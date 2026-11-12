package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.c;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u001c\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u001f\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u001f\u0010\"\u001a\u00020\u001d8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!\"\u001f\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0019\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010\u001f\"\u0019\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010\u001f\"\u0019\u0010(\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010\u001f\"\u0019\u0010)\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010\u001f\"\u0019\u0010*\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b*\u0010\u001f\"\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0019\u0010.\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010\u001f\"\u0019\u0010/\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b/\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", Constants.ENABLED, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/State;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "SwitchImpl", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trackColor", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "drawTrack", "Landroidx/compose/ui/unit/Dp;", "TrackWidth", "F", "getTrackWidth", "()F", "TrackStrokeWidth", "getTrackStrokeWidth", "ThumbDiameter", "getThumbDiameter", "ThumbRippleRadius", "DefaultSwitchPadding", "SwitchWidth", "SwitchHeight", "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "ThumbDefaultElevation", "ThumbPressedElevation", "material_release"}, k = 2, mv = {1, 5, 1})
public final class SwitchKt {

    @NotNull
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float fM2965constructorimpl = Dp.m2965constructorimpl(34);
        TrackWidth = fM2965constructorimpl;
        TrackStrokeWidth = Dp.m2965constructorimpl(14);
        float fM2965constructorimpl2 = Dp.m2965constructorimpl(20);
        ThumbDiameter = fM2965constructorimpl2;
        ThumbRippleRadius = Dp.m2965constructorimpl(24);
        DefaultSwitchPadding = Dp.m2965constructorimpl(2);
        SwitchWidth = fM2965constructorimpl;
        SwitchHeight = fM2965constructorimpl2;
        ThumbPathLength = Dp.m2965constructorimpl(fM2965constructorimpl - fM2965constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m2965constructorimpl(1);
        ThumbPressedElevation = Dp.m2965constructorimpl(6);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016b  */
    /* JADX WARN: Code duplicated, block: B:104:0x016e  */
    /* JADX WARN: Code duplicated, block: B:107:0x018b  */
    /* JADX WARN: Code duplicated, block: B:108:0x018e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01df  */
    /* JADX WARN: Code duplicated, block: B:119:0x0248  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:123:0x0258  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    @Composable
    public static final void Switch(final boolean z, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SwitchColors switchColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        SwitchColors switchColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        SwitchColors switchColorsM821colorsSQMK_m0;
        Modifier modifier4;
        boolean z5;
        MutableInteractionSource mutableInteractionSource4;
        SwitchColors switchColors3;
        Object objRememberedValue;
        Function1<? super Boolean, Unit> function2;
        boolean z6;
        Composer composer2;
        Modifier modifierM371toggleableO2vRcR0;
        boolean z7;
        Composer composer3;
        Function0<ComposeUiNode> constructor;
        Modifier modifier5;
        final MutableInteractionSource mutableInteractionSource5;
        final SwitchColors switchColors4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1826260230);
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
        int i8 = i2 & 4;
        if (i8 == 0) {
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
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            int i9 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i3 |= i9;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if (((374491 & i3) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i8 != 0) {
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
                                switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i3 &= -458753;
                            } else {
                                switchColorsM821colorsSQMK_m0 = switchColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColors3 = switchColorsM821colorsSQMK_m0;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColors3 = switchColors2;
                        }
                        int i10 = i3;
                        float fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                        Boolean boolValueOf = Boolean.valueOf(z);
                        if (function1 == null) {
                            function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z8) {
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        SwipeableState swipeableStateRememberSwipeableStateFor = SwipeableKt.rememberSwipeableStateFor(boolValueOf, function2, AnimationSpec, composerStartRestartGroup, (i10 & 14) | 384, 0);
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (function1 != null) {
                            composer2 = composerStartRestartGroup;
                            modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                        } else {
                            composer2 = composerStartRestartGroup;
                            modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        Modifier modifierThen = modifier4.then(modifierM371toggleableO2vRcR0);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_4), Boolean.TRUE));
                        Orientation orientation = Orientation.Horizontal;
                        if (z5 || function1 == null) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, swipeableStateRememberSwipeableStateFor, mapMapOf, orientation, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                                return invoke(bool.booleanValue(), bool2.booleanValue());
                            }

                            @NotNull
                            public final ThresholdConfig invoke(boolean z8, boolean z9) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Modifier modifierM316requiredSizeVpY3zN4 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY, companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        composer3 = composer2;
                        composer3.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(1376089335);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN4);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer3);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer3.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-1229339505);
                        int i11 = i10 << 3;
                        SwitchImpl(boxScopeInstance, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor.getOffset(), mutableInteractionSource4, composer3, (i11 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11 & 458752));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        modifier5 = modifier4;
                        z3 = z5;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors4 = switchColors3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors4 = switchColors2;
                        composer3 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier5;
                    final boolean z8 = z3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer4, int i12) {
                            SwitchKt.Switch(z, function1, modifier6, z8, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i3 |= i9;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i9;
                } else {
                    switchColors2 = switchColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    }
                    int i12 = i3;
                    float fMo193toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z9) {
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor2 = SwipeableKt.rememberSwipeableStateFor(boolValueOf2, function2, AnimationSpec, composerStartRestartGroup, (i12 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    Modifier modifierThen2 = modifier4.then(modifierM371toggleableO2vRcR0);
                    Map mapMapOf2 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_5), Boolean.TRUE));
                    Orientation orientation2 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM819swipeablepPrIpRY2 = SwipeableKt.m819swipeablepPrIpRY(modifierThen2, swipeableStateRememberSwipeableStateFor2, mapMapOf2, orientation2, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z9, boolean z10) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf2.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN5 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY2, companion3.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(1376089335);
                    Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN5);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion4.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1229339505);
                    int i13 = i12 << 3;
                    SwitchImpl(boxScopeInstance2, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor2.getOffset(), mutableInteractionSource4, composer3, (i13 & 112) | 6 | ((i12 >> 3) & 896) | ((i12 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i13 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors4 = switchColors3;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    }
                    int i14 = i3;
                    float fMo193toPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z9) {
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor3 = SwipeableKt.rememberSwipeableStateFor(boolValueOf3, function2, AnimationSpec, composerStartRestartGroup, (i14 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    Modifier modifierThen3 = modifier4.then(modifierM371toggleableO2vRcR0);
                    Map mapMapOf3 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_6), Boolean.TRUE));
                    Orientation orientation3 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM819swipeablepPrIpRY3 = SwipeableKt.m819swipeablepPrIpRY(modifierThen3, swipeableStateRememberSwipeableStateFor3, mapMapOf3, orientation3, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z9, boolean z10) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf3.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN6 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY3, companion5.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(1376089335);
                    Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN6);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl3, density3, companion6.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion6.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1229339505);
                    int i15 = i14 << 3;
                    SwitchImpl(boxScopeInstance3, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor3.getOffset(), mutableInteractionSource4, composer3, (i15 & 112) | 6 | ((i14 >> 3) & 896) | ((i14 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i15 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors4 = switchColors3;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier5;
                final boolean z9 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer4, int i16) {
                        SwitchKt.Switch(z, function1, modifier7, z9, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
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
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i3 |= i9;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i9;
                } else {
                    switchColors2 = switchColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    }
                    int i16 = i3;
                    float fMo193toPx0680j_7 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z10) {
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor4 = SwipeableKt.rememberSwipeableStateFor(boolValueOf4, function2, AnimationSpec, composerStartRestartGroup, (i16 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    Modifier modifierThen4 = modifier4.then(modifierM371toggleableO2vRcR0);
                    Map mapMapOf4 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_7), Boolean.TRUE));
                    Orientation orientation4 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM819swipeablepPrIpRY4 = SwipeableKt.m819swipeablepPrIpRY(modifierThen4, swipeableStateRememberSwipeableStateFor4, mapMapOf4, orientation4, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z10, boolean z11) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf4.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN7 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY4, companion7.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(1376089335);
                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    constructor = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN7);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, companion8.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl4, density4, companion8.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl4, layoutDirection4, companion8.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf4.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1229339505);
                    int i17 = i16 << 3;
                    SwitchImpl(boxScopeInstance4, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor4.getOffset(), mutableInteractionSource4, composer3, (i17 & 112) | 6 | ((i16 >> 3) & 896) | ((i16 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i17 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors4 = switchColors3;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    }
                    int i18 = i3;
                    float fMo193toPx0680j_8 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf5 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z10) {
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor5 = SwipeableKt.rememberSwipeableStateFor(boolValueOf5, function2, AnimationSpec, composerStartRestartGroup, (i18 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    Modifier modifierThen5 = modifier4.then(modifierM371toggleableO2vRcR0);
                    Map mapMapOf5 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_8), Boolean.TRUE));
                    Orientation orientation5 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM819swipeablepPrIpRY5 = SwipeableKt.m819swipeablepPrIpRY(modifierThen5, swipeableStateRememberSwipeableStateFor5, mapMapOf5, orientation5, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z10, boolean z11) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf5.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN8 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY5, companion9.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion9.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(1376089335);
                    Density density5 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN8);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl5, measurePolicyRememberBoxMeasurePolicy5, companion10.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl5, density5, companion10.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl5, layoutDirection5, companion10.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf5.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1229339505);
                    int i19 = i18 << 3;
                    SwitchImpl(boxScopeInstance5, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor5.getOffset(), mutableInteractionSource4, composer3, (i19 & 112) | 6 | ((i18 >> 3) & 896) | ((i18 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors4 = switchColors3;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier5;
                final boolean z10 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer4, int i110) {
                        SwitchKt.Switch(z, function1, modifier8, z10, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i3 |= i9;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i9;
            } else {
                switchColors2 = switchColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                }
                int i110 = i3;
                float fMo193toPx0680j_9 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf6 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z11) {
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor6 = SwipeableKt.rememberSwipeableStateFor(boolValueOf6, function2, AnimationSpec, composerStartRestartGroup, (i110 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                Modifier modifierThen6 = modifier4.then(modifierM371toggleableO2vRcR0);
                Map mapMapOf6 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_9), Boolean.TRUE));
                Orientation orientation6 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM819swipeablepPrIpRY6 = SwipeableKt.m819swipeablepPrIpRY(modifierThen6, swipeableStateRememberSwipeableStateFor6, mapMapOf6, orientation6, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(T t, T t2) {
                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z11, boolean z12) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf6.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion11 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN9 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY6, companion11.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer3 = composer2;
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion11.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089335);
                Density density6 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN9);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composer3);
                Updater.m906setimpl(composerM899constructorimpl6, measurePolicyRememberBoxMeasurePolicy6, companion12.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl6, density6, companion12.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl6, layoutDirection6, companion12.getSetLayoutDirection());
                composer3.enableReusing();
                function3MaterializerOf6.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1229339505);
                int i111 = i110 << 3;
                SwitchImpl(boxScopeInstance6, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor6.getOffset(), mutableInteractionSource4, composer3, (i111 & 112) | 6 | ((i110 >> 3) & 896) | ((i110 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i111 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors4 = switchColors3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                }
                int i112 = i3;
                float fMo193toPx0680j_10 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf7 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z11) {
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor7 = SwipeableKt.rememberSwipeableStateFor(boolValueOf7, function2, AnimationSpec, composerStartRestartGroup, (i112 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                Modifier modifierThen7 = modifier4.then(modifierM371toggleableO2vRcR0);
                Map mapMapOf7 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_10), Boolean.TRUE));
                Orientation orientation7 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM819swipeablepPrIpRY7 = SwipeableKt.m819swipeablepPrIpRY(modifierThen7, swipeableStateRememberSwipeableStateFor7, mapMapOf7, orientation7, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(T t, T t2) {
                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z11, boolean z12) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf7.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN10 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY7, companion13.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer3 = composer2;
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion13.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089335);
                Density density7 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN10);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composer3);
                Updater.m906setimpl(composerM899constructorimpl7, measurePolicyRememberBoxMeasurePolicy7, companion14.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl7, density7, companion14.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl7, layoutDirection7, companion14.getSetLayoutDirection());
                composer3.enableReusing();
                function3MaterializerOf7.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1229339505);
                int i113 = i112 << 3;
                SwitchImpl(boxScopeInstance7, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor7.getOffset(), mutableInteractionSource4, composer3, (i113 & 112) | 6 | ((i112 >> 3) & 896) | ((i112 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i113 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors4 = switchColors3;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier5;
            final boolean z11 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i114) {
                    SwitchKt.Switch(z, function1, modifier9, z11, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
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
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i3 |= i9;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i9;
                } else {
                    switchColors2 = switchColors;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    }
                    int i114 = i3;
                    float fMo193toPx0680j_11 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf8 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z12) {
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor8 = SwipeableKt.rememberSwipeableStateFor(boolValueOf8, function2, AnimationSpec, composerStartRestartGroup, (i114 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    Modifier modifierThen8 = modifier4.then(modifierM371toggleableO2vRcR0);
                    Map mapMapOf8 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_11), Boolean.TRUE));
                    Orientation orientation8 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM819swipeablepPrIpRY8 = SwipeableKt.m819swipeablepPrIpRY(modifierThen8, swipeableStateRememberSwipeableStateFor8, mapMapOf8, orientation8, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z12, boolean z13) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf8.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion15 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN11 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY8, companion15.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(companion15.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(1376089335);
                    Density density8 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection8 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                    constructor = companion16.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN11);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl8 = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl8, measurePolicyRememberBoxMeasurePolicy8, companion16.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl8, density8, companion16.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl8, layoutDirection8, companion16.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf8.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1229339505);
                    int i115 = i114 << 3;
                    SwitchImpl(boxScopeInstance8, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor8.getOffset(), mutableInteractionSource4, composer3, (i115 & 112) | 6 | ((i114 >> 3) & 896) | ((i114 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i115 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors4 = switchColors3;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
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
                            switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i3 &= -458753;
                        } else {
                            switchColorsM821colorsSQMK_m0 = switchColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColors3 = switchColorsM821colorsSQMK_m0;
                    }
                    int i116 = i3;
                    float fMo193toPx0680j_12 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf9 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z12) {
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor9 = SwipeableKt.rememberSwipeableStateFor(boolValueOf9, function2, AnimationSpec, composerStartRestartGroup, (i116 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    Modifier modifierThen9 = modifier4.then(modifierM371toggleableO2vRcR0);
                    Map mapMapOf9 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_12), Boolean.TRUE));
                    Orientation orientation9 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM819swipeablepPrIpRY9 = SwipeableKt.m819swipeablepPrIpRY(modifierThen9, swipeableStateRememberSwipeableStateFor9, mapMapOf9, orientation9, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z12, boolean z13) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf9.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN12 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY9, companion17.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(companion17.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(1376089335);
                    Density density9 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection9 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN12);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl9 = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl9, measurePolicyRememberBoxMeasurePolicy9, companion18.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl9, density9, companion18.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl9, layoutDirection9, companion18.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf9.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1229339505);
                    int i117 = i116 << 3;
                    SwitchImpl(boxScopeInstance9, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor9.getOffset(), mutableInteractionSource4, composer3, (i117 & 112) | 6 | ((i116 >> 3) & 896) | ((i116 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i117 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors4 = switchColors3;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier5;
                final boolean z12 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer4, int i118) {
                        SwitchKt.Switch(z, function1, modifier10, z12, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i3 |= i9;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i9;
            } else {
                switchColors2 = switchColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                }
                int i118 = i3;
                float fMo193toPx0680j_13 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf10 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z13) {
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor10 = SwipeableKt.rememberSwipeableStateFor(boolValueOf10, function2, AnimationSpec, composerStartRestartGroup, (i118 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                Modifier modifierThen10 = modifier4.then(modifierM371toggleableO2vRcR0);
                Map mapMapOf10 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_13), Boolean.TRUE));
                Orientation orientation10 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM819swipeablepPrIpRY10 = SwipeableKt.m819swipeablepPrIpRY(modifierThen10, swipeableStateRememberSwipeableStateFor10, mapMapOf10, orientation10, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(T t, T t2) {
                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z13, boolean z14) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf10.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion19 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN13 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY10, companion19.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer3 = composer2;
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(companion19.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089335);
                Density density10 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                constructor = companion110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN13);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer composerM899constructorimpl10 = Updater.m899constructorimpl(composer3);
                Updater.m906setimpl(composerM899constructorimpl10, measurePolicyRememberBoxMeasurePolicy10, companion110.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl10, density10, companion110.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl10, layoutDirection10, companion110.getSetLayoutDirection());
                composer3.enableReusing();
                function3MaterializerOf10.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1229339505);
                int i119 = i118 << 3;
                SwitchImpl(boxScopeInstance10, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor10.getOffset(), mutableInteractionSource4, composer3, (i119 & 112) | 6 | ((i118 >> 3) & 896) | ((i118 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i119 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors4 = switchColors3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                }
                int i1110 = i3;
                float fMo193toPx0680j_14 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf11 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z13) {
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor11 = SwipeableKt.rememberSwipeableStateFor(boolValueOf11, function2, AnimationSpec, composerStartRestartGroup, (i1110 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                Modifier modifierThen11 = modifier4.then(modifierM371toggleableO2vRcR0);
                Map mapMapOf11 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_14), Boolean.TRUE));
                Orientation orientation11 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM819swipeablepPrIpRY11 = SwipeableKt.m819swipeablepPrIpRY(modifierThen11, swipeableStateRememberSwipeableStateFor11, mapMapOf11, orientation11, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(T t, T t2) {
                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z13, boolean z14) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf11.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion111 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN14 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY11, companion111.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer3 = composer2;
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(companion111.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089335);
                Density density11 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN14);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer composerM899constructorimpl11 = Updater.m899constructorimpl(composer3);
                Updater.m906setimpl(composerM899constructorimpl11, measurePolicyRememberBoxMeasurePolicy11, companion112.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl11, density11, companion112.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl11, layoutDirection11, companion112.getSetLayoutDirection());
                composer3.enableReusing();
                function3MaterializerOf11.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1229339505);
                int i1111 = i1110 << 3;
                SwitchImpl(boxScopeInstance11, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor11.getOffset(), mutableInteractionSource4, composer3, (i1111 & 112) | 6 | ((i1110 >> 3) & 896) | ((i1110 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1111 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors4 = switchColors3;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier5;
            final boolean z13 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i1112) {
                    SwitchKt.Switch(z, function1, modifier11, z13, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
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
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i3 |= i9;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i9;
            } else {
                switchColors2 = switchColors;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                }
                int i1112 = i3;
                float fMo193toPx0680j_15 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf12 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z14) {
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor12 = SwipeableKt.rememberSwipeableStateFor(boolValueOf12, function2, AnimationSpec, composerStartRestartGroup, (i1112 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                Modifier modifierThen12 = modifier4.then(modifierM371toggleableO2vRcR0);
                Map mapMapOf12 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_15), Boolean.TRUE));
                Orientation orientation12 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM819swipeablepPrIpRY12 = SwipeableKt.m819swipeablepPrIpRY(modifierThen12, swipeableStateRememberSwipeableStateFor12, mapMapOf12, orientation12, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(T t, T t2) {
                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z14, boolean z15) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf12.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion113 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN15 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY12, companion113.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer3 = composer2;
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(companion113.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089335);
                Density density12 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection12 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                constructor = companion114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN15);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer composerM899constructorimpl12 = Updater.m899constructorimpl(composer3);
                Updater.m906setimpl(composerM899constructorimpl12, measurePolicyRememberBoxMeasurePolicy12, companion114.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl12, density12, companion114.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl12, layoutDirection12, companion114.getSetLayoutDirection());
                composer3.enableReusing();
                function3MaterializerOf12.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1229339505);
                int i1113 = i1112 << 3;
                SwitchImpl(boxScopeInstance12, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor12.getOffset(), mutableInteractionSource4, composer3, (i1113 & 112) | 6 | ((i1112 >> 3) & 896) | ((i1112 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1113 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors4 = switchColors3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
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
                        switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i3 &= -458753;
                    } else {
                        switchColorsM821colorsSQMK_m0 = switchColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColors3 = switchColorsM821colorsSQMK_m0;
                }
                int i1114 = i3;
                float fMo193toPx0680j_16 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf13 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z14) {
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor13 = SwipeableKt.rememberSwipeableStateFor(boolValueOf13, function2, AnimationSpec, composerStartRestartGroup, (i1114 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                Modifier modifierThen13 = modifier4.then(modifierM371toggleableO2vRcR0);
                Map mapMapOf13 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_16), Boolean.TRUE));
                Orientation orientation13 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM819swipeablepPrIpRY13 = SwipeableKt.m819swipeablepPrIpRY(modifierThen13, swipeableStateRememberSwipeableStateFor13, mapMapOf13, orientation13, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(T t, T t2) {
                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z14, boolean z15) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf13.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion115 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN16 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY13, companion115.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer3 = composer2;
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(companion115.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089335);
                Density density13 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection13 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN16);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer composerM899constructorimpl13 = Updater.m899constructorimpl(composer3);
                Updater.m906setimpl(composerM899constructorimpl13, measurePolicyRememberBoxMeasurePolicy13, companion116.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl13, density13, companion116.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl13, layoutDirection13, companion116.getSetLayoutDirection());
                composer3.enableReusing();
                function3MaterializerOf13.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1229339505);
                int i1115 = i1114 << 3;
                SwitchImpl(boxScopeInstance13, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor13.getOffset(), mutableInteractionSource4, composer3, (i1115 & 112) | 6 | ((i1114 >> 3) & 896) | ((i1114 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1115 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors4 = switchColors3;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier12 = modifier5;
            final boolean z14 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i1116) {
                    SwitchKt.Switch(z, function1, modifier12, z14, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                switchColors2 = switchColors;
                if (composerStartRestartGroup.changed(switchColors2)) {
                }
                i3 |= i9;
            } else {
                switchColors2 = switchColors;
            }
            i3 |= i9;
        } else {
            switchColors2 = switchColors;
        }
        if (((374491 & i3) ^ 74898) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
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
                    switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i3 &= -458753;
                } else {
                    switchColorsM821colorsSQMK_m0 = switchColors2;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                switchColors3 = switchColorsM821colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
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
                    switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i3 &= -458753;
                } else {
                    switchColorsM821colorsSQMK_m0 = switchColors2;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                switchColors3 = switchColorsM821colorsSQMK_m0;
            }
            int i1116 = i3;
            float fMo193toPx0680j_17 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
            Boolean boolValueOf14 = Boolean.valueOf(z);
            if (function1 == null) {
                function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z15) {
                    }
                };
            } else {
                function2 = function1;
            }
            SwipeableState swipeableStateRememberSwipeableStateFor14 = SwipeableKt.rememberSwipeableStateFor(boolValueOf14, function2, AnimationSpec, composerStartRestartGroup, (i1116 & 14) | 384, 0);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (function1 != null) {
                composer2 = composerStartRestartGroup;
                modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
            } else {
                composer2 = composerStartRestartGroup;
                modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            Modifier modifierThen14 = modifier4.then(modifierM371toggleableO2vRcR0);
            Map mapMapOf14 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_17), Boolean.TRUE));
            Orientation orientation14 = Orientation.Horizontal;
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            Modifier modifierM819swipeablepPrIpRY14 = SwipeableKt.m819swipeablepPrIpRY(modifierThen14, swipeableStateRememberSwipeableStateFor14, mapMapOf14, orientation14, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(T t, T t2) {
                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                }
            } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                    return invoke(bool.booleanValue(), bool2.booleanValue());
                }

                @NotNull
                public final ThresholdConfig invoke(boolean z15, boolean z16) {
                    return new FractionalThreshold(0.5f);
                }
            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf14.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
            Alignment.Companion companion117 = Alignment.INSTANCE;
            Modifier modifierM316requiredSizeVpY3zN17 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY14, companion117.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composer3 = composer2;
            composer3.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(companion117.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(1376089335);
            Density density14 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
            constructor = companion118.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN17);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer composerM899constructorimpl14 = Updater.m899constructorimpl(composer3);
            Updater.m906setimpl(composerM899constructorimpl14, measurePolicyRememberBoxMeasurePolicy14, companion118.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl14, density14, companion118.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl14, layoutDirection14, companion118.getSetLayoutDirection());
            composer3.enableReusing();
            function3MaterializerOf14.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            composer3.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            composer3.startReplaceableGroup(-1229339505);
            int i1117 = i1116 << 3;
            SwitchImpl(boxScopeInstance14, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor14.getOffset(), mutableInteractionSource4, composer3, (i1117 & 112) | 6 | ((i1116 >> 3) & 896) | ((i1116 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1117 & 458752));
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            modifier5 = modifier4;
            z3 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors4 = switchColors3;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
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
                    switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i3 &= -458753;
                } else {
                    switchColorsM821colorsSQMK_m0 = switchColors2;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                switchColors3 = switchColorsM821colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
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
                    switchColorsM821colorsSQMK_m0 = SwitchDefaults.INSTANCE.m821colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i3 &= -458753;
                } else {
                    switchColorsM821colorsSQMK_m0 = switchColors2;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                switchColors3 = switchColorsM821colorsSQMK_m0;
            }
            int i1118 = i3;
            float fMo193toPx0680j_18 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(ThumbPathLength);
            Boolean boolValueOf15 = Boolean.valueOf(z);
            if (function1 == null) {
                function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z15) {
                    }
                };
            } else {
                function2 = function1;
            }
            SwipeableState swipeableStateRememberSwipeableStateFor15 = SwipeableKt.rememberSwipeableStateFor(boolValueOf15, function2, AnimationSpec, composerStartRestartGroup, (i1118 & 14) | 384, 0);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (function1 != null) {
                composer2 = composerStartRestartGroup;
                modifierM371toggleableO2vRcR0 = ToggleableKt.m371toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m2624boximpl(Role.INSTANCE.m2635getSwitcho7Vup1c()), function1);
            } else {
                composer2 = composerStartRestartGroup;
                modifierM371toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            Modifier modifierThen15 = modifier4.then(modifierM371toggleableO2vRcR0);
            Map mapMapOf15 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_18), Boolean.TRUE));
            Orientation orientation15 = Orientation.Horizontal;
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            Modifier modifierM819swipeablepPrIpRY15 = SwipeableKt.m819swipeablepPrIpRY(modifierThen15, swipeableStateRememberSwipeableStateFor15, mapMapOf15, orientation15, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(T t, T t2) {
                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                }
            } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                    return invoke(bool.booleanValue(), bool2.booleanValue());
                }

                @NotNull
                public final ThresholdConfig invoke(boolean z15, boolean z16) {
                    return new FractionalThreshold(0.5f);
                }
            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf15.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
            Alignment.Companion companion119 = Alignment.INSTANCE;
            Modifier modifierM316requiredSizeVpY3zN18 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY15, companion119.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composer3 = composer2;
            composer3.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(companion119.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(1376089335);
            Density density15 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection15 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN18);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer composerM899constructorimpl15 = Updater.m899constructorimpl(composer3);
            Updater.m906setimpl(composerM899constructorimpl15, measurePolicyRememberBoxMeasurePolicy15, companion1110.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl15, density15, companion1110.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl15, layoutDirection15, companion1110.getSetLayoutDirection());
            composer3.enableReusing();
            function3MaterializerOf15.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            composer3.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            composer3.startReplaceableGroup(-1229339505);
            int i1119 = i1118 << 3;
            SwitchImpl(boxScopeInstance15, z, z5, switchColors3, swipeableStateRememberSwipeableStateFor15.getOffset(), mutableInteractionSource4, composer3, (i1119 & 112) | 6 | ((i1118 >> 3) & 896) | ((i1118 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1119 & 458752));
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            modifier5 = modifier4;
            z3 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors4 = switchColors3;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier13 = modifier5;
        final boolean z15 = z3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer4, int i11110) {
                SwitchKt.Switch(z, function1, modifier13, z15, mutableInteractionSource5, switchColors4, composer4, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final State<Float> state, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        long jM823SwitchImpl$lambda7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-539246976);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if (((374491 & i2) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i4 = (i2 >> 15) & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            boolean zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i4);
            float f = snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation;
            int i5 = ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | (i2 & 112);
            final State<Color> stateTrackColor = switchColors.trackColor(z2, z, composerStartRestartGroup, i5);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion3, companion4.getCenter()), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            boolean zChanged2 = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
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
                        SwitchKt.m826drawTrackRPmYEkk(drawScope, SwitchKt.m822SwitchImpl$lambda5(stateTrackColor), drawScope.mo193toPx0680j_4(SwitchKt.getTrackWidth()), drawScope.mo193toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z2, z, composerStartRestartGroup, i5);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM2965constructorimpl = Dp.m2965constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m2979unboximpl() + f);
            if (!Color.m1213equalsimpl0(m823SwitchImpl$lambda7(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU()) || elevationOverlay == null) {
                companion = companion3;
                i3 = -3686930;
                composerStartRestartGroup.startReplaceableGroup(-539245328);
                composerStartRestartGroup.endReplaceableGroup();
                jM823SwitchImpl$lambda7 = m823SwitchImpl$lambda7(stateThumbColor);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-539245411);
                i3 = -3686930;
                long jMo672apply7g2Lkgo = elevationOverlay.mo672apply7g2Lkgo(m823SwitchImpl$lambda7(stateThumbColor), fM2965constructorimpl, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                jM823SwitchImpl$lambda7 = jMo672apply7g2Lkgo;
                companion = companion3;
            }
            Modifier modifierAlign = boxScope.align(companion, companion4.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(i3);
            boolean zChanged3 = composerStartRestartGroup.changed(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m3034boximpl(m827invokeBjo55l4(density));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m827invokeBjo55l4(@NotNull Density density) {
                        return IntOffsetKt.IntOffset(c.roundToInt(state.getValue().floatValue()), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m110backgroundbw27NRU(ShadowKt.m922shadowziNgDLE(SizeKt.m315requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue4), interactionSource, RippleKt.m880rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), ThumbDiameter), f, RoundedCornerShapeKt.getCircleShape(), false), jM823SwitchImpl$lambda7, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.SwitchImpl.4
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
                SwitchKt.SwitchImpl(boxScope, z, z2, switchColors, state, interactionSource, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SwitchImpl$lambda-5, reason: not valid java name */
    public static final long m822SwitchImpl$lambda5(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX INFO: renamed from: SwitchImpl$lambda-7, reason: not valid java name */
    private static final long m823SwitchImpl$lambda7(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m826drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m1482getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
