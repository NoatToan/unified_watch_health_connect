package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.math.c;
import kotlin.ranges.e;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aõ\u0001\u0010(\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001c2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a3\u0010.\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010+\u001a\u00020\u0006H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a=\u00101\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00002\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0004\b1\u00102\u001a`\u00108\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002040\u00052\u001d\u00107\u001a\u0019\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e06¢\u0006\u0002\b\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0019\u0010:\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BackdropScaffoldState;", "rememberBackdropScaffoldState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "gesturesEnabled", "Landroidx/compose/ui/unit/Dp;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "Landroidx/compose/ui/graphics/Color;", "backLayerBackgroundColor", "backLayerContentColor", "Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropScaffold", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "target", "content", "BackLayerTransition", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "backLayer", "Landroidx/compose/ui/unit/Constraints;", "calculateBackLayerConstraints", "Lkotlin/Function2;", "frontLayer", "BackdropStack", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "AnimationSlideOffset", "F", "material_release"}, k = 2, mv = {1, 5, 1})
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m2965constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1142038671);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(backdropValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        int i3 = i2;
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 0, 12);
            float fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(AnimationSlideOffset);
            float f = 1;
            float fCoerceIn = e.coerceIn(m568BackLayerTransition$lambda7(stateAnimateFloatAsState) - f, 0.0f, 1.0f);
            float fCoerceIn2 = e.coerceIn(f - m568BackLayerTransition$lambda7(stateAnimateFloatAsState), 0.0f, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1538629202);
            Modifier modifierM1347graphicsLayersKFY_QE$default = GraphicsLayerModifierKt.m1347graphicsLayersKFY_QE$default(ZIndexModifierKt.zIndex(companion, fCoerceIn), 0.0f, 0.0f, fCoerceIn, 0.0f, (f - fCoerceIn) * fMo193toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 8171, null);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM1347graphicsLayersKFY_QE$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            composerStartRestartGroup.startReplaceableGroup(-481855329);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1347graphicsLayersKFY_QE$default2 = GraphicsLayerModifierKt.m1347graphicsLayersKFY_QE$default(ZIndexModifierKt.zIndex(companion, fCoerceIn2), 0.0f, 0.0f, fCoerceIn2, 0.0f, (f - fCoerceIn2) * (-fMo193toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 8171, null);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM1347graphicsLayersKFY_QE$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            composerStartRestartGroup.startReplaceableGroup(-481855090);
            function3.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackLayerTransition.2
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
                BackdropScaffoldKt.BackLayerTransition(backdropValue, function2, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: renamed from: BackLayerTransition$lambda-7, reason: not valid java name */
    private static final float m568BackLayerTransition$lambda7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:120:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0195  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019f  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:162:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:174:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:177:0x0208  */
    /* JADX WARN: Code duplicated, block: B:179:0x020c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0213  */
    /* JADX WARN: Code duplicated, block: B:184:0x0217  */
    /* JADX WARN: Code duplicated, block: B:186:0x021f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0222  */
    /* JADX WARN: Code duplicated, block: B:190:0x0229  */
    /* JADX WARN: Code duplicated, block: B:193:0x0239  */
    /* JADX WARN: Code duplicated, block: B:199:0x026b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0279  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:240:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:241:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:244:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:245:0x0318  */
    /* JADX WARN: Code duplicated, block: B:247:0x0322  */
    /* JADX WARN: Code duplicated, block: B:250:0x0327  */
    /* JADX WARN: Code duplicated, block: B:253:0x0334  */
    /* JADX WARN: Code duplicated, block: B:254:0x033d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0341  */
    /* JADX WARN: Code duplicated, block: B:257:0x0343  */
    /* JADX WARN: Code duplicated, block: B:259:0x0347  */
    /* JADX WARN: Code duplicated, block: B:260:0x0349  */
    /* JADX WARN: Code duplicated, block: B:263:0x0350  */
    /* JADX WARN: Code duplicated, block: B:264:0x035f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0365  */
    /* JADX WARN: Code duplicated, block: B:268:0x036e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0376  */
    /* JADX WARN: Code duplicated, block: B:272:0x037f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0385  */
    /* JADX WARN: Code duplicated, block: B:276:0x038e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0396  */
    /* JADX WARN: Code duplicated, block: B:280:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:283:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:284:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:287:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:288:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:291:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:292:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:296:0x0453  */
    /* JADX WARN: Code duplicated, block: B:298:0x045b  */
    /* JADX WARN: Code duplicated, block: B:303:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    public static final void m569BackdropScaffoldBZszfkY(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function3, @NotNull final Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Modifier modifier, @Nullable BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, @Nullable Shape shape, float f3, long j3, long j4, long j5, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function5, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        BackdropScaffoldState backdropScaffoldState2;
        int i5;
        boolean z4;
        int i6;
        float fM567getPeekHeightD9Ej5fM;
        float f4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        long j6;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function6;
        int i13;
        Modifier modifier2;
        BackdropScaffoldState backdropScaffoldStateRememberBackdropScaffoldState;
        float fM566getHeaderHeightD9Ej5fM;
        boolean z5;
        boolean z6;
        long jM638getPrimary0d7_KjU;
        long jM656contentColorForek8zF_U;
        int i14;
        Shape frontLayerShape;
        float fM565getFrontLayerElevationD9Ej5fM;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U2;
        long frontLayerScrimColor;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M662getLambda1$material_release;
        long j7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function7;
        float f5;
        int i15;
        long j8;
        long j9;
        long j10;
        final int i16;
        Modifier modifier3;
        float f6;
        boolean z7;
        Shape shape3;
        boolean z8;
        final float fMo193toPx0680j_4;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier4;
        final BackdropScaffoldState backdropScaffoldState3;
        Shape shape4;
        final float f7;
        final long j11;
        final long j12;
        final long j13;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function8;
        final long j14;
        final boolean z9;
        final float f8;
        final boolean z10;
        final boolean z11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1341968169);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(function4) ? 256 : 128;
        }
        int i23 = i3 & 8;
        if (i23 == 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            if ((i & 57344) == 0) {
                backdropScaffoldState2 = backdropScaffoldState;
                if ((i3 & 16) == 0 || !composerStartRestartGroup.changed(backdropScaffoldState2)) {
                    i22 = 8192;
                } else {
                    i22 = 16384;
                }
                i4 |= i22;
            } else {
                backdropScaffoldState2 = backdropScaffoldState;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= 196608;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(z4)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
            }
            if ((i & 3670016) == 0) {
                fM567getPeekHeightD9Ej5fM = f;
                if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(fM567getPeekHeightD9Ej5fM)) {
                    i21 = 524288;
                } else {
                    i21 = 1048576;
                }
                i4 |= i21;
            } else {
                fM567getPeekHeightD9Ej5fM = f;
            }
            if ((i & 29360128) == 0) {
                if ((i3 & 128) == 0) {
                    f4 = f2;
                    int i24 = composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    i4 |= i24;
                } else {
                    f4 = f2;
                }
                i4 |= i24;
            } else {
                f4 = f2;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i10 = i4 | C.ENCODING_PCM_32BIT;
                    i9 = i9;
                } else {
                    if ((i & 1879048192) != 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i4 |= i11;
                    }
                    i10 = i4;
                }
                if ((i2 & 14) == 0) {
                    if ((i3 & 1024) == 0 || !composerStartRestartGroup.changed(j)) {
                        i20 = 2;
                    } else {
                        i20 = 4;
                    }
                    i12 = i2 | i20;
                } else {
                    i12 = i2;
                }
                if ((i2 & 112) != 0) {
                    if ((i3 & 2048) == 0 || !composerStartRestartGroup.changed(j2)) {
                        i19 = 16;
                    } else {
                        i19 = 32;
                    }
                    i12 |= i19;
                }
                if ((i2 & 896) == 0) {
                    if ((i3 & 4096) == 0) {
                        shape2 = shape;
                        int i25 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                        i12 |= i25;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i25;
                } else {
                    shape2 = shape;
                }
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i12 |= ((i3 & 8192) == 0 || !composerStartRestartGroup.changed(f3)) ? 1024 : 2048;
                }
                if ((i2 & 57344) != 0) {
                    i12 |= ((i3 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
                }
                if ((458752 & i2) != 0) {
                    if ((32768 & i3) == 0 || !composerStartRestartGroup.changed(j4)) {
                        i18 = 65536;
                    } else {
                        i18 = 131072;
                    }
                    i12 |= i18;
                }
                if ((3670016 & i2) == 0) {
                    j6 = j5;
                    if ((i3 & 65536) == 0 || !composerStartRestartGroup.changed(j6)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i12 |= i17;
                } else {
                    j6 = j5;
                }
                if ((29360128 & i2) == 0) {
                    if ((i3 & 131072) == 0) {
                        function6 = function5;
                        int i26 = composerStartRestartGroup.changed(function6) ? 8388608 : 4194304;
                        i12 |= i26;
                    } else {
                        function6 = function5;
                    }
                    i12 |= i26;
                } else {
                    function6 = function5;
                }
                i13 = i12;
                if (((i10 & 1533916891) ^ 306783378) != 0 && ((i13 & 23967451) ^ 4793490) == 0 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    z9 = z2;
                    j9 = j2;
                    f5 = f3;
                    j11 = j3;
                    j12 = j4;
                    function8 = function6;
                    shape4 = shape2;
                    j13 = j6;
                    z11 = z4;
                    f7 = fM567getPeekHeightD9Ej5fM;
                    z10 = z3;
                    j14 = j;
                    f8 = f4;
                    backdropScaffoldState3 = backdropScaffoldState2;
                } else {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 16) != 0) {
                            backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                            i10 &= -57345;
                        } else {
                            backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if ((i3 & 64) != 0) {
                            i10 &= -3670017;
                            fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                        }
                        if ((i3 & 128) != 0) {
                            fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                            i10 &= -29360129;
                        } else {
                            fM566getHeaderHeightD9Ej5fM = f2;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if ((i3 & 1024) != 0) {
                            i13 &= -15;
                            jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                        } else {
                            jM638getPrimary0d7_KjU = j;
                        }
                        if ((i3 & 2048) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                            i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        i14 = i13;
                        if ((i3 & 4096) != 0) {
                            frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                            i14 &= -897;
                        } else {
                            frontLayerShape = shape;
                        }
                        if ((i3 & 8192) != 0) {
                            fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                            i14 &= -7169;
                        } else {
                            fM565getFrontLayerElevationD9Ej5fM = f3;
                        }
                        BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldStateRememberBackdropScaffoldState;
                        if ((i3 & 16384) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i14 &= -57345;
                        } else {
                            jM642getSurface0d7_KjU = j3;
                        }
                        if ((i3 & 32768) != 0) {
                            jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                            i14 &= -458753;
                        } else {
                            jM656contentColorForek8zF_U2 = j4;
                        }
                        if ((i3 & 65536) != 0) {
                            frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                            i14 &= -3670017;
                        } else {
                            frontLayerScrimColor = j5;
                        }
                        if ((i3 & 131072) != 0) {
                            function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                            i14 &= -29360129;
                        } else {
                            function3M662getLambda1$material_release = function5;
                        }
                        composerStartRestartGroup.endDefaults();
                        j7 = frontLayerScrimColor;
                        function7 = function3M662getLambda1$material_release;
                        f5 = fM565getFrontLayerElevationD9Ej5fM;
                        i15 = i14;
                        j8 = jM656contentColorForek8zF_U2;
                        j9 = jM656contentColorForek8zF_U;
                        j10 = jM642getSurface0d7_KjU;
                        i16 = i10;
                        modifier3 = modifier2;
                        f6 = fM566getHeaderHeightD9Ej5fM;
                        backdropScaffoldState2 = backdropScaffoldState4;
                        z7 = z6;
                        shape3 = frontLayerShape;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i3 & 16) != 0) {
                            i10 &= -57345;
                        }
                        if ((i3 & 64) != 0) {
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i10 &= -29360129;
                        }
                        if ((i3 & 1024) != 0) {
                            i13 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        }
                        int i27 = i13;
                        if ((i3 & 4096) != 0) {
                            i27 &= -897;
                        }
                        if ((i3 & 8192) != 0) {
                            i27 &= -7169;
                        }
                        if ((i3 & 16384) != 0) {
                            i27 &= -57345;
                        }
                        if ((32768 & i3) != 0) {
                            i27 &= -458753;
                        }
                        if ((i3 & 65536) != 0) {
                            i27 &= -3670017;
                        }
                        if ((i3 & 131072) != 0) {
                            i27 &= -29360129;
                        }
                        z8 = z2;
                        jM638getPrimary0d7_KjU = j;
                        j9 = j2;
                        f5 = f3;
                        j10 = j3;
                        j8 = j4;
                        j7 = j5;
                        i15 = i27;
                        function7 = function6;
                        f6 = f4;
                        shape3 = shape2;
                        i16 = i10;
                        modifier3 = modifier;
                        z7 = z3;
                    }
                    final float fMo193toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
                    fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
                    final boolean z12 = z8;
                    final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                    final int i28 = i16;
                    boolean z13 = z8;
                    final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                        public final void invoke(@Nullable Composer composer2, int i29) {
                            if (((i29 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (!z12) {
                                composer2.startReplaceableGroup(-1017265259);
                                BackdropValue targetValue = backdropScaffoldState5.getTargetValue();
                                Function2<Composer, Integer, Unit> function9 = function2;
                                Function2<Composer, Integer, Unit> function10 = function3;
                                int i30 = i28;
                                BackdropScaffoldKt.BackLayerTransition(targetValue, function9, function10, composer2, ((i30 << 3) & 896) | ((i30 << 3) & 112));
                                composer2.endReplaceableGroup();
                                return;
                            }
                            composer2.startReplaceableGroup(-1017265371);
                            Function2<Composer, Integer, Unit> function11 = function2;
                            int i31 = i28;
                            Function2<Composer, Integer, Unit> function12 = function3;
                            composer2.startReplaceableGroup(-1113031299);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(276693241);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1993300243);
                            function11.invoke(composer2, Integer.valueOf(i31 & 14));
                            function12.invoke(composer2, Integer.valueOf((i31 >> 3) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    Float fValueOf = Float.valueOf(fMo193toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(fValueOf);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                            }

                            /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                            public final long m576invokeZezNO4M(long j15) {
                                return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j15, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final Function1 function1 = (Function1) objRememberedValue;
                    final Modifier modifier5 = modifier3;
                    final boolean z14 = z7;
                    final boolean z15 = z4;
                    final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState2;
                    final Shape shape5 = shape3;
                    final long j15 = j10;
                    final long j16 = j8;
                    final float f9 = f5;
                    final int i29 = i15;
                    final float f10 = f6;
                    final float f11 = fM567getPeekHeightD9Ej5fM;
                    final long j17 = j7;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function9 = function7;
                    int i30 = i15 << 6;
                    SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i31) {
                            if (((i31 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function10 = composableLambda;
                            Function1<Constraints, Constraints> function11 = function1;
                            final float f12 = fMo193toPx0680j_4;
                            final boolean z16 = z14;
                            final boolean z17 = z15;
                            final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState6;
                            final float f13 = fMo193toPx0680j_5;
                            final int i32 = i16;
                            final Shape shape6 = shape5;
                            final long j18 = j15;
                            final long j19 = j16;
                            final float f14 = f9;
                            final int i33 = i29;
                            final float f15 = f10;
                            final float f16 = f11;
                            final Function2<Composer, Integer, Unit> function12 = function4;
                            final long j20 = j17;
                            final Function3<SnackbarHostState, Composer, Integer, Unit> function13 = function9;
                            BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function10, function11, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer3, Integer num) {
                                    m574invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                                @Composable
                                /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                                public final void m574invokejYbf7pk(long j21, float f17, @Nullable Composer composer3, int i34) {
                                    int i35;
                                    float fM2965constructorimpl;
                                    if ((i34 & 14) == 0) {
                                        i35 = i34 | (composer3.changed(j21) ? 4 : 2);
                                    } else {
                                        i35 = i34;
                                    }
                                    if ((i34 & 112) == 0) {
                                        i35 |= composer3.changed(f17) ? 32 : 16;
                                    }
                                    if (((i35 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                                    float fMin = fM2934getMaxHeightimpl - f12;
                                    if (z16) {
                                        fMin = Math.min(fMin, f17);
                                    }
                                    float f18 = fMin;
                                    Modifier modifierNestedScroll$default = z17 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                    BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                    Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f18), BackdropValue.Revealed));
                                    Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState8, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z17, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        @NotNull
                                        public final FixedThreshold invoke(T t, T t2) {
                                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                        }
                                    } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                                    final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            if (backdropScaffoldState9.isConcealed()) {
                                                final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState9;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                                    /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                                    public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new C00411(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @Nullable
                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                            return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) {
                                                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                this.label = 1;
                                                                if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    /* JADX INFO: renamed from: invoke */
                                                    public final Boolean getA() {
                                                        if (backdropScaffoldState10.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                            kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState10, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            } else {
                                                final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState9;
                                                final CoroutineScope coroutineScope4 = coroutineScope2;
                                                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                                    /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @Nullable
                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) {
                                                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                this.label = 1;
                                                                if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    /* JADX INFO: renamed from: invoke */
                                                    public final Boolean getA() {
                                                        if (backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                            kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null);
                                    final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                    composer3.startReplaceableGroup(-3686930);
                                    boolean zChanged2 = composer3.changed(backdropScaffoldState10);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                            }

                                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m575invokeBjo55l4(@NotNull Density density) {
                                                return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState10.getOffset().getValue().floatValue()));
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                    Shape shape7 = shape6;
                                    long j22 = j18;
                                    long j23 = j19;
                                    float f19 = f14;
                                    final float f20 = f16;
                                    final Function2<Composer, Integer, Unit> function14 = function12;
                                    final int i36 = i32;
                                    final long j24 = j20;
                                    final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                    final int i37 = i33;
                                    final boolean z18 = z17;
                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i38) {
                                            if (((i38 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                            Function2<Composer, Integer, Unit> function15 = function14;
                                            int i39 = i36;
                                            long j25 = j24;
                                            final BackdropScaffoldState backdropScaffoldState12 = backdropScaffoldState11;
                                            int i40 = i37;
                                            final boolean z19 = z18;
                                            final CoroutineScope coroutineScope4 = coroutineScope3;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(967343144);
                                            function15.invoke(composer4, Integer.valueOf((i39 >> 6) & 14));
                                            BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                    if (z19 && backdropScaffoldState12.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState12, null), 3, null);
                                                    }
                                                }
                                            }, backdropScaffoldState12.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    });
                                    int i38 = i33;
                                    SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape7, j22, j23, (BorderStroke) null, f19, composableLambda2, composer3, 1572864 | ((i38 >> 3) & 112) | ((i38 >> 6) & 896) | ((i38 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i38 << 6) & 458752), 16);
                                    if (backdropScaffoldState7.isRevealed()) {
                                        if (f18 == fM2934getMaxHeightimpl - f12) {
                                            fM2965constructorimpl = f15;
                                        } else {
                                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                        }
                                    } else {
                                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                    }
                                    Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                    Function3<SnackbarHostState, Composer, Integer, Unit> function15 = function13;
                                    BackdropScaffoldState backdropScaffoldState12 = backdropScaffoldState7;
                                    int i39 = i33;
                                    composer3.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                                    composer3.startReplaceableGroup(1395535623);
                                    function15.invoke(backdropScaffoldState12.getSnackbarHostState(), composer3, Integer.valueOf((i39 >> 18) & 112));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 3120);
                        }
                    }), composerStartRestartGroup, (i30 & 896) | 1572864 | (i30 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
                    modifier4 = modifier3;
                    backdropScaffoldState3 = backdropScaffoldState2;
                    shape4 = shape3;
                    f7 = fM567getPeekHeightD9Ej5fM;
                    j11 = j10;
                    j12 = j8;
                    j13 = j7;
                    function8 = function7;
                    j14 = jM638getPrimary0d7_KjU;
                    z9 = z13;
                    f8 = f6;
                    boolean z16 = z4;
                    z10 = z7;
                    z11 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j18 = j9;
                final Shape shape6 = shape4;
                final float f12 = f5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                    public final void invoke(@Nullable Composer composer2, int i31) {
                        BackdropScaffoldKt.m569BackdropScaffoldBZszfkY(function2, function3, function4, modifier4, backdropScaffoldState3, z11, f7, f8, z9, z10, j14, j18, shape6, f12, j11, j12, j13, function8, composer2, i | 1, i2, i3);
                    }
                });
            }
            i4 |= 100663296;
            i9 = i3 & 512;
            if (i9 != 0) {
                i10 = i4 | C.ENCODING_PCM_32BIT;
                i9 = i9;
            } else {
                if ((i & 1879048192) != 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i4 |= i11;
                }
                i10 = i4;
            }
            if ((i2 & 14) == 0) {
                if ((i3 & 1024) == 0) {
                    i20 = 2;
                } else {
                    i20 = 2;
                }
                i12 = i2 | i20;
            } else {
                i12 = i2;
            }
            if ((i2 & 112) != 0) {
                if ((i3 & 2048) == 0) {
                    i19 = 16;
                } else {
                    i19 = 16;
                }
                i12 |= i19;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4096) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i25;
                } else {
                    shape2 = shape;
                }
                i12 |= i25;
            } else {
                shape2 = shape;
            }
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i12 |= ((i3 & 8192) == 0 || !composerStartRestartGroup.changed(f3)) ? 1024 : 2048;
            }
            if ((i2 & 57344) != 0) {
                i12 |= ((i3 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
            }
            if ((458752 & i2) != 0) {
                if ((32768 & i3) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((3670016 & i2) == 0) {
                j6 = j5;
                if ((i3 & 65536) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                j6 = j5;
            }
            if ((29360128 & i2) == 0) {
                if ((i3 & 131072) == 0) {
                    function6 = function5;
                    if (composerStartRestartGroup.changed(function6)) {
                    }
                    i12 |= i26;
                } else {
                    function6 = function5;
                }
                i12 |= i26;
            } else {
                function6 = function5;
            }
            i13 = i12;
            if (((i10 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState7;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState8;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                }
                final float fMo193toPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
                fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
                final boolean z17 = z8;
                final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState2;
                final int i210 = i16;
                boolean z18 = z8;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                    public final void invoke(@Nullable Composer composer2, int i211) {
                        if (((i211 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (!z17) {
                            composer2.startReplaceableGroup(-1017265259);
                            BackdropValue targetValue = backdropScaffoldState9.getTargetValue();
                            Function2<Composer, Integer, Unit> function10 = function2;
                            Function2<Composer, Integer, Unit> function11 = function3;
                            int i31 = i210;
                            BackdropScaffoldKt.BackLayerTransition(targetValue, function10, function11, composer2, ((i31 << 3) & 896) | ((i31 << 3) & 112));
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.startReplaceableGroup(-1017265371);
                        Function2<Composer, Integer, Unit> function12 = function2;
                        int i32 = i210;
                        Function2<Composer, Integer, Unit> function13 = function3;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1993300243);
                        function12.invoke(composer2, Integer.valueOf(i32 & 14));
                        function13.invoke(composer2, Integer.valueOf((i32 >> 3) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                Float fValueOf2 = Float.valueOf(fMo193toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(fValueOf2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j19) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j19, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j19) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j19, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Function1<? super Constraints, Constraints> function10 = (Function1) objRememberedValue;
                final Modifier modifier6 = modifier3;
                final boolean z19 = z7;
                final boolean z110 = z4;
                final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState2;
                final Shape shape7 = shape3;
                final long j19 = j10;
                final long j110 = j8;
                final float f13 = f5;
                final int i211 = i15;
                final float f14 = f6;
                final float f15 = fM567getPeekHeightD9Ej5fM;
                final long j111 = j7;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function11 = function7;
                int i31 = i15 << 6;
                SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i32) {
                        if (((i32 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function12 = composableLambda2;
                        Function1<Constraints, Constraints> function13 = function10;
                        final float f16 = fMo193toPx0680j_4;
                        final boolean z111 = z19;
                        final boolean z112 = z110;
                        final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                        final float f17 = fMo193toPx0680j_6;
                        final int i33 = i16;
                        final Shape shape8 = shape7;
                        final long j112 = j19;
                        final long j113 = j110;
                        final float f18 = f13;
                        final int i34 = i211;
                        final float f19 = f14;
                        final float f110 = f15;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function4;
                        final long j20 = j111;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function15 = function11;
                        BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function12, function13, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f111, Composer composer3, Integer num) {
                                m574invokejYbf7pk(constraints.getValue(), f111.floatValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                            @Composable
                            /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m574invokejYbf7pk(long j21, float f111, @Nullable Composer composer3, int i35) {
                                int i36;
                                float fM2965constructorimpl;
                                if ((i35 & 14) == 0) {
                                    i36 = i35 | (composer3.changed(j21) ? 4 : 2);
                                } else {
                                    i36 = i35;
                                }
                                if ((i35 & 112) == 0) {
                                    i36 |= composer3.changed(f111) ? 32 : 16;
                                }
                                if (((i36 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                                float fMin = fM2934getMaxHeightimpl - f16;
                                if (z111) {
                                    fMin = Math.min(fMin, f111);
                                }
                                float f112 = fMin;
                                Modifier modifierNestedScroll$default = z112 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState11.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                BackdropScaffoldState backdropScaffoldState12 = backdropScaffoldState11;
                                Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f17), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f112), BackdropValue.Revealed));
                                Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState12, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z112, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                    }
                                } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                                final BackdropScaffoldState backdropScaffoldState13 = backdropScaffoldState11;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        if (backdropScaffoldState13.isConcealed()) {
                                            final BackdropScaffoldState backdropScaffoldState14 = backdropScaffoldState13;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C00411(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState14.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState14, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BackdropScaffoldState backdropScaffoldState15 = backdropScaffoldState13;
                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState15.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState15, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null);
                                final BackdropScaffoldState backdropScaffoldState14 = backdropScaffoldState11;
                                composer3.startReplaceableGroup(-3686930);
                                boolean zChanged2 = composer3.changed(backdropScaffoldState14);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                        }

                                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m575invokeBjo55l4(@NotNull Density density) {
                                            return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState14.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                Shape shape9 = shape8;
                                long j22 = j112;
                                long j23 = j113;
                                float f113 = f18;
                                final float f20 = f110;
                                final Function2<? super Composer, ? super Integer, Unit> function16 = function14;
                                final int i37 = i33;
                                final long j24 = j20;
                                final BackdropScaffoldState backdropScaffoldState15 = backdropScaffoldState11;
                                final int i38 = i34;
                                final boolean z113 = z112;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i39) {
                                        if (((i39 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                        Function2<Composer, Integer, Unit> function17 = function16;
                                        int i310 = i37;
                                        long j25 = j24;
                                        final BackdropScaffoldState backdropScaffoldState16 = backdropScaffoldState15;
                                        int i40 = i38;
                                        final boolean z114 = z113;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(967343144);
                                        function17.invoke(composer4, Integer.valueOf((i310 >> 6) & 14));
                                        BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                if (z114 && backdropScaffoldState16.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState16, null), 3, null);
                                                }
                                            }
                                        }, backdropScaffoldState16.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                });
                                int i39 = i34;
                                SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape9, j22, j23, (BorderStroke) null, f113, composableLambda3, composer3, 1572864 | ((i39 >> 3) & 112) | ((i39 >> 6) & 896) | ((i39 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i39 << 6) & 458752), 16);
                                if (backdropScaffoldState11.isRevealed()) {
                                    if (f112 == fM2934getMaxHeightimpl - f16) {
                                        fM2965constructorimpl = f19;
                                    } else {
                                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                    }
                                } else {
                                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                }
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                Function3<SnackbarHostState, Composer, Integer, Unit> function17 = function15;
                                BackdropScaffoldState backdropScaffoldState16 = backdropScaffoldState11;
                                int i310 = i34;
                                composer3.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                                composer3.startReplaceableGroup(1376089335);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                                composer3.startReplaceableGroup(1395535623);
                                function17.invoke(backdropScaffoldState16.getSnackbarHostState(), composer3, Integer.valueOf((i310 >> 18) & 112));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 3120);
                    }
                }), composerStartRestartGroup, (i31 & 896) | 1572864 | (i31 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
                modifier4 = modifier3;
                backdropScaffoldState3 = backdropScaffoldState2;
                shape4 = shape3;
                f7 = fM567getPeekHeightD9Ej5fM;
                j11 = j10;
                j12 = j8;
                j13 = j7;
                function8 = function7;
                j14 = jM638getPrimary0d7_KjU;
                z9 = z18;
                f8 = f6;
                boolean z111 = z4;
                z10 = z7;
                z11 = z111;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState11;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState12 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState12;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                }
                final float fMo193toPx0680j_7 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
                fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
                final boolean z112 = z8;
                final BackdropScaffoldState backdropScaffoldState13 = backdropScaffoldState2;
                final int i212 = i16;
                boolean z113 = z8;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                    public final void invoke(@Nullable Composer composer2, int i213) {
                        if (((i213 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (!z112) {
                            composer2.startReplaceableGroup(-1017265259);
                            BackdropValue targetValue = backdropScaffoldState13.getTargetValue();
                            Function2<Composer, Integer, Unit> function12 = function2;
                            Function2<Composer, Integer, Unit> function13 = function3;
                            int i32 = i212;
                            BackdropScaffoldKt.BackLayerTransition(targetValue, function12, function13, composer2, ((i32 << 3) & 896) | ((i32 << 3) & 112));
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.startReplaceableGroup(-1017265371);
                        Function2<Composer, Integer, Unit> function14 = function2;
                        int i33 = i212;
                        Function2<Composer, Integer, Unit> function15 = function3;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1993300243);
                        function14.invoke(composer2, Integer.valueOf(i33 & 14));
                        function15.invoke(composer2, Integer.valueOf((i33 >> 3) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                Float fValueOf3 = Float.valueOf(fMo193toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(fValueOf3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j112) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j112, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j112) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j112, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Function1<? super Constraints, Constraints> function12 = (Function1) objRememberedValue;
                final Modifier modifier7 = modifier3;
                final boolean z114 = z7;
                final boolean z115 = z4;
                final BackdropScaffoldState backdropScaffoldState14 = backdropScaffoldState2;
                final Shape shape8 = shape3;
                final long j112 = j10;
                final long j113 = j8;
                final float f16 = f5;
                final int i213 = i15;
                final float f17 = f6;
                final float f18 = fM567getPeekHeightD9Ej5fM;
                final long j114 = j7;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function13 = function7;
                int i32 = i15 << 6;
                SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i33) {
                        if (((i33 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function14 = composableLambda3;
                        Function1<Constraints, Constraints> function15 = function12;
                        final float f19 = fMo193toPx0680j_4;
                        final boolean z116 = z114;
                        final boolean z117 = z115;
                        final BackdropScaffoldState backdropScaffoldState15 = backdropScaffoldState14;
                        final float f110 = fMo193toPx0680j_7;
                        final int i34 = i16;
                        final Shape shape9 = shape8;
                        final long j115 = j112;
                        final long j116 = j113;
                        final float f111 = f16;
                        final int i35 = i213;
                        final float f112 = f17;
                        final float f113 = f18;
                        final Function2<? super Composer, ? super Integer, Unit> function16 = function4;
                        final long j20 = j114;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function17 = function13;
                        BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function14, function15, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f114, Composer composer3, Integer num) {
                                m574invokejYbf7pk(constraints.getValue(), f114.floatValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                            @Composable
                            /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m574invokejYbf7pk(long j21, float f114, @Nullable Composer composer3, int i36) {
                                int i37;
                                float fM2965constructorimpl;
                                if ((i36 & 14) == 0) {
                                    i37 = i36 | (composer3.changed(j21) ? 4 : 2);
                                } else {
                                    i37 = i36;
                                }
                                if ((i36 & 112) == 0) {
                                    i37 |= composer3.changed(f114) ? 32 : 16;
                                }
                                if (((i37 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                                float fMin = fM2934getMaxHeightimpl - f19;
                                if (z116) {
                                    fMin = Math.min(fMin, f114);
                                }
                                float f115 = fMin;
                                Modifier modifierNestedScroll$default = z117 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState15.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                BackdropScaffoldState backdropScaffoldState16 = backdropScaffoldState15;
                                Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f110), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f115), BackdropValue.Revealed));
                                Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState16, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z117, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                    }
                                } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                                final BackdropScaffoldState backdropScaffoldState17 = backdropScaffoldState15;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        if (backdropScaffoldState17.isConcealed()) {
                                            final BackdropScaffoldState backdropScaffoldState18 = backdropScaffoldState17;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C00411(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState18.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState18, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BackdropScaffoldState backdropScaffoldState19 = backdropScaffoldState17;
                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState19.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState19, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null);
                                final BackdropScaffoldState backdropScaffoldState18 = backdropScaffoldState15;
                                composer3.startReplaceableGroup(-3686930);
                                boolean zChanged2 = composer3.changed(backdropScaffoldState18);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                        }

                                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m575invokeBjo55l4(@NotNull Density density) {
                                            return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState18.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                Shape shape10 = shape9;
                                long j22 = j115;
                                long j23 = j116;
                                float f116 = f111;
                                final float f20 = f113;
                                final Function2<? super Composer, ? super Integer, Unit> function18 = function16;
                                final int i38 = i34;
                                final long j24 = j20;
                                final BackdropScaffoldState backdropScaffoldState19 = backdropScaffoldState15;
                                final int i39 = i35;
                                final boolean z118 = z117;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i310) {
                                        if (((i310 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                        Function2<Composer, Integer, Unit> function19 = function18;
                                        int i311 = i38;
                                        long j25 = j24;
                                        final BackdropScaffoldState backdropScaffoldState110 = backdropScaffoldState19;
                                        int i40 = i39;
                                        final boolean z119 = z118;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(967343144);
                                        function19.invoke(composer4, Integer.valueOf((i311 >> 6) & 14));
                                        BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                if (z119 && backdropScaffoldState110.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState110, null), 3, null);
                                                }
                                            }
                                        }, backdropScaffoldState110.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                });
                                int i310 = i35;
                                SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape10, j22, j23, (BorderStroke) null, f116, composableLambda4, composer3, 1572864 | ((i310 >> 3) & 112) | ((i310 >> 6) & 896) | ((i310 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i310 << 6) & 458752), 16);
                                if (backdropScaffoldState15.isRevealed()) {
                                    if (f115 == fM2934getMaxHeightimpl - f19) {
                                        fM2965constructorimpl = f112;
                                    } else {
                                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                    }
                                } else {
                                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                }
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                Function3<SnackbarHostState, Composer, Integer, Unit> function19 = function17;
                                BackdropScaffoldState backdropScaffoldState110 = backdropScaffoldState15;
                                int i311 = i35;
                                composer3.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                                composer3.startReplaceableGroup(1376089335);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                                composer3.startReplaceableGroup(1395535623);
                                function19.invoke(backdropScaffoldState110.getSnackbarHostState(), composer3, Integer.valueOf((i311 >> 18) & 112));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 3120);
                    }
                }), composerStartRestartGroup, (i32 & 896) | 1572864 | (i32 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
                modifier4 = modifier3;
                backdropScaffoldState3 = backdropScaffoldState2;
                shape4 = shape3;
                f7 = fM567getPeekHeightD9Ej5fM;
                j11 = j10;
                j12 = j8;
                j13 = j7;
                function8 = function7;
                j14 = jM638getPrimary0d7_KjU;
                z9 = z113;
                f8 = f6;
                boolean z116 = z4;
                z10 = z7;
                z11 = z116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j115 = j9;
            final Shape shape9 = shape4;
            final float f19 = f5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                public final void invoke(@Nullable Composer composer2, int i33) {
                    BackdropScaffoldKt.m569BackdropScaffoldBZszfkY(function2, function3, function4, modifier4, backdropScaffoldState3, z11, f7, f8, z9, z10, j14, j115, shape9, f19, j11, j12, j13, function8, composer2, i | 1, i2, i3);
                }
            });
        }
        i4 |= 3072;
        if ((i & 57344) == 0) {
            backdropScaffoldState2 = backdropScaffoldState;
            if ((i3 & 16) == 0) {
                i22 = 8192;
            } else {
                i22 = 8192;
            }
            i4 |= i22;
        } else {
            backdropScaffoldState2 = backdropScaffoldState;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(z4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
        }
        if ((i & 3670016) == 0) {
            fM567getPeekHeightD9Ej5fM = f;
            if ((i3 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i4 |= i21;
        } else {
            fM567getPeekHeightD9Ej5fM = f;
        }
        if ((i & 29360128) == 0) {
            if ((i3 & 128) == 0) {
                f4 = f2;
                if (composerStartRestartGroup.changed(f4)) {
                }
                i4 |= i24;
            } else {
                f4 = f2;
            }
            i4 |= i24;
        } else {
            f4 = f2;
        }
        i7 = i3 & 256;
        if (i7 != 0) {
            if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                i10 = i4 | C.ENCODING_PCM_32BIT;
                i9 = i9;
            } else {
                if ((i & 1879048192) != 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i4 |= i11;
                }
                i10 = i4;
            }
            if ((i2 & 14) == 0) {
                if ((i3 & 1024) == 0) {
                    i20 = 2;
                } else {
                    i20 = 2;
                }
                i12 = i2 | i20;
            } else {
                i12 = i2;
            }
            if ((i2 & 112) != 0) {
                if ((i3 & 2048) == 0) {
                    i19 = 16;
                } else {
                    i19 = 16;
                }
                i12 |= i19;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4096) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i25;
                } else {
                    shape2 = shape;
                }
                i12 |= i25;
            } else {
                shape2 = shape;
            }
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i12 |= ((i3 & 8192) == 0 || !composerStartRestartGroup.changed(f3)) ? 1024 : 2048;
            }
            if ((i2 & 57344) != 0) {
                i12 |= ((i3 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
            }
            if ((458752 & i2) != 0) {
                if ((32768 & i3) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((3670016 & i2) == 0) {
                j6 = j5;
                if ((i3 & 65536) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                j6 = j5;
            }
            if ((29360128 & i2) == 0) {
                if ((i3 & 131072) == 0) {
                    function6 = function5;
                    if (composerStartRestartGroup.changed(function6)) {
                    }
                    i12 |= i26;
                } else {
                    function6 = function5;
                }
                i12 |= i26;
            } else {
                function6 = function5;
            }
            i13 = i12;
            if (((i10 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState15 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState15;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState16 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState16;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                }
                final float fMo193toPx0680j_8 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
                fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
                final boolean z117 = z8;
                final BackdropScaffoldState backdropScaffoldState17 = backdropScaffoldState2;
                final int i214 = i16;
                boolean z118 = z8;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                    public final void invoke(@Nullable Composer composer2, int i215) {
                        if (((i215 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (!z117) {
                            composer2.startReplaceableGroup(-1017265259);
                            BackdropValue targetValue = backdropScaffoldState17.getTargetValue();
                            Function2<Composer, Integer, Unit> function14 = function2;
                            Function2<Composer, Integer, Unit> function15 = function3;
                            int i33 = i214;
                            BackdropScaffoldKt.BackLayerTransition(targetValue, function14, function15, composer2, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.startReplaceableGroup(-1017265371);
                        Function2<Composer, Integer, Unit> function16 = function2;
                        int i34 = i214;
                        Function2<Composer, Integer, Unit> function17 = function3;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1993300243);
                        function16.invoke(composer2, Integer.valueOf(i34 & 14));
                        function17.invoke(composer2, Integer.valueOf((i34 >> 3) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                Float fValueOf4 = Float.valueOf(fMo193toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(fValueOf4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j116) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j116, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j116) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j116, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Function1<? super Constraints, Constraints> function14 = (Function1) objRememberedValue;
                final Modifier modifier8 = modifier3;
                final boolean z119 = z7;
                final boolean z1110 = z4;
                final BackdropScaffoldState backdropScaffoldState18 = backdropScaffoldState2;
                final Shape shape10 = shape3;
                final long j116 = j10;
                final long j117 = j8;
                final float f110 = f5;
                final int i215 = i15;
                final float f111 = f6;
                final float f112 = fM567getPeekHeightD9Ej5fM;
                final long j118 = j7;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function15 = function7;
                int i33 = i15 << 6;
                SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i34) {
                        if (((i34 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier8, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function16 = composableLambda4;
                        Function1<Constraints, Constraints> function17 = function14;
                        final float f113 = fMo193toPx0680j_4;
                        final boolean z1111 = z119;
                        final boolean z1112 = z1110;
                        final BackdropScaffoldState backdropScaffoldState19 = backdropScaffoldState18;
                        final float f114 = fMo193toPx0680j_8;
                        final int i35 = i16;
                        final Shape shape11 = shape10;
                        final long j119 = j116;
                        final long j1110 = j117;
                        final float f115 = f110;
                        final int i36 = i215;
                        final float f116 = f111;
                        final float f117 = f112;
                        final Function2<? super Composer, ? super Integer, Unit> function18 = function4;
                        final long j20 = j118;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function19 = function15;
                        BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function16, function17, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f118, Composer composer3, Integer num) {
                                m574invokejYbf7pk(constraints.getValue(), f118.floatValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                            @Composable
                            /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m574invokejYbf7pk(long j21, float f118, @Nullable Composer composer3, int i37) {
                                int i38;
                                float fM2965constructorimpl;
                                if ((i37 & 14) == 0) {
                                    i38 = i37 | (composer3.changed(j21) ? 4 : 2);
                                } else {
                                    i38 = i37;
                                }
                                if ((i37 & 112) == 0) {
                                    i38 |= composer3.changed(f118) ? 32 : 16;
                                }
                                if (((i38 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                                float fMin = fM2934getMaxHeightimpl - f113;
                                if (z1111) {
                                    fMin = Math.min(fMin, f118);
                                }
                                float f119 = fMin;
                                Modifier modifierNestedScroll$default = z1112 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState19.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                BackdropScaffoldState backdropScaffoldState110 = backdropScaffoldState19;
                                Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f114), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f119), BackdropValue.Revealed));
                                Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState110, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z1112, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                    }
                                } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                                final BackdropScaffoldState backdropScaffoldState111 = backdropScaffoldState19;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        if (backdropScaffoldState111.isConcealed()) {
                                            final BackdropScaffoldState backdropScaffoldState112 = backdropScaffoldState111;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C00411(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState112.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState112, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BackdropScaffoldState backdropScaffoldState113 = backdropScaffoldState111;
                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState113.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState113, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null);
                                final BackdropScaffoldState backdropScaffoldState112 = backdropScaffoldState19;
                                composer3.startReplaceableGroup(-3686930);
                                boolean zChanged2 = composer3.changed(backdropScaffoldState112);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                        }

                                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m575invokeBjo55l4(@NotNull Density density) {
                                            return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState112.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                Shape shape12 = shape11;
                                long j22 = j119;
                                long j23 = j1110;
                                float f1110 = f115;
                                final float f20 = f117;
                                final Function2<? super Composer, ? super Integer, Unit> function110 = function18;
                                final int i39 = i35;
                                final long j24 = j20;
                                final BackdropScaffoldState backdropScaffoldState113 = backdropScaffoldState19;
                                final int i310 = i36;
                                final boolean z1113 = z1112;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i311) {
                                        if (((i311 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                        Function2<Composer, Integer, Unit> function111 = function110;
                                        int i312 = i39;
                                        long j25 = j24;
                                        final BackdropScaffoldState backdropScaffoldState114 = backdropScaffoldState113;
                                        int i40 = i310;
                                        final boolean z1114 = z1113;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(967343144);
                                        function111.invoke(composer4, Integer.valueOf((i312 >> 6) & 14));
                                        BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                if (z1114 && backdropScaffoldState114.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState114, null), 3, null);
                                                }
                                            }
                                        }, backdropScaffoldState114.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                });
                                int i311 = i36;
                                SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape12, j22, j23, (BorderStroke) null, f1110, composableLambda5, composer3, 1572864 | ((i311 >> 3) & 112) | ((i311 >> 6) & 896) | ((i311 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i311 << 6) & 458752), 16);
                                if (backdropScaffoldState19.isRevealed()) {
                                    if (f119 == fM2934getMaxHeightimpl - f113) {
                                        fM2965constructorimpl = f116;
                                    } else {
                                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                    }
                                } else {
                                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                }
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                Function3<SnackbarHostState, Composer, Integer, Unit> function111 = function19;
                                BackdropScaffoldState backdropScaffoldState114 = backdropScaffoldState19;
                                int i312 = i36;
                                composer3.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                                composer3.startReplaceableGroup(1376089335);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                                composer3.startReplaceableGroup(1395535623);
                                function111.invoke(backdropScaffoldState114.getSnackbarHostState(), composer3, Integer.valueOf((i312 >> 18) & 112));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 3120);
                    }
                }), composerStartRestartGroup, (i33 & 896) | 1572864 | (i33 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
                modifier4 = modifier3;
                backdropScaffoldState3 = backdropScaffoldState2;
                shape4 = shape3;
                f7 = fM567getPeekHeightD9Ej5fM;
                j11 = j10;
                j12 = j8;
                j13 = j7;
                function8 = function7;
                j14 = jM638getPrimary0d7_KjU;
                z9 = z118;
                f8 = f6;
                boolean z1111 = z4;
                z10 = z7;
                z11 = z1111;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState19 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState19;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 16) != 0) {
                        backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                        i10 &= -57345;
                    } else {
                        backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                        fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                    }
                    if ((i3 & 128) != 0) {
                        fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                        i10 &= -29360129;
                    } else {
                        fM566getHeaderHeightD9Ej5fM = f2;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if ((i3 & 1024) != 0) {
                        i13 &= -15;
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j;
                    }
                    if ((i3 & 2048) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                        i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i14 = i13;
                    if ((i3 & 4096) != 0) {
                        frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                        i14 &= -897;
                    } else {
                        frontLayerShape = shape;
                    }
                    if ((i3 & 8192) != 0) {
                        fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                        i14 &= -7169;
                    } else {
                        fM565getFrontLayerElevationD9Ej5fM = f3;
                    }
                    BackdropScaffoldState backdropScaffoldState110 = backdropScaffoldStateRememberBackdropScaffoldState;
                    if ((i3 & 16384) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i14 &= -57345;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i3 & 32768) != 0) {
                        jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                        i14 &= -458753;
                    } else {
                        jM656contentColorForek8zF_U2 = j4;
                    }
                    if ((i3 & 65536) != 0) {
                        frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                        i14 &= -3670017;
                    } else {
                        frontLayerScrimColor = j5;
                    }
                    if ((i3 & 131072) != 0) {
                        function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                        i14 &= -29360129;
                    } else {
                        function3M662getLambda1$material_release = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    j7 = frontLayerScrimColor;
                    function7 = function3M662getLambda1$material_release;
                    f5 = fM565getFrontLayerElevationD9Ej5fM;
                    i15 = i14;
                    j8 = jM656contentColorForek8zF_U2;
                    j9 = jM656contentColorForek8zF_U;
                    j10 = jM642getSurface0d7_KjU;
                    i16 = i10;
                    modifier3 = modifier2;
                    f6 = fM566getHeaderHeightD9Ej5fM;
                    backdropScaffoldState2 = backdropScaffoldState110;
                    z7 = z6;
                    shape3 = frontLayerShape;
                    z8 = z5;
                }
                final float fMo193toPx0680j_9 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
                fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
                final boolean z1112 = z8;
                final BackdropScaffoldState backdropScaffoldState111 = backdropScaffoldState2;
                final int i216 = i16;
                boolean z1113 = z8;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                    public final void invoke(@Nullable Composer composer2, int i217) {
                        if (((i217 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (!z1112) {
                            composer2.startReplaceableGroup(-1017265259);
                            BackdropValue targetValue = backdropScaffoldState111.getTargetValue();
                            Function2<Composer, Integer, Unit> function16 = function2;
                            Function2<Composer, Integer, Unit> function17 = function3;
                            int i34 = i216;
                            BackdropScaffoldKt.BackLayerTransition(targetValue, function16, function17, composer2, ((i34 << 3) & 896) | ((i34 << 3) & 112));
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.startReplaceableGroup(-1017265371);
                        Function2<Composer, Integer, Unit> function18 = function2;
                        int i35 = i216;
                        Function2<Composer, Integer, Unit> function19 = function3;
                        composer2.startReplaceableGroup(-1113031299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(276693241);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1993300243);
                        function18.invoke(composer2, Integer.valueOf(i35 & 14));
                        function19.invoke(composer2, Integer.valueOf((i35 >> 3) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                Float fValueOf5 = Float.valueOf(fMo193toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(fValueOf5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j119) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j119, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                        }

                        /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m576invokeZezNO4M(long j119) {
                            return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j119, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Function1<? super Constraints, Constraints> function16 = (Function1) objRememberedValue;
                final Modifier modifier9 = modifier3;
                final boolean z1114 = z7;
                final boolean z1115 = z4;
                final BackdropScaffoldState backdropScaffoldState112 = backdropScaffoldState2;
                final Shape shape11 = shape3;
                final long j119 = j10;
                final long j1110 = j8;
                final float f113 = f5;
                final int i217 = i15;
                final float f114 = f6;
                final float f115 = fM567getPeekHeightD9Ej5fM;
                final long j1111 = j7;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function17 = function7;
                int i34 = i15 << 6;
                SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i35) {
                        if (((i35 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier9, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function18 = composableLambda5;
                        Function1<Constraints, Constraints> function19 = function16;
                        final float f116 = fMo193toPx0680j_4;
                        final boolean z1116 = z1114;
                        final boolean z1117 = z1115;
                        final BackdropScaffoldState backdropScaffoldState113 = backdropScaffoldState112;
                        final float f117 = fMo193toPx0680j_9;
                        final int i36 = i16;
                        final Shape shape12 = shape11;
                        final long j1112 = j119;
                        final long j1113 = j1110;
                        final float f118 = f113;
                        final int i37 = i217;
                        final float f119 = f114;
                        final float f1110 = f115;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function4;
                        final long j20 = j1111;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function111 = function17;
                        BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function18, function19, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f1111, Composer composer3, Integer num) {
                                m574invokejYbf7pk(constraints.getValue(), f1111.floatValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                            @Composable
                            /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m574invokejYbf7pk(long j21, float f1111, @Nullable Composer composer3, int i38) {
                                int i39;
                                float fM2965constructorimpl;
                                if ((i38 & 14) == 0) {
                                    i39 = i38 | (composer3.changed(j21) ? 4 : 2);
                                } else {
                                    i39 = i38;
                                }
                                if ((i38 & 112) == 0) {
                                    i39 |= composer3.changed(f1111) ? 32 : 16;
                                }
                                if (((i39 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                                float fMin = fM2934getMaxHeightimpl - f116;
                                if (z1116) {
                                    fMin = Math.min(fMin, f1111);
                                }
                                float f1112 = fMin;
                                Modifier modifierNestedScroll$default = z1117 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState113.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                BackdropScaffoldState backdropScaffoldState114 = backdropScaffoldState113;
                                Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f117), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f1112), BackdropValue.Revealed));
                                Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState114, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z1117, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                    }
                                } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                                final BackdropScaffoldState backdropScaffoldState115 = backdropScaffoldState113;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        if (backdropScaffoldState115.isConcealed()) {
                                            final BackdropScaffoldState backdropScaffoldState116 = backdropScaffoldState115;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C00411(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState116.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState116, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BackdropScaffoldState backdropScaffoldState117 = backdropScaffoldState115;
                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                                /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                            this.label = 1;
                                                            if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* JADX INFO: renamed from: invoke */
                                                public final Boolean getA() {
                                                    if (backdropScaffoldState117.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState117, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null);
                                final BackdropScaffoldState backdropScaffoldState116 = backdropScaffoldState113;
                                composer3.startReplaceableGroup(-3686930);
                                boolean zChanged2 = composer3.changed(backdropScaffoldState116);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                        }

                                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m575invokeBjo55l4(@NotNull Density density) {
                                            return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState116.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                Shape shape13 = shape12;
                                long j22 = j1112;
                                long j23 = j1113;
                                float f1113 = f118;
                                final float f20 = f1110;
                                final Function2<? super Composer, ? super Integer, Unit> function112 = function110;
                                final int i310 = i36;
                                final long j24 = j20;
                                final BackdropScaffoldState backdropScaffoldState117 = backdropScaffoldState113;
                                final int i311 = i37;
                                final boolean z1118 = z1117;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i312) {
                                        if (((i312 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                        Function2<Composer, Integer, Unit> function113 = function112;
                                        int i313 = i310;
                                        long j25 = j24;
                                        final BackdropScaffoldState backdropScaffoldState118 = backdropScaffoldState117;
                                        int i40 = i311;
                                        final boolean z1119 = z1118;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(967343144);
                                        function113.invoke(composer4, Integer.valueOf((i313 >> 6) & 14));
                                        BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                if (z1119 && backdropScaffoldState118.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState118, null), 3, null);
                                                }
                                            }
                                        }, backdropScaffoldState118.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                });
                                int i312 = i37;
                                SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape13, j22, j23, (BorderStroke) null, f1113, composableLambda6, composer3, 1572864 | ((i312 >> 3) & 112) | ((i312 >> 6) & 896) | ((i312 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i312 << 6) & 458752), 16);
                                if (backdropScaffoldState113.isRevealed()) {
                                    if (f1112 == fM2934getMaxHeightimpl - f116) {
                                        fM2965constructorimpl = f119;
                                    } else {
                                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                    }
                                } else {
                                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                }
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                Function3<SnackbarHostState, Composer, Integer, Unit> function113 = function111;
                                BackdropScaffoldState backdropScaffoldState118 = backdropScaffoldState113;
                                int i313 = i37;
                                composer3.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                                composer3.startReplaceableGroup(1376089335);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                                composer3.startReplaceableGroup(1395535623);
                                function113.invoke(backdropScaffoldState118.getSnackbarHostState(), composer3, Integer.valueOf((i313 >> 18) & 112));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 3120);
                    }
                }), composerStartRestartGroup, (i34 & 896) | 1572864 | (i34 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
                modifier4 = modifier3;
                backdropScaffoldState3 = backdropScaffoldState2;
                shape4 = shape3;
                f7 = fM567getPeekHeightD9Ej5fM;
                j11 = j10;
                j12 = j8;
                j13 = j7;
                function8 = function7;
                j14 = jM638getPrimary0d7_KjU;
                z9 = z1113;
                f8 = f6;
                boolean z1116 = z4;
                z10 = z7;
                z11 = z1116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j1112 = j9;
            final Shape shape12 = shape4;
            final float f116 = f5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                public final void invoke(@Nullable Composer composer2, int i35) {
                    BackdropScaffoldKt.m569BackdropScaffoldBZszfkY(function2, function3, function4, modifier4, backdropScaffoldState3, z11, f7, f8, z9, z10, j14, j1112, shape12, f116, j11, j12, j13, function8, composer2, i | 1, i2, i3);
                }
            });
        }
        i4 |= 100663296;
        i9 = i3 & 512;
        if (i9 != 0) {
            i10 = i4 | C.ENCODING_PCM_32BIT;
            i9 = i9;
        } else {
            if ((i & 1879048192) != 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i4 |= i11;
            }
            i10 = i4;
        }
        if ((i2 & 14) == 0) {
            if ((i3 & 1024) == 0) {
                i20 = 2;
            } else {
                i20 = 2;
            }
            i12 = i2 | i20;
        } else {
            i12 = i2;
        }
        if ((i2 & 112) != 0) {
            if ((i3 & 2048) == 0) {
                i19 = 16;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4096) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i25;
            } else {
                shape2 = shape;
            }
            i12 |= i25;
        } else {
            shape2 = shape;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            i12 |= ((i3 & 8192) == 0 || !composerStartRestartGroup.changed(f3)) ? 1024 : 2048;
        }
        if ((i2 & 57344) != 0) {
            i12 |= ((i3 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
        }
        if ((458752 & i2) != 0) {
            if ((32768 & i3) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        }
        if ((3670016 & i2) == 0) {
            j6 = j5;
            if ((i3 & 65536) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        } else {
            j6 = j5;
        }
        if ((29360128 & i2) == 0) {
            if ((i3 & 131072) == 0) {
                function6 = function5;
                if (composerStartRestartGroup.changed(function6)) {
                }
                i12 |= i26;
            } else {
                function6 = function5;
            }
            i12 |= i26;
        } else {
            function6 = function5;
        }
        i13 = i12;
        if (((i10 & 1533916891) ^ 306783378) != 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 16) != 0) {
                    backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                    i10 &= -57345;
                } else {
                    backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                if ((i3 & 64) != 0) {
                    i10 &= -3670017;
                    fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                }
                if ((i3 & 128) != 0) {
                    fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                    i10 &= -29360129;
                } else {
                    fM566getHeaderHeightD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if ((i3 & 1024) != 0) {
                    i13 &= -15;
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j;
                }
                if ((i3 & 2048) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                    i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i14 = i13;
                if ((i3 & 4096) != 0) {
                    frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                    i14 &= -897;
                } else {
                    frontLayerShape = shape;
                }
                if ((i3 & 8192) != 0) {
                    fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                    i14 &= -7169;
                } else {
                    fM565getFrontLayerElevationD9Ej5fM = f3;
                }
                BackdropScaffoldState backdropScaffoldState113 = backdropScaffoldStateRememberBackdropScaffoldState;
                if ((i3 & 16384) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i14 &= -57345;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i3 & 32768) != 0) {
                    jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                    i14 &= -458753;
                } else {
                    jM656contentColorForek8zF_U2 = j4;
                }
                if ((i3 & 65536) != 0) {
                    frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                    i14 &= -3670017;
                } else {
                    frontLayerScrimColor = j5;
                }
                if ((i3 & 131072) != 0) {
                    function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                    i14 &= -29360129;
                } else {
                    function3M662getLambda1$material_release = function5;
                }
                composerStartRestartGroup.endDefaults();
                j7 = frontLayerScrimColor;
                function7 = function3M662getLambda1$material_release;
                f5 = fM565getFrontLayerElevationD9Ej5fM;
                i15 = i14;
                j8 = jM656contentColorForek8zF_U2;
                j9 = jM656contentColorForek8zF_U;
                j10 = jM642getSurface0d7_KjU;
                i16 = i10;
                modifier3 = modifier2;
                f6 = fM566getHeaderHeightD9Ej5fM;
                backdropScaffoldState2 = backdropScaffoldState113;
                z7 = z6;
                shape3 = frontLayerShape;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 16) != 0) {
                    backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                    i10 &= -57345;
                } else {
                    backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                if ((i3 & 64) != 0) {
                    i10 &= -3670017;
                    fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                }
                if ((i3 & 128) != 0) {
                    fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                    i10 &= -29360129;
                } else {
                    fM566getHeaderHeightD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if ((i3 & 1024) != 0) {
                    i13 &= -15;
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j;
                }
                if ((i3 & 2048) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                    i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i14 = i13;
                if ((i3 & 4096) != 0) {
                    frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                    i14 &= -897;
                } else {
                    frontLayerShape = shape;
                }
                if ((i3 & 8192) != 0) {
                    fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                    i14 &= -7169;
                } else {
                    fM565getFrontLayerElevationD9Ej5fM = f3;
                }
                BackdropScaffoldState backdropScaffoldState114 = backdropScaffoldStateRememberBackdropScaffoldState;
                if ((i3 & 16384) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i14 &= -57345;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i3 & 32768) != 0) {
                    jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                    i14 &= -458753;
                } else {
                    jM656contentColorForek8zF_U2 = j4;
                }
                if ((i3 & 65536) != 0) {
                    frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                    i14 &= -3670017;
                } else {
                    frontLayerScrimColor = j5;
                }
                if ((i3 & 131072) != 0) {
                    function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                    i14 &= -29360129;
                } else {
                    function3M662getLambda1$material_release = function5;
                }
                composerStartRestartGroup.endDefaults();
                j7 = frontLayerScrimColor;
                function7 = function3M662getLambda1$material_release;
                f5 = fM565getFrontLayerElevationD9Ej5fM;
                i15 = i14;
                j8 = jM656contentColorForek8zF_U2;
                j9 = jM656contentColorForek8zF_U;
                j10 = jM642getSurface0d7_KjU;
                i16 = i10;
                modifier3 = modifier2;
                f6 = fM566getHeaderHeightD9Ej5fM;
                backdropScaffoldState2 = backdropScaffoldState114;
                z7 = z6;
                shape3 = frontLayerShape;
                z8 = z5;
            }
            final float fMo193toPx0680j_10 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
            fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
            final boolean z1117 = z8;
            final BackdropScaffoldState backdropScaffoldState115 = backdropScaffoldState2;
            final int i218 = i16;
            boolean z1118 = z8;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                public final void invoke(@Nullable Composer composer2, int i219) {
                    if (((i219 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (!z1117) {
                        composer2.startReplaceableGroup(-1017265259);
                        BackdropValue targetValue = backdropScaffoldState115.getTargetValue();
                        Function2<Composer, Integer, Unit> function18 = function2;
                        Function2<Composer, Integer, Unit> function19 = function3;
                        int i35 = i218;
                        BackdropScaffoldKt.BackLayerTransition(targetValue, function18, function19, composer2, ((i35 << 3) & 896) | ((i35 << 3) & 112));
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.startReplaceableGroup(-1017265371);
                    Function2<Composer, Integer, Unit> function110 = function2;
                    int i36 = i218;
                    Function2<Composer, Integer, Unit> function111 = function3;
                    composer2.startReplaceableGroup(-1113031299);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(276693241);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1993300243);
                    function110.invoke(composer2, Integer.valueOf(i36 & 14));
                    function111.invoke(composer2, Integer.valueOf((i36 >> 3) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            Float fValueOf6 = Float.valueOf(fMo193toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(fValueOf6);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                    }

                    /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m576invokeZezNO4M(long j1113) {
                        return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j1113, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                    }

                    /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m576invokeZezNO4M(long j1113) {
                        return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j1113, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final Function1<? super Constraints, Constraints> function18 = (Function1) objRememberedValue;
            final Modifier modifier10 = modifier3;
            final boolean z1119 = z7;
            final boolean z11110 = z4;
            final BackdropScaffoldState backdropScaffoldState116 = backdropScaffoldState2;
            final Shape shape13 = shape3;
            final long j1113 = j10;
            final long j1114 = j8;
            final float f117 = f5;
            final int i219 = i15;
            final float f118 = f6;
            final float f119 = fM567getPeekHeightD9Ej5fM;
            final long j1115 = j7;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function19 = function7;
            int i35 = i15 << 6;
            SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                public final void invoke(@Nullable Composer composer2, int i36) {
                    if (((i36 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    composer2.startReplaceableGroup(-723524056);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composer2.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier10, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function110 = composableLambda6;
                    Function1<Constraints, Constraints> function111 = function18;
                    final float f1110 = fMo193toPx0680j_4;
                    final boolean z11111 = z1119;
                    final boolean z11112 = z11110;
                    final BackdropScaffoldState backdropScaffoldState117 = backdropScaffoldState116;
                    final float f1111 = fMo193toPx0680j_10;
                    final int i37 = i16;
                    final Shape shape14 = shape13;
                    final long j1116 = j1113;
                    final long j1117 = j1114;
                    final float f1112 = f117;
                    final int i38 = i219;
                    final float f1113 = f118;
                    final float f1114 = f119;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function4;
                    final long j20 = j1115;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function113 = function19;
                    BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function110, function111, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f1115, Composer composer3, Integer num) {
                            m574invokejYbf7pk(constraints.getValue(), f1115.floatValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                        @Composable
                        /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                        public final void m574invokejYbf7pk(long j21, float f1115, @Nullable Composer composer3, int i39) {
                            int i310;
                            float fM2965constructorimpl;
                            if ((i39 & 14) == 0) {
                                i310 = i39 | (composer3.changed(j21) ? 4 : 2);
                            } else {
                                i310 = i39;
                            }
                            if ((i39 & 112) == 0) {
                                i310 |= composer3.changed(f1115) ? 32 : 16;
                            }
                            if (((i310 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                            float fMin = fM2934getMaxHeightimpl - f1110;
                            if (z11111) {
                                fMin = Math.min(fMin, f1115);
                            }
                            float f1116 = fMin;
                            Modifier modifierNestedScroll$default = z11112 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState117.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierThen = companion.then(modifierNestedScroll$default);
                            BackdropScaffoldState backdropScaffoldState118 = backdropScaffoldState117;
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f1111), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f1116), BackdropValue.Revealed));
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState118, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z11112, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                            final BackdropScaffoldState backdropScaffoldState119 = backdropScaffoldState117;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    if (backdropScaffoldState119.isConcealed()) {
                                        final BackdropScaffoldState backdropScaffoldState1110 = backdropScaffoldState119;
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00411(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* JADX INFO: renamed from: invoke */
                                            public final Boolean getA() {
                                                if (backdropScaffoldState1110.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState1110, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else {
                                        final BackdropScaffoldState backdropScaffoldState1111 = backdropScaffoldState119;
                                        final CoroutineScope coroutineScope4 = coroutineScope2;
                                        SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* JADX INFO: renamed from: invoke */
                                            public final Boolean getA() {
                                                if (backdropScaffoldState1111.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState1111, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null);
                            final BackdropScaffoldState backdropScaffoldState1110 = backdropScaffoldState117;
                            composer3.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer3.changed(backdropScaffoldState1110);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m575invokeBjo55l4(@NotNull Density density) {
                                        return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState1110.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                            Shape shape15 = shape14;
                            long j22 = j1116;
                            long j23 = j1117;
                            float f1117 = f1112;
                            final float f20 = f1114;
                            final Function2<? super Composer, ? super Integer, Unit> function114 = function112;
                            final int i311 = i37;
                            final long j24 = j20;
                            final BackdropScaffoldState backdropScaffoldState1111 = backdropScaffoldState117;
                            final int i312 = i38;
                            final boolean z11113 = z11112;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i313) {
                                    if (((i313 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                    Function2<Composer, Integer, Unit> function115 = function114;
                                    int i314 = i311;
                                    long j25 = j24;
                                    final BackdropScaffoldState backdropScaffoldState1112 = backdropScaffoldState1111;
                                    int i40 = i312;
                                    final boolean z11114 = z11113;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    composer4.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                    composer4.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                    composer4.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(967343144);
                                    function115.invoke(composer4, Integer.valueOf((i314 >> 6) & 14));
                                    BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                        /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$scaffoldState = backdropScaffoldState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                    this.label = 1;
                                                    if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            if (z11114 && backdropScaffoldState1112.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState1112, null), 3, null);
                                            }
                                        }
                                    }, backdropScaffoldState1112.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                }
                            });
                            int i313 = i38;
                            SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape15, j22, j23, (BorderStroke) null, f1117, composableLambda7, composer3, 1572864 | ((i313 >> 3) & 112) | ((i313 >> 6) & 896) | ((i313 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i313 << 6) & 458752), 16);
                            if (backdropScaffoldState117.isRevealed()) {
                                if (f1116 == fM2934getMaxHeightimpl - f1110) {
                                    fM2965constructorimpl = f1113;
                                } else {
                                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                }
                            } else {
                                fM2965constructorimpl = Dp.m2965constructorimpl(0);
                            }
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                            Function3<SnackbarHostState, Composer, Integer, Unit> function115 = function113;
                            BackdropScaffoldState backdropScaffoldState1112 = backdropScaffoldState117;
                            int i314 = i38;
                            composer3.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                            composer3.startReplaceableGroup(1376089335);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                            composer3.startReplaceableGroup(1395535623);
                            function115.invoke(backdropScaffoldState1112.getSnackbarHostState(), composer3, Integer.valueOf((i314 >> 18) & 112));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    }), composer2, 3120);
                }
            }), composerStartRestartGroup, (i35 & 896) | 1572864 | (i35 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
            modifier4 = modifier3;
            backdropScaffoldState3 = backdropScaffoldState2;
            shape4 = shape3;
            f7 = fM567getPeekHeightD9Ej5fM;
            j11 = j10;
            j12 = j8;
            j13 = j7;
            function8 = function7;
            j14 = jM638getPrimary0d7_KjU;
            z9 = z1118;
            f8 = f6;
            boolean z11111 = z4;
            z10 = z7;
            z11 = z11111;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 16) != 0) {
                    backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                    i10 &= -57345;
                } else {
                    backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                if ((i3 & 64) != 0) {
                    i10 &= -3670017;
                    fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                }
                if ((i3 & 128) != 0) {
                    fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                    i10 &= -29360129;
                } else {
                    fM566getHeaderHeightD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if ((i3 & 1024) != 0) {
                    i13 &= -15;
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j;
                }
                if ((i3 & 2048) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                    i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i14 = i13;
                if ((i3 & 4096) != 0) {
                    frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                    i14 &= -897;
                } else {
                    frontLayerShape = shape;
                }
                if ((i3 & 8192) != 0) {
                    fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                    i14 &= -7169;
                } else {
                    fM565getFrontLayerElevationD9Ej5fM = f3;
                }
                BackdropScaffoldState backdropScaffoldState117 = backdropScaffoldStateRememberBackdropScaffoldState;
                if ((i3 & 16384) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i14 &= -57345;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i3 & 32768) != 0) {
                    jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                    i14 &= -458753;
                } else {
                    jM656contentColorForek8zF_U2 = j4;
                }
                if ((i3 & 65536) != 0) {
                    frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                    i14 &= -3670017;
                } else {
                    frontLayerScrimColor = j5;
                }
                if ((i3 & 131072) != 0) {
                    function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                    i14 &= -29360129;
                } else {
                    function3M662getLambda1$material_release = function5;
                }
                composerStartRestartGroup.endDefaults();
                j7 = frontLayerScrimColor;
                function7 = function3M662getLambda1$material_release;
                f5 = fM565getFrontLayerElevationD9Ej5fM;
                i15 = i14;
                j8 = jM656contentColorForek8zF_U2;
                j9 = jM656contentColorForek8zF_U;
                j10 = jM642getSurface0d7_KjU;
                i16 = i10;
                modifier3 = modifier2;
                f6 = fM566getHeaderHeightD9Ej5fM;
                backdropScaffoldState2 = backdropScaffoldState117;
                z7 = z6;
                shape3 = frontLayerShape;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 16) != 0) {
                    backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                    i10 &= -57345;
                } else {
                    backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState2;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                if ((i3 & 64) != 0) {
                    i10 &= -3670017;
                    fM567getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m567getPeekHeightD9Ej5fM();
                }
                if ((i3 & 128) != 0) {
                    fM566getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m566getHeaderHeightD9Ej5fM();
                    i10 &= -29360129;
                } else {
                    fM566getHeaderHeightD9Ej5fM = f2;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if ((i3 & 1024) != 0) {
                    i13 &= -15;
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j;
                }
                if ((i3 & 2048) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composerStartRestartGroup, i13 & 14);
                    i13 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i14 = i13;
                if ((i3 & 4096) != 0) {
                    frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                    i14 &= -897;
                } else {
                    frontLayerShape = shape;
                }
                if ((i3 & 8192) != 0) {
                    fM565getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m565getFrontLayerElevationD9Ej5fM();
                    i14 &= -7169;
                } else {
                    fM565getFrontLayerElevationD9Ej5fM = f3;
                }
                BackdropScaffoldState backdropScaffoldState118 = backdropScaffoldStateRememberBackdropScaffoldState;
                if ((i3 & 16384) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i14 &= -57345;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i3 & 32768) != 0) {
                    jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i14 >> 12) & 14);
                    i14 &= -458753;
                } else {
                    jM656contentColorForek8zF_U2 = j4;
                }
                if ((i3 & 65536) != 0) {
                    frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                    i14 &= -3670017;
                } else {
                    frontLayerScrimColor = j5;
                }
                if ((i3 & 131072) != 0) {
                    function3M662getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m662getLambda1$material_release();
                    i14 &= -29360129;
                } else {
                    function3M662getLambda1$material_release = function5;
                }
                composerStartRestartGroup.endDefaults();
                j7 = frontLayerScrimColor;
                function7 = function3M662getLambda1$material_release;
                f5 = fM565getFrontLayerElevationD9Ej5fM;
                i15 = i14;
                j8 = jM656contentColorForek8zF_U2;
                j9 = jM656contentColorForek8zF_U;
                j10 = jM642getSurface0d7_KjU;
                i16 = i10;
                modifier3 = modifier2;
                f6 = fM566getHeaderHeightD9Ej5fM;
                backdropScaffoldState2 = backdropScaffoldState118;
                z7 = z6;
                shape3 = frontLayerShape;
                z8 = z5;
            }
            final float fMo193toPx0680j_11 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(fM567getPeekHeightD9Ej5fM);
            fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f6);
            final boolean z11112 = z8;
            final BackdropScaffoldState backdropScaffoldState119 = backdropScaffoldState2;
            final int i2110 = i16;
            boolean z11113 = z8;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898504, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                public final void invoke(@Nullable Composer composer2, int i2111) {
                    if (((i2111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (!z11112) {
                        composer2.startReplaceableGroup(-1017265259);
                        BackdropValue targetValue = backdropScaffoldState119.getTargetValue();
                        Function2<Composer, Integer, Unit> function110 = function2;
                        Function2<Composer, Integer, Unit> function111 = function3;
                        int i36 = i2110;
                        BackdropScaffoldKt.BackLayerTransition(targetValue, function110, function111, composer2, ((i36 << 3) & 896) | ((i36 << 3) & 112));
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.startReplaceableGroup(-1017265371);
                    Function2<Composer, Integer, Unit> function112 = function2;
                    int i37 = i2110;
                    Function2<Composer, Integer, Unit> function113 = function3;
                    composer2.startReplaceableGroup(-1113031299);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(276693241);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1993300243);
                    function112.invoke(composer2, Integer.valueOf(i37 & 14));
                    function113.invoke(composer2, Integer.valueOf((i37 >> 3) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            Float fValueOf7 = Float.valueOf(fMo193toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(fValueOf7);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                    }

                    /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m576invokeZezNO4M(long j1116) {
                        return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j1116, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m2923boximpl(m576invokeZezNO4M(constraints.getValue()));
                    }

                    /* JADX INFO: renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m576invokeZezNO4M(long j1116) {
                        return ConstraintsKt.m2952offsetNN6EwU$default(Constraints.m2926copyZbe2FdA$default(j1116, 0, 0, 0, 0, 10, null), 0, -c.roundToInt(fMo193toPx0680j_4), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final Function1<? super Constraints, Constraints> function110 = (Function1) objRememberedValue;
            final Modifier modifier11 = modifier3;
            final boolean z11114 = z7;
            final boolean z11115 = z4;
            final BackdropScaffoldState backdropScaffoldState1110 = backdropScaffoldState2;
            final Shape shape14 = shape3;
            final long j1116 = j10;
            final long j1117 = j8;
            final float f1110 = f5;
            final int i2111 = i15;
            final float f1111 = f6;
            final float f1112 = fM567getPeekHeightD9Ej5fM;
            final long j1118 = j7;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function111 = function7;
            int i36 = i15 << 6;
            SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, jM638getPrimary0d7_KjU, j9, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899749, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                public final void invoke(@Nullable Composer composer2, int i37) {
                    if (((i37 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    composer2.startReplaceableGroup(-723524056);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composer2.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier11, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function112 = composableLambda7;
                    Function1<Constraints, Constraints> function113 = function110;
                    final float f1113 = fMo193toPx0680j_4;
                    final boolean z11116 = z11114;
                    final boolean z11117 = z11115;
                    final BackdropScaffoldState backdropScaffoldState1111 = backdropScaffoldState1110;
                    final float f1114 = fMo193toPx0680j_11;
                    final int i38 = i16;
                    final Shape shape15 = shape14;
                    final long j1119 = j1116;
                    final long j11110 = j1117;
                    final float f1115 = f1110;
                    final int i39 = i2111;
                    final float f1116 = f1111;
                    final float f1117 = f1112;
                    final Function2<? super Composer, ? super Integer, Unit> function114 = function4;
                    final long j20 = j1118;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function115 = function111;
                    BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function112, function113, ComposableLambdaKt.composableLambda(composer2, -819899836, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f1118, Composer composer3, Integer num) {
                            m574invokejYbf7pk(constraints.getValue(), f1118.floatValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Code duplicated, block: B:43:0x0169  */
                        @Composable
                        /* JADX INFO: renamed from: invoke-jYbf7pk, reason: not valid java name */
                        public final void m574invokejYbf7pk(long j21, float f1118, @Nullable Composer composer3, int i310) {
                            int i311;
                            float fM2965constructorimpl;
                            if ((i310 & 14) == 0) {
                                i311 = i310 | (composer3.changed(j21) ? 4 : 2);
                            } else {
                                i311 = i310;
                            }
                            if ((i310 & 112) == 0) {
                                i311 |= composer3.changed(f1118) ? 32 : 16;
                            }
                            if (((i311 & 731) ^ 146) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            float fM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j21);
                            float fMin = fM2934getMaxHeightimpl - f1113;
                            if (z11116) {
                                fMin = Math.min(fMin, f1118);
                            }
                            float f1119 = fMin;
                            Modifier modifierNestedScroll$default = z11117 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState1111.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierThen = companion.then(modifierNestedScroll$default);
                            BackdropScaffoldState backdropScaffoldState1112 = backdropScaffoldState1111;
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f1114), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f1119), BackdropValue.Revealed));
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(modifierThen, backdropScaffoldState1112, mapMapOf, Orientation.Vertical, (32 & 8) != 0 ? true : z11117, (32 & 16) != 0 ? false : false, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : null, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                            final BackdropScaffoldState backdropScaffoldState1113 = backdropScaffoldState1111;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM819swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    if (backdropScaffoldState1113.isConcealed()) {
                                        final BackdropScaffoldState backdropScaffoldState1114 = backdropScaffoldState1113;
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {SportDeviceUtils.SOURCE_MADRID}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00411(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00411> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00411(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* JADX INFO: renamed from: invoke */
                                            public final Boolean getA() {
                                                if (backdropScaffoldState1114.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope3, null, null, new C00411(backdropScaffoldState1114, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else {
                                        final BackdropScaffoldState backdropScaffoldState1115 = backdropScaffoldState1113;
                                        final CoroutineScope coroutineScope4 = coroutineScope2;
                                        SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2

                                            /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$scaffoldState = backdropScaffoldState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                        this.label = 1;
                                                        if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* JADX INFO: renamed from: invoke */
                                            public final Boolean getA() {
                                                if (backdropScaffoldState1115.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                    kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState1115, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null);
                            final BackdropScaffoldState backdropScaffoldState1114 = backdropScaffoldState1111;
                            composer3.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer3.changed(backdropScaffoldState1114);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3034boximpl(m575invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m575invokeBjo55l4(@NotNull Density density) {
                                        return IntOffsetKt.IntOffset(0, c.roundToInt(backdropScaffoldState1114.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                            Shape shape16 = shape15;
                            long j22 = j1119;
                            long j23 = j11110;
                            float f11110 = f1115;
                            final float f20 = f1117;
                            final Function2<? super Composer, ? super Integer, Unit> function116 = function114;
                            final int i312 = i38;
                            final long j24 = j20;
                            final BackdropScaffoldState backdropScaffoldState1115 = backdropScaffoldState1111;
                            final int i313 = i39;
                            final boolean z11118 = z11117;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer3, -819897619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i314) {
                                    if (((i314 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f20, 7, null);
                                    Function2<Composer, Integer, Unit> function117 = function116;
                                    int i315 = i312;
                                    long j25 = j24;
                                    final BackdropScaffoldState backdropScaffoldState1116 = backdropScaffoldState1115;
                                    int i40 = i313;
                                    final boolean z11119 = z11118;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    composer4.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                    composer4.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                    composer4.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(967343144);
                                    function117.invoke(composer4, Integer.valueOf((i315 >> 6) & 14));
                                    BackdropScaffoldKt.m570Scrim3JVO9M(j25, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1

                                        /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$scaffoldState = backdropScaffoldState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                    this.label = 1;
                                                    if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            if (z11119 && backdropScaffoldState1116.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                kotlinx.coroutines.e.f(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState1116, null), 3, null);
                                            }
                                        }
                                    }, backdropScaffoldState1116.getTargetValue() == BackdropValue.Revealed, composer4, (i40 >> 18) & 14);
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                }
                            });
                            int i314 = i39;
                            SurfaceKt.m815SurfaceFjzlyU(modifierThen2, shape16, j22, j23, (BorderStroke) null, f11110, composableLambda8, composer3, 1572864 | ((i314 >> 3) & 112) | ((i314 >> 6) & 896) | ((i314 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i314 << 6) & 458752), 16);
                            if (backdropScaffoldState1111.isRevealed()) {
                                if (f1119 == fM2934getMaxHeightimpl - f1113) {
                                    fM2965constructorimpl = f1116;
                                } else {
                                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                                }
                            } else {
                                fM2965constructorimpl = Dp.m2965constructorimpl(0);
                            }
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM2965constructorimpl, 7, null);
                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                            Function3<SnackbarHostState, Composer, Integer, Unit> function117 = function115;
                            BackdropScaffoldState backdropScaffoldState1116 = backdropScaffoldState1111;
                            int i315 = i39;
                            composer3.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 0);
                            composer3.startReplaceableGroup(1376089335);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
                            composer3.startReplaceableGroup(1395535623);
                            function117.invoke(backdropScaffoldState1116.getSnackbarHostState(), composer3, Integer.valueOf((i315 >> 18) & 112));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    }), composer2, 3120);
                }
            }), composerStartRestartGroup, (i36 & 896) | 1572864 | (i36 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 51);
            modifier4 = modifier3;
            backdropScaffoldState3 = backdropScaffoldState2;
            shape4 = shape3;
            f7 = fM567getPeekHeightD9Ej5fM;
            j11 = j10;
            j12 = j8;
            j13 = j7;
            function8 = function7;
            j14 = jM638getPrimary0d7_KjU;
            z9 = z11113;
            f8 = f6;
            boolean z11116 = z4;
            z10 = z7;
            z11 = z11116;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j1119 = j9;
        final Shape shape15 = shape4;
        final float f1113 = f5;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

            public final void invoke(@Nullable Composer composer2, int i37) {
                BackdropScaffoldKt.m569BackdropScaffoldBZszfkY(function2, function3, function4, modifier4, backdropScaffoldState3, z11, f7, f8, z9, z10, j14, j1119, shape15, f1113, j11, j12, j13, function8, composer2, i | 1, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i) {
        final int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1200747690);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function1) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(function4) ? 2048 : 1024;
        }
        if (((i2 & 5851) ^ 1170) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            boolean zChanged = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(function4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m577invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m577invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, final long j) {
                        final Placeable placeableMo2468measureBRTryo0 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(BackdropLayers.Back, function2))).mo2468measureBRTryo0(function1.invoke(Constraints.m2923boximpl(j)).getValue());
                        final float height = placeableMo2468measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function5 = function4;
                        final int i3 = i2;
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-985548218, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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
                            public final void invoke(@Nullable Composer composer2, int i4) {
                                if (((i4 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function5.invoke(Constraints.m2923boximpl(j), Float.valueOf(height), composer2, Integer.valueOf((i3 >> 3) & 896));
                                }
                            }
                        }));
                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size() - 1;
                        int i4 = 0;
                        if (size >= 0) {
                            int i5 = 0;
                            while (true) {
                                int i6 = i5 + 1;
                                arrayList.add(listSubcompose.get(i5).mo2468measureBRTryo0(j));
                                if (i6 > size) {
                                    break;
                                }
                                i5 = i6;
                            }
                        }
                        int iMax = Math.max(Constraints.m2937getMinWidthimpl(j), placeableMo2468measureBRTryo0.getWidth());
                        int iMax2 = Math.max(Constraints.m2936getMinHeightimpl(j), placeableMo2468measureBRTryo0.getHeight());
                        int size2 = arrayList.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i7 = i4 + 1;
                                Placeable placeable = (Placeable) arrayList.get(i4);
                                iMax = Math.max(iMax, placeable.getWidth());
                                iMax2 = Math.max(iMax2, placeable.getHeight());
                                if (i7 > size2) {
                                    break;
                                }
                                i4 = i7;
                            }
                        }
                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
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
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList;
                                int size3 = list.size() - 1;
                                if (size3 < 0) {
                                    return;
                                }
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i8), 0, 0, 0.0f, 4, null);
                                    if (i9 > size3) {
                                        return;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i2 & 14, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropStack.2
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                BackdropScaffoldKt.BackdropStack(modifier, function2, function1, function4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m570Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierPointerInput;
        Composer composerStartRestartGroup = composer.startRestartGroup(1010546681);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (((i2 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (j != Color.INSTANCE.m1248getUnspecified0d7_KjU()) {
                composerStartRestartGroup.startReplaceableGroup(1010546789);
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 0, 12);
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(1010546977);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1010547072);
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierPointerInput = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierPointerInput);
                Color colorM1202boximpl = Color.m1202boximpl(j);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged2 = composerStartRestartGroup.changed(colorM1202boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
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
                            DrawScope.DefaultImpls.m1628drawRectnJ9OG0$default(drawScope, j, 0L, 0L, BackdropScaffoldKt.m571Scrim_3J_VO9M$lambda4(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1010547290);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                BackdropScaffoldKt.m570Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Scrim_3J_VO9M$lambda-4, reason: not valid java name */
    public static final float m571Scrim_3J_VO9M$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@NotNull final BackdropValue backdropValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super BackdropValue, Boolean> function1, @Nullable final SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(380713820);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BackdropValue backdropValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m912rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BackdropScaffoldState getA() {
                return new BackdropScaffoldState(backdropValue, animationSpec, function1, snackbarHostState);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}
