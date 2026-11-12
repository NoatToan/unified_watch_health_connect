package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.d;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.e;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a]\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\"\u0010#\u001aE\u0010)\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020$H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001aU\u0010,\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0003¢\u0006\u0004\b,\u0010-\u001a.\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0002\u001a3\u00109\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0000\u0018\u000105*\u0002022\u0006\u00104\u001a\u000203H\u0082@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a0\u0010@\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000H\u0002\u001a<\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000H\u0002\u001a \u0010E\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0000H\u0002\u001aG\u0010I\u001a\u00020\u00032\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000G2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\bI\u0010J\u001aX\u0010K\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002\u001a\\\u0010R\u001a\u00020\u0005*\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u00072\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u0018\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020O2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a3\u0010U\u001a\u00020\u00032\u0006\u0010M\u001a\u00020L2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u0092\u0001\u0010[\u001a\u00020\u0005*\u00020\u00052\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000O2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020O2\u0018\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030YH\u0002\"\u001f\u0010\\\u001a\u00020$8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0019\u0010`\u001a\u00020$8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b`\u0010]\"\u0019\u0010a\u001a\u00020$8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\ba\u0010]\"\u0019\u0010b\u001a\u00020$8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bb\u0010]\"\u001f\u0010c\u001a\u00020$8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0019\u0010e\u001a\u00020$8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\be\u0010]\"\u0019\u0010f\u001a\u00020$8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bf\u0010]\"\u0016\u0010g\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h\"\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", Constants.ENABLED, "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", GetWatermarkAPI.KEY_NAME_STEPS, "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "values", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "positionFraction", "", "tickFractions", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "SliderImpl", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "RangeSliderImpl", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "offset", "thumbSize", "SliderThumb-gNmqVrs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "SliderThumb", "thumbPx", "trackStrokeWidth", AVTransport.TRACK, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "snapValueToTick", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "a1", "b1", "x1", "a2", "b2", AnimatorViewWrapper.SCALE, "x", "a", "b", "pos", "calcFraction", "scaleToOffset", "Landroidx/compose/runtime/MutableState;", "valueState", "CorrectValueSideEffect", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "sliderPressModifier", "target", "velocity", "animateToTarget", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "rangeSliderPressDragModifier", "ThumbRadius", "F", "getThumbRadius", "()F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material_release"}, k = 2, mv = {1, 5, 1})
public final class SliderKt {

    @NotNull
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;

