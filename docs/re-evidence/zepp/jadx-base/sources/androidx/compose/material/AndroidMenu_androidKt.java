package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.huami.passport.Configs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010\u001a\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpOffset;", "offset", "Landroidx/compose/ui/window/PopupProperties;", Configs.Params.PROPERTIES, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu", "onClick", Constants.ENABLED, "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItem", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidMenu_androidKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:103:0x0187  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x0213  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x015c  */
    @Composable
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final void m557DropdownMenuILWXrKs(final boolean z, @NotNull final Function0<Unit> function0, @Nullable Modifier modifier, long j, @Nullable PopupProperties popupProperties, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long jM2986DpOffsetYgX7TsA;
        int i5;
        PopupProperties popupProperties2;
        int i6;
        Modifier modifier3;
        long j2;
        PopupProperties popupProperties3;
        Modifier modifier4;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier5;
        final long j3;
        final PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-803033813);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    jM2986DpOffsetYgX7TsA = j;
                    if (composerStartRestartGroup.changed(jM2986DpOffsetYgX7TsA)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        popupProperties2 = popupProperties;
                        int i8 = composerStartRestartGroup.changed(popupProperties2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        popupProperties2 = popupProperties;
                    }
                    i3 |= i8;
                } else {
                    popupProperties2 = popupProperties;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                        i3 |= i6;
                    }
                    if (((374491 & i3) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                float f = 0;
                                jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(f));
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            }
                            composerStartRestartGroup.endDefaults();
                            j2 = jM2986DpOffsetYgX7TsA;
                            popupProperties3 = popupProperties2;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            j2 = jM2986DpOffsetYgX7TsA;
                            popupProperties3 = popupProperties2;
                            modifier4 = modifier2;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableTransitionState = (MutableTransitionState) objRememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-803033359);
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(-3686930);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                        mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            DropdownMenuPositionProvider dropdownMenuPositionProvider = new DropdownMenuPositionProvider(j2, density, (Function2) objRememberedValue3, null);
                            final Modifier modifier6 = modifier4;
                            final int i9 = i3;
                            AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    if (((i10 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                    MutableState<TransformOrigin> mutableState2 = mutableState;
                                    Modifier modifier7 = modifier6;
                                    Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                    int i11 = MutableTransitionState.$stable | 48;
                                    int i12 = i9;
                                    MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier7, function4, composer2, i11 | (i12 & 896) | ((i12 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                                }
                            }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-803032564);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        modifier5 = modifier4;
                        j3 = j2;
                        popupProperties4 = popupProperties3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        j3 = jM2986DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        public final void invoke(@Nullable Composer composer2, int i10) {
                            AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f2 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f2), Dp.m2965constructorimpl(f2));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f3 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f3), Dp.m2965constructorimpl(f3));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider2 = new DropdownMenuPositionProvider(j2, density2, (Function2) objRememberedValue3, null);
                        final Modifier modifier7 = modifier4;
                        final int i10 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider2, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            public final void invoke(@Nullable Composer composer2, int i11) {
                                if (((i11 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier8 = modifier7;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i12 = MutableTransitionState.$stable | 48;
                                int i13 = i10;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier8, function4, composer2, i12 | (i13 & 896) | ((i13 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider3 = new DropdownMenuPositionProvider(j2, density3, (Function2) objRememberedValue3, null);
                        final Modifier modifier8 = modifier4;
                        final int i11 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if (((i12 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier9 = modifier8;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i11;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier9, function4, composer2, i13 | (i14 & 896) | ((i14 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    popupProperties4 = popupProperties3;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f4 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f4), Dp.m2965constructorimpl(f4));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f5 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f5), Dp.m2965constructorimpl(f5));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider4 = new DropdownMenuPositionProvider(j2, density4, (Function2) objRememberedValue3, null);
                        final Modifier modifier9 = modifier4;
                        final int i12 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider4, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier10 = modifier9;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i14 = MutableTransitionState.$stable | 48;
                                int i15 = i12;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier10, function4, composer2, i14 | (i15 & 896) | ((i15 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider5 = new DropdownMenuPositionProvider(j2, density5, (Function2) objRememberedValue3, null);
                        final Modifier modifier10 = modifier4;
                        final int i13 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider5, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier11 = modifier10;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i15 = MutableTransitionState.$stable | 48;
                                int i16 = i13;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier11, function4, composer2, i15 | (i16 & 896) | ((i16 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    public final void invoke(@Nullable Composer composer2, int i14) {
                        AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            jM2986DpOffsetYgX7TsA = j;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                    }
                    i3 |= i8;
                } else {
                    popupProperties2 = popupProperties;
                }
                i3 |= i8;
            } else {
                popupProperties2 = popupProperties;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f6 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f6), Dp.m2965constructorimpl(f6));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f7 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f7), Dp.m2965constructorimpl(f7));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider6 = new DropdownMenuPositionProvider(j2, density6, (Function2) objRememberedValue3, null);
                        final Modifier modifier11 = modifier4;
                        final int i14 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider6, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier12 = modifier11;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i16 = MutableTransitionState.$stable | 48;
                                int i17 = i14;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier12, function4, composer2, i16 | (i17 & 896) | ((i17 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider7 = new DropdownMenuPositionProvider(j2, density7, (Function2) objRememberedValue3, null);
                        final Modifier modifier12 = modifier4;
                        final int i15 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider7, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier13 = modifier12;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i17 = MutableTransitionState.$stable | 48;
                                int i18 = i15;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier13, function4, composer2, i17 | (i18 & 896) | ((i18 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    popupProperties4 = popupProperties3;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f8 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f8), Dp.m2965constructorimpl(f8));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f9 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f9), Dp.m2965constructorimpl(f9));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider8 = new DropdownMenuPositionProvider(j2, density8, (Function2) objRememberedValue3, null);
                        final Modifier modifier13 = modifier4;
                        final int i16 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider8, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier14 = modifier13;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i18 = MutableTransitionState.$stable | 48;
                                int i19 = i16;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier14, function4, composer2, i18 | (i19 & 896) | ((i19 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider9 = new DropdownMenuPositionProvider(j2, density9, (Function2) objRememberedValue3, null);
                        final Modifier modifier14 = modifier4;
                        final int i17 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider9, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier15 = modifier14;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i19 = MutableTransitionState.$stable | 48;
                                int i110 = i17;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier15, function4, composer2, i19 | (i110 & 896) | ((i110 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    public final void invoke(@Nullable Composer composer2, int i18) {
                        AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f10 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f10), Dp.m2965constructorimpl(f10));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f11 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f11), Dp.m2965constructorimpl(f11));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider10 = new DropdownMenuPositionProvider(j2, density10, (Function2) objRememberedValue3, null);
                    final Modifier modifier15 = modifier4;
                    final int i18 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider10, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier16 = modifier15;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i110 = MutableTransitionState.$stable | 48;
                            int i111 = i18;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier16, function4, composer2, i110 | (i111 & 896) | ((i111 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider11 = new DropdownMenuPositionProvider(j2, density11, (Function2) objRememberedValue3, null);
                    final Modifier modifier16 = modifier4;
                    final int i19 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider11, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier17 = modifier16;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i111 = MutableTransitionState.$stable | 48;
                            int i112 = i19;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier17, function4, composer2, i111 | (i112 & 896) | ((i112 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier5 = modifier4;
                j3 = j2;
                popupProperties4 = popupProperties3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f12 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f12), Dp.m2965constructorimpl(f12));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f13 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f13), Dp.m2965constructorimpl(f13));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider12 = new DropdownMenuPositionProvider(j2, density12, (Function2) objRememberedValue3, null);
                    final Modifier modifier17 = modifier4;
                    final int i110 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider12, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier18 = modifier17;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i112 = MutableTransitionState.$stable | 48;
                            int i113 = i110;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier18, function4, composer2, i112 | (i113 & 896) | ((i113 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider13 = new DropdownMenuPositionProvider(j2, density13, (Function2) objRememberedValue3, null);
                    final Modifier modifier18 = modifier4;
                    final int i111 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider13, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier19 = modifier18;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i113 = MutableTransitionState.$stable | 48;
                            int i114 = i111;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier19, function4, composer2, i113 | (i114 & 896) | ((i114 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier5 = modifier4;
                j3 = j2;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                public final void invoke(@Nullable Composer composer2, int i112) {
                    AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                jM2986DpOffsetYgX7TsA = j;
                if (composerStartRestartGroup.changed(jM2986DpOffsetYgX7TsA)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                    }
                    i3 |= i8;
                } else {
                    popupProperties2 = popupProperties;
                }
                i3 |= i8;
            } else {
                popupProperties2 = popupProperties;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f14 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f14), Dp.m2965constructorimpl(f14));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f15 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f15), Dp.m2965constructorimpl(f15));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider14 = new DropdownMenuPositionProvider(j2, density14, (Function2) objRememberedValue3, null);
                        final Modifier modifier19 = modifier4;
                        final int i112 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider14, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier110 = modifier19;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i114 = MutableTransitionState.$stable | 48;
                                int i115 = i112;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier110, function4, composer2, i114 | (i115 & 896) | ((i115 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider15 = new DropdownMenuPositionProvider(j2, density15, (Function2) objRememberedValue3, null);
                        final Modifier modifier110 = modifier4;
                        final int i113 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider15, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier111 = modifier110;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i115 = MutableTransitionState.$stable | 48;
                                int i116 = i113;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier111, function4, composer2, i115 | (i116 & 896) | ((i116 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    popupProperties4 = popupProperties3;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f16 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f16), Dp.m2965constructorimpl(f16));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f17 = 0;
                            jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f17), Dp.m2965constructorimpl(f17));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        composerStartRestartGroup.endDefaults();
                        j2 = jM2986DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider16 = new DropdownMenuPositionProvider(j2, density16, (Function2) objRememberedValue3, null);
                        final Modifier modifier111 = modifier4;
                        final int i114 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider16, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier112 = modifier111;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i116 = MutableTransitionState.$stable | 48;
                                int i117 = i114;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier112, function4, composer2, i116 | (i117 & 896) | ((i117 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-803033359);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        DropdownMenuPositionProvider dropdownMenuPositionProvider17 = new DropdownMenuPositionProvider(j2, density17, (Function2) objRememberedValue3, null);
                        final Modifier modifier112 = modifier4;
                        final int i115 = i3;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider17, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                Modifier modifier113 = modifier112;
                                Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                                int i117 = MutableTransitionState.$stable | 48;
                                int i118 = i115;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier113, function4, composer2, i117 | (i118 & 896) | ((i118 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                            }
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    public final void invoke(@Nullable Composer composer2, int i116) {
                        AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f18 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f18), Dp.m2965constructorimpl(f18));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f19 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f19), Dp.m2965constructorimpl(f19));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider18 = new DropdownMenuPositionProvider(j2, density18, (Function2) objRememberedValue3, null);
                    final Modifier modifier113 = modifier4;
                    final int i116 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider18, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier114 = modifier113;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i118 = MutableTransitionState.$stable | 48;
                            int i119 = i116;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier114, function4, composer2, i118 | (i119 & 896) | ((i119 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider19 = new DropdownMenuPositionProvider(j2, density19, (Function2) objRememberedValue3, null);
                    final Modifier modifier114 = modifier4;
                    final int i117 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider19, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier115 = modifier114;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i119 = MutableTransitionState.$stable | 48;
                            int i1110 = i117;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier115, function4, composer2, i119 | (i1110 & 896) | ((i1110 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier5 = modifier4;
                j3 = j2;
                popupProperties4 = popupProperties3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f110 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f110), Dp.m2965constructorimpl(f110));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f111 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f111), Dp.m2965constructorimpl(f111));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider110 = new DropdownMenuPositionProvider(j2, density110, (Function2) objRememberedValue3, null);
                    final Modifier modifier115 = modifier4;
                    final int i118 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider110, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier116 = modifier115;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i1110 = MutableTransitionState.$stable | 48;
                            int i1111 = i118;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier116, function4, composer2, i1110 | (i1111 & 896) | ((i1111 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider111 = new DropdownMenuPositionProvider(j2, density111, (Function2) objRememberedValue3, null);
                    final Modifier modifier116 = modifier4;
                    final int i119 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider111, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                        public final void invoke(@Nullable Composer composer2, int i1110) {
                            if (((i1110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier117 = modifier116;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i1111 = MutableTransitionState.$stable | 48;
                            int i1112 = i119;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier117, function4, composer2, i1111 | (i1112 & 896) | ((i1112 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier5 = modifier4;
                j3 = j2;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                public final void invoke(@Nullable Composer composer2, int i1110) {
                    AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        jM2986DpOffsetYgX7TsA = j;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                }
                i3 |= i8;
            } else {
                popupProperties2 = popupProperties;
            }
            i3 |= i8;
        } else {
            popupProperties2 = popupProperties;
        }
        if ((i2 & 32) != 0) {
            if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f112 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f112), Dp.m2965constructorimpl(f112));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f113 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f113), Dp.m2965constructorimpl(f113));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider112 = new DropdownMenuPositionProvider(j2, density112, (Function2) objRememberedValue3, null);
                    final Modifier modifier117 = modifier4;
                    final int i1110 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider112, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                        public final void invoke(@Nullable Composer composer2, int i1111) {
                            if (((i1111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier118 = modifier117;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i1112 = MutableTransitionState.$stable | 48;
                            int i1113 = i1110;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier118, function4, composer2, i1112 | (i1113 & 896) | ((i1113 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider113 = new DropdownMenuPositionProvider(j2, density113, (Function2) objRememberedValue3, null);
                    final Modifier modifier118 = modifier4;
                    final int i1111 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider113, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                        public final void invoke(@Nullable Composer composer2, int i1112) {
                            if (((i1112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier119 = modifier118;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i1113 = MutableTransitionState.$stable | 48;
                            int i1114 = i1111;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier119, function4, composer2, i1113 | (i1114 & 896) | ((i1114 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier5 = modifier4;
                j3 = j2;
                popupProperties4 = popupProperties3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f114 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f114), Dp.m2965constructorimpl(f114));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f115 = 0;
                        jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f115), Dp.m2965constructorimpl(f115));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    j2 = jM2986DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider114 = new DropdownMenuPositionProvider(j2, density114, (Function2) objRememberedValue3, null);
                    final Modifier modifier119 = modifier4;
                    final int i1112 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider114, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                        public final void invoke(@Nullable Composer composer2, int i1113) {
                            if (((i1113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier1110 = modifier119;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i1114 = MutableTransitionState.$stable | 48;
                            int i1115 = i1112;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier1110, function4, composer2, i1114 | (i1115 & 896) | ((i1115 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-803033359);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DropdownMenuPositionProvider dropdownMenuPositionProvider115 = new DropdownMenuPositionProvider(j2, density115, (Function2) objRememberedValue3, null);
                    final Modifier modifier1110 = modifier4;
                    final int i1113 = i3;
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider115, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                        public final void invoke(@Nullable Composer composer2, int i1114) {
                            if (((i1114 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            Modifier modifier1111 = modifier1110;
                            Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                            int i1115 = MutableTransitionState.$stable | 48;
                            int i1116 = i1113;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier1111, function4, composer2, i1115 | (i1116 & 896) | ((i1116 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        }
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier5 = modifier4;
                j3 = j2;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                public final void invoke(@Nullable Composer composer2, int i1114) {
                    AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        if (((374491 & i3) ^ 74898) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f116 = 0;
                    jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f116), Dp.m2965constructorimpl(f116));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                composerStartRestartGroup.endDefaults();
                j2 = jM2986DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f117 = 0;
                    jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f117), Dp.m2965constructorimpl(f117));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                composerStartRestartGroup.endDefaults();
                j2 = jM2986DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-803033359);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                DropdownMenuPositionProvider dropdownMenuPositionProvider116 = new DropdownMenuPositionProvider(j2, density116, (Function2) objRememberedValue3, null);
                final Modifier modifier1111 = modifier4;
                final int i1114 = i3;
                AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider116, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                    public final void invoke(@Nullable Composer composer2, int i1115) {
                        if (((i1115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        Modifier modifier1112 = modifier1111;
                        Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                        int i1116 = MutableTransitionState.$stable | 48;
                        int i1117 = i1114;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier1112, function4, composer2, i1116 | (i1117 & 896) | ((i1117 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    }
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-803033359);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                DropdownMenuPositionProvider dropdownMenuPositionProvider117 = new DropdownMenuPositionProvider(j2, density117, (Function2) objRememberedValue3, null);
                final Modifier modifier1112 = modifier4;
                final int i1115 = i3;
                AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider117, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                    public final void invoke(@Nullable Composer composer2, int i1116) {
                        if (((i1116 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        Modifier modifier1113 = modifier1112;
                        Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                        int i1117 = MutableTransitionState.$stable | 48;
                        int i1118 = i1115;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier1113, function4, composer2, i1117 | (i1118 & 896) | ((i1118 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    }
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            modifier5 = modifier4;
            j3 = j2;
            popupProperties4 = popupProperties3;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f118 = 0;
                    jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f118), Dp.m2965constructorimpl(f118));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                composerStartRestartGroup.endDefaults();
                j2 = jM2986DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f119 = 0;
                    jM2986DpOffsetYgX7TsA = DpKt.m2986DpOffsetYgX7TsA(Dp.m2965constructorimpl(f119), Dp.m2965constructorimpl(f119));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                composerStartRestartGroup.endDefaults();
                j2 = jM2986DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-803033359);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                DropdownMenuPositionProvider dropdownMenuPositionProvider118 = new DropdownMenuPositionProvider(j2, density118, (Function2) objRememberedValue3, null);
                final Modifier modifier1113 = modifier4;
                final int i1116 = i3;
                AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider118, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        if (((i1117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        Modifier modifier1114 = modifier1113;
                        Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                        int i1118 = MutableTransitionState.$stable | 48;
                        int i1119 = i1116;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier1114, function4, composer2, i1118 | (i1119 & 896) | ((i1119 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    }
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-803033359);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m1504boximpl(TransformOrigin.INSTANCE.m1517getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m1504boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                DropdownMenuPositionProvider dropdownMenuPositionProvider119 = new DropdownMenuPositionProvider(j2, density119, (Function2) objRememberedValue3, null);
                final Modifier modifier1114 = modifier4;
                final int i1117 = i3;
                AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider119, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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
                    public final void invoke(@Nullable Composer composer2, int i1118) {
                        if (((i1118 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        Modifier modifier1115 = modifier1114;
                        Function3<ColumnScope, Composer, Integer, Unit> function4 = function3;
                        int i1119 = MutableTransitionState.$stable | 48;
                        int i11110 = i1117;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier1115, function4, composer2, i1119 | (i11110 & 896) | ((i11110 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    }
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            modifier5 = modifier4;
            j3 = j2;
            popupProperties4 = popupProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

            public final void invoke(@Nullable Composer composer2, int i1118) {
                AndroidMenu_androidKt.m557DropdownMenuILWXrKs(z, function0, modifier5, j3, popupProperties4, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015c  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    @Composable
    public static final void DropdownMenuItem(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        PaddingValues dropdownMenuItemContentPadding;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        Modifier modifier3;
        boolean z3;
        int i9;
        PaddingValues paddingValues2;
        Object objRememberedValue;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z4;
        final PaddingValues paddingValues3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1325582368);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if ((i2 & 8) == 0) {
                        dropdownMenuItemContentPadding = paddingValues;
                        int i11 = composerStartRestartGroup.changed(dropdownMenuItemContentPadding) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    i3 |= i11;
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if (((374491 & i3) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            composerStartRestartGroup.endDefaults();
                            i9 = i3;
                            z2 = z3;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i9 = i3;
                            paddingValues2 = dropdownMenuItemContentPadding;
                        }
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource4, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                        mutableInteractionSource3 = mutableInteractionSource4;
                        z4 = z2;
                        Modifier modifier5 = modifier2;
                        paddingValues3 = paddingValues2;
                        modifier4 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z4 = z2;
                        paddingValues3 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    }
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                    MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource5, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                    mutableInteractionSource3 = mutableInteractionSource5;
                    z4 = z2;
                    Modifier modifier6 = modifier2;
                    paddingValues3 = paddingValues2;
                    modifier4 = modifier6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    }
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                    MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource6, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                    mutableInteractionSource3 = mutableInteractionSource6;
                    z4 = z2;
                    Modifier modifier7 = modifier2;
                    paddingValues3 = paddingValues2;
                    modifier4 = modifier7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            z2 = z;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    dropdownMenuItemContentPadding = paddingValues;
                    if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                    }
                    i3 |= i11;
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                i3 |= i11;
            } else {
                dropdownMenuItemContentPadding = paddingValues;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    }
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                    MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource7, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                    mutableInteractionSource3 = mutableInteractionSource7;
                    z4 = z2;
                    Modifier modifier8 = modifier2;
                    paddingValues3 = paddingValues2;
                    modifier4 = modifier8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    }
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                    MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource8, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                    mutableInteractionSource3 = mutableInteractionSource8;
                    z4 = z2;
                    Modifier modifier9 = modifier2;
                    paddingValues3 = paddingValues2;
                    modifier4 = modifier9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                }
                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource9, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                mutableInteractionSource3 = mutableInteractionSource9;
                z4 = z2;
                Modifier modifier10 = modifier2;
                paddingValues3 = paddingValues2;
                modifier4 = modifier10;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                }
                MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource10, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                mutableInteractionSource3 = mutableInteractionSource10;
                z4 = z2;
                Modifier modifier11 = modifier2;
                paddingValues3 = paddingValues2;
                modifier4 = modifier11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    dropdownMenuItemContentPadding = paddingValues;
                    if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                    }
                    i3 |= i11;
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                i3 |= i11;
            } else {
                dropdownMenuItemContentPadding = paddingValues;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    }
                    MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                    MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource11, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                    mutableInteractionSource3 = mutableInteractionSource11;
                    z4 = z2;
                    Modifier modifier12 = modifier2;
                    paddingValues3 = paddingValues2;
                    modifier4 = modifier12;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        z2 = z3;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        modifier2 = modifier3;
                    }
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                    MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource12, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                    mutableInteractionSource3 = mutableInteractionSource12;
                    z4 = z2;
                    Modifier modifier13 = modifier2;
                    paddingValues3 = paddingValues2;
                    modifier4 = modifier13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                }
                MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource13, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                mutableInteractionSource3 = mutableInteractionSource13;
                z4 = z2;
                Modifier modifier14 = modifier2;
                paddingValues3 = paddingValues2;
                modifier4 = modifier14;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                }
                MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource14, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                mutableInteractionSource3 = mutableInteractionSource14;
                z4 = z2;
                Modifier modifier15 = modifier2;
                paddingValues3 = paddingValues2;
                modifier4 = modifier15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        z2 = z;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                dropdownMenuItemContentPadding = paddingValues;
                if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                }
                i3 |= i11;
            } else {
                dropdownMenuItemContentPadding = paddingValues;
            }
            i3 |= i11;
        } else {
            dropdownMenuItemContentPadding = paddingValues;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                }
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource15, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                mutableInteractionSource3 = mutableInteractionSource15;
                z4 = z2;
                Modifier modifier16 = modifier2;
                paddingValues3 = paddingValues2;
                modifier4 = modifier16;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    z2 = z3;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    modifier2 = modifier3;
                }
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource16, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
                mutableInteractionSource3 = mutableInteractionSource16;
                z4 = z2;
                Modifier modifier17 = modifier2;
                paddingValues3 = paddingValues2;
                modifier4 = modifier17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if (((374491 & i3) ^ 74898) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                z2 = z3;
                paddingValues2 = dropdownMenuItemContentPadding;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                z2 = z3;
                paddingValues2 = dropdownMenuItemContentPadding;
                modifier2 = modifier3;
            }
            MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
            MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource17, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
            mutableInteractionSource3 = mutableInteractionSource17;
            z4 = z2;
            Modifier modifier18 = modifier2;
            paddingValues3 = paddingValues2;
            modifier4 = modifier18;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                z2 = z3;
                paddingValues2 = dropdownMenuItemContentPadding;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                z2 = z3;
                paddingValues2 = dropdownMenuItemContentPadding;
                modifier2 = modifier3;
            }
            MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
            MenuKt.DropdownMenuItemContent(function0, modifier2, z2, paddingValues2, mutableInteractionSource18, function3, composerStartRestartGroup, (i9 & 458752) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 57344), 0);
            mutableInteractionSource3 = mutableInteractionSource18;
            z4 = z2;
            Modifier modifier19 = modifier2;
            paddingValues3 = paddingValues2;
            modifier4 = modifier19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidMenu_androidKt.DropdownMenuItem(function0, modifier4, z4, paddingValues3, mutableInteractionSource3, function3, composer2, i | 1, i2);
            }
        });
    }
}
