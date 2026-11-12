package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u000e\u001a\u00020\n*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001aW\u0010\u000e\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0013\u001aY\u0010\u000e\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0016\u001a]\u0010\u000e\u001a\u00020\n*\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0017\u001a]\u0010\u000e\u001a\u00020\n*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0018\u001ao\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u001b\u001aL\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00002\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\n0\u001d¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u001e\u001am\u0010 \u001a\u00020\n\"\u0004\b\u0000\u0010\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\b \u0010!\u001aT\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0083\b¢\u0006\u0004\b \u0010#\u001a;\u0010%\u001a\u00020\"\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010$\u001a\u00028\u0000H\u0003¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "AnimatedVisibility", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "transition", "AnimatedEnterExitImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "targetState", "targetEnterExit", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 5, 1})
public final class AnimatedVisibilityKt {

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass4 implements MeasurePolicy {
        public final /* synthetic */ AnimatedVisibilityScopeImpl $scope;

        public AnonymousClass4(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
            this.$scope = animatedVisibilityScopeImpl;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
            Object obj;
            final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Measurable) it2.next()).mo2468measureBRTryo0(j));
            }
            Object obj2 = null;
            int i = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int width = ((Placeable) obj).getWidth();
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex) {
                    int i2 = 1;
                    while (true) {
                        int i3 = i2 + 1;
                        Object obj3 = arrayList.get(i2);
                        int width2 = ((Placeable) obj3).getWidth();
                        if (width < width2) {
                            obj = obj3;
                            width = width2;
                        }
                        if (i2 == lastIndex) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            }
            Placeable placeable = (Placeable) obj;
            int width3 = placeable == null ? 0 : placeable.getWidth();
            if (!arrayList.isEmpty()) {
                Object obj4 = arrayList.get(0);
                int height = ((Placeable) obj4).getHeight();
                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex2) {
                    while (true) {
                        int i4 = i + 1;
                        Object obj5 = arrayList.get(i);
                        int height2 = ((Placeable) obj5).getHeight();
                        if (height < height2) {
                            obj4 = obj5;
                            height = height2;
                        }
                        if (i == lastIndex2) {
                            break;
                        }
                        i = i4;
                    }
                }
                obj2 = obj4;
            }
            Placeable placeable2 = (Placeable) obj2;
            int height3 = placeable2 == null ? 0 : placeable2.getHeight();
            this.$scope.getTargetSize$animation_release().setValue(IntSize.m3077boximpl(IntSizeKt.IntSize(width3, height3)));
            return MeasureScope.DefaultImpls.layout$default(measureScope, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4$measure$1
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
                    int size = list2.size() - 1;
                    if (size < 0) {
                        return;
                    }
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        Placeable.PlacementScope.place$default(placementScope, list2.get(i5), 0, 0, 0.0f, 4, null);
                        if (i6 > size) {
                            return;
                        } else {
                            i5 = i6;
                        }
                    }
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalAnimationApi
    public static final <T> void AnimatedEnterExitImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-918811683);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= composerStartRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(function3) ? 131072 : 65536;
        }
        int i3 = i2;
        if (((374491 & i3) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            int i4 = i3 & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            boolean zChanged = composerStartRestartGroup.changed(transition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            if (function1.invoke(transition.getTargetState()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-918811264);
                composerStartRestartGroup.startReplaceableGroup(1117104460);
                int i5 = i4 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                boolean zChanged2 = composerStartRestartGroup.changed(transition);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = transition.getCurrentState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-174040094);
                int i6 = i4 | (i3 & 112) | ((((i4 >> 3) & 112) << 6) & 896);
                EnterExitState enterExitStateTargetEnterExit = targetEnterExit(transition, function1, objRememberedValue2, composerStartRestartGroup, i6);
                composerStartRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-174040094);
                EnterExitState enterExitStateTargetEnterExit2 = targetEnterExit(transition, function1, targetState, composerStartRestartGroup, i6);
                composerStartRestartGroup.endReplaceableGroup();
                Transition transitionCreateChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitStateTargetEnterExit, enterExitStateTargetEnterExit2, "ChildTransition", composerStartRestartGroup, i5 | ((i4 << 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged3 = composerStartRestartGroup.changed(transitionCreateChildTransitionInternal) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(transitionCreateChildTransitionInternal, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(transitionCreateChildTransitionInternal, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                int i7 = i3 >> 3;
                int i8 = (i7 & 57344) | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                composerStartRestartGroup.startReplaceableGroup(-918810546);
                Object currentState = transitionCreateChildTransitionInternal.getCurrentState();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (currentState == enterExitState || transitionCreateChildTransitionInternal.getTargetState() == enterExitState) {
                    composerStartRestartGroup.startReplaceableGroup(-918809988);
                    int i9 = i8 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    boolean zChanged4 = composerStartRestartGroup.changed(transitionCreateChildTransitionInternal);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new AnimatedVisibilityScopeImpl(transitionCreateChildTransitionInternal);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue4;
                    int i10 = i8 >> 3;
                    Modifier modifierThen = modifier.then(EnterExitTransitionKt.createModifier(transitionCreateChildTransitionInternal, enterTransition, exitTransition, composerStartRestartGroup, i9 | (i10 & 112) | (i10 & 896)));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(animatedVisibilityScopeImpl);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m906setimpl(composerM899constructorimpl, anonymousClass4, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-174038756);
                    function3.invoke(animatedVisibilityScopeImpl, composerStartRestartGroup, Integer.valueOf(((i8 >> 9) & 112) | 8));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-918809227);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-918810644);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.2
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
                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(final boolean z, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        final Modifier modifier4;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844969890);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if (((46811 & i3) ^ 9362) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i6 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        int i10 = i3 << 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                            @NotNull
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i10 & 896) | (i10 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i10 & 57344) | (i10 & 458752));
                        modifier4 = modifier3;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                            AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if (((46811 & i3) ^ 9362) == 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i11 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11 & 57344) | (i11 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i12 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i12 & 57344) | (i12 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                        AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if (((46811 & i3) ^ 9362) == 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i13 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i13 & 57344) | (i13 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i14 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i14 & 57344) | (i14 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                        AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if (((46811 & i3) ^ 9362) == 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i15 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i15 & 57344) | (i15 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i16 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i16 & 57344) | (i16 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if (((46811 & i3) ^ 9362) == 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i17 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i17 & 57344) | (i17 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i18 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i18 & 57344) | (i18 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                        AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if (((46811 & i3) ^ 9362) == 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i19 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344) | (i19 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i110 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i110 & 57344) | (i110 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if (((46811 & i3) ^ 9362) == 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i111 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i111 & 896) | (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i111 & 57344) | (i111 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i112 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i112 & 57344) | (i112 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if (((46811 & i3) ^ 9362) == 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            int i113 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i113 & 896) | (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i113 & 57344) | (i113 & 458752));
            modifier4 = modifier3;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            int i114 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, i3 & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i114 & 57344) | (i114 & 458752));
            modifier4 = modifier3;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
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
                AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ExperimentalAnimationApi
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(-721839832);
        composer.startMovableGroup(-721839725, transition);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (function1.invoke(transition.getCurrentState()).booleanValue()) {
            mutableState.setValue(Boolean.TRUE);
        }
        if (function1.invoke(t).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else {
            enterExitState = ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        composer.endMovableGroup();
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(@NotNull final RowScope rowScope, final boolean z, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        final Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844974119);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if (((374481 & i3) ^ 74896) != 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i6 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                            @NotNull
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                        EnterTransition enterTransition4 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransition4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                            AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition5 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition5;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition6 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                        AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition7 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition7;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition8 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                        AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition9 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition9;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition10 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition11 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition11;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition12 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                        AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition13 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition13;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition14 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition15 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition15;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition16 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if (((374481 & i3) ^ 74896) != 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition17 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition17;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition18 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
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
                AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(@NotNull final ColumnScope columnScope, final boolean z, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        final Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844978358);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if (((374481 & i3) ^ 74896) != 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i6 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                            @NotNull
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                        EnterTransition enterTransition4 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransition4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                            AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition5 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition5;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition6 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                        AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition7 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition7;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition8 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                        AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition9 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition9;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition10 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition11 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition11;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition12 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                        AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition13 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition13;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition14 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition15 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition15;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition16 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if (((374481 & i3) ^ 74896) != 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition17 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition17;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, composerStartRestartGroup, (i3 >> 3) & 14, 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition18 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
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
                AnimatedVisibilityKt.AnimatedVisibility(columnScope, z, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(@NotNull final MutableTransitionState<Boolean> mutableTransitionState, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        final Modifier modifier4;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844983733);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(mutableTransitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if (((46811 & i3) ^ 9362) != 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i6 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        int i10 = i3 << 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                            @NotNull
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i10 & 896) | (i10 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i10 & 57344) | (i10 & 458752));
                        modifier4 = modifier3;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                            AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if (((46811 & i3) ^ 9362) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i11 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11 & 57344) | (i11 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i12 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i12 & 57344) | (i12 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                        AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if (((46811 & i3) ^ 9362) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i13 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i13 & 57344) | (i13 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i14 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i14 & 57344) | (i14 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                        AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if (((46811 & i3) ^ 9362) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i15 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i15 & 57344) | (i15 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i16 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i16 & 57344) | (i16 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if (((46811 & i3) ^ 9362) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i17 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i17 & 57344) | (i17 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    int i18 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i18 & 57344) | (i18 & 458752));
                    modifier4 = modifier3;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                        AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if (((46811 & i3) ^ 9362) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i19 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344) | (i19 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i110 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i110 & 57344) | (i110 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if (((46811 & i3) ^ 9362) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i111 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i111 & 896) | (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i111 & 57344) | (i111 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                int i112 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i112 & 57344) | (i112 & 458752));
                modifier4 = modifier3;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if (((46811 & i3) ^ 9362) != 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            int i113 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i113 & 896) | (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i113 & 57344) | (i113 & 458752));
            modifier4 = modifier3;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            int i114 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | (i3 & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i114 & 57344) | (i114 & 458752));
            modifier4 = modifier3;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
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
                AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier4, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(@NotNull final RowScope rowScope, @NotNull final MutableTransitionState<Boolean> mutableTransitionState, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        final Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844988019);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (composerStartRestartGroup.changed(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if (((374481 & i3) ^ 74896) != 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i6 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                            @NotNull
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                        EnterTransition enterTransition4 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransition4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                            AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition5 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition5;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition6 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                        AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition7 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition7;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition8 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                        AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition9 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition9;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition10 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition11 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition11;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition12 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                        AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition13 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition13;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition14 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition15 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition15;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition16 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if (((374481 & i3) ^ 74896) != 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition17 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition17;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition18 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
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
                AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(@NotNull final ColumnScope columnScope, @NotNull final MutableTransitionState<Boolean> mutableTransitionState, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        final Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844992426);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (composerStartRestartGroup.changed(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if (((374481 & i3) ^ 74896) != 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i6 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                            @NotNull
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                        EnterTransition enterTransition4 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransition4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                            AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition5 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition5;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition6 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                        AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition7 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition7;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition8 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                        AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition9 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition9;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition10 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if (((374481 & i3) ^ 74896) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition11 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition11;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i6 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                    EnterTransition enterTransition12 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransition12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                        AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition13 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition13;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition14 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if (((374481 & i3) ^ 74896) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition15 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition15;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i6 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
                EnterTransition enterTransition16 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransition16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if (((374481 & i3) ^ 74896) != 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition17 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition17;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i6 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable | ((i3 >> 3) & 14), 2), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (57344 & i3) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
            EnterTransition enterTransition18 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransition18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
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
                AnimatedVisibilityKt.AnimatedVisibility(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, function3, composer2, i | 1, i2);
            }
        });
    }

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
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    public static final <T> void AnimatedVisibility(@NotNull final Transition<T> transition, @NotNull final Function1<? super T, Boolean> function1, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        EnterTransition enterTransition2;
        int i7;
        int i8;
        ExitTransition exitTransition2;
        int i9;
        int i10;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        final ExitTransition exitTransitionPlus;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1844996818);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 4;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        enterTransition2 = enterTransition;
                        if (composerStartRestartGroup.changed(enterTransition2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 8;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            exitTransition2 = exitTransition;
                            if (composerStartRestartGroup.changed(exitTransition2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 16) != 0) {
                            i3 |= 196608;
                        } else if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(function3)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if (((374491 & i3) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i8 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                            enterTransition2 = enterTransitionPlus;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            exitTransitionPlus = exitTransition2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier3;
                        final EnterTransition enterTransition3 = enterTransition2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                                AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier4, enterTransition3, exitTransitionPlus, function3, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    exitTransition2 = exitTransition;
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if (((374491 & i3) ^ 74898) == 0) {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    } else {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier5 = modifier3;
                    final EnterTransition enterTransition4 = enterTransition2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                            AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier5, enterTransition4, exitTransitionPlus, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                enterTransition2 = enterTransition;
                i8 = i2 & 8;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if (((374491 & i3) ^ 74898) == 0) {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    } else {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier3;
                    final EnterTransition enterTransition5 = enterTransition2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                            AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier6, enterTransition5, exitTransitionPlus, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                } else {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier3;
                final EnterTransition enterTransition6 = enterTransition2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                        AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier7, enterTransition6, exitTransitionPlus, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            modifier2 = modifier;
            i6 = i2 & 4;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 8;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if (((374491 & i3) ^ 74898) == 0) {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    } else {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier3;
                    final EnterTransition enterTransition7 = enterTransition2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                            AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier8, enterTransition7, exitTransitionPlus, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                } else {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier9 = modifier3;
                final EnterTransition enterTransition8 = enterTransition2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                        AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier9, enterTransition8, exitTransitionPlus, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            enterTransition2 = enterTransition;
            i8 = i2 & 8;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                } else {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier3;
                final EnterTransition enterTransition9 = enterTransition2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                        AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier10, enterTransition9, exitTransitionPlus, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            } else {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier3;
            final EnterTransition enterTransition10 = enterTransition2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                    AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier11, enterTransition10, exitTransitionPlus, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 2;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 4;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 8;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if (((374491 & i3) ^ 74898) == 0) {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    } else {
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i8 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                        enterTransition2 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier12 = modifier3;
                    final EnterTransition enterTransition11 = enterTransition2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                            AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier12, enterTransition11, exitTransitionPlus, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                } else {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier13 = modifier3;
                final EnterTransition enterTransition12 = enterTransition2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                        AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier13, enterTransition12, exitTransitionPlus, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            enterTransition2 = enterTransition;
            i8 = i2 & 8;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                } else {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier3;
                final EnterTransition enterTransition13 = enterTransition2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                        AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier14, enterTransition13, exitTransitionPlus, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            } else {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = modifier3;
            final EnterTransition enterTransition14 = enterTransition2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                    AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier15, enterTransition14, exitTransitionPlus, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i6 = i2 & 4;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 8;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if (((374491 & i3) ^ 74898) == 0) {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                } else {
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i8 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                    enterTransition2 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier16 = modifier3;
                final EnterTransition enterTransition15 = enterTransition2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                        AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier16, enterTransition15, exitTransitionPlus, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            } else {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier3;
            final EnterTransition enterTransition16 = enterTransition2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                    AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier17, enterTransition16, exitTransitionPlus, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        enterTransition2 = enterTransition;
        i8 = i2 & 8;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i2 & 16) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if (((374491 & i3) ^ 74898) == 0) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            } else {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i8 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
                enterTransition2 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier18 = modifier3;
            final EnterTransition enterTransition17 = enterTransition2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                    AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier18, enterTransition17, exitTransitionPlus, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if (((374491 & i3) ^ 74898) == 0) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i8 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
            enterTransition2 = enterTransitionPlus;
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(0.0f, null, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, null, false, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i8 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, null, false, 15, null).plus(EnterExitTransitionKt.fadeOut$default(0.0f, null, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            AnimatedEnterExitImpl(transition, function1, modifier3, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344));
            enterTransition2 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier19 = modifier3;
        final EnterTransition enterTransition18 = enterTransition2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
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
                AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier19, enterTransition18, exitTransitionPlus, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @Deprecated(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @ReplaceWith(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(final boolean z, @Nullable Modifier modifier, @NotNull final EnterTransition enterTransition, @NotNull final ExitTransition exitTransition, final boolean z2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier modifier3;
        Object objRememberedValue;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1845001428);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(enterTransition)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(exitTransition)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                    }
                    if (((374491 & i3) ^ 74898) != 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                    } else {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z));
                        AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                                if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                }
                            }
                        }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                        public final void invoke(@Nullable Composer composer2, int i9) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i7 = 196608;
                i3 |= i7;
                if (((374491 & i3) ^ 74898) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState2 = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState2.setTargetState(Boolean.valueOf(z));
                    AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                            if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                            }
                        }
                    }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                    modifier4 = modifier3;
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState3 = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState3.setTargetState(Boolean.valueOf(z));
                    AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState3, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                            if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                            }
                        }
                    }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(exitTransition)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                }
                if (((374491 & i3) ^ 74898) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState4 = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState4.setTargetState(Boolean.valueOf(z));
                    AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState4, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                            if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                            }
                        }
                    }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                    modifier4 = modifier3;
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState5 = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState5.setTargetState(Boolean.valueOf(z));
                    AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState5, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                            if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                            }
                        }
                    }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i7 = 196608;
            i3 |= i7;
            if (((374491 & i3) ^ 74898) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState6 = (MutableTransitionState) objRememberedValue;
                mutableTransitionState6.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState6, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                        if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                modifier4 = modifier3;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState7 = (MutableTransitionState) objRememberedValue;
                mutableTransitionState7.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState7, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                        if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(enterTransition)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(exitTransition)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                }
                if (((374491 & i3) ^ 74898) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState8 = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState8.setTargetState(Boolean.valueOf(z));
                    AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState8, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                            if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                            }
                        }
                    }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                    modifier4 = modifier3;
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableTransitionState mutableTransitionState9 = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState9.setTargetState(Boolean.valueOf(z));
                    AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState9, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                            if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                            }
                        }
                    }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i7 = 196608;
            i3 |= i7;
            if (((374491 & i3) ^ 74898) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState10 = (MutableTransitionState) objRememberedValue;
                mutableTransitionState10.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState10, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                        if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                modifier4 = modifier3;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState11 = (MutableTransitionState) objRememberedValue;
                mutableTransitionState11.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState11, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                        if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if (composerStartRestartGroup.changed(exitTransition)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i2 & 32) != 0) {
            if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
            }
            if (((374491 & i3) ^ 74898) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState12 = (MutableTransitionState) objRememberedValue;
                mutableTransitionState12.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState12, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                        if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                modifier4 = modifier3;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState13 = (MutableTransitionState) objRememberedValue;
                mutableTransitionState13.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState13, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                        if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
                }
            });
        }
        i7 = 196608;
        i3 |= i7;
        if (((374491 & i3) ^ 74898) != 0) {
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableTransitionState mutableTransitionState14 = (MutableTransitionState) objRememberedValue;
            mutableTransitionState14.setTargetState(Boolean.valueOf(z));
            AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState14, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                    if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                    }
                }
            }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
            modifier4 = modifier3;
        } else {
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableTransitionState mutableTransitionState15 = (MutableTransitionState) objRememberedValue;
            mutableTransitionState15.setTargetState(Boolean.valueOf(z));
            AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState15, modifier3, enterTransition, exitTransition, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819858807, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer2, int i9) {
                    if (((i9 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                    }
                }
            }), composerStartRestartGroup, (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | MutableTransitionState.$stable | 24576 | (i3 & 112) | (i3 & 896), 0);
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
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

            public final void invoke(@Nullable Composer composer2, int i9) {
                AnimatedVisibilityKt.AnimatedVisibility(z, modifier4, enterTransition, exitTransition, z2, function2, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    @ExperimentalAnimationApi
    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        composer.startReplaceableGroup(-918810546);
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.Visible;
        if (currentState != enterExitState && transition.getTargetState() != enterExitState) {
            composer.startReplaceableGroup(-918809227);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-918809988);
            int i2 = i & 14;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged = composer.changed(transition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue;
            int i3 = i >> 3;
            Modifier modifierThen = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, composer, i2 | (i3 & 112) | (i3 & 896)));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(animatedVisibilityScopeImpl);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
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
            Updater.m906setimpl(composerM899constructorimpl, anonymousClass4, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-174038756);
            function3.invoke(animatedVisibilityScopeImpl, composer, Integer.valueOf(((i >> 9) & 112) | 8));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }
}
