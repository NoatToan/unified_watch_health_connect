package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010 \u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aA\u0010)\u001a\u00020\u0003*\u00020\u00172\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0019\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b0\u00101\"\u0019\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u00101\"\u0019\u00103\u001a\u00020/8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b3\u00101\"\u0019\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b4\u00101\"\u0019\u00105\u001a\u00020/8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", Constants.ENABLED, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/CheckboxColors;", "colors", "Checkbox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "value", "CheckboxImpl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "boxColor", "borderColor", "", "radius", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawBox", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material/CheckDrawingCache;", "drawingCache", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "drawCheck", "", "BoxInDuration", LogUtil.I, "BoxOutDuration", "CheckAnimationDuration", "Landroidx/compose/ui/unit/Dp;", "CheckboxRippleRadius", "F", "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "RadiusSize", "material_release"}, k = 2, mv = {1, 5, 1})
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m2965constructorimpl(24);
    private static final float CheckboxSize = Dp.m2965constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m2965constructorimpl(f);
        StrokeWidth = Dp.m2965constructorimpl(f);
        RadiusSize = Dp.m2965constructorimpl(f);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0148  */
    /* JADX WARN: Code duplicated, block: B:104:0x0167  */
    /* JADX WARN: Code duplicated, block: B:106:0x016f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0181  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137  */
    @Composable
    public static final void Checkbox(final boolean z, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable CheckboxColors checkboxColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        CheckboxColors checkboxColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        CheckboxColors checkboxColorsM614colorszjMxDiM;
        int i8;
        boolean z5;
        CheckboxColors checkboxColors3;
        Object objRememberedValue;
        Function0 function0;
        final boolean z6;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource4;
        final CheckboxColors checkboxColors4;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1433125592);
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
            i3 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
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
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            int i10 = composerStartRestartGroup.changed(checkboxColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if (((374491 & i3) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i9 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) != 0) {
                                checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                                i3 &= -458753;
                            } else {
                                checkboxColorsM614colorszjMxDiM = checkboxColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            CheckboxColors checkboxColors5 = checkboxColorsM614colorszjMxDiM;
                            i8 = i3;
                            z5 = z4;
                            modifier2 = modifier3;
                            checkboxColors3 = checkboxColors5;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            checkboxColors3 = checkboxColors2;
                            boolean z7 = z3;
                            i8 = i3;
                            z5 = z7;
                        }
                        ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                        if (function1 != null) {
                            composerStartRestartGroup.startReplaceableGroup(1433125996);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            composerStartRestartGroup.startReplaceableGroup(-3686552);
                            zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Unit getA() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        function1.invoke(Boolean.valueOf(!z));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function0 = (Function0) objRememberedValue2;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(1477234126);
                            composerStartRestartGroup.endReplaceableGroup();
                            function0 = null;
                        }
                        TriStateCheckbox(ToggleableState, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                        CheckboxColors checkboxColors6 = checkboxColors3;
                        z6 = z5;
                        modifier4 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors4 = checkboxColors6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z6 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        checkboxColors4 = checkboxColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors7 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors7;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors8 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors8;
                    }
                    ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                    if (function1 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1433125996);
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1477234126);
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = null;
                    }
                    TriStateCheckbox(ToggleableState2, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                    CheckboxColors checkboxColors9 = checkboxColors3;
                    z6 = z5;
                    modifier4 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors4 = checkboxColors9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors10 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors10;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors11 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors11;
                    }
                    ToggleableState ToggleableState3 = ToggleableStateKt.ToggleableState(z);
                    if (function1 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1433125996);
                        Boolean boolValueOf3 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1477234126);
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = null;
                    }
                    TriStateCheckbox(ToggleableState3, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                    CheckboxColors checkboxColors12 = checkboxColors3;
                    z6 = z5;
                    modifier4 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors4 = checkboxColors12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z2;
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
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors13 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors14 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors14;
                    }
                    ToggleableState ToggleableState4 = ToggleableStateKt.ToggleableState(z);
                    if (function1 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1433125996);
                        Boolean boolValueOf4 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(boolValueOf4) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1477234126);
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = null;
                    }
                    TriStateCheckbox(ToggleableState4, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                    CheckboxColors checkboxColors15 = checkboxColors3;
                    z6 = z5;
                    modifier4 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors4 = checkboxColors15;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors16 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors16;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors17 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors17;
                    }
                    ToggleableState ToggleableState5 = ToggleableStateKt.ToggleableState(z);
                    if (function1 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1433125996);
                        Boolean boolValueOf5 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(boolValueOf5) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1477234126);
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = null;
                    }
                    TriStateCheckbox(ToggleableState5, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                    CheckboxColors checkboxColors18 = checkboxColors3;
                    z6 = z5;
                    modifier4 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors4 = checkboxColors18;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors19 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors19;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors110 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors110;
                }
                ToggleableState ToggleableState6 = ToggleableStateKt.ToggleableState(z);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1433125996);
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1477234126);
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = null;
                }
                TriStateCheckbox(ToggleableState6, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                CheckboxColors checkboxColors111 = checkboxColors3;
                z6 = z5;
                modifier4 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors4 = checkboxColors111;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors112 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors113 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors113;
                }
                ToggleableState ToggleableState7 = ToggleableStateKt.ToggleableState(z);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1433125996);
                    Boolean boolValueOf7 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(boolValueOf7) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1477234126);
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = null;
                }
                TriStateCheckbox(ToggleableState7, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                CheckboxColors checkboxColors114 = checkboxColors3;
                z6 = z5;
                modifier4 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors4 = checkboxColors114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
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
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors115 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors116 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors116;
                    }
                    ToggleableState ToggleableState8 = ToggleableStateKt.ToggleableState(z);
                    if (function1 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1433125996);
                        Boolean boolValueOf8 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(boolValueOf8) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1477234126);
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = null;
                    }
                    TriStateCheckbox(ToggleableState8, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                    CheckboxColors checkboxColors117 = checkboxColors3;
                    z6 = z5;
                    modifier4 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors4 = checkboxColors117;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors118 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors118;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            i3 &= -458753;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        CheckboxColors checkboxColors119 = checkboxColorsM614colorszjMxDiM;
                        i8 = i3;
                        z5 = z4;
                        modifier2 = modifier3;
                        checkboxColors3 = checkboxColors119;
                    }
                    ToggleableState ToggleableState9 = ToggleableStateKt.ToggleableState(z);
                    if (function1 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1433125996);
                        Boolean boolValueOf9 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(boolValueOf9) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ Unit getA() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1477234126);
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = null;
                    }
                    TriStateCheckbox(ToggleableState9, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                    CheckboxColors checkboxColors1110 = checkboxColors3;
                    z6 = z5;
                    modifier4 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors4 = checkboxColors1110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors1111 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors1111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors1112 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors1112;
                }
                ToggleableState ToggleableState10 = ToggleableStateKt.ToggleableState(z);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1433125996);
                    Boolean boolValueOf10 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(boolValueOf10) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1477234126);
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = null;
                }
                TriStateCheckbox(ToggleableState10, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                CheckboxColors checkboxColors1113 = checkboxColors3;
                z6 = z5;
                modifier4 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors4 = checkboxColors1113;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors1114 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors1114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors1115 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors1115;
                }
                ToggleableState ToggleableState11 = ToggleableStateKt.ToggleableState(z);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1433125996);
                    Boolean boolValueOf11 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(boolValueOf11) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1477234126);
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = null;
                }
                TriStateCheckbox(ToggleableState11, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                CheckboxColors checkboxColors1116 = checkboxColors3;
                z6 = z5;
                modifier4 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors4 = checkboxColors1116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z2;
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
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors1117 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors1117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors1118 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors1118;
                }
                ToggleableState ToggleableState12 = ToggleableStateKt.ToggleableState(z);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1433125996);
                    Boolean boolValueOf12 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(boolValueOf12) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1477234126);
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = null;
                }
                TriStateCheckbox(ToggleableState12, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                CheckboxColors checkboxColors1119 = checkboxColors3;
                z6 = z5;
                modifier4 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors4 = checkboxColors1119;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors11110 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors11110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        i3 &= -458753;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    CheckboxColors checkboxColors11111 = checkboxColorsM614colorszjMxDiM;
                    i8 = i3;
                    z5 = z4;
                    modifier2 = modifier3;
                    checkboxColors3 = checkboxColors11111;
                }
                ToggleableState ToggleableState13 = ToggleableStateKt.ToggleableState(z);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1433125996);
                    Boolean boolValueOf13 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(boolValueOf13) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public /* bridge */ /* synthetic */ Unit getA() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1477234126);
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = null;
                }
                TriStateCheckbox(ToggleableState13, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
                CheckboxColors checkboxColors11112 = checkboxColors3;
                z6 = z5;
                modifier4 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors4 = checkboxColors11112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                checkboxColors2 = checkboxColors;
                if (composerStartRestartGroup.changed(checkboxColors2)) {
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
            }
            i3 |= i10;
        } else {
            checkboxColors2 = checkboxColors;
        }
        if (((374491 & i3) ^ 74898) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    i3 &= -458753;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors2;
                }
                composerStartRestartGroup.endDefaults();
                CheckboxColors checkboxColors11113 = checkboxColorsM614colorszjMxDiM;
                i8 = i3;
                z5 = z4;
                modifier2 = modifier3;
                checkboxColors3 = checkboxColors11113;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    i3 &= -458753;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors2;
                }
                composerStartRestartGroup.endDefaults();
                CheckboxColors checkboxColors11114 = checkboxColorsM614colorszjMxDiM;
                i8 = i3;
                z5 = z4;
                modifier2 = modifier3;
                checkboxColors3 = checkboxColors11114;
            }
            ToggleableState ToggleableState14 = ToggleableStateKt.ToggleableState(z);
            if (function1 != null) {
                composerStartRestartGroup.startReplaceableGroup(1433125996);
                Boolean boolValueOf14 = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(boolValueOf14) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit getA() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit getA() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function0 = (Function0) objRememberedValue2;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1477234126);
                composerStartRestartGroup.endReplaceableGroup();
                function0 = null;
            }
            TriStateCheckbox(ToggleableState14, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
            CheckboxColors checkboxColors11115 = checkboxColors3;
            z6 = z5;
            modifier4 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            checkboxColors4 = checkboxColors11115;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    i3 &= -458753;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors2;
                }
                composerStartRestartGroup.endDefaults();
                CheckboxColors checkboxColors11116 = checkboxColorsM614colorszjMxDiM;
                i8 = i3;
                z5 = z4;
                modifier2 = modifier3;
                checkboxColors3 = checkboxColors11116;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    i3 &= -458753;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors2;
                }
                composerStartRestartGroup.endDefaults();
                CheckboxColors checkboxColors11117 = checkboxColorsM614colorszjMxDiM;
                i8 = i3;
                z5 = z4;
                modifier2 = modifier3;
                checkboxColors3 = checkboxColors11117;
            }
            ToggleableState ToggleableState15 = ToggleableStateKt.ToggleableState(z);
            if (function1 != null) {
                composerStartRestartGroup.startReplaceableGroup(1433125996);
                Boolean boolValueOf15 = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(boolValueOf15) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit getA() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit getA() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function0 = (Function0) objRememberedValue2;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1477234126);
                composerStartRestartGroup.endReplaceableGroup();
                function0 = null;
            }
            TriStateCheckbox(ToggleableState15, function0, modifier2, z5, mutableInteractionSource3, checkboxColors3, composerStartRestartGroup, (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i8 & 57344) | (i8 & 458752), 0);
            CheckboxColors checkboxColors11118 = checkboxColors3;
            z6 = z5;
            modifier4 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            checkboxColors4 = checkboxColors11118;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
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

            public final void invoke(@Nullable Composer composer2, int i11) {
                CheckboxKt.Checkbox(z, function1, modifier4, z6, mutableInteractionSource4, checkboxColors4, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void CheckboxImpl(final boolean z, final ToggleableState toggleableState, final Modifier modifier, final CheckboxColors checkboxColors, Composer composer, final int i) {
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1927332995);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i4 = i2;
        if (((i4 & 5851) ^ 1170) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            int i5 = i4 >> 3;
            int i6 = i5 & 14;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(toggleableState, (String) null, composerStartRestartGroup, i6, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> segment, @Nullable Composer composer2, int i7) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
                    composer2.startReplaceableGroup(-1028758507);
                    ToggleableState initialState = segment.getInitialState();
                    ToggleableState toggleableState2 = ToggleableState.Off;
                    if (initialState == toggleableState2) {
                        finiteAnimationSpecSnap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    } else {
                        finiteAnimationSpecSnap = segment.getTargetState() == toggleableState2 ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecSnap;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1399888299);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(1847721878);
            ToggleableState toggleableState2 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1028758263);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i7 = iArr[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i7 == 1) {
                f = 1.0f;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf = Float.valueOf(f);
            ToggleableState toggleableState3 = (ToggleableState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1028758263);
            int i8 = iArr[toggleableState3.ordinal()];
            if (i8 == 1) {
                f2 = 1.0f;
            } else if (i8 != 2) {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> segment, @Nullable Composer composer2, int i9) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
                    composer2.startReplaceableGroup(-1028758004);
                    ToggleableState initialState = segment.getInitialState();
                    ToggleableState toggleableState4 = ToggleableState.Off;
                    if (initialState == toggleableState4) {
                        finiteAnimationSpecSnap = AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        finiteAnimationSpecSnap = segment.getTargetState() == toggleableState4 ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecSnap;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1399888299);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(1847721878);
            ToggleableState toggleableState4 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1028757745);
            int i9 = iArr[toggleableState4.ordinal()];
            if (i9 == 1 || i9 == 2) {
                i3 = 3;
                f3 = 0.0f;
            } else {
                i3 = 3;
                if (i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 1.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf2 = Float.valueOf(f3);
            ToggleableState toggleableState5 = (ToggleableState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1028757745);
            int i10 = iArr[toggleableState5.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != i3) {
                    throw new NoWhenBranchMatchedException();
                }
                f4 = 1.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CheckDrawingCache(null, null, null, 7, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CheckDrawingCache checkDrawingCache = (CheckDrawingCache) objRememberedValue;
            final State<Color> stateCheckmarkColor = checkboxColors.checkmarkColor(toggleableState, composerStartRestartGroup, i6 | ((i4 >> 6) & 112));
            int i11 = (i4 & 14) | (i4 & 112) | (i5 & 896);
            final State<Color> stateBoxColor = checkboxColors.boxColor(z, toggleableState, composerStartRestartGroup, i11);
            final State<Color> stateBorderColor = checkboxColors.borderColor(z, toggleableState, composerStartRestartGroup, i11);
            Modifier modifierM315requiredSize3ABfNKs = SizeKt.m315requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
            Object[] objArr = new Object[6];
            objArr[0] = stateBoxColor;
            objArr[1] = stateBorderColor;
            objArr[2] = stateCheckmarkColor;
            objArr[i3] = stateCreateTransitionAnimation;
            objArr[4] = stateCreateTransitionAnimation2;
            objArr[5] = checkDrawingCache;
            composerStartRestartGroup.startReplaceableGroup(-3685570);
            boolean zChanged = false;
            int i12 = 0;
            while (i12 < 6) {
                Object obj = objArr[i12];
                i12++;
                zChanged |= composerStartRestartGroup.changed(obj);
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope drawScope) {
                        float fFloor = (float) Math.floor(drawScope.mo193toPx0680j_4(CheckboxKt.StrokeWidth));
                        CheckboxKt.m627drawBox1wkBAMs(drawScope, CheckboxKt.m619CheckboxImpl$lambda9(stateBoxColor), CheckboxKt.m615CheckboxImpl$lambda10(stateBorderColor), drawScope.mo193toPx0680j_4(CheckboxKt.RadiusSize), fFloor);
                        CheckboxKt.m628drawCheck3IgeMak(drawScope, CheckboxKt.m618CheckboxImpl$lambda8(stateCheckmarkColor), CheckboxKt.m616CheckboxImpl$lambda4(stateCreateTransitionAnimation), CheckboxKt.m617CheckboxImpl$lambda6(stateCreateTransitionAnimation2), fFloor, checkDrawingCache);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM315requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.CheckboxImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                CheckboxKt.CheckboxImpl(z, toggleableState, modifier, checkboxColors, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CheckboxImpl$lambda-10, reason: not valid java name */
    public static final long m615CheckboxImpl$lambda10(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CheckboxImpl$lambda-4, reason: not valid java name */
    public static final float m616CheckboxImpl$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CheckboxImpl$lambda-6, reason: not valid java name */
    public static final float m617CheckboxImpl$lambda6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CheckboxImpl$lambda-8, reason: not valid java name */
    public static final long m618CheckboxImpl$lambda8(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CheckboxImpl$lambda-9, reason: not valid java name */
    public static final long m619CheckboxImpl$lambda9(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    @Composable
    public static final void TriStateCheckbox(@NotNull final ToggleableState toggleableState, @Nullable final Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable CheckboxColors checkboxColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        CheckboxColors checkboxColorsM614colorszjMxDiM;
        Modifier modifier3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        Modifier modifier4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        CheckboxColors checkboxColors2;
        Object objRememberedValue;
        Composer composer2;
        Modifier modifierM377triStateToggleableO2vRcR0;
        final Modifier modifier5;
        final MutableInteractionSource mutableInteractionSource5;
        final CheckboxColors checkboxColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1517549866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(toggleableState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColorsM614colorszjMxDiM = checkboxColors;
                            int i10 = composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            checkboxColorsM614colorszjMxDiM = checkboxColors;
                        }
                        i3 |= i10;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                    }
                    if (((374491 & i3) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i9 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                            }
                            composerStartRestartGroup.endDefaults();
                            i8 = i3;
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i8 = i3;
                            z4 = z2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                            modifier4 = modifier2;
                        }
                        if (function0 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1517549516);
                            composer2 = composerStartRestartGroup;
                            modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceableGroup(-1517549100);
                            composer2.endReplaceableGroup();
                            modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                        modifier5 = modifier4;
                        z2 = z4;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        checkboxColors3 = checkboxColors2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        composer2 = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColorsM614colorszjMxDiM;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i11) {
                            CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    }
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1517549516);
                        composer2 = composerStartRestartGroup;
                        modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1517549100);
                        composer2.endReplaceableGroup();
                        modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    modifier5 = modifier4;
                    z2 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColors2;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    }
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1517549516);
                        composer2 = composerStartRestartGroup;
                        modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1517549100);
                        composer2.endReplaceableGroup();
                        modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    modifier5 = modifier4;
                    z2 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i11) {
                        CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    }
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1517549516);
                        composer2 = composerStartRestartGroup;
                        modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1517549100);
                        composer2.endReplaceableGroup();
                        modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    modifier5 = modifier4;
                    z2 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColors2;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    }
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1517549516);
                        composer2 = composerStartRestartGroup;
                        modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1517549100);
                        composer2.endReplaceableGroup();
                        modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    modifier5 = modifier4;
                    z2 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i11) {
                        CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColorsM614colorszjMxDiM = checkboxColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                }
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1517549516);
                    composer2 = composerStartRestartGroup;
                    modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1517549100);
                    composer2.endReplaceableGroup();
                    modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                modifier5 = modifier4;
                z2 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColors2;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                }
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1517549516);
                    composer2 = composerStartRestartGroup;
                    modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1517549100);
                    composer2.endReplaceableGroup();
                    modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                modifier5 = modifier4;
                z2 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColors2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i11) {
                    CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColorsM614colorszjMxDiM = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    }
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1517549516);
                        composer2 = composerStartRestartGroup;
                        modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1517549100);
                        composer2.endReplaceableGroup();
                        modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    modifier5 = modifier4;
                    z2 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColors2;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                    }
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1517549516);
                        composer2 = composerStartRestartGroup;
                        modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1517549100);
                        composer2.endReplaceableGroup();
                        modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    modifier5 = modifier4;
                    z2 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i11) {
                        CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColorsM614colorszjMxDiM = checkboxColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                }
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1517549516);
                    composer2 = composerStartRestartGroup;
                    modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1517549100);
                    composer2.endReplaceableGroup();
                    modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                modifier5 = modifier4;
                z2 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColors2;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                }
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1517549516);
                    composer2 = composerStartRestartGroup;
                    modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1517549100);
                    composer2.endReplaceableGroup();
                    modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                modifier5 = modifier4;
                z2 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColors2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i11) {
                    CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColorsM614colorszjMxDiM = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColorsM614colorszjMxDiM = checkboxColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                }
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1517549516);
                    composer2 = composerStartRestartGroup;
                    modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1517549100);
                    composer2.endReplaceableGroup();
                    modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                modifier5 = modifier4;
                z2 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColors2;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColors2 = checkboxColorsM614colorszjMxDiM;
                }
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1517549516);
                    composer2 = composerStartRestartGroup;
                    modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1517549100);
                    composer2.endReplaceableGroup();
                    modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                modifier5 = modifier4;
                z2 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColors2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i11) {
                    CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                checkboxColorsM614colorszjMxDiM = checkboxColors;
                if (composerStartRestartGroup.changed(checkboxColorsM614colorszjMxDiM)) {
                }
                i3 |= i10;
            } else {
                checkboxColorsM614colorszjMxDiM = checkboxColors;
            }
            i3 |= i10;
        } else {
            checkboxColorsM614colorszjMxDiM = checkboxColors;
        }
        if (((374491 & i3) ^ 74898) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z4 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors2 = checkboxColorsM614colorszjMxDiM;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z4 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors2 = checkboxColorsM614colorszjMxDiM;
            }
            if (function0 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1517549516);
                composer2 = composerStartRestartGroup;
                modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1517549100);
                composer2.endReplaceableGroup();
                modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            modifier5 = modifier4;
            z2 = z4;
            mutableInteractionSource5 = mutableInteractionSource4;
            checkboxColors3 = checkboxColors2;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z4 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors2 = checkboxColorsM614colorszjMxDiM;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    checkboxColorsM614colorszjMxDiM = CheckboxDefaults.INSTANCE.m614colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 31);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z4 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                checkboxColors2 = checkboxColorsM614colorszjMxDiM;
            }
            if (function0 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1517549516);
                composer2 = composerStartRestartGroup;
                modifierM377triStateToggleableO2vRcR0 = ToggleableKt.m377triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m2624boximpl(Role.INSTANCE.m2632getCheckboxo7Vup1c()), function0);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1517549100);
                composer2.endReplaceableGroup();
                modifierM377triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            CheckboxImpl(z4, toggleableState, PaddingKt.m281padding3ABfNKs(modifier4.then(modifierM377triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColors2, composer2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            modifier5 = modifier4;
            z2 = z4;
            mutableInteractionSource5 = mutableInteractionSource4;
            checkboxColors3 = checkboxColors2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i11) {
                CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier5, z2, mutableInteractionSource5, checkboxColors3, composer3, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m627drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float fM1052getWidthimpl = Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc());
        float f4 = 2;
        float f5 = fM1052getWidthimpl - (f2 * f4);
        DrawScope.DefaultImpls.m1630drawRoundRectuAw5IA$default(drawScope, j, OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(f / f4, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f6 = fM1052getWidthimpl - f2;
        DrawScope.DefaultImpls.m1630drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f3, f3), androidx.compose.ui.geometry.SizeKt.Size(f6, f6), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m628drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m1483getSquareKaPHkGw(), 0, null, 26, null);
        float fM1052getWidthimpl = Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * fM1052getWidthimpl, fLerp3 * fM1052getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(fLerp * fM1052getWidthimpl, fLerp2 * fM1052getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * fM1052getWidthimpl, fM1052getWidthimpl * fLerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.DefaultImpls.m1624drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }
}
