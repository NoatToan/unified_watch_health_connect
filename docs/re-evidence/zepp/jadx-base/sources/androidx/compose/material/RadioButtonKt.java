package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0015\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0019\u0010\u0019\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0019\u0010\u001b\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0019\u0010\u001c\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010\u001d\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u0019\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0019\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", Constants.ENABLED, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "dotRadius", "drawRadio-Hht5A8o", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "drawRadio", "", "RadioAnimationDuration", LogUtil.I, "RadioButtonRippleRadius", "F", "RadioButtonPadding", "RadioButtonSize", "RadioRadius", "RadioButtonDotSize", "RadioStrokeWidth", "material_release"}, k = 2, mv = {1, 5, 1})
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m2965constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    static {
        float f = 2;
        RadioButtonPadding = Dp.m2965constructorimpl(f);
        float fM2965constructorimpl = Dp.m2965constructorimpl(20);
        RadioButtonSize = fM2965constructorimpl;
        RadioRadius = Dp.m2965constructorimpl(fM2965constructorimpl / f);
        RadioButtonDotSize = Dp.m2965constructorimpl(12);
        RadioStrokeWidth = Dp.m2965constructorimpl(f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0144  */
    /* JADX WARN: Code duplicated, block: B:105:0x016f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /* JADX WARN: Code duplicated, block: B:116:0x021e  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    @Composable
    public static final void RadioButton(final boolean z, @Nullable final Function0<Unit> function0, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable RadioButtonColors radioButtonColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        RadioButtonColors radioButtonColorsM782colorsRGew2ao;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        Modifier modifier4;
        boolean z5;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue;
        float fM2965constructorimpl;
        final State<Dp> stateM78animateDpAsStateKz89ssw;
        final State<Color> stateRadioColor;
        Composer composer2;
        boolean z6;
        ?? r12;
        Modifier modifierM366selectableO2vRcR0;
        boolean zChanged;
        Object objRememberedValue2;
        final MutableInteractionSource mutableInteractionSource5;
        final boolean z7;
        final RadioButtonColors radioButtonColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1941631898);
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
                            radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                            int i10 = composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                        }
                        i3 |= i10;
                    } else {
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                                i3 &= -458753;
                                radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                            }
                            composerStartRestartGroup.endDefaults();
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i8 = i3;
                            modifier4 = modifier2;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        if (z) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                        int i11 = i8 >> 9;
                        stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i11 & 896) | (i11 & 14) | ((i8 << 3) & 112));
                        if (function0 != null) {
                            composerStartRestartGroup.startReplaceableGroup(1941632489);
                            z6 = z5;
                            composer2 = composerStartRestartGroup;
                            r12 = 0;
                            modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2 = composerStartRestartGroup;
                            z6 = z5;
                            r12 = 0;
                            composer2.startReplaceableGroup(1941632909);
                            composer2.endReplaceableGroup();
                            modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        modifier2 = modifier4;
                        Modifier modifierM315requiredSize3ABfNKs = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                        composer2.startReplaceableGroup(-3686552);
                        zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                    RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM315requiredSize3ABfNKs, (Function1) objRememberedValue2, composer2, r12);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        z7 = z6;
                        radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z7 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i12) {
                            RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                        }
                        i3 |= i10;
                    } else {
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    if (z) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                    int i12 = i8 >> 9;
                    stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i12 & 896) | (i12 & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1941632489);
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        r12 = 0;
                        modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        z6 = z5;
                        r12 = 0;
                        composer2.startReplaceableGroup(1941632909);
                        composer2.endReplaceableGroup();
                        modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    modifier2 = modifier4;
                    Modifier modifierM315requiredSize3ABfNKs2 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                    composer2.startReplaceableGroup(-3686552);
                    zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM315requiredSize3ABfNKs2, (Function1) objRememberedValue2, composer2, r12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z7 = z6;
                    radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    if (z) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                    int i13 = i8 >> 9;
                    stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i13 & 896) | (i13 & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1941632489);
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        r12 = 0;
                        modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        z6 = z5;
                        r12 = 0;
                        composer2.startReplaceableGroup(1941632909);
                        composer2.endReplaceableGroup();
                        modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    modifier2 = modifier4;
                    Modifier modifierM315requiredSize3ABfNKs3 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                    composer2.startReplaceableGroup(-3686552);
                    zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM315requiredSize3ABfNKs3, (Function1) objRememberedValue2, composer2, r12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z7 = z6;
                    radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z2;
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
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                        }
                        i3 |= i10;
                    } else {
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    if (z) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                    int i14 = i8 >> 9;
                    stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i14 & 896) | (i14 & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1941632489);
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        r12 = 0;
                        modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        z6 = z5;
                        r12 = 0;
                        composer2.startReplaceableGroup(1941632909);
                        composer2.endReplaceableGroup();
                        modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    modifier2 = modifier4;
                    Modifier modifierM315requiredSize3ABfNKs4 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                    composer2.startReplaceableGroup(-3686552);
                    zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM315requiredSize3ABfNKs4, (Function1) objRememberedValue2, composer2, r12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z7 = z6;
                    radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    if (z) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                    int i15 = i8 >> 9;
                    stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i15 & 896) | (i15 & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1941632489);
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        r12 = 0;
                        modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        z6 = z5;
                        r12 = 0;
                        composer2.startReplaceableGroup(1941632909);
                        composer2.endReplaceableGroup();
                        modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    modifier2 = modifier4;
                    Modifier modifierM315requiredSize3ABfNKs5 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                    composer2.startReplaceableGroup(-3686552);
                    zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM315requiredSize3ABfNKs5, (Function1) objRememberedValue2, composer2, r12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z7 = z6;
                    radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i16) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                }
                i3 |= i10;
            } else {
                radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if (z) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                int i16 = i8 >> 9;
                stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i16 & 896) | (i16 & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1941632489);
                    z6 = z5;
                    composer2 = composerStartRestartGroup;
                    r12 = 0;
                    modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    z6 = z5;
                    r12 = 0;
                    composer2.startReplaceableGroup(1941632909);
                    composer2.endReplaceableGroup();
                    modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                }
                modifier2 = modifier4;
                Modifier modifierM315requiredSize3ABfNKs6 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(-3686552);
                zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM315requiredSize3ABfNKs6, (Function1) objRememberedValue2, composer2, r12);
                mutableInteractionSource5 = mutableInteractionSource4;
                z7 = z6;
                radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if (z) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                int i17 = i8 >> 9;
                stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i17 & 896) | (i17 & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1941632489);
                    z6 = z5;
                    composer2 = composerStartRestartGroup;
                    r12 = 0;
                    modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    z6 = z5;
                    r12 = 0;
                    composer2.startReplaceableGroup(1941632909);
                    composer2.endReplaceableGroup();
                    modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                }
                modifier2 = modifier4;
                Modifier modifierM315requiredSize3ABfNKs7 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(-3686552);
                zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM315requiredSize3ABfNKs7, (Function1) objRememberedValue2, composer2, r12);
                mutableInteractionSource5 = mutableInteractionSource4;
                z7 = z6;
                radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i18) {
                    RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
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
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                        }
                        i3 |= i10;
                    } else {
                        radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    if (z) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                    int i18 = i8 >> 9;
                    stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i18 & 896) | (i18 & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1941632489);
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        r12 = 0;
                        modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        z6 = z5;
                        r12 = 0;
                        composer2.startReplaceableGroup(1941632909);
                        composer2.endReplaceableGroup();
                        modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    modifier2 = modifier4;
                    Modifier modifierM315requiredSize3ABfNKs8 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                    composer2.startReplaceableGroup(-3686552);
                    zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM315requiredSize3ABfNKs8, (Function1) objRememberedValue2, composer2, r12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z7 = z6;
                    radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
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
                            i3 &= -458753;
                            radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                        }
                        composerStartRestartGroup.endDefaults();
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    if (z) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                    int i19 = i8 >> 9;
                    stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i19 & 896) | (i19 & 14) | ((i8 << 3) & 112));
                    if (function0 != null) {
                        composerStartRestartGroup.startReplaceableGroup(1941632489);
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        r12 = 0;
                        modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        z6 = z5;
                        r12 = 0;
                        composer2.startReplaceableGroup(1941632909);
                        composer2.endReplaceableGroup();
                        modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    modifier2 = modifier4;
                    Modifier modifierM315requiredSize3ABfNKs9 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                    composer2.startReplaceableGroup(-3686552);
                    zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM315requiredSize3ABfNKs9, (Function1) objRememberedValue2, composer2, r12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z7 = z6;
                    radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i110) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                }
                i3 |= i10;
            } else {
                radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if (z) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                int i110 = i8 >> 9;
                stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i110 & 896) | (i110 & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1941632489);
                    z6 = z5;
                    composer2 = composerStartRestartGroup;
                    r12 = 0;
                    modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    z6 = z5;
                    r12 = 0;
                    composer2.startReplaceableGroup(1941632909);
                    composer2.endReplaceableGroup();
                    modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                }
                modifier2 = modifier4;
                Modifier modifierM315requiredSize3ABfNKs10 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(-3686552);
                zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM315requiredSize3ABfNKs10, (Function1) objRememberedValue2, composer2, r12);
                mutableInteractionSource5 = mutableInteractionSource4;
                z7 = z6;
                radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if (z) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                int i111 = i8 >> 9;
                stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i111 & 896) | (i111 & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1941632489);
                    z6 = z5;
                    composer2 = composerStartRestartGroup;
                    r12 = 0;
                    modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    z6 = z5;
                    r12 = 0;
                    composer2.startReplaceableGroup(1941632909);
                    composer2.endReplaceableGroup();
                    modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                }
                modifier2 = modifier4;
                Modifier modifierM315requiredSize3ABfNKs11 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(-3686552);
                zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM315requiredSize3ABfNKs11, (Function1) objRememberedValue2, composer2, r12);
                mutableInteractionSource5 = mutableInteractionSource4;
                z7 = z6;
                radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i112) {
                    RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z2;
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
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                }
                i3 |= i10;
            } else {
                radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if (z) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                int i112 = i8 >> 9;
                stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i112 & 896) | (i112 & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1941632489);
                    z6 = z5;
                    composer2 = composerStartRestartGroup;
                    r12 = 0;
                    modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    z6 = z5;
                    r12 = 0;
                    composer2.startReplaceableGroup(1941632909);
                    composer2.endReplaceableGroup();
                    modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                }
                modifier2 = modifier4;
                Modifier modifierM315requiredSize3ABfNKs12 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(-3686552);
                zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM315requiredSize3ABfNKs12, (Function1) objRememberedValue2, composer2, r12);
                mutableInteractionSource5 = mutableInteractionSource4;
                z7 = z6;
                radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
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
                        i3 &= -458753;
                        radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                    }
                    composerStartRestartGroup.endDefaults();
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if (z) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                int i113 = i8 >> 9;
                stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i113 & 896) | (i113 & 14) | ((i8 << 3) & 112));
                if (function0 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1941632489);
                    z6 = z5;
                    composer2 = composerStartRestartGroup;
                    r12 = 0;
                    modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    z6 = z5;
                    r12 = 0;
                    composer2.startReplaceableGroup(1941632909);
                    composer2.endReplaceableGroup();
                    modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
                }
                modifier2 = modifier4;
                Modifier modifierM315requiredSize3ABfNKs13 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
                composer2.startReplaceableGroup(-3686552);
                zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM315requiredSize3ABfNKs13, (Function1) objRememberedValue2, composer2, r12);
                mutableInteractionSource5 = mutableInteractionSource4;
                z7 = z6;
                radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i114) {
                    RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                radioButtonColorsM782colorsRGew2ao = radioButtonColors;
                if (composerStartRestartGroup.changed(radioButtonColorsM782colorsRGew2ao)) {
                }
                i3 |= i10;
            } else {
                radioButtonColorsM782colorsRGew2ao = radioButtonColors;
            }
            i3 |= i10;
        } else {
            radioButtonColorsM782colorsRGew2ao = radioButtonColors;
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
                    i3 &= -458753;
                    radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
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
                    i3 &= -458753;
                    radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            if (z) {
                fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
            } else {
                fM2965constructorimpl = Dp.m2965constructorimpl(0);
            }
            stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
            int i114 = i8 >> 9;
            stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i114 & 896) | (i114 & 14) | ((i8 << 3) & 112));
            if (function0 != null) {
                composerStartRestartGroup.startReplaceableGroup(1941632489);
                z6 = z5;
                composer2 = composerStartRestartGroup;
                r12 = 0;
                modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                z6 = z5;
                r12 = 0;
                composer2.startReplaceableGroup(1941632909);
                composer2.endReplaceableGroup();
                modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
            }
            modifier2 = modifier4;
            Modifier modifierM315requiredSize3ABfNKs14 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
            composer2.startReplaceableGroup(-3686552);
            zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM315requiredSize3ABfNKs14, (Function1) objRememberedValue2, composer2, r12);
            mutableInteractionSource5 = mutableInteractionSource4;
            z7 = z6;
            radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
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
                    i3 &= -458753;
                    radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
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
                    i3 &= -458753;
                    radioButtonColorsM782colorsRGew2ao = RadioButtonDefaults.INSTANCE.m782colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 0, 7);
                }
                composerStartRestartGroup.endDefaults();
                i8 = i3;
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            if (z) {
                fM2965constructorimpl = Dp.m2965constructorimpl(RadioButtonDotSize / 2);
            } else {
                fM2965constructorimpl = Dp.m2965constructorimpl(0);
            }
            stateM78animateDpAsStateKz89ssw = AnimateAsStateKt.m78animateDpAsStateKz89ssw(fM2965constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
            int i115 = i8 >> 9;
            stateRadioColor = radioButtonColorsM782colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, (i115 & 896) | (i115 & 14) | ((i8 << 3) & 112));
            if (function0 != null) {
                composerStartRestartGroup.startReplaceableGroup(1941632489);
                z6 = z5;
                composer2 = composerStartRestartGroup;
                r12 = 0;
                modifierM366selectableO2vRcR0 = SelectableKt.m366selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m880rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z6, Role.m2624boximpl(Role.INSTANCE.m2634getRadioButtono7Vup1c()), function0);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                z6 = z5;
                r12 = 0;
                composer2.startReplaceableGroup(1941632909);
                composer2.endReplaceableGroup();
                modifierM366selectableO2vRcR0 = Modifier.INSTANCE;
            }
            modifier2 = modifier4;
            Modifier modifierM315requiredSize3ABfNKs15 = SizeKt.m315requiredSize3ABfNKs(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(modifierM366selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, 2, null), RadioButtonPadding), RadioButtonSize);
            composer2.startReplaceableGroup(-3686552);
            zChanged = composer2.changed(stateRadioColor) | composer2.changed(stateM78animateDpAsStateKz89ssw);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        RadioButtonKt.m788drawRadioHht5A8o(drawScope, RadioButtonKt.m784RadioButton$lambda2(stateRadioColor), RadioButtonKt.m783RadioButton$lambda1(stateM78animateDpAsStateKz89ssw));
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM315requiredSize3ABfNKs15, (Function1) objRememberedValue2, composer2, r12);
            mutableInteractionSource5 = mutableInteractionSource4;
            z7 = z6;
            radioButtonColors2 = radioButtonColorsM782colorsRGew2ao;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i116) {
                RadioButtonKt.RadioButton(z, function0, modifier2, z7, mutableInteractionSource5, radioButtonColors2, composer3, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: RadioButton$lambda-1, reason: not valid java name */
    public static final float m783RadioButton$lambda1(State<Dp> state) {
        return state.getValue().m2979unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: RadioButton$lambda-2, reason: not valid java name */
    public static final long m784RadioButton$lambda2(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRadio-Hht5A8o, reason: not valid java name */
    public static final void m788drawRadioHht5A8o(DrawScope drawScope, long j, float f) {
        float fMo193toPx0680j_4 = drawScope.mo193toPx0680j_4(RadioStrokeWidth);
        float f2 = fMo193toPx0680j_4 / 2;
        DrawScope.DefaultImpls.m1616drawCircleVaOC9Bg$default(drawScope, j, drawScope.mo193toPx0680j_4(RadioRadius) - f2, 0L, 0.0f, new Stroke(fMo193toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m2964compareTo0680j_4(f, Dp.m2965constructorimpl(0)) > 0) {
            DrawScope.DefaultImpls.m1616drawCircleVaOC9Bg$default(drawScope, j, drawScope.mo193toPx0680j_4(f) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
    }
}
