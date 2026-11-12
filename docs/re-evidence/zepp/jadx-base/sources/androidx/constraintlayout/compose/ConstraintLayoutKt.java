package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.xiaomi.hm.health.Constant;
import java.util.EnumSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001e\b\u0004\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ap\u0010\n\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0010\b\n\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u0013\b\b\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001e\u001a5\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0015\u0010!\u001a\b\u0010#\u001a\u00020\"H\u0000\u001a\u001f\u0010*\u001a\u00020'*\u00020$2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010.\u001a\u00020+*\u00020$2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010-\u001a!\u00102\u001a\u00020/*\u00020+2\u0006\u0010&\u001a\u00020%H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u00101\u001a\u001f\u0010*\u001a\u00020/*\u00020+2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u00101\u001a\u001f\u0010.\u001a\u00020/*\u00020'2\u0006\u0010&\u001a\u00020%ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u00103\u001a%\u00106\u001a\u00020\u00172\b\b\u0001\u0010\t\u001a\u0002042\n\b\u0003\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\b6\u00107\u001a\u0010\u00106\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u000204\u001a\u0018\u00106\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\b\b\u0001\u00108\u001a\u000204\u001a\u001f\u00106\u001a\u00020\u00172\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\b\u001a'\u00106\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\b\u001a\u001e\u0010A\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0000\u001a\f\u0010C\u001a\u000204*\u00020BH\u0002\u001a\f\u0010C\u001a\u000204*\u00020DH\u0002\"\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010F\"\u0017\u00102\u001a\u00020'*\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0017\u0010K\u001a\u00020+*\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0017\u00102\u001a\u00020/*\u00020+8F@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010L\"\u0017\u0010K\u001a\u00020/*\u00020'8F@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010M*\f\b\u0000\u0010O\"\u00020N2\u00020N*\f\b\u0000\u0010Q\"\u00020P2\u00020P*\f\b\u0000\u0010S\"\u00020R2\u00020R*\f\b\u0000\u0010U\"\u00020T2\u00020T\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "optimizationLevel", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ConstraintLayout", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "scope", "Landroidx/compose/runtime/MutableState;", "", "remeasureRequesterState", "Landroidx/constraintlayout/compose/Measurer;", "measurer", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "rememberConstraintLayoutMeasurePolicy", "(ILandroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "animateChanges", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "finishedAnimationListener", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "needsUpdate", "(ILandroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "createId", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/compose/ui/unit/Dp;", Constant.PAI_KEY_DAILY_PAI, "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeast", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMost", "Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "", "overrideVariables", "ConstraintSet", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "jsonContent", "extendConstraintSet", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "description", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "buildMapping", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "toDebugString", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "DEBUG", "Z", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/core/state/State$Chain;", "SolverChain", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDimension", "Landroidx/constraintlayout/core/state/State$Direction;", "SolverDirection", "Landroidx/constraintlayout/core/state/State;", "SolverState", "compose_release"}, k = 2, mv = {1, 5, 1})
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4", f = "ConstraintLayout.kt", i = {}, l = {237, 246}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AnimationSpec<Float> $animationSpec;
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ MutableState<Integer> $direction;
        public final /* synthetic */ MutableState<ConstraintSet> $endConstraint$delegate;
        public final /* synthetic */ Function0<Unit> $finishedAnimationListener;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
        public final /* synthetic */ MutableState<ConstraintSet> $startConstraint$delegate;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Channel<ConstraintSet> channel, MutableState<Integer> mutableState, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$direction = mutableState;
            this.$progress = animatable;
            this.$animationSpec = animationSpec;
            this.$finishedAnimationListener = function0;
            this.$startConstraint$delegate = mutableState2;
            this.$endConstraint$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass4(this.$channel, this.$direction, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x003f  */
        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x005f  */
        /* JADX WARN: Code duplicated, block: B:23:0x006e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0075  */
        /* JADX WARN: Code duplicated, block: B:27:0x0081  */
        /* JADX WARN: Code duplicated, block: B:29:0x008f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0095  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bf A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c0 -> B:35:0x00c2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e5 -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutKt.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Composable
    public static final void ConstraintLayout(@Nullable Modifier modifier, int i, @NotNull final Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i2, int i3) {
        composer.startReplaceableGroup(-270267499);
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        int i4 = (i3 & 2) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Measurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Measurer measurer = (Measurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i4, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer, ((i2 >> 3) & 14) | 4544);
        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
        final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.1
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
                ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, measurer);
            }
        }, 1, null), ComposableLambdaKt.composableLambda(composer, -819893854, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.2
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
            public final void invoke(@Nullable Composer composer2, int i5) {
                if (((i5 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                constraintLayoutScope.reset();
                function3.invoke(constraintLayoutScope, composer2, Integer.valueOf(((i2 >> 3) & 112) | 8));
                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                    function0Component2.getA();
                }
            }
        }), measurePolicyComponent1, composer, 48, 0);
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ConstraintLayout$lambda-10, reason: not valid java name */
    public static final void m3209ConstraintLayout$lambda10(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ConstraintLayout$lambda-6, reason: not valid java name */
    public static final ConstraintSet m3210ConstraintLayout$lambda6(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ConstraintLayout$lambda-7, reason: not valid java name */
    public static final void m3211ConstraintLayout$lambda7(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ConstraintLayout$lambda-9, reason: not valid java name */
    public static final ConstraintSet m3212ConstraintLayout$lambda9(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @NotNull
    public static final ConstraintSet ConstraintSet(@Language("json5") @NotNull String str, @Language("json5") @Nullable String str2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1704604713);
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(str) | composer.changed(str3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new JSONConstraintSet(str, str3, null, 4, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        JSONConstraintSet jSONConstraintSet = (JSONConstraintSet) objRememberedValue;
        composer.endReplaceableGroup();
        return jSONConstraintSet;
    }

    @NotNull
    /* JADX INFO: renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension.MaxCoercible m3217atLeast3ABfNKs(@NotNull Dimension.Coercible coercible, float f) {
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.m3228setMinYLDhkOg(Dp.m2963boximpl(f));
        return dimensionDescription;
    }

    @Deprecated(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @ReplaceWith(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    @NotNull
    /* JADX INFO: renamed from: atLeastWrapContent-3ABfNKs, reason: not valid java name */
    public static final Dimension m3219atLeastWrapContent3ABfNKs(@NotNull Dimension.MinCoercible minCoercible, float f) {
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.m3228setMinYLDhkOg(Dp.m2963boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension.MinCoercible m3220atMost3ABfNKs(@NotNull Dimension.Coercible coercible, float f) {
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.m3227setMaxYLDhkOg(Dp.m2963boximpl(f));
        return dimensionDescription;
    }

    public static final void buildMapping(@NotNull State state, @NotNull List<? extends Measurable> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Measurable measurable = list.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId, measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @NotNull
    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.createId.1
        };
    }

    @NotNull
    public static final Dimension.MaxCoercible getAtLeastWrapContent(@NotNull Dimension.Coercible coercible) {
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @NotNull
    public static final Dimension.MinCoercible getAtMostWrapContent(@NotNull Dimension.Coercible coercible) {
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy(final int i, @NotNull ConstraintLayoutScope constraintLayoutScope, @NotNull final MutableState<Boolean> mutableState, @NotNull final Measurer measurer, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-441911663);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ConstraintSetForInlineDsl(constraintLayoutScope);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = TuplesKt.to(new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull final List<? extends Measurable> list, long j) {
                    long jM3233performMeasureDjhGOtQ = measurer.m3233performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, i, measureScope);
                    mutableState.getValue();
                    int iM3085getWidthimpl = IntSize.m3085getWidthimpl(jM3233performMeasureDjhGOtQ);
                    int iM3084getHeightimpl = IntSize.m3084getHeightimpl(jM3233performMeasureDjhGOtQ);
                    final Measurer measurer2 = measurer;
                    return MeasureScope.DefaultImpls.layout$default(measureScope, iM3085getWidthimpl, iM3084getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1
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
                            measurer2.performLayout(placementScope, list);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }
            }, new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1
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
                    MutableState<Boolean> mutableState2 = mutableState;
                    mutableState2.setValue(Boolean.valueOf(!mutableState2.getValue().booleanValue()));
                    constraintSetForInlineDsl.setKnownDirty(true);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pair = (Pair) objRememberedValue2;
        composer.endReplaceableGroup();
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.getDebugName()) + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(BasicMeasure.Measure measure) {
        return "measure strategy is ";
    }

    @NotNull
    /* JADX INFO: renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension m3218atLeast3ABfNKs(@NotNull Dimension.MinCoercible minCoercible, float f) {
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.m3228setMinYLDhkOg(Dp.m2963boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension m3221atMost3ABfNKs(@NotNull Dimension.MaxCoercible maxCoercible, float f) {
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.m3227setMaxYLDhkOg(Dp.m2963boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    public static final Dimension getAtLeastWrapContent(@NotNull Dimension.MinCoercible minCoercible) {
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @NotNull
    public static final Dimension getAtMostWrapContent(@NotNull Dimension.MaxCoercible maxCoercible) {
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@Language("json5") @NotNull String str) {
        return new JSONConstraintSet(str, null, null, 6, null);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull ConstraintSet constraintSet, @Language("json5") @NotNull String str) {
        return new JSONConstraintSet(str, null, constraintSet, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, null, 2, 0 == true ? 1 : 0);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull ConstraintSet constraintSet, @NotNull Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, constraintSet);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberConstraintLayoutMeasurePolicy(final int i, @NotNull MutableState<Long> mutableState, @NotNull final ConstraintSet constraintSet, @NotNull final Measurer measurer, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-441904281);
        Integer numValueOf = Integer.valueOf(i);
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(value) | composer.changed(numValueOf) | composer.changed(constraintSet);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            measurer.parseDesignElements(constraintSet);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull final List<? extends Measurable> list, long j) {
                    long jM3233performMeasureDjhGOtQ = measurer.m3233performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSet, list, i, measureScope);
                    int iM3085getWidthimpl = IntSize.m3085getWidthimpl(jM3233performMeasureDjhGOtQ);
                    int iM3084getHeightimpl = IntSize.m3084getHeightimpl(jM3233performMeasureDjhGOtQ);
                    final Measurer measurer2 = measurer;
                    return MeasureScope.DefaultImpls.layout$default(measureScope, iM3085getWidthimpl, iM3084getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1$measure$1
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
                            measurer2.performLayout(placementScope, list);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public static final void ConstraintLayout(@NotNull final ConstraintSet constraintSet, @Nullable Modifier modifier, int i, boolean z, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function0<Unit> function0, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i2, int i3) {
        composer.startReplaceableGroup(-270262526);
        Modifier modifierScale = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 4) != 0 ? 257 : i;
        boolean z2 = (i3 & 8) != 0 ? false : z;
        AnimationSpec<Float> animationSpecTween$default = (i3 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function1 = (i3 & 32) != 0 ? null : function0;
        if (z2) {
            composer.startReplaceableGroup(-270262143);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue3;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final Channel channel = (Channel) objRememberedValue4;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.3
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
                    channel.mo4435trySendJP2dKIU(constraintSet);
                }
            }, composer, 0);
            EffectsKt.LaunchedEffect(channel, new AnonymousClass4(channel, (MutableState) objRememberedValue5, animatable, animationSpecTween$default, function1, mutableState, mutableState2, null), composer, 8);
            ConstraintSet constraintSetM3210ConstraintLayout$lambda6 = m3210ConstraintLayout$lambda6(mutableState);
            ConstraintSet constraintSetM3212ConstraintLayout$lambda9 = m3212ConstraintLayout$lambda9(mutableState2);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            int i5 = (i2 << 12) & 458752;
            composer.startReplaceableGroup(-1330873931);
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            EnumSet enumSetOf = EnumSet.of(motionLayoutDebugFlags);
            int i6 = i5 << 3;
            int i7 = (i5 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i5 & 14) | 229376 | (i5 & 112) | (i5 & 896) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024);
            composer.startReplaceableGroup(-1330871174);
            final int i8 = (i7 & 234881024) | (i7 & 896) | (i7 & 14) | 32768 | (i7 & 112) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128);
            composer.startReplaceableGroup(-1401223160);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new MotionMeasurer();
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue6;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceableGroup();
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue7;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            EffectsKt.SideEffect(new MotionLayoutKt.AnonymousClass7(mutableState3, fFloatValue), composer, 0);
            int i9 = i8 << 9;
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(257, enumSetOf, 0L, constraintSetM3210ConstraintLayout$lambda6, constraintSetM3212ConstraintLayout$lambda9, null, mutableState3, motionMeasurer, composer, 18350528 | ((i8 >> 21) & 14) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (i9 & 458752));
            motionMeasurer.addLayoutInformationReceiver(null);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (enumSetOf.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401221304);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt.AnonymousClass9(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897795, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        }
                    }
                }), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1401222019);
                if (!Float.isNaN(forcedScaleFactor)) {
                    modifierScale = ScaleKt.scale(modifierScale, motionMeasurer.getForcedScaleFactor());
                }
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer);
                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$8$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897313, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        }
                    }
                }), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922832858);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922832784);
                    composer.endReplaceableGroup();
                }
                if (!enumSetOf.contains(motionLayoutDebugFlags)) {
                    composer.startReplaceableGroup(-922832717);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922832666);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-270260735);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue9 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue9 == companion4.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceableGroup();
            MutableState<Long> mutableState4 = (MutableState) objRememberedValue9;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue10 = composer.rememberedValue();
            if (objRememberedValue10 == companion4.getEmpty()) {
                objRememberedValue10 = new Measurer();
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceableGroup();
            final Measurer measurer = (Measurer) objRememberedValue10;
            Modifier modifier2 = modifierScale;
            MeasurePolicy measurePolicyRememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i4, mutableState4, constraintSet, measurer, composer, ((i2 >> 6) & 14) | 4144 | ((i2 << 6) & 896));
            if (constraintSet instanceof EditableJSONLayout) {
                ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableState4);
            }
            measurer.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
            float forcedScaleFactor2 = measurer.getForcedScaleFactor();
            if (!Float.isNaN(forcedScaleFactor2)) {
                composer.startReplaceableGroup(-270260121);
                Modifier modifierScale2 = ScaleKt.scale(modifier2, measurer.getForcedScaleFactor());
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer);
                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl2, density2, companion6.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion6.getSetLayoutDirection());
                composer.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$6$1
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
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, measurer);
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composer, -819901215, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$6$2
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
                        } else {
                            measurer.createDesignElements(composer2, 8);
                            function2.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        }
                    }
                }), measurePolicyRememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                measurer.drawDebugBounds(boxScopeInstance2, forcedScaleFactor2, composer, 518);
                Unit unit2 = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-270259531);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.7
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
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, measurer);
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composer, -819901739, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.8
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
                        } else {
                            measurer.createDesignElements(composer2, 8);
                            function2.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        }
                    }
                }), measurePolicyRememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }
}
