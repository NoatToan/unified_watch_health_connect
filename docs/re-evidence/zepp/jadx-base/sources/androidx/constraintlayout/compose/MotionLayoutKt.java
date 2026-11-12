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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a{\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ag\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018\u001a\u008d\u0001\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001f\u001a\u0087\u0001\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\"\u001a\u008d\u0001\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0081\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001f\u001ag\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0081\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u0018\u001a\u0087\u0001\u0010#\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\b\u0004\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0081\bø\u0001\u0000¢\u0006\u0004\b#\u0010\"\u001a\u0019\u0010$\u001a\u00020\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b&\u0010'\u001a]\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050,2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101\"\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "start", "end", "Landroidx/constraintlayout/compose/Transition;", "transition", "", "progress", "Ljava/util/EnumSet;", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "debug", "Landroidx/compose/ui/Modifier;", "modifier", "", "optimizationLevel", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", MotionLayout.TAG, "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/constraintlayout/compose/MotionScene;", "motionScene", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "constraintSetName", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function0;", "finishedAnimationListener", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Ljava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "informationReceiver", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", "MotionScene", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;", "Transition", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/Transition;", "", "needsUpdate", "constraintSetStart", "constraintSetEnd", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberMotionLayoutMeasurePolicy", "(ILjava/util/EnumSet;JLandroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "DEBUG", "Z", "compose_release"}, k = 2, mv = {1, 5, 1})
public final class MotionLayoutKt {
    private static final boolean DEBUG = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ ConstraintSet $targetConstraintSet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Channel<ConstraintSet> channel, ConstraintSet constraintSet) {
            super(0);
            this.$channel = channel;
            this.$targetConstraintSet = constraintSet;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$channel.mo4435trySendJP2dKIU(this.$targetConstraintSet);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$10, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass10 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function3<MotionLayoutScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ MotionLayoutScope $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, MotionLayoutScope motionLayoutScope, int i) {
            super(2);
            this.$content = function3;
            this.$scope = motionLayoutScope;
            this.$$changed = i;
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
            } else {
                this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 21) & 112) | 8));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2", f = "MotionLayout.kt", i = {}, l = {228, 238}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
        public final /* synthetic */ AnimationSpec<Float> $animationSpec;
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
        public final /* synthetic */ Function0<Unit> $finishedAnimationListener;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
        public final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Channel<ConstraintSet> channel, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$progress = animatable;
            this.$animationSpec = animationSpec;
            this.$finishedAnimationListener = function0;
            this.$animateToEnd$delegate = mutableState;
            this.$start$delegate = mutableState2;
            this.$end$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x003f  */
        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x005f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0068  */
        /* JADX WARN: Code duplicated, block: B:24:0x006b  */
        /* JADX WARN: Code duplicated, block: B:27:0x0074  */
        /* JADX WARN: Code duplicated, block: B:28:0x007b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0087  */
        /* JADX WARN: Code duplicated, block: B:33:0x008f  */
        /* JADX WARN: Code duplicated, block: B:34:0x0095  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b4 -> B:39:0x00b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cb -> B:11:0x0034). Please report as a decompilation issue!!! */
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
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableState<Float> $progressState;
        public final /* synthetic */ Ref.FloatRef $usedProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableState<Float> mutableState, Ref.FloatRef floatRef) {
            super(0);
            this.$progressState = mutableState;
            this.$usedProgress = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$progressState.setValue(Float.valueOf(this.$usedProgress.element));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass5 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ MotionMeasurer $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MotionMeasurer motionMeasurer) {
            super(1);
            this.$measurer = motionMeasurer;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$6, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass6 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function3<MotionLayoutScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ MotionLayoutScope $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, MotionLayoutScope motionLayoutScope, int i) {
            super(2);
            this.$content = function3;
            this.$scope = motionLayoutScope;
            this.$$changed = i;
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
            } else {
                this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 12) & 112) | 8));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$7, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass7 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ float $progress;
        public final /* synthetic */ MutableState<Float> $progressState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MutableState<Float> mutableState, float f) {
            super(0);
            this.$progressState = mutableState;
            this.$progress = f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$progressState.setValue(Float.valueOf(this.$progress));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$9, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass9 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ MotionMeasurer $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(MotionMeasurer motionMeasurer) {
            super(1);
            this.$measurer = motionMeasurer;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
        }
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull ConstraintSet constraintSet, @NotNull ConstraintSet constraintSet2, @Nullable Transition transition, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1330873931);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 16) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        Modifier modifierScale = (i3 & 32) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 64) != 0 ? 257 : i;
        int i5 = i2 << 3;
        int i6 = (i5 & 234881024) | 229376 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i5 & 3670016) | (i5 & 29360128);
        composer.startReplaceableGroup(-1330871174);
        int i7 = 32768 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i6 & 458752) | (3670016 & i6) | (i6 & 29360128) | (i6 & 234881024);
        composer.startReplaceableGroup(-1401223160);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        EffectsKt.SideEffect(new AnonymousClass7(mutableState, f), composer, 0);
        int i8 = i7 << 9;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSetOf, 0L, constraintSet, constraintSet2, transition2, mutableState, motionMeasurer, composer, ((i7 >> 21) & 14) | 18350528 | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i8) | (i8 & 458752));
        motionMeasurer.addLayoutInformationReceiver(null);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSetOf.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401221304);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new AnonymousClass9(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897795, true, new AnonymousClass10(function3, motionLayoutScope, i7)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$8$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897313, true, new MotionLayoutKt$MotionLayoutCore$8$2(function3, motionLayoutScope, i7)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922832784);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922832858);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            }
            if (enumSetOf.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922832666);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922832717);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
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
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02c0  */
    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull MotionScene motionScene, @Nullable String str, @Nullable AnimationSpec<Float> animationSpec, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @Nullable Function0<Unit> function0, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        Transition transition;
        int i4;
        int i5;
        composer.startReplaceableGroup(-1401230599);
        String str2 = (i3 & 2) != 0 ? null : str;
        AnimationSpec<Float> animationSpecTween$default = (i3 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 8) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        Modifier modifier2 = (i3 & 16) != 0 ? Modifier.INSTANCE : modifier;
        int i6 = (i3 & 32) != 0 ? 257 : i;
        Function0<Unit> function1 = (i3 & 64) != 0 ? null : function0;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSetOf = EnumSet.of(motionScene.getForcedDrawDebug());
        }
        Long value = mutableState.getValue();
        int i7 = i2 & 14;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(value) | composer.changed(motionScene);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue2;
        if (str3 == null) {
            composer.startReplaceableGroup(-488445290);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401229621);
            Transition Transition = Transition(str3, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? "start" : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str4 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str5 = (String) objRememberedValue4;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged4 = composer.changed(motionScene) | composer.changed(str2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = str2 == null ? null : motionScene.getConstraintSet(str2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        String str6 = (String) objRememberedValue5;
        if (str4 == null || str5 == null) {
            composer.endReplaceableGroup();
            return;
        }
        composer.startReplaceableGroup(-3686930);
        boolean zChanged5 = composer.changed(motionScene);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str4), null, 2, null);
            composer.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue6 = mutableStateMutableStateOf$default;
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue6;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged6 = composer.changed(motionScene);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str5), null, 2, null);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue7;
        ConstraintSet ConstraintSet = str6 == null ? null : ConstraintLayoutKt.ConstraintSet(str6);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue8;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged7 = composer.changed(motionScene);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChanged7 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) objRememberedValue9;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(objRememberedValue10);
        }
        composer.endReplaceableGroup();
        Channel channel = (Channel) objRememberedValue10;
        if (ConstraintSet != null) {
            composer.startReplaceableGroup(-1401228367);
            EffectsKt.SideEffect(new AnonymousClass1(channel, ConstraintSet), composer, 0);
            i4 = -3687241;
            EffectsKt.LaunchedEffect(motionScene, channel, new AnonymousClass2(channel, animatable, animationSpecTween$default, function1, mutableState4, mutableState2, mutableState3, null), composer, i7 | 64);
            composer.endReplaceableGroup();
        } else {
            i4 = -3687241;
            composer.startReplaceableGroup(-1401227510);
            composer.endReplaceableGroup();
        }
        composer.startReplaceableGroup(i4);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            i5 = 2;
            objRememberedValue11 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue11);
        } else {
            i5 = 2;
        }
        composer.endReplaceableGroup();
        MutableState mutableState5 = (MutableState) objRememberedValue11;
        float forcedProgress = motionScene.getForcedProgress();
        if (Float.isNaN(forcedProgress)) {
            motionScene.resetForcedProgress();
            forcedProgress = ((Number) animatable.getValue()).floatValue();
        } else {
            if (!(((Number) mutableState5.getValue()).floatValue() == ((Number) animatable.getValue()).floatValue())) {
                motionScene.resetForcedProgress();
                forcedProgress = ((Number) animatable.getValue()).floatValue();
            }
        }
        mutableState5.setValue(animatable.getValue());
        ConstraintSet constraintSetM3240MotionLayoutCore$lambda8 = m3240MotionLayoutCore$lambda8(mutableState2);
        ConstraintSet constraintSetM3234MotionLayoutCore$lambda11 = m3234MotionLayoutCore$lambda11(mutableState3);
        JSONMotionScene jSONMotionScene = motionScene instanceof JSONMotionScene ? (JSONMotionScene) motionScene : null;
        int i8 = i2 << 6;
        int i9 = (i8 & 29360128) | (i8 & 3670016) | 32768 | ((i2 << 3) & 234881024);
        composer.startReplaceableGroup(-1330871174);
        int i10 = (3670016 & i9) | (i9 & 14) | 32768 | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 458752) | (i9 & 29360128) | (i9 & 234881024);
        composer.startReplaceableGroup(-1401223160);
        composer.startReplaceableGroup(i4);
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue12);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue12;
        composer.startReplaceableGroup(i4);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue13);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue13;
        composer.startReplaceableGroup(i4);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, i5, null);
            composer.updateRememberedValue(objRememberedValue14);
        }
        composer.endReplaceableGroup();
        MutableState mutableState6 = (MutableState) objRememberedValue14;
        EffectsKt.SideEffect(new AnonymousClass7(mutableState6, forcedProgress), composer, 0);
        int i11 = i10 << 9;
        EnumSet<MotionLayoutDebugFlags> enumSet2 = enumSetOf;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i6, enumSetOf, 0L, constraintSetM3240MotionLayoutCore$lambda8, constraintSetM3234MotionLayoutCore$lambda11, transition, mutableState6, motionMeasurer, composer, 18350528 | ((i10 >> 21) & 14) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11) | (i11 & 458752));
        motionMeasurer.addLayoutInformationReceiver(jSONMotionScene);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401221304);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new AnonymousClass9(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897795, true, new AnonymousClass10(function3, motionLayoutScope, i10)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        } else {
            Modifier modifier3 = modifier2;
            composer.startReplaceableGroup(-1401222019);
            Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$8$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897313, true, new MotionLayoutKt$MotionLayoutCore$8$2(function3, motionLayoutScope, i10)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922832784);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922832858);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            }
            if (enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922832666);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922832717);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-11, reason: not valid java name */
    public static final ConstraintSet m3234MotionLayoutCore$lambda11(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-12, reason: not valid java name */
    public static final void m3235MotionLayoutCore$lambda12(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-16, reason: not valid java name */
    public static final boolean m3236MotionLayoutCore$lambda16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-17, reason: not valid java name */
    public static final void m3237MotionLayoutCore$lambda17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-26, reason: not valid java name */
    public static final float m3238MotionLayoutCore$lambda26(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-27, reason: not valid java name */
    public static final void m3239MotionLayoutCore$lambda27(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-8, reason: not valid java name */
    public static final ConstraintSet m3240MotionLayoutCore$lambda8(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MotionLayoutCore$lambda-9, reason: not valid java name */
    public static final void m3241MotionLayoutCore$lambda9(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @NotNull
    public static final MotionScene MotionScene(@Language("json5") @NotNull String str, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1405666242);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(str);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new JSONMotionScene(str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        JSONMotionScene jSONMotionScene = (JSONMotionScene) objRememberedValue;
        composer.endReplaceableGroup();
        return jSONMotionScene;
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @Nullable
    public static final Transition Transition(@Language("json5") @NotNull String str, @Nullable Composer composer, int i) {
        final CLObject cLObject;
        composer.startReplaceableGroup(811760657);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(str);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            try {
                cLObject = CLParser.parse(str);
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
                cLObject = null;
            }
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(cLObject != null ? new Transition() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$Transition$transition$1$1
                @Override // androidx.constraintlayout.compose.Transition
                public void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition, int i2) {
                    try {
                        ConstraintSetParserKt.parseTransition(cLObject, transition);
                    } catch (CLParsingException e2) {
                        System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e2));
                    }
                }

                @Override // androidx.constraintlayout.compose.Transition
                @NotNull
                public String getEndConstraintSetId() {
                    String stringOrNull = cLObject.getStringOrNull("to");
                    return stringOrNull == null ? "end" : stringOrNull;
                }

                @Override // androidx.constraintlayout.compose.Transition
                @NotNull
                public String getStartConstraintSetId() {
                    String stringOrNull = cLObject.getStringOrNull("from");
                    return stringOrNull == null ? "start" : stringOrNull;
                }
            } : null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionLayoutKt$Transition$transition$1$1 motionLayoutKt$Transition$transition$1$1 = (MotionLayoutKt$Transition$transition$1$1) ((MutableState) objRememberedValue).getValue();
        composer.endReplaceableGroup();
        return motionLayoutKt$Transition$transition$1$1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 ??, still in use, count: 1, list:
          (r8v1 ?? I:java.lang.Object) from 0x0064: INVOKE (r18v0 ?? I:androidx.compose.runtime.Composer), (r8v1 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:9)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.layout.MeasurePolicy rememberMotionLayoutMeasurePolicy(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 ??, still in use, count: 1, list:
          (r8v1 ?? I:java.lang.Object) from 0x0064: INVOKE (r18v0 ?? I:androidx.compose.runtime.Composer), (r8v1 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:9)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull MotionScene motionScene, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        Object obj;
        composer.startReplaceableGroup(-1330873040);
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 4) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 16) != 0 ? 257 : i;
        int i5 = (i2 & 14) | 512 | (i2 & 112) | (i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i2) | (i2 & 458752);
        composer.startReplaceableGroup(-1401226724);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        Transition transition = null;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        EnumSet<MotionLayoutDebugFlags> enumSetOf2 = motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN ? EnumSet.of(motionScene.getForcedDrawDebug()) : enumSetOf;
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(motionScene) | composer.changed(value);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str = (String) objRememberedValue2;
        if (str == null) {
            composer.startReplaceableGroup(-488329412);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401225883);
            Transition Transition = Transition(str, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? "start" : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str2 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue4;
        if (str2 != null && str3 != null) {
            ConstraintSet ConstraintSet = ConstraintLayoutKt.ConstraintSet(str2);
            ConstraintSet ConstraintSet2 = ConstraintLayoutKt.ConstraintSet(str3);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue5;
            float forcedProgress = motionScene.getForcedProgress();
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (Float.isNaN(forcedProgress)) {
                motionScene.resetForcedProgress();
            } else {
                if (m3238MotionLayoutCore$lambda26(mutableState2) == f) {
                    floatRef.element = forcedProgress;
                } else {
                    motionScene.resetForcedProgress();
                }
            }
            m3239MotionLayoutCore$lambda27(mutableState2, f);
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
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue7;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                obj = null;
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            } else {
                obj = null;
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            EffectsKt.SideEffect(new AnonymousClass3(mutableState3, floatRef), composer, 0);
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSetOf2, mutableState.getValue().longValue(), ConstraintSet, ConstraintSet2, transition, mutableState3, motionMeasurer, composer, ((i5 >> 12) & 14) | 18350144);
            motionMeasurer.addLayoutInformationReceiver((JSONMotionScene) motionScene);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            if (enumSetOf.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401223448);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new AnonymousClass5(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819899683, true, new AnonymousClass6(function3, motionLayoutScope, i5)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                Modifier modifier3 = modifier2;
                composer.startReplaceableGroup(-1401224163);
                Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$4$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819899201, true, new MotionLayoutKt$MotionLayoutCore$4$2(function3, motionLayoutScope, i5)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922835002);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922834928);
                    composer.endReplaceableGroup();
                }
                if (!enumSetOf.contains(motionLayoutDebugFlags)) {
                    composer.startReplaceableGroup(-922834861);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922834810);
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
        } else {
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull MotionScene motionScene, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        Object obj;
        composer.startReplaceableGroup(-1401226724);
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 4) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 16) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        Transition transition = null;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        EnumSet<MotionLayoutDebugFlags> enumSetOf2 = motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN ? EnumSet.of(motionScene.getForcedDrawDebug()) : enumSetOf;
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(motionScene) | composer.changed(value);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str = (String) objRememberedValue2;
        if (str == null) {
            composer.startReplaceableGroup(-488329412);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401225883);
            Transition Transition = Transition(str, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? "start" : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str2 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue4;
        if (str2 != null && str3 != null) {
            ConstraintSet ConstraintSet = ConstraintLayoutKt.ConstraintSet(str2);
            ConstraintSet ConstraintSet2 = ConstraintLayoutKt.ConstraintSet(str3);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue5;
            float forcedProgress = motionScene.getForcedProgress();
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (Float.isNaN(forcedProgress)) {
                motionScene.resetForcedProgress();
            } else {
                if (m3238MotionLayoutCore$lambda26(mutableState2) == f) {
                    floatRef.element = forcedProgress;
                } else {
                    motionScene.resetForcedProgress();
                }
            }
            m3239MotionLayoutCore$lambda27(mutableState2, f);
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
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue7;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                obj = null;
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            } else {
                obj = null;
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            EffectsKt.SideEffect(new AnonymousClass3(mutableState3, floatRef), composer, 0);
            Modifier modifier3 = modifier2;
            EnumSet<MotionLayoutDebugFlags> enumSet2 = enumSetOf;
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSetOf2, mutableState.getValue().longValue(), ConstraintSet, ConstraintSet2, transition, mutableState3, motionMeasurer, composer, ((i2 >> 12) & 14) | 18350144);
            motionMeasurer.addLayoutInformationReceiver((JSONMotionScene) motionScene);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401223448);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new AnonymousClass5(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819899683, true, new AnonymousClass6(function3, motionLayoutScope, i2)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1401224163);
                Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$4$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819899201, true, new MotionLayoutKt$MotionLayoutCore$4$2(function3, motionLayoutScope, i2)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922835002);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922834928);
                    composer.endReplaceableGroup();
                }
                if (!enumSet2.contains(motionLayoutDebugFlags)) {
                    composer.startReplaceableGroup(-922834861);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922834810);
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
            return;
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02e3  */
    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull MotionScene motionScene, @Nullable String str, @Nullable AnimationSpec<Float> animationSpec, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @Nullable Function0<Unit> function0, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        Transition transition;
        int i4;
        int i5;
        composer.startReplaceableGroup(-1330872018);
        String str2 = (i3 & 2) != 0 ? null : str;
        AnimationSpec<Float> animationSpecTween$default = (i3 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 8) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        Modifier modifier2 = (i3 & 16) != 0 ? Modifier.INSTANCE : modifier;
        int i6 = (i3 & 32) != 0 ? 257 : i;
        Function0<Unit> function1 = (i3 & 64) != 0 ? null : function0;
        int i7 = (i2 & 14) | RaceId.RACE_ANC_ON | (i2 & 112) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128);
        composer.startReplaceableGroup(-1401230599);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSetOf = EnumSet.of(motionScene.getForcedDrawDebug());
        }
        Long value = mutableState.getValue();
        int i8 = i7 & 14;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(value) | composer.changed(motionScene);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue2;
        if (str3 == null) {
            composer.startReplaceableGroup(-488445290);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401229621);
            Transition Transition = Transition(str3, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? "start" : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str4 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str5 = (String) objRememberedValue4;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged4 = composer.changed(motionScene) | composer.changed(str2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = str2 == null ? null : motionScene.getConstraintSet(str2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        String str6 = (String) objRememberedValue5;
        if (str4 != null && str5 != null) {
            composer.startReplaceableGroup(-3686930);
            boolean zChanged5 = composer.changed(motionScene);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str4), null, 2, null);
                composer.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue6 = mutableStateMutableStateOf$default;
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue6;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged6 = composer.changed(motionScene);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str5), null, 2, null);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue7;
            ConstraintSet ConstraintSet = str6 == null ? null : ConstraintLayoutKt.ConstraintSet(str6);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue8;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged7 = composer.changed(motionScene);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue9;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue10 = composer.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceableGroup();
            Channel channel = (Channel) objRememberedValue10;
            if (ConstraintSet != null) {
                composer.startReplaceableGroup(-1401228367);
                EffectsKt.SideEffect(new AnonymousClass1(channel, ConstraintSet), composer, 0);
                i4 = -3687241;
                EffectsKt.LaunchedEffect(motionScene, channel, new AnonymousClass2(channel, animatable, animationSpecTween$default, function1, mutableState4, mutableState2, mutableState3, null), composer, i8 | 64);
                composer.endReplaceableGroup();
            } else {
                i4 = -3687241;
                composer.startReplaceableGroup(-1401227510);
                composer.endReplaceableGroup();
            }
            composer.startReplaceableGroup(i4);
            Object objRememberedValue11 = composer.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                i5 = 2;
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue11);
            } else {
                i5 = 2;
            }
            composer.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) objRememberedValue11;
            float forcedProgress = motionScene.getForcedProgress();
            if (Float.isNaN(forcedProgress)) {
                motionScene.resetForcedProgress();
                forcedProgress = ((Number) animatable.getValue()).floatValue();
            } else {
                if (!(((Number) mutableState5.getValue()).floatValue() == ((Number) animatable.getValue()).floatValue())) {
                    motionScene.resetForcedProgress();
                    forcedProgress = ((Number) animatable.getValue()).floatValue();
                }
            }
            mutableState5.setValue(animatable.getValue());
            ConstraintSet constraintSetM3240MotionLayoutCore$lambda8 = m3240MotionLayoutCore$lambda8(mutableState2);
            ConstraintSet constraintSetM3234MotionLayoutCore$lambda11 = m3234MotionLayoutCore$lambda11(mutableState3);
            JSONMotionScene jSONMotionScene = motionScene instanceof JSONMotionScene ? (JSONMotionScene) motionScene : null;
            int i9 = i7 << 6;
            int i10 = (i9 & 29360128) | (i9 & 3670016) | 32768 | ((i7 << 3) & 234881024);
            composer.startReplaceableGroup(-1330871174);
            int i11 = (i10 & 14) | 32768 | (i10 & 112) | (i10 & 896) | (i10 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024);
            composer.startReplaceableGroup(-1401223160);
            composer.startReplaceableGroup(i4);
            Object objRememberedValue12 = composer.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new MotionMeasurer();
                composer.updateRememberedValue(objRememberedValue12);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue12;
            composer.startReplaceableGroup(i4);
            Object objRememberedValue13 = composer.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(objRememberedValue13);
            }
            composer.endReplaceableGroup();
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue13;
            composer.startReplaceableGroup(i4);
            Object objRememberedValue14 = composer.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, i5, null);
                composer.updateRememberedValue(objRememberedValue14);
            }
            composer.endReplaceableGroup();
            MutableState mutableState6 = (MutableState) objRememberedValue14;
            EffectsKt.SideEffect(new AnonymousClass7(mutableState6, forcedProgress), composer, 0);
            int i12 = i11 << 9;
            EnumSet<MotionLayoutDebugFlags> enumSet2 = enumSetOf;
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i6, enumSetOf, 0L, constraintSetM3240MotionLayoutCore$lambda8, constraintSetM3234MotionLayoutCore$lambda11, transition, mutableState6, motionMeasurer, composer, 18350528 | ((i11 >> 21) & 14) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i12 & 57344) | (i12 & 458752));
            motionMeasurer.addLayoutInformationReceiver(jSONMotionScene);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401221304);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new AnonymousClass9(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897795, true, new AnonymousClass10(function3, motionLayoutScope, i11)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                Modifier modifier3 = modifier2;
                composer.startReplaceableGroup(-1401222019);
                Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$8$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897313, true, new MotionLayoutKt$MotionLayoutCore$8$2(function3, motionLayoutScope, i11)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922832858);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922832784);
                    composer.endReplaceableGroup();
                }
                if (!enumSet2.contains(motionLayoutDebugFlags)) {
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
        } else {
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull ConstraintSet constraintSet, @NotNull ConstraintSet constraintSet2, @Nullable Transition transition, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable LayoutInformationReceiver layoutInformationReceiver, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1401223160);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 16) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        LayoutInformationReceiver layoutInformationReceiver2 = (i3 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier modifier2 = (i3 & 64) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 128) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        EffectsKt.SideEffect(new AnonymousClass7(mutableState, f), composer, 0);
        int i5 = i2 << 9;
        Modifier modifier3 = modifier2;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSetOf, 0L, constraintSet, constraintSet2, transition2, mutableState, motionMeasurer, composer, ((i2 >> 21) & 14) | 18350528 | (i5 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i5) | (i5 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSetOf.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401221304);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new AnonymousClass9(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897795, true, new AnonymousClass10(function3, motionLayoutScope, i2)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222019);
            Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$8$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897313, true, new MotionLayoutKt$MotionLayoutCore$8$2(function3, motionLayoutScope, i2)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
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
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull ConstraintSet constraintSet, @NotNull ConstraintSet constraintSet2, @Nullable Transition transition, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable LayoutInformationReceiver layoutInformationReceiver, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1330871174);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        EnumSet<MotionLayoutDebugFlags> enumSetOf = (i3 & 16) != 0 ? EnumSet.of(MotionLayoutDebugFlags.NONE) : enumSet;
        LayoutInformationReceiver layoutInformationReceiver2 = (i3 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier modifier2 = (i3 & 64) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 128) != 0 ? 257 : i;
        int i5 = 32768 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2 & 458752) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024);
        composer.startReplaceableGroup(-1401223160);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        EffectsKt.SideEffect(new AnonymousClass7(mutableState, f), composer, 0);
        int i6 = i5 << 9;
        Modifier modifier3 = modifier2;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSetOf, 0L, constraintSet, constraintSet2, transition2, mutableState, motionMeasurer, composer, 18350528 | ((i5 >> 21) & 14) | (i6 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i6) | (i6 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (enumSetOf.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401221304);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new AnonymousClass9(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897795, true, new AnonymousClass10(function3, motionLayoutScope, i5)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222019);
            Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$8$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819897313, true, new MotionLayoutKt$MotionLayoutCore$8$2(function3, motionLayoutScope, i5)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
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
    }
}