    @NotNull
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m2965constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m2965constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m2965constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m2965constructorimpl(6);
    private static final float TrackHeight = Dp.m2965constructorimpl(4);

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class C13882 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        public final /* synthetic */ List<Float> $tickFractions;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $values;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ float $minPx;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
                this.$valueRange = closedFloatingPointRange;
                this.$minPx = f;
                this.$maxPx = f2;
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(C13882.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class C00522 extends FunctionReferenceImpl implements Function1<Float, Float> {
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ float $minPx;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00522(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
                this.$valueRange = closedFloatingPointRange;
                this.$minPx = f;
                this.$maxPx = f2;
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(C13882.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13882(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, List<Float> list, SliderColors sliderColors, Function0<Unit> function0) {
            super(3);
            this.$valueRange = closedFloatingPointRange;
            this.$values = closedFloatingPointRange2;
            this.$$dirty = i;
            this.$modifier = modifier;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$enabled = z;
            this.$onValueChangeState = state;
            this.$tickFractions = list;
            this.$colors = sliderColors;
            this.$onValueChangeFinished = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
            return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
            return SliderKt.scale(f, f2, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            int i3 = 0;
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            final float fM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$values;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, 0.0f, fM2935getMaxWidthimpl, closedFloatingPointRange.getStart().floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$values;
            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, 0.0f, fM2935getMaxWidthimpl, closedFloatingPointRange3.getEndInclusive().floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            SliderKt.CorrectValueSideEffect(new AnonymousClass1(this.$valueRange, 0.0f, fM2935getMaxWidthimpl), this.$valueRange, mutableState, this.$values.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 384);
            SliderKt.CorrectValueSideEffect(new C00522(this.$valueRange, 0.0f, fM2935getMaxWidthimpl), this.$valueRange, mutableState2, this.$values.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 384);
            composer.startReplaceableGroup(-723524056);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$valueRange;
            final float f = 0.0f;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ float $current;
                    public final /* synthetic */ boolean $isStart;
                    public final /* synthetic */ float $maxPx;
                    public final /* synthetic */ float $minPx;
                    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
                    public final /* synthetic */ MutableState<Float> $rawOffsetEnd;
                    public final /* synthetic */ MutableState<Float> $rawOffsetStart;
                    public final /* synthetic */ float $target;
                    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(float f, float f2, Function0<Unit> function0, boolean z, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float f3, float f4, ClosedFloatingPointRange<Float> closedFloatingPointRange, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$current = f;
                        this.$target = f2;
                        this.$onValueChangeFinished = function0;
                        this.$isStart = z;
                        this.$rawOffsetStart = mutableState;
                        this.$rawOffsetEnd = mutableState2;
                        this.$onValueChangeState = state;
                        this.$minPx = f3;
                        this.$maxPx = f4;
                        this.$valueRange = closedFloatingPointRange;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
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
                            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float fBoxFloat = Boxing.boxFloat(this.$target);
                            TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                            Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                            final boolean z = this.$isStart;
                            final MutableState<Float> mutableState = this.$rawOffsetStart;
                            final MutableState<Float> mutableState2 = this.$rawOffsetEnd;
                            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
                            final float f = this.$minPx;
                            final float f2 = this.$maxPx;
                            final ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
                            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable) {
                                    (z ? mutableState : mutableState2).setValue(animatable.getValue());
                                    state.getValue().invoke(SliderKt.C13882.invoke$scaleToUserValue(f, f2, closedFloatingPointRange, d.rangeTo(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue())));
                                }
                            };
                            this.label = 1;
                            if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    float fFloatValue = (z2 ? mutableState : mutableState2).getValue().floatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(fFloatValue, list, f, fM2935getMaxWidthimpl);
                    if (!(fFloatValue == fSnapValueToTick)) {
                        e.f(coroutineScope, null, null, new AnonymousClass1(fFloatValue, fSnapValueToTick, function0, z2, mutableState, mutableState2, state, f, fM2935getMaxWidthimpl, closedFloatingPointRange5, null), 3, null);
                        return;
                    }
                    Function0<Unit> function1 = function0;
                    if (function1 == null) {
                        return;
                    }
                    function1.invoke();
                }
            }, composer, 0);
            Modifier modifier = this.$modifier;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            boolean z2 = this.$enabled;
            ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> closedFloatingPointRange7 = this.$valueRange;
            Object[] objArr = {mutableState, Float.valueOf(0.0f), mutableState2, Float.valueOf(fM2935getMaxWidthimpl), state2, closedFloatingPointRange7};
            composer.startReplaceableGroup(-3685570);
            boolean zChanged = false;
            while (i3 < 6) {
                Object obj = objArr[i3];
                i3++;
                zChanged |= composer.changed(obj);
            }
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                final float f2 = 0.0f;
                objRememberedValue4 = new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$pressDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f3) {
                        invoke(bool.booleanValue(), f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z3, float f3) {
                        if (z3) {
                            MutableState<Float> mutableState3 = mutableState;
                            mutableState3.setValue(Float.valueOf(kotlin.ranges.e.coerceIn(mutableState3.getValue().floatValue() + f3, f2, mutableState2.getValue().floatValue())));
                        } else {
                            MutableState<Float> mutableState4 = mutableState2;
                            mutableState4.setValue(Float.valueOf(kotlin.ranges.e.coerceIn(mutableState4.getValue().floatValue() + f3, mutableState.getValue().floatValue(), fM2935getMaxWidthimpl)));
                        }
                        state2.getValue().invoke(SliderKt.C13882.invoke$scaleToUserValue(f2, fM2935getMaxWidthimpl, closedFloatingPointRange7, d.rangeTo(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue())));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierRangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(modifier, mutableInteractionSource, mutableInteractionSource2, mutableState, mutableState2, z2, z, fM2935getMaxWidthimpl, closedFloatingPointRange6, stateRememberUpdatedState, (Function2) objRememberedValue4);
            float fCoerceIn = kotlin.ranges.e.coerceIn(this.$values.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$values.getEndInclusive().floatValue());
            float fCoerceIn2 = kotlin.ranges.e.coerceIn(this.$values.getEndInclusive().floatValue(), this.$values.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn);
            float fCalcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn2);
            boolean z3 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            MutableInteractionSource mutableInteractionSource3 = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource4 = this.$endInteractionSource;
            Modifier modifierThen = modifierRangeSliderPressDragModifier.then(this.$modifier);
            int i4 = this.$$dirty;
            SliderKt.RangeSliderImpl(z3, fCalcFraction, fCalcFraction2, list2, sliderColors, fM2935getMaxWidthimpl, mutableInteractionSource3, mutableInteractionSource4, modifierThen, composer, ((i4 >> 9) & 57344) | 14159872 | ((i4 >> 9) & 14));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class C13903 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
        public final /* synthetic */ List<Float> $tickFractions;
        public final /* synthetic */ float $value;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ float $minPx;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
                this.$valueRange = closedFloatingPointRange;
                this.$minPx = f;
                this.$maxPx = f2;
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(C13903.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13903(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
            super(3);
            this.$valueRange = closedFloatingPointRange;
            this.$$dirty = i;
            this.$value = f;
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z;
            this.$tickFractions = list;
            this.$colors = sliderColors;
            this.$onValueChangeState = state;
            this.$onValueChangeFinished = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
            return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToUserValue(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3) {
            return SliderKt.scale(f, f2, f3, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            final float fM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(boxWithConstraintsScope.getConstraints());
            composer.startReplaceableGroup(-723524056);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange, 0.0f, fM2935getMaxWidthimpl, f)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            Object objValueOf = Float.valueOf(0.0f);
            Object objValueOf2 = Float.valueOf(fM2935getMaxWidthimpl);
            final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            final State<Function1<Float, Unit>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(-3686095);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(objValueOf2) | composer.changed(closedFloatingPointRange2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                final float f2 = 0.0f;
                objRememberedValue3 = new SliderDraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                        invoke(f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f3) {
                        MutableState<Float> mutableState2 = mutableState;
                        mutableState2.setValue(Float.valueOf(kotlin.ranges.e.coerceIn(mutableState2.getValue().floatValue() + f3, f2, fM2935getMaxWidthimpl)));
                        state.getValue().invoke(Float.valueOf(SliderKt.C13903.invoke$scaleToUserValue(f2, fM2935getMaxWidthimpl, closedFloatingPointRange2, mutableState.getValue().floatValue())));
                    }
                });
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState = (SliderDraggableState) objRememberedValue3;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$valueRange, 0.0f, fM2935getMaxWidthimpl);
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$valueRange;
            float f3 = this.$value;
            int i3 = this.$$dirty;
            SliderKt.CorrectValueSideEffect(anonymousClass1, closedFloatingPointRange3, mutableState, f3, composer, ((i3 >> 9) & 112) | 384 | ((i3 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            final float f4 = 0.0f;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_TAP_DANCE}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ float $current;
                    public final /* synthetic */ SliderDraggableState $draggableState;
                    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    public final /* synthetic */ float $target;
                    public final /* synthetic */ float $velocity;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f;
                        this.$target = f2;
                        this.$velocity = f3;
                        this.$onValueChangeFinished = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
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
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f = this.$current;
                            float f2 = this.$target;
                            float f3 = this.$velocity;
                            this.label = 1;
                            if (SliderKt.animateToTarget(sliderDraggableState, f, f2, f3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                    invoke(f5.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f5) {
                    Function0<Unit> function1;
                    float fFloatValue = mutableState.getValue().floatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(fFloatValue, list, f4, fM2935getMaxWidthimpl);
                    if (!(fFloatValue == fSnapValueToTick)) {
                        e.f(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState, fFloatValue, fSnapValueToTick, f5, function0, null), 3, null);
                    } else {
                        if (sliderDraggableState.isDragging() || (function1 = function0) == null) {
                            return;
                        }
                        function1.invoke();
                    }
                }
            }, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSliderPressModifier = SliderKt.sliderPressModifier(companion2, sliderDraggableState, this.$interactionSource, fM2935getMaxWidthimpl, z, mutableState, stateRememberUpdatedState, this.$enabled);
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState.isDragging();
            boolean z2 = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged2 = composer.changed(stateRememberUpdatedState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new SliderKt$Slider$3$drag$1$1(stateRememberUpdatedState, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierDraggable = DraggableKt.draggable(companion2, sliderDraggableState, orientation, (32 & 4) != 0 ? true : z2, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : zIsDragging, (32 & 32) != 0 ? new DraggableKt.C13281(null) : null, (32 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : (Function3) objRememberedValue4, (32 & 128) != 0 ? false : z);
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), kotlin.ranges.e.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue()));
            boolean z3 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            Modifier modifierThen = modifierSliderPressModifier.then(modifierDraggable);
            int i4 = this.$$dirty;
            SliderKt.SliderImpl(z3, fCalcFraction, list2, sliderColors, fM2935getMaxWidthimpl, mutableInteractionSource2, modifierThen, composer, ((i4 >> 9) & 14) | 512 | ((i4 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i4 >> 6) & 458752));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {829}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13932 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $current;
        public final /* synthetic */ float $target;
        public final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13932(float f, float f2, float f3, Continuation<? super C13932> continuation) {
            super(2, continuation);
            this.$current = f;
            this.$target = f2;
            this.$velocity = f3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C13932 c13932 = new C13932(this.$current, this.$target, this.$velocity, continuation);
            c13932.L$0 = obj;
            return c13932;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13932) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float f = this.$current;
                floatRef.element = f;
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat(this.$target);
                TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                Float fBoxFloat2 = Boxing.boxFloat(this.$velocity);
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.animateToTarget.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable) {
                        dragScope.dragBy(animatable.getValue().floatValue() - floatRef.element);
                        floatRef.element = animatable.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {857}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13941 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        public final /* synthetic */ boolean $isRtl;
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
        public final /* synthetic */ State<Float> $rawOffsetEnd;
        public final /* synthetic */ State<Float> $rawOffsetStart;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {858}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $$this$pointerInput;
            public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            public final /* synthetic */ boolean $isRtl;
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
            public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            public final /* synthetic */ State<Float> $rawOffsetEnd;
            public final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {}, l = {859}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00551 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                public final /* synthetic */ boolean $isRtl;
                public final /* synthetic */ float $maxPx;
                public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
                public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                public final /* synthetic */ State<Float> $rawOffsetEnd;
                public final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2}, l = {863, 883, TypedValues.Custom.TYPE_BOOLEAN}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "thumbCaptured", "draggingStart", "$this$awaitPointerEventScope", "thumbCaptured", "draggingStart", "pointerEvent", "interaction", "posX", "draggingStart", "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "L$0", "L$1"})
                public static final class C00561 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                    public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                    public final /* synthetic */ boolean $isRtl;
                    public final /* synthetic */ float $maxPx;
                    public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
                    public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    public final /* synthetic */ State<Float> $rawOffsetEnd;
                    public final /* synthetic */ State<Float> $rawOffsetStart;
                    public float F$0;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public Object L$4;
                    public int label;

                    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", i = {}, l = {921}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ Ref.BooleanRef $draggingStart;
                        public final /* synthetic */ PressInteraction $finishInteraction;
                        public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, PressInteraction pressInteraction, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$draggingStart = booleanRef;
                            this.$finishInteraction = pressInteraction;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                                PressInteraction pressInteraction = this.$finishInteraction;
                                this.label = 1;
                                if (mutableInteractionSourceActiveInteraction.emit(pressInteraction, this) == coroutine_suspended) {
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
                    /* JADX WARN: Multi-variable type inference failed */
                    public C00561(boolean z, float f, State<Float> state, State<Float> state2, RangeSliderLogic rangeSliderLogic, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2, Continuation<? super C00561> continuation) {
                        super(2, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$rawOffsetEnd = state;
                        this.$rawOffsetStart = state2;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$$this$coroutineScope = coroutineScope;
                        this.$gestureEndAction = state3;
                        this.$onDrag = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C00561 c00561 = new C00561(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$$this$coroutineScope, this.$gestureEndAction, this.$onDrag, continuation);
                        c00561.L$0 = obj;
                        return c00561;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C00561) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0116  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
                    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0176 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:55:0x0177  */
                    /* JADX WARN: Code duplicated, block: B:58:0x0180 A[Catch: CancellationException -> 0x018d, TryCatch #1 {CancellationException -> 0x018d, blocks: (B:8:0x001d, B:56:0x0178, B:58:0x0180, B:59:0x0186), top: B:68:0x001d }] */
                    /* JADX WARN: Code duplicated, block: B:59:0x0186 A[Catch: CancellationException -> 0x018d, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x018d, blocks: (B:8:0x001d, B:56:0x0178, B:58:0x0180, B:59:0x0186), top: B:68:0x001d }] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Ref.BooleanRef booleanRef;
                        Object objAwaitFirstDown;
                        AwaitPointerEventScope awaitPointerEventScope;
                        final Ref.BooleanRef booleanRef2;
                        PressInteraction.Press press;
                        float fM983getXimpl;
                        Object objM797awaitSloprnUCldI;
                        Ref.BooleanRef booleanRef3;
                        PointerInputChange pointerInputChange;
                        Pair pair;
                        PressInteraction.Press press2;
                        Object objM161horizontalDragjO51t88;
                        Function2<Boolean, Float, Unit> function2;
                        boolean z;
                        float fFloatValue;
                        PressInteraction cancel;
                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        boolean z2 = false;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            booleanRef = new Ref.BooleanRef();
                            Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                            booleanRef4.element = true;
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = booleanRef;
                            this.L$2 = booleanRef4;
                            this.label = 1;
                            objAwaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope2, false, this);
                            if (objAwaitFirstDown == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope = awaitPointerEventScope2;
                            booleanRef2 = booleanRef4;
                        } else if (i == 1) {
                            booleanRef2 = (Ref.BooleanRef) this.L$2;
                            booleanRef = (Ref.BooleanRef) this.L$1;
                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            objAwaitFirstDown = obj;
                            awaitPointerEventScope = awaitPointerEventScope3;
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                press2 = (PressInteraction.Press) this.L$1;
                                booleanRef2 = (Ref.BooleanRef) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    objM161horizontalDragjO51t88 = obj;
                                    if (((Boolean) objM161horizontalDragjO51t88).booleanValue()) {
                                        cancel = new PressInteraction.Release(press2);
                                    } else {
                                        cancel = new PressInteraction.Cancel(press2);
                                    }
                                } catch (CancellationException unused) {
                                    cancel = new PressInteraction.Cancel(press2);
                                }
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                e.f(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            float f = this.F$0;
                            PressInteraction.Press press3 = (PressInteraction.Press) this.L$4;
                            pointerInputChange = (PointerInputChange) this.L$3;
                            Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) this.L$2;
                            Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) this.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            fM983getXimpl = f;
                            booleanRef2 = booleanRef5;
                            booleanRef3 = booleanRef6;
                            press = press3;
                            objM797awaitSloprnUCldI = obj;
                            pair = (Pair) objM797awaitSloprnUCldI;
                            if (pair != null) {
                                function2 = this.$onDrag;
                                z = this.$isRtl;
                                if (booleanRef3.element) {
                                    Boolean boolBoxBoolean = Boxing.boxBoolean(booleanRef2.element);
                                    fFloatValue = ((Number) pair.getSecond()).floatValue();
                                    if (z) {
                                        fFloatValue = -fFloatValue;
                                    }
                                    function2.invoke(boolBoxBoolean, Boxing.boxFloat(fFloatValue));
                                } else {
                                    float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                                    if (z ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f) {
                                    }
                                    booleanRef2.element = z2;
                                }
                            }
                            if (!booleanRef3.element) {
                                this.$rangeSliderLogic.captureThumb(booleanRef2.element, fM983getXimpl, press, this.$$this$coroutineScope);
                            }
                            try {
                                long id = pointerInputChange.getId();
                                final Function2<Boolean, Float, Unit> function3 = this.$onDrag;
                                final boolean z3 = this.$isRtl;
                                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                        invoke2(pointerInputChange2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                                        float fM983getXimpl2 = Offset.m983getXimpl(PointerEventKt.positionChange(pointerInputChange2));
                                        Function2<Boolean, Float, Unit> function4 = function3;
                                        Boolean boolValueOf = Boolean.valueOf(booleanRef2.element);
                                        if (z3) {
                                            fM983getXimpl2 = -fM983getXimpl2;
                                        }
                                        function4.invoke(boolValueOf, Float.valueOf(fM983getXimpl2));
                                    }
                                };
                                this.L$0 = booleanRef2;
                                this.L$1 = press;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                objM161horizontalDragjO51t88 = DragGestureDetectorKt.m161horizontalDragjO51t88(awaitPointerEventScope, id, function1, this);
                                if (objM161horizontalDragjO51t88 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                press2 = press;
                                if (((Boolean) objM161horizontalDragjO51t88).booleanValue()) {
                                    cancel = new PressInteraction.Release(press2);
                                } else {
                                    cancel = new PressInteraction.Cancel(press2);
                                }
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                e.f(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            } catch (CancellationException unused2) {
                                press2 = press;
                                cancel = new PressInteraction.Cancel(press2);
                            }
                        }
                        PointerInputChange pointerInputChange2 = (PointerInputChange) objAwaitFirstDown;
                        press = new PressInteraction.Press(pointerInputChange2.getPosition(), null);
                        float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                        fM983getXimpl = this.$isRtl ? this.$maxPx - Offset.m983getXimpl(pointerInputChange2.getPosition()) : Offset.m983getXimpl(pointerInputChange2.getPosition());
                        if (Math.abs(this.$rawOffsetEnd.getValue().floatValue() - fM983getXimpl) > touchSlop || Math.abs(this.$rawOffsetStart.getValue().floatValue() - fM983getXimpl) > touchSlop) {
                            boolean zShouldCaptureStartThumb = this.$rangeSliderLogic.shouldCaptureStartThumb(fM983getXimpl);
                            booleanRef2.element = zShouldCaptureStartThumb;
                            this.$rangeSliderLogic.captureThumb(zShouldCaptureStartThumb, fM983getXimpl, press, this.$$this$coroutineScope);
                            booleanRef.element = true;
                        }
                        long id2 = pointerInputChange2.getId();
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = booleanRef;
                        this.L$2 = booleanRef2;
                        this.L$3 = pointerInputChange2;
                        this.L$4 = press;
                        this.F$0 = fM983getXimpl;
                        this.label = 2;
                        objM797awaitSloprnUCldI = SliderKt.m797awaitSloprnUCldI(awaitPointerEventScope, id2, this);
                        if (objM797awaitSloprnUCldI == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef3 = booleanRef;
                        pointerInputChange = pointerInputChange2;
                        pair = (Pair) objM797awaitSloprnUCldI;
                        if (pair != null) {
                            function2 = this.$onDrag;
                            z = this.$isRtl;
                            if (booleanRef3.element) {
                                Boolean boolBoxBoolean2 = Boxing.boxBoolean(booleanRef2.element);
                                fFloatValue = ((Number) pair.getSecond()).floatValue();
                                if (z) {
                                    fFloatValue = -fFloatValue;
                                }
                                function2.invoke(boolBoxBoolean2, Boxing.boxFloat(fFloatValue));
                            } else {
                                float fFloatValue3 = ((Number) pair.getSecond()).floatValue();
                                z2 = z ? true : true;
                                booleanRef2.element = z2;
                            }
                        }
                        if (!booleanRef3.element) {
                            this.$rangeSliderLogic.captureThumb(booleanRef2.element, fM983getXimpl, press, this.$$this$coroutineScope);
                        }
                        long id3 = pointerInputChange.getId();
                        final Function2<? super Boolean, ? super Float, Unit> function4 = this.$onDrag;
                        final boolean z4 = this.$isRtl;
                        Function1<PointerInputChange, Unit> function5 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                invoke2(pointerInputChange3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull PointerInputChange pointerInputChange3) {
                                float fM983getXimpl2 = Offset.m983getXimpl(PointerEventKt.positionChange(pointerInputChange3));
                                Function2<Boolean, Float, Unit> function6 = function4;
                                Boolean boolValueOf = Boolean.valueOf(booleanRef2.element);
                                if (z4) {
                                    fM983getXimpl2 = -fM983getXimpl2;
                                }
                                function6.invoke(boolValueOf, Float.valueOf(fM983getXimpl2));
                            }
                        };
                        this.L$0 = booleanRef2;
                        this.L$1 = press;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        objM161horizontalDragjO51t88 = DragGestureDetectorKt.m161horizontalDragjO51t88(awaitPointerEventScope, id3, function5, this);
                        if (objM161horizontalDragjO51t88 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        press2 = press;
                        if (((Boolean) objM161horizontalDragjO51t88).booleanValue()) {
                            cancel = new PressInteraction.Release(press2);
                        } else {
                            cancel = new PressInteraction.Cancel(press2);
                        }
                        this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                        e.f(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00551(boolean z, float f, State<Float> state, State<Float> state2, RangeSliderLogic rangeSliderLogic, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2, Continuation<? super C00551> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rawOffsetEnd = state;
                    this.$rawOffsetStart = state2;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state3;
                    this.$onDrag = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00551 c00551 = new C00551(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$$this$coroutineScope, this.$gestureEndAction, this.$onDrag, continuation);
                    c00551.L$0 = obj;
                    return c00551;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00551) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00561 c00561 = new C00561(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$$this$coroutineScope, this.$gestureEndAction, this.$onDrag, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c00561, this) == coroutine_suspended) {
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
            /* JADX WARN: Multi-variable type inference failed */
            public C00541(PointerInputScope pointerInputScope, boolean z, float f, State<Float> state, State<Float> state2, RangeSliderLogic rangeSliderLogic, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2, Continuation<? super C00541> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rawOffsetEnd = state;
                this.$rawOffsetStart = state2;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$gestureEndAction = state3;
                this.$onDrag = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00541 c00541 = new C00541(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$gestureEndAction, this.$onDrag, continuation);
                c00541.L$0 = obj;
                return c00541;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00551 c00551 = new C00551(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, coroutineScope, this.$gestureEndAction, this.$onDrag, null);
                    this.label = 1;
                    if (ForEachGestureKt.forEachGesture(pointerInputScope, c00551, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public C13941(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, Function2<? super Boolean, ? super Float, Unit> function2, boolean z, float f, State<? extends Function1<? super Boolean, Unit>> state3, Continuation<? super C13941> continuation) {
            super(2, continuation);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = function2;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$gestureEndAction = state3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C13941 c13941 = new C13941(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
            c13941.L$0 = obj;
            return c13941;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13941) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C00541 c00541 = new C00541((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$gestureEndAction, this.$onDrag, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c00541, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderPressModifier$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderPressModifier$1", f = "Slider.kt", i = {}, l = {793}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13951 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ DraggableState $draggableState;
        public final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isRtl;
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ State<Float> $rawOffset;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderPressModifier$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pos", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderPressModifier$1$1", f = "Slider.kt", i = {0, 0, 1, 1, 2}, l = {795, 800, 803, 813}, m = "invokeSuspend", n = {"$this$detectTapGestures", "pos", "$this$detectTapGestures", "interaction", "interaction"}, s = {"L$0", "J$0", "L$0", "L$1", "L$0"})
        public static final class C00571 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            public final /* synthetic */ DraggableState $draggableState;
            public final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public final /* synthetic */ boolean $isRtl;
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ State<Float> $rawOffset;
            public /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            public Object L$1;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderPressModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderPressModifier$1$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00581 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ boolean $isRtl;
                public final /* synthetic */ float $maxPx;
                public final /* synthetic */ long $pos;
                public final /* synthetic */ State<Float> $rawOffset;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00581(boolean z, float f, long j, State<Float> state, Continuation<? super C00581> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$pos = j;
                    this.$rawOffset = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00581 c00581 = new C00581(this.$isRtl, this.$maxPx, this.$pos, this.$rawOffset, continuation);
                    c00581.L$0 = obj;
                    return c00581;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00581) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    a.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((DragScope) this.L$0).dragBy((this.$isRtl ? this.$maxPx - Offset.m983getXimpl(this.$pos) : Offset.m983getXimpl(this.$pos)) - this.$rawOffset.getValue().floatValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00571(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Float, Unit>> state, boolean z, float f, State<Float> state2, Continuation<? super C00571> continuation) {
                super(3, continuation);
                this.$draggableState = draggableState;
                this.$interactionSource = mutableInteractionSource;
                this.$gestureEndAction = state;
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rawOffset = state2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m798invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m798invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
                C00571 c00571 = new C00571(this.$draggableState, this.$interactionSource, this.$gestureEndAction, this.$isRtl, this.$maxPx, this.$rawOffset, continuation);
                c00571.L$0 = pressGestureScope;
                c00571.J$0 = j;
                return c00571.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x009f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[Catch: CancellationException -> 0x00c4, TryCatch #0 {CancellationException -> 0x00c4, blocks: (B:12:0x0027, B:26:0x00a0, B:28:0x00b8, B:29:0x00be, B:23:0x0091), top: B:37:0x000c }] */
            /* JADX WARN: Code duplicated, block: B:29:0x00be A[Catch: CancellationException -> 0x00c4, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c4, blocks: (B:12:0x0027, B:26:0x00a0, B:28:0x00b8, B:29:0x00be, B:23:0x0091), top: B:37:0x000c }] */
            /* JADX WARN: Code duplicated, block: B:34:0x00d9 A[RETURN] */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.foundation.interaction.PressInteraction$Press, int] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Interaction cancel;
                MutableInteractionSource mutableInteractionSource;
                PressGestureScope pressGestureScope;
                long j;
                PressInteraction.Press press;
                Object objTryAwaitRelease;
                boolean zBooleanValue;
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                ?? r2 = this.label;
                try {
                    if (r2 != 0) {
                        if (r2 == 1) {
                            j = this.J$0;
                            PressGestureScope pressGestureScope2 = (PressGestureScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            pressGestureScope = pressGestureScope2;
                        } else if (r2 == 2) {
                            press = (PressInteraction.Press) this.L$1;
                            pressGestureScope = (PressGestureScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = press;
                            this.L$1 = null;
                            this.label = 3;
                            objTryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
                            if (objTryAwaitRelease == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
                            this.$gestureEndAction.getValue().invoke(Boxing.boxFloat(0.0f));
                            if (zBooleanValue) {
                                cancel = new PressInteraction.Release(press);
                            } else {
                                cancel = new PressInteraction.Cancel(press);
                            }
                            mutableInteractionSource = this.$interactionSource;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (r2 == 3) {
                            press = (PressInteraction.Press) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            objTryAwaitRelease = obj;
                            zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
                            this.$gestureEndAction.getValue().invoke(Boxing.boxFloat(0.0f));
                            if (zBooleanValue) {
                                cancel = new PressInteraction.Release(press);
                            } else {
                                cancel = new PressInteraction.Cancel(press);
                            }
                            mutableInteractionSource = this.$interactionSource;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (r2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope3 = (PressGestureScope) this.L$0;
                    long j2 = this.J$0;
                    DraggableState draggableState = this.$draggableState;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    C00581 c00581 = new C00581(this.$isRtl, this.$maxPx, j2, this.$rawOffset, null);
                    this.L$0 = pressGestureScope3;
                    this.J$0 = j2;
                    this.label = 1;
                    if (draggableState.drag(mutatePriority, c00581, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pressGestureScope = pressGestureScope3;
                    j = j2;
                    press = new PressInteraction.Press(j, null);
                    MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                    this.L$0 = pressGestureScope;
                    this.L$1 = press;
                    this.label = 2;
                    if (mutableInteractionSource2.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = press;
                    this.L$1 = null;
                    this.label = 3;
                    objTryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
                    if (objTryAwaitRelease == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
                    this.$gestureEndAction.getValue().invoke(Boxing.boxFloat(0.0f));
                    if (zBooleanValue) {
                        cancel = new PressInteraction.Release(press);
                    } else {
                        cancel = new PressInteraction.Cancel(press);
                    }
                } catch (CancellationException unused) {
                    cancel = new PressInteraction.Cancel(r2);
                }
                mutableInteractionSource = this.$interactionSource;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13951(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Float, Unit>> state, boolean z, float f, State<Float> state2, Continuation<? super C13951> continuation) {
            super(2, continuation);
            this.$draggableState = draggableState;
            this.$interactionSource = mutableInteractionSource;
            this.$gestureEndAction = state;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$rawOffset = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C13951 c13951 = new C13951(this.$draggableState, this.$interactionSource, this.$gestureEndAction, this.$isRtl, this.$maxPx, this.$rawOffset, continuation);
            c13951.L$0 = obj;
            return c13951;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13951) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C00571 c00571 = new C00571(this.$draggableState, this.$interactionSource, this.$gestureEndAction, this.$isRtl, this.$maxPx, this.$rawOffset, null);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00571, null, this, 11, null) == coroutine_suspended) {
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

    static {
        float fM2965constructorimpl = Dp.m2965constructorimpl(48);
        SliderHeight = fM2965constructorimpl;
        float fM2965constructorimpl2 = Dp.m2965constructorimpl(144);
        SliderMinWidth = fM2965constructorimpl2;
        DefaultSliderConstraints = SizeKt.m311heightInVpY3zN4$default(SizeKt.m328widthInVpY3zN4$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 2, null), 0.0f, fM2965constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void CorrectValueSideEffect(final Function1<? super Float, Float> function1, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final MutableState<Float> mutableState, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1481631415);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if (((i2 & 5851) ^ 1170) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Object[] objArr = {closedFloatingPointRange, function1, Float.valueOf(f), mutableState};
            composerStartRestartGroup.startReplaceableGroup(-3685570);
            int i3 = 0;
            boolean zChanged = false;
            while (i3 < 4) {
                Object obj = objArr[i3];
                i3++;
                zChanged |= composerStartRestartGroup.changed(obj);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float fFloatValue = (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / 1000;
                        float fFloatValue2 = function1.invoke(Float.valueOf(f)).floatValue();
                        if (Math.abs(fFloatValue2 - mutableState.getValue().floatValue()) > fFloatValue) {
                            mutableState.setValue(Float.valueOf(fFloatValue2));
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.CorrectValueSideEffect.2
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
                SliderKt.CorrectValueSideEffect(function1, closedFloatingPointRange, mutableState, f, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:128:0x019f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:145:0x0247  */
    /* JADX WARN: Code duplicated, block: B:147:0x0259  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0110, please report this as an issue */
    @Composable
    @ExperimentalMaterialApi
    public static final void RangeSlider(@NotNull final ClosedFloatingPointRange<Float> closedFloatingPointRange, @NotNull final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0<Unit> function2;
        int i11;
        SliderColors sliderColors2;
        int i12;
        Function0<Unit> function3;
        SliderColors sliderColorsM793colorsq0g_0yA;
        int i13;
        SliderColors sliderColors3;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableInteractionSource mutableInteractionSource;
        Object objRememberedValue2;
        MutableInteractionSource mutableInteractionSource2;
        boolean zChanged;
        Object objRememberedValue3;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final int i14;
        final boolean z3;
        final Function0<Unit> function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(982566305);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        int i16 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i4 |= i16;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    i4 |= i16;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        i8 = i;
                        if (composerStartRestartGroup.changed(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        if ((3670016 & i2) == 0) {
                            function2 = function0;
                            if (composerStartRestartGroup.changed(function2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                        if ((29360128 & i2) == 0) {
                            if ((i3 & 128) == 0) {
                                sliderColors2 = sliderColors;
                                int i17 = composerStartRestartGroup.changed(sliderColors2) ? 8388608 : 4194304;
                                i4 |= i17;
                            } else {
                                sliderColors2 = sliderColors;
                            }
                            i4 |= i17;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        if (((i4 & 23967451) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.startDefaults();
                                if (i15 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                }
                                if (i7 != 0) {
                                    i12 = 0;
                                } else {
                                    i12 = i8;
                                }
                                if (i10 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function0;
                                }
                                if ((i3 & 128) != 0) {
                                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                    i4 &= -29360129;
                                } else {
                                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                                }
                                composerStartRestartGroup.endDefaults();
                                i13 = i4;
                                sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            } else {
                                composerStartRestartGroup.skipCurrentGroup();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                function3 = function0;
                                i13 = i4;
                                i12 = i8;
                                sliderColors3 = sliderColors2;
                            }
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                            if (!(i12 >= 0)) {
                                throw new IllegalArgumentException("steps should be >= 0".toString());
                            }
                            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                            Integer numValueOf = Integer.valueOf(i12);
                            composerStartRestartGroup.startReplaceableGroup(-3686930);
                            zChanged = composerStartRestartGroup.changed(numValueOf);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = stepsToTickFractions(i12);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = closedFloatingPointRangeRangeTo;
                            sliderColors4 = sliderColors3;
                            modifier3 = modifier2;
                            closedFloatingPointRange3 = closedFloatingPointRange4;
                            Function0<Unit> function5 = function3;
                            i14 = i12;
                            z3 = z2;
                            function4 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                            i14 = i8;
                            function4 = function2;
                            sliderColors4 = sliderColors2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                                SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                            }
                        });
                    }
                    i4 |= 1572864;
                    function2 = function0;
                    if ((29360128 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i17;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 23967451) ^ 4793490) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf2 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState2, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange5 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange5;
                        Function0<Unit> function6 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function6;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf3 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf3);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState3, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange6 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange6;
                        Function0<Unit> function7 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 196608;
                i8 = i;
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    if ((29360128 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i17;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 23967451) ^ 4793490) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf4 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState4, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange7 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange7;
                        Function0<Unit> function8 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function8;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf5 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf5);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState5, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange8 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange8;
                        Function0<Unit> function9 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 1572864;
                function2 = function0;
                if ((29360128 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf6 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState6, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange9 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange9;
                    Function0<Unit> function10 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function10;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf7 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf7);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState7, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange10 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange10;
                    Function0<Unit> function11 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 3072;
            z2 = z;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                    }
                    i4 |= i16;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                i4 |= i16;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    if ((29360128 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i17;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 23967451) ^ 4793490) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf8 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf8);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState8, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange11 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange11;
                        Function0<Unit> function12 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function12;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf9 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf9);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState9, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange12 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange12;
                        Function0<Unit> function13 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 1572864;
                function2 = function0;
                if ((29360128 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf10 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState10, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange13 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange13;
                    Function0<Unit> function14 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function14;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf11 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf11);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState11, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange14 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange14;
                    Function0<Unit> function15 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function15;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                if ((29360128 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf12 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf12);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState12, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange15 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange15;
                    Function0<Unit> function16 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function16;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf13 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf13);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState13, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange16 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange16;
                    Function0<Unit> function17 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function17;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 1572864;
            function2 = function0;
            if ((29360128 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i17;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf14 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf14);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState14, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange17 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange17;
                Function0<Unit> function18 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function18;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf15 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf15);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState15, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange18 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange18;
                Function0<Unit> function19 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function19;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 384;
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                    }
                    i4 |= i16;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                i4 |= i16;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    if ((29360128 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i17;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 23967451) ^ 4793490) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState16 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf16 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf16);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState16, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange19 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange19;
                        Function0<Unit> function110 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function110;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i13 = i4;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState17 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                        Integer numValueOf17 = Integer.valueOf(i12);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf17);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = stepsToTickFractions(i12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState17, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                        ClosedFloatingPointRange<Float> closedFloatingPointRange110 = closedFloatingPointRangeRangeTo;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange110;
                        Function0<Unit> function111 = function3;
                        i14 = i12;
                        z3 = z2;
                        function4 = function111;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 1572864;
                function2 = function0;
                if ((29360128 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState18 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf18 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf18);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState18, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange111 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange111;
                    Function0<Unit> function112 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function112;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState19 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf19 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf19);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState19, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange112 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange112;
                    Function0<Unit> function113 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function113;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                if ((29360128 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState110 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf110 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf110);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState110, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange113 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange113;
                    Function0<Unit> function114 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function114;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState111 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf111 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf111);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState111, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange114 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange114;
                    Function0<Unit> function115 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function115;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 1572864;
            function2 = function0;
            if ((29360128 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i17;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState112 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf112 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf112);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState112, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange115 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange115;
                Function0<Unit> function116 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function116;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState113 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf113 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf113);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState113, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange116 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange116;
                Function0<Unit> function117 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function117;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 3072;
        z2 = z;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                }
                i4 |= i16;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
            }
            i4 |= i16;
        } else {
            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                i8 = i;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                if ((29360128 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState114 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf114 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf114);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState114, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange117 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange117;
                    Function0<Unit> function118 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function118;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if ((i3 & 128) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -29360129;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i13 = i4;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i12 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState115 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                    Integer numValueOf115 = Integer.valueOf(i12);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf115);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState115, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                    ClosedFloatingPointRange<Float> closedFloatingPointRange118 = closedFloatingPointRangeRangeTo;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    closedFloatingPointRange3 = closedFloatingPointRange118;
                    Function0<Unit> function119 = function3;
                    i14 = i12;
                    z3 = z2;
                    function4 = function119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 1572864;
            function2 = function0;
            if ((29360128 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i17;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState116 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf116 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf116);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState116, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange119 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange119;
                Function0<Unit> function1110 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function1110;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState117 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf117 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf117);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState117, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange1110 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange1110;
                Function0<Unit> function1111 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function1111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 196608;
        i8 = i;
        i10 = i3 & 64;
        if (i10 != 0) {
            if ((3670016 & i2) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changed(function2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            if ((29360128 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i17;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState118 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf118 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf118);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState118, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange1111 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange1111;
                Function0<Unit> function1112 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function1112;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if ((i3 & 128) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -29360129;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i13 = i4;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i12 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState119 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
                Integer numValueOf119 = Integer.valueOf(i12);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf119);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState119, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
                ClosedFloatingPointRange<Float> closedFloatingPointRange1112 = closedFloatingPointRangeRangeTo;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                closedFloatingPointRange3 = closedFloatingPointRange1112;
                Function0<Unit> function1113 = function3;
                i14 = i12;
                z3 = z2;
                function4 = function1113;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 1572864;
        function2 = function0;
        if ((29360128 & i2) == 0) {
            if ((i3 & 128) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i4 |= i17;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 |= i17;
        } else {
            sliderColors2 = sliderColors;
        }
        if (((i4 & 23967451) ^ 4793490) == 0) {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i12 = 0;
                } else {
                    i12 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if ((i3 & 128) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -29360129;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i13 = i4;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i12 = 0;
                } else {
                    i12 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if ((i3 & 128) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -29360129;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i13 = i4;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            if (!(i12 >= 0)) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState1110 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
            Integer numValueOf1110 = Integer.valueOf(i12);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(numValueOf1110);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = stepsToTickFractions(i12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = stepsToTickFractions(i12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState1110, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
            ClosedFloatingPointRange<Float> closedFloatingPointRange1113 = closedFloatingPointRangeRangeTo;
            sliderColors4 = sliderColors3;
            modifier3 = modifier2;
            closedFloatingPointRange3 = closedFloatingPointRange1113;
            Function0<Unit> function1114 = function3;
            i14 = i12;
            z3 = z2;
            function4 = function1114;
        } else {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i12 = 0;
                } else {
                    i12 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if ((i3 & 128) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -29360129;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i13 = i4;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i12 = 0;
                } else {
                    i12 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if ((i3 & 128) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -29360129;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i13 = i4;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            if (!(i12 >= 0)) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState1111 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i13 >> 3) & 14);
            Integer numValueOf1111 = Integer.valueOf(i12);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(numValueOf1111);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = stepsToTickFractions(i12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = stepsToTickFractions(i12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899358, true, new C13882(closedFloatingPointRangeRangeTo, closedFloatingPointRange, i13, modifier2, mutableInteractionSource, mutableInteractionSource2, z2, stateRememberUpdatedState1111, (List) objRememberedValue3, sliderColors3, function3)), composerStartRestartGroup, 3072, 7);
            ClosedFloatingPointRange<Float> closedFloatingPointRange1114 = closedFloatingPointRangeRangeTo;
            sliderColors4 = sliderColors3;
            modifier3 = modifier2;
            closedFloatingPointRange3 = closedFloatingPointRange1114;
            Function0<Unit> function1115 = function3;
            i14 = i12;
            z3 = z2;
            function4 = function1115;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange3, i14, function4, sliderColors4, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final List<Float> list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1161720431);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(-1990474327);
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
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
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1690176212);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo193toPx0680j_4 = density2.mo193toPx0680j_4(getTrackHeight());
        float fMo193toPx0680j_5 = density2.mo193toPx0680j_4(getThumbRadius());
        float fMo190toDpu2uoSUM = density2.mo190toDpu2uoSUM(f3);
        float fM2965constructorimpl = Dp.m2965constructorimpl(getThumbRadius() * 2);
        float f4 = fMo190toDpu2uoSUM - fM2965constructorimpl;
        float fM2965constructorimpl2 = Dp.m2965constructorimpl(Dp.m2965constructorimpl(f4) * f);
        float fM2965constructorimpl3 = Dp.m2965constructorimpl(Dp.m2965constructorimpl(f4) * f2);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        int i2 = i << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion3, companion.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, fMo193toPx0680j_5, fMo193toPx0680j_4, composerStartRestartGroup, 262144 | ((i >> 9) & 112) | (i2 & 896) | (i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2 & 57344));
        Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getCenterStart());
        int i3 = (i >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
        int i4 = (i << 12) & 57344;
        m794SliderThumbgNmqVrs(modifierAlign, fM2965constructorimpl2, mutableInteractionSource, sliderColors, z, fM2965constructorimpl, composerStartRestartGroup, ((i >> 12) & 896) | 196608 | i3 | i4);
        m794SliderThumbgNmqVrs(boxScopeInstance.align(companion3, companion.getCenterStart()), fM2965constructorimpl3, mutableInteractionSource2, sliderColors, z, fM2965constructorimpl, composerStartRestartGroup, ((i >> 15) & 896) | 196608 | i3 | i4);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                SliderKt.RangeSliderImpl(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01df  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:149:0x020a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0212  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0134, please report this as an issue */
    @Composable
    public static final void Slider(final float f, @NotNull final Function1<? super Float, Unit> function1, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, @Nullable Function0<Unit> function0, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SliderColors sliderColors, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0<Unit> function2;
        int i11;
        int i12;
        int i13;
        SliderColors sliderColors2;
        Modifier modifier3;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i14;
        Function0<Unit> function3;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColorsM793colorsq0g_0yA;
        int i15;
        Function0<Unit> function4;
        SliderColors sliderColors3;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final SliderColors sliderColors4;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier4;
        final int i16;
        final Function0<Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1510867745);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        int i18 = composerStartRestartGroup.changed(closedFloatingPointRange2) ? 16384 : 8192;
                        i4 |= i18;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i4 |= i18;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        i8 = i;
                        if (composerStartRestartGroup.changed(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        if ((3670016 & i2) == 0) {
                            function2 = function0;
                            if (composerStartRestartGroup.changed(function2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i4 |= i13;
                        }
                        if ((i2 & 234881024) == 0) {
                            if ((i3 & 256) == 0) {
                                sliderColors2 = sliderColors;
                                int i19 = composerStartRestartGroup.changed(sliderColors2) ? 67108864 : 33554432;
                                i4 |= i19;
                            } else {
                                sliderColors2 = sliderColors;
                            }
                            i4 |= i19;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        if (((i4 & 191739611) ^ 38347922) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.startDefaults();
                                if (i17 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                    i4 &= -57345;
                                } else {
                                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                                }
                                if (i7 != 0) {
                                    i14 = 0;
                                } else {
                                    i14 = i8;
                                }
                                if (i10 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function0;
                                }
                                if (i12 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i3 & 256) != 0) {
                                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                    i4 &= -234881025;
                                } else {
                                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                                }
                                composerStartRestartGroup.endDefaults();
                                i15 = i4;
                                function4 = function3;
                                sliderColors3 = sliderColorsM793colorsq0g_0yA;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                modifier2 = modifier3;
                            } else {
                                composerStartRestartGroup.skipCurrentGroup();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 256) != 0) {
                                    int i20 = i4 & (-234881025);
                                    sliderColors3 = sliderColors2;
                                    i15 = i20;
                                    i14 = i8;
                                    function4 = function0;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i15 = i4;
                                    i14 = i8;
                                    sliderColors3 = sliderColors2;
                                    function4 = function0;
                                }
                            }
                            if (!(i14 >= 0)) {
                                throw new IllegalArgumentException("steps should be >= 0".toString());
                            }
                            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                            Integer numValueOf = Integer.valueOf(i14);
                            composerStartRestartGroup.startReplaceableGroup(-3686930);
                            zChanged = composerStartRestartGroup.changed(numValueOf);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = stepsToTickFractions(i14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            List list = (List) objRememberedValue2;
                            float f2 = ThumbRadius;
                            float f3 = 2;
                            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f2 * f3), Dp.m2965constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, list, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list, sliderColors3, stateRememberUpdatedState, function4)), composerStartRestartGroup, 3072, 6);
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            sliderColors4 = sliderColors3;
                            z3 = z2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier2;
                            i16 = i14;
                            function5 = function4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i16 = i8;
                            function5 = function2;
                            mutableInteractionSource3 = mutableInteractionSource;
                            sliderColors4 = sliderColors2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                            public final void invoke(@Nullable Composer composer2, int i21) {
                                SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                            }
                        });
                    }
                    i4 |= 1572864;
                    function2 = function0;
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) == 0) {
                        if ((i3 & 256) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i19;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 191739611) ^ 38347922) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf2 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list2 = (List) objRememberedValue2;
                        float f4 = ThumbRadius;
                        float f5 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f4 * f5), Dp.m2965constructorimpl(f4 * f5), 0.0f, 0.0f, 12, null), f, list2, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list2, sliderColors3, stateRememberUpdatedState2, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf3 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list3 = (List) objRememberedValue2;
                        float f6 = ThumbRadius;
                        float f7 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f6 * f7), Dp.m2965constructorimpl(f6 * f7), 0.0f, 0.0f, 12, null), f, list3, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list3, sliderColors3, stateRememberUpdatedState3, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                        public final void invoke(@Nullable Composer composer2, int i21) {
                            SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 196608;
                i8 = i;
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) == 0) {
                        if ((i3 & 256) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i19;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 191739611) ^ 38347922) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf4 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list4 = (List) objRememberedValue2;
                        float f8 = ThumbRadius;
                        float f9 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f8 * f9), Dp.m2965constructorimpl(f8 * f9), 0.0f, 0.0f, 12, null), f, list4, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list4, sliderColors3, stateRememberUpdatedState4, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf5 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf5);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list5 = (List) objRememberedValue2;
                        float f10 = ThumbRadius;
                        float f11 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f10 * f11), Dp.m2965constructorimpl(f10 * f11), 0.0f, 0.0f, 12, null), f, list5, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list5, sliderColors3, stateRememberUpdatedState5, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                        public final void invoke(@Nullable Composer composer2, int i21) {
                            SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 1572864;
                function2 = function0;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 191739611) ^ 38347922) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf6 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list6 = (List) objRememberedValue2;
                    float f12 = ThumbRadius;
                    float f13 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f12 * f13), Dp.m2965constructorimpl(f12 * f13), 0.0f, 0.0f, 12, null), f, list6, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list6, sliderColors3, stateRememberUpdatedState6, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf7 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf7);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list7 = (List) objRememberedValue2;
                    float f14 = ThumbRadius;
                    float f15 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f14 * f15), Dp.m2965constructorimpl(f14 * f15), 0.0f, 0.0f, 12, null), f, list7, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list7, sliderColors3, stateRememberUpdatedState7, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                    public final void invoke(@Nullable Composer composer2, int i21) {
                        SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 3072;
            z2 = z;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i4 |= i18;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i4 |= i18;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) == 0) {
                        if ((i3 & 256) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i19;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 191739611) ^ 38347922) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf8 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf8);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list8 = (List) objRememberedValue2;
                        float f16 = ThumbRadius;
                        float f17 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f16 * f17), Dp.m2965constructorimpl(f16 * f17), 0.0f, 0.0f, 12, null), f, list8, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list8, sliderColors3, stateRememberUpdatedState8, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf9 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf9);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list9 = (List) objRememberedValue2;
                        float f18 = ThumbRadius;
                        float f19 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f18 * f19), Dp.m2965constructorimpl(f18 * f19), 0.0f, 0.0f, 12, null), f, list9, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list9, sliderColors3, stateRememberUpdatedState9, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                        public final void invoke(@Nullable Composer composer2, int i21) {
                            SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 1572864;
                function2 = function0;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 191739611) ^ 38347922) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf10 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf10);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list10 = (List) objRememberedValue2;
                    float f110 = ThumbRadius;
                    float f111 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f110 * f111), Dp.m2965constructorimpl(f110 * f111), 0.0f, 0.0f, 12, null), f, list10, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list10, sliderColors3, stateRememberUpdatedState10, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf11 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf11);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list11 = (List) objRememberedValue2;
                    float f112 = ThumbRadius;
                    float f113 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f112 * f113), Dp.m2965constructorimpl(f112 * f113), 0.0f, 0.0f, 12, null), f, list11, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list11, sliderColors3, stateRememberUpdatedState11, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                    public final void invoke(@Nullable Composer composer2, int i21) {
                        SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 191739611) ^ 38347922) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf12 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf12);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list12 = (List) objRememberedValue2;
                    float f114 = ThumbRadius;
                    float f115 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f114 * f115), Dp.m2965constructorimpl(f114 * f115), 0.0f, 0.0f, 12, null), f, list12, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list12, sliderColors3, stateRememberUpdatedState12, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf13 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf13);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list13 = (List) objRememberedValue2;
                    float f116 = ThumbRadius;
                    float f117 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f116 * f117), Dp.m2965constructorimpl(f116 * f117), 0.0f, 0.0f, 12, null), f, list13, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list13, sliderColors3, stateRememberUpdatedState13, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                    public final void invoke(@Nullable Composer composer2, int i21) {
                        SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 1572864;
            function2 = function0;
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) == 0) {
                if ((i3 & 256) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 191739611) ^ 38347922) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf14 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf14);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list14 = (List) objRememberedValue2;
                float f118 = ThumbRadius;
                float f119 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f118 * f119), Dp.m2965constructorimpl(f118 * f119), 0.0f, 0.0f, 12, null), f, list14, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list14, sliderColors3, stateRememberUpdatedState14, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf15 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf15);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list15 = (List) objRememberedValue2;
                float f1110 = ThumbRadius;
                float f1111 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1110 * f1111), Dp.m2965constructorimpl(f1110 * f1111), 0.0f, 0.0f, 12, null), f, list15, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list15, sliderColors3, stateRememberUpdatedState15, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                public final void invoke(@Nullable Composer composer2, int i21) {
                    SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 384;
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i4 |= i18;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i4 |= i18;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) == 0) {
                        if ((i3 & 256) == 0) {
                            sliderColors2 = sliderColors;
                            if (composerStartRestartGroup.changed(sliderColors2)) {
                            }
                            i4 |= i19;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if (((i4 & 191739611) ^ 38347922) == 0) {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState16 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf16 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf16);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list16 = (List) objRememberedValue2;
                        float f1112 = ThumbRadius;
                        float f1113 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1112 * f1113), Dp.m2965constructorimpl(f1112 * f1113), 0.0f, 0.0f, 12, null), f, list16, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list16, sliderColors3, stateRememberUpdatedState16, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    } else {
                        if ((i2 & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                                i4 &= -234881025;
                            } else {
                                sliderColorsM793colorsq0g_0yA = sliderColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i15 = i4;
                            function4 = function3;
                            sliderColors3 = sliderColorsM793colorsq0g_0yA;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            modifier2 = modifier3;
                        }
                        if (!(i14 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState17 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf17 = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(numValueOf17);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list17 = (List) objRememberedValue2;
                        float f1114 = ThumbRadius;
                        float f1115 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1114 * f1115), Dp.m2965constructorimpl(f1114 * f1115), 0.0f, 0.0f, 12, null), f, list17, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list17, sliderColors3, stateRememberUpdatedState17, function4)), composerStartRestartGroup, 3072, 6);
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors3;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        i16 = i14;
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                        public final void invoke(@Nullable Composer composer2, int i21) {
                            SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 1572864;
                function2 = function0;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 191739611) ^ 38347922) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState18 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf18 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf18);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list18 = (List) objRememberedValue2;
                    float f1116 = ThumbRadius;
                    float f1117 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1116 * f1117), Dp.m2965constructorimpl(f1116 * f1117), 0.0f, 0.0f, 12, null), f, list18, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list18, sliderColors3, stateRememberUpdatedState18, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState19 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf19 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf19);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list19 = (List) objRememberedValue2;
                    float f1118 = ThumbRadius;
                    float f1119 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1118 * f1119), Dp.m2965constructorimpl(f1118 * f1119), 0.0f, 0.0f, 12, null), f, list19, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list19, sliderColors3, stateRememberUpdatedState19, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                    public final void invoke(@Nullable Composer composer2, int i21) {
                        SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 191739611) ^ 38347922) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState110 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf110 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf110);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list110 = (List) objRememberedValue2;
                    float f11110 = ThumbRadius;
                    float f11111 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f11110 * f11111), Dp.m2965constructorimpl(f11110 * f11111), 0.0f, 0.0f, 12, null), f, list110, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list110, sliderColors3, stateRememberUpdatedState110, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState111 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf111 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf111);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list111 = (List) objRememberedValue2;
                    float f11112 = ThumbRadius;
                    float f11113 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f11112 * f11113), Dp.m2965constructorimpl(f11112 * f11113), 0.0f, 0.0f, 12, null), f, list111, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list111, sliderColors3, stateRememberUpdatedState111, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                    public final void invoke(@Nullable Composer composer2, int i21) {
                        SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 1572864;
            function2 = function0;
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) == 0) {
                if ((i3 & 256) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 191739611) ^ 38347922) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState112 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf112 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf112);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list112 = (List) objRememberedValue2;
                float f11114 = ThumbRadius;
                float f11115 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f11114 * f11115), Dp.m2965constructorimpl(f11114 * f11115), 0.0f, 0.0f, 12, null), f, list112, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list112, sliderColors3, stateRememberUpdatedState112, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState113 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf113 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf113);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list113 = (List) objRememberedValue2;
                float f11116 = ThumbRadius;
                float f11117 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f11116 * f11117), Dp.m2965constructorimpl(f11116 * f11117), 0.0f, 0.0f, 12, null), f, list113, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list113, sliderColors3, stateRememberUpdatedState113, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                public final void invoke(@Nullable Composer composer2, int i21) {
                    SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 3072;
        z2 = z;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                closedFloatingPointRange2 = closedFloatingPointRange;
                if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                }
                i4 |= i18;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i4 |= i18;
        } else {
            closedFloatingPointRange2 = closedFloatingPointRange;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                i8 = i;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        sliderColors2 = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColors2)) {
                        }
                        i4 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (((i4 & 191739611) ^ 38347922) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState114 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf114 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf114);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list114 = (List) objRememberedValue2;
                    float f11118 = ThumbRadius;
                    float f11119 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f11118 * f11119), Dp.m2965constructorimpl(f11118 * f11119), 0.0f, 0.0f, 12, null), f, list114, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list114, sliderColors3, stateRememberUpdatedState114, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                            i4 &= -234881025;
                        } else {
                            sliderColorsM793colorsq0g_0yA = sliderColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i15 = i4;
                        function4 = function3;
                        sliderColors3 = sliderColorsM793colorsq0g_0yA;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        modifier2 = modifier3;
                    }
                    if (!(i14 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState115 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf115 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(numValueOf115);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list115 = (List) objRememberedValue2;
                    float f111110 = ThumbRadius;
                    float f111111 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f111110 * f111111), Dp.m2965constructorimpl(f111110 * f111111), 0.0f, 0.0f, 12, null), f, list115, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list115, sliderColors3, stateRememberUpdatedState115, function4)), composerStartRestartGroup, 3072, 6);
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    sliderColors4 = sliderColors3;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier2;
                    i16 = i14;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                    public final void invoke(@Nullable Composer composer2, int i21) {
                        SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 1572864;
            function2 = function0;
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) == 0) {
                if ((i3 & 256) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 191739611) ^ 38347922) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState116 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf116 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf116);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list116 = (List) objRememberedValue2;
                float f111112 = ThumbRadius;
                float f111113 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f111112 * f111113), Dp.m2965constructorimpl(f111112 * f111113), 0.0f, 0.0f, 12, null), f, list116, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list116, sliderColors3, stateRememberUpdatedState116, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState117 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf117 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf117);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list117 = (List) objRememberedValue2;
                float f111114 = ThumbRadius;
                float f111115 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f111114 * f111115), Dp.m2965constructorimpl(f111114 * f111115), 0.0f, 0.0f, 12, null), f, list117, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list117, sliderColors3, stateRememberUpdatedState117, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                public final void invoke(@Nullable Composer composer2, int i21) {
                    SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 196608;
        i8 = i;
        i10 = i3 & 64;
        if (i10 != 0) {
            if ((3670016 & i2) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changed(function2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) == 0) {
                if ((i3 & 256) == 0) {
                    sliderColors2 = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColors2)) {
                    }
                    i4 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                i4 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            if (((i4 & 191739611) ^ 38347922) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState118 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf118 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf118);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list118 = (List) objRememberedValue2;
                float f111116 = ThumbRadius;
                float f111117 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f111116 * f111117), Dp.m2965constructorimpl(f111116 * f111117), 0.0f, 0.0f, 12, null), f, list118, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list118, sliderColors3, stateRememberUpdatedState118, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & 256) != 0) {
                        sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                        i4 &= -234881025;
                    } else {
                        sliderColorsM793colorsq0g_0yA = sliderColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i15 = i4;
                    function4 = function3;
                    sliderColors3 = sliderColorsM793colorsq0g_0yA;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    modifier2 = modifier3;
                }
                if (!(i14 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState119 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf119 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(numValueOf119);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list119 = (List) objRememberedValue2;
                float f111118 = ThumbRadius;
                float f111119 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f111118 * f111119), Dp.m2965constructorimpl(f111118 * f111119), 0.0f, 0.0f, 12, null), f, list119, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list119, sliderColors3, stateRememberUpdatedState119, function4)), composerStartRestartGroup, 3072, 6);
                closedFloatingPointRange3 = closedFloatingPointRange2;
                sliderColors4 = sliderColors3;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier2;
                i16 = i14;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

                public final void invoke(@Nullable Composer composer2, int i21) {
                    SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 1572864;
        function2 = function0;
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i4 |= i13;
        }
        if ((i2 & 234881024) == 0) {
            if ((i3 & 256) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i4 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 |= i19;
        } else {
            sliderColors2 = sliderColors;
        }
        if (((i4 & 191739611) ^ 38347922) == 0) {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & 256) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -234881025;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i15 = i4;
                function4 = function3;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & 256) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -234881025;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i15 = i4;
                function4 = function3;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                modifier2 = modifier3;
            }
            if (!(i14 >= 0)) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState1110 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
            Integer numValueOf1110 = Integer.valueOf(i14);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(numValueOf1110);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list1110 = (List) objRememberedValue2;
            float f1111110 = ThumbRadius;
            float f1111111 = 2;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1111110 * f1111111), Dp.m2965constructorimpl(f1111110 * f1111111), 0.0f, 0.0f, 12, null), f, list1110, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list1110, sliderColors3, stateRememberUpdatedState1110, function4)), composerStartRestartGroup, 3072, 6);
            closedFloatingPointRange3 = closedFloatingPointRange2;
            sliderColors4 = sliderColors3;
            z3 = z2;
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier4 = modifier2;
            i16 = i14;
            function5 = function4;
        } else {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & 256) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -234881025;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i15 = i4;
                function4 = function3;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = d.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & 256) != 0) {
                    sliderColorsM793colorsq0g_0yA = SliderDefaults.INSTANCE.m793colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 1023);
                    i4 &= -234881025;
                } else {
                    sliderColorsM793colorsq0g_0yA = sliderColors2;
                }
                composerStartRestartGroup.endDefaults();
                i15 = i4;
                function4 = function3;
                sliderColors3 = sliderColorsM793colorsq0g_0yA;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                modifier2 = modifier3;
            }
            if (!(i14 >= 0)) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState1111 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i15 >> 3) & 14);
            Integer numValueOf1111 = Integer.valueOf(i14);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(numValueOf1111);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list1111 = (List) objRememberedValue2;
            float f1111112 = ThumbRadius;
            float f1111113 = 2;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m318requiredSizeInqDBjuR0$default(modifier2, Dp.m2965constructorimpl(f1111112 * f1111113), Dp.m2965constructorimpl(f1111112 * f1111113), 0.0f, 0.0f, 12, null), f, list1111, z2, function1, closedFloatingPointRange2, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890022, true, new C13903(closedFloatingPointRange2, i15, f, mutableInteractionSource2, z2, list1111, sliderColors3, stateRememberUpdatedState1111, function4)), composerStartRestartGroup, 3072, 6);
            closedFloatingPointRange3 = closedFloatingPointRange2;
            sliderColors4 = sliderColors3;
            z3 = z2;
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier4 = modifier2;
            i16 = i14;
            function5 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
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

            public final void invoke(@Nullable Composer composer2, int i21) {
                SliderKt.Slider(f, function1, modifier4, z3, closedFloatingPointRange3, i16, function5, mutableInteractionSource3, sliderColors4, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SliderImpl(final boolean z, final float f, final List<Float> list, final SliderColors sliderColors, final float f2, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1568553854);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(-1990474327);
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
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
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(618021173);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo193toPx0680j_4 = density2.mo193toPx0680j_4(getTrackHeight());
        float fMo193toPx0680j_5 = density2.mo193toPx0680j_4(getThumbRadius());
        float fMo190toDpu2uoSUM = density2.mo190toDpu2uoSUM(f2);
        float fM2965constructorimpl = Dp.m2965constructorimpl(getThumbRadius() * 2);
        float fM2965constructorimpl2 = Dp.m2965constructorimpl(Dp.m2965constructorimpl(fMo190toDpu2uoSUM - fM2965constructorimpl) * f);
        Modifier modifierAlign = boxScopeInstance.align(Modifier.INSTANCE, companion.getCenterStart());
        Track(SizeKt.fillMaxSize$default(modifierAlign, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, fMo193toPx0680j_5, fMo193toPx0680j_4, composerStartRestartGroup, 265216 | ((i >> 6) & 112) | ((i << 6) & 896) | ((i << 9) & 57344));
        m794SliderThumbgNmqVrs(modifierAlign, fM2965constructorimpl2, mutableInteractionSource, sliderColors, z, fM2965constructorimpl, composerStartRestartGroup, 196608 | ((i >> 9) & 896) | (i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i << 12) & 57344));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.SliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                SliderKt.SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: SliderThumb-gNmqVrs, reason: not valid java name */
    public static final void m794SliderThumbgNmqVrs(final Modifier modifier, final float f, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1690330031);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(sliderColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if (((374491 & i2) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(modifier, f, 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-528165580);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i3 = i2 >> 6;
            int i4 = i3 & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i4);
            float fM2965constructorimpl = snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation;
            Modifier modifierIndication = IndicationKt.indication(SizeKt.m323sizeVpY3zN4(Modifier.INSTANCE, f2, f2), mutableInteractionSource, RippleKt.m880rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4));
            if (!z) {
                fM2965constructorimpl = Dp.m2965constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m110backgroundbw27NRU(ShadowKt.m922shadowziNgDLE(modifierIndication, fM2965constructorimpl, RoundedCornerShapeKt.getCircleShape(), false), sliderColors.thumbColor(z, composerStartRestartGroup, ((i2 >> 12) & 14) | (i3 & 112)).getValue().m1222unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                SliderKt.m794SliderThumbgNmqVrs(modifier, f, mutableInteractionSource, sliderColors, z, f2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final List<Float> list, final float f3, final float f4, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1052525940);
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final State<Color> stateTrackColor = sliderColors.trackColor(z, false, composerStartRestartGroup, i2);
        final State<Color> stateTrackColor2 = sliderColors.trackColor(z, true, composerStartRestartGroup, i2);
        final State<Color> stateTickColor = sliderColors.tickColor(z, false, composerStartRestartGroup, i2);
        final State<Color> stateTickColor2 = sliderColors.tickColor(z, true, composerStartRestartGroup, i2);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt.Track.1
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
                boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                long jOffset = OffsetKt.Offset(f3, Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0()));
                long jOffset2 = OffsetKt.Offset(Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc()) - f3, Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0()));
                long j = z2 ? jOffset2 : jOffset;
                if (!z2) {
                    jOffset = jOffset2;
                }
                long jM1222unboximpl = stateTrackColor.getValue().m1222unboximpl();
                float f5 = f4;
                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                long j2 = j;
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, jM1222unboximpl, j, jOffset, f5, companion.m1482getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, stateTrackColor2.getValue().m1222unboximpl(), OffsetKt.Offset(Offset.m983getXimpl(j2) + ((Offset.m983getXimpl(jOffset) - Offset.m983getXimpl(j2)) * f), Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0())), OffsetKt.Offset(Offset.m983getXimpl(j2) + ((Offset.m983getXimpl(jOffset) - Offset.m983getXimpl(j2)) * f2), Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0())), f4, companion.m1482getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f6 = f2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).floatValue() > f6);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                State<Color> state = stateTickColor;
                State<Color> state2 = stateTickColor2;
                float f7 = f4;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Offset.m972boximpl(OffsetKt.Offset(Offset.m983getXimpl(OffsetKt.m1006lerpWko1d7g(j2, jOffset, ((Number) it2.next()).floatValue())), Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0()))));
                    }
                    DrawScope.DefaultImpls.m1625drawPointsF8ZwMP8$default(drawScope, arrayList2, PointMode.INSTANCE.m1447getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m1222unboximpl(), f7, StrokeCap.INSTANCE.m1482getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                }
            }
        }, composerStartRestartGroup, i & 14);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Track.2
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
                SliderKt.Track(modifier, sliderColors, z, f, f2, list, f3, f4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object objDrag$default = DraggableState.DefaultImpls.drag$default(draggableState, null, new C13932(f, f2, f3, null), continuation, 1, null);
        return objDrag$default == a.getCOROUTINE_SUSPENDED() ? objDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: awaitSlop-rnUCldI, reason: not valid java name */
    public static final Object m797awaitSloprnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            int i = sliderKt$awaitSlop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label = i - Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
            }
        } else {
            sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
        }
        Object obj = sliderKt$awaitSlop$1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = sliderKt$awaitSlop$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material.SliderKt$awaitSlop$postTouchSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f) {
                    invoke(pointerInputChange, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PointerInputChange pointerInputChange, float f) {
                    PointerEventKt.consumePositionChange(pointerInputChange);
                    floatRef2.element = f;
                }
            };
            sliderKt$awaitSlop$1.L$0 = floatRef2;
            sliderKt$awaitSlop$1.label = 1;
            Object objM154awaitHorizontalTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m154awaitHorizontalTouchSlopOrCancellationjO51t88(awaitPointerEventScope, j, function2, sliderKt$awaitSlop$1);
            if (objM154awaitHorizontalTouchSlopOrCancellationjO51t88 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM154awaitHorizontalTouchSlopOrCancellationjO51t88;
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return kotlin.ranges.e.coerceIn((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C13941(mutableInteractionSource, mutableInteractionSource2, state, state2, function2, z2, f, state3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderPressModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f, boolean z, State<Float> state, State<? extends Function1<? super Float, Unit>> state2, boolean z2) {
        return z2 ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f), Boolean.valueOf(z)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C13951(draggableState, mutableInteractionSource, state2, z, f, state, null)) : modifier;
    }

    private static final Modifier sliderSemantics(Modifier modifier, float f, final List<Float> list, final boolean z, final Function1<? super Float, Unit> function1, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i) {
        final float fCoerceIn = kotlin.ranges.e.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i2 = i;
                final List<Float> list2 = list;
                final float f2 = fCoerceIn;
                final Function1<Float, Unit> function2 = function1;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return invoke(f3.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f3) {
                        Object obj;
                        float fCoerceIn2 = kotlin.ranges.e.coerceIn(f3, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        if (i2 > 0) {
                            List<Float> list3 = list2;
                            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = closedFloatingPointRange2;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            Iterator<T> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Float.valueOf(MathHelpersKt.lerp(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), ((Number) it2.next()).floatValue())));
                            }
                            Iterator it3 = arrayList.iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    float fAbs = Math.abs(((Number) next).floatValue() - fCoerceIn2);
                                    do {
                                        Object next2 = it3.next();
                                        float fAbs2 = Math.abs(((Number) next2).floatValue() - fCoerceIn2);
                                        if (Float.compare(fAbs, fAbs2) > 0) {
                                            next = next2;
                                            fAbs = fAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Float f4 = (Float) obj;
                            if (f4 != null) {
                                fCoerceIn2 = f4.floatValue();
                            }
                        }
                        boolean z2 = true;
                        if (fCoerceIn2 == f2) {
                            z2 = false;
                        } else {
                            function2.invoke(Float.valueOf(fCoerceIn2));
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }), f, closedFloatingPointRange, i);
    }

    public static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, List list, boolean z, Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = d.rangeTo(0.0f, 1.0f);
        }
        return sliderSemantics(modifier, f, list, z, function1, closedFloatingPointRange, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, List<Float> list, float f2, float f3) {
        Object obj;
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next).floatValue()) - f);
                do {
                    Object next2 = it2.next();
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next2).floatValue()) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f4 = (Float) obj;
        return f4 == null ? f : MathHelpersKt.lerp(f2, f3, f4.floatValue());
    }

    private static final List<Float> stepsToTickFractions(int i) {
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return d.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }
}
