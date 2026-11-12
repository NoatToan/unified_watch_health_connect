package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "content", "Crossfade", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 5, 1})
public final class CrossfadeKt {
    /* JADX WARN: Code duplicated, block: B:103:0x0275 A[LOOP:0: B:100:0x0251->B:103:0x0275, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0292  */
    /* JADX WARN: Code duplicated, block: B:111:0x0277 A[EDGE_INSN: B:111:0x0277->B:104:0x0277 BREAK  A[LOOP:0: B:100:0x0251->B:103:0x0275], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113 A[LOOP:1: B:68:0x010d->B:70:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d A[LOOP:2: B:75:0x0137->B:77:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0228  */
    /* JADX WARN: Code duplicated, block: B:93:0x023d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0248  */
    /* JADX WARN: Code duplicated, block: B:99:0x0250  */
    @Composable
    public static final <T> void Crossfade(final T t, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @NotNull final Function3<? super T, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        FiniteAnimationSpec<Float> finiteAnimationSpecTween$default;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        Object objRememberedValue2;
        boolean z;
        Transition transitionUpdateTransition;
        List arrayList;
        Iterator<T> it2;
        SnapshotStateList snapshotStateList2;
        int i6;
        Function0<ComposeUiNode> constructor;
        int i7;
        int size;
        int i8;
        int i9;
        final Modifier modifier3;
        final FiniteAnimationSpec<Float> finiteAnimationSpec2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1621451811);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(t) ? 4 : 2) | i;
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
                i3 |= 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((4 & (~i2)) != 0 && ((i3 & 5851) ^ 1170) == 0 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier3 = modifier2;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                    } else {
                        finiteAnimationSpecTween$default = finiteAnimationSpec;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new MutableTransitionState(t);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue2;
                    z = !Intrinsics.areEqual(t, mutableTransitionState.getTargetState());
                    mutableTransitionState.setTargetState(t);
                    transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
                    if (!z || snapshotStateList.isEmpty()) {
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                        it2 = snapshotStateList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                        }
                        if (!arrayList.contains(t)) {
                            arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                            arrayList.add(t);
                            Unit unit = Unit.INSTANCE;
                        }
                        snapshotStateList.clear();
                        for (T t2 : arrayList) {
                            SnapshotStateList snapshotStateList3 = snapshotStateList;
                            snapshotStateList3.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                            snapshotStateList = snapshotStateList3;
                        }
                    } else if (Intrinsics.areEqual(mutableTransitionState.getCurrentState(), mutableTransitionState.getTargetState())) {
                        h.removeAll((List) snapshotStateList, (Function1) new Function1<CrossfadeAnimationItem<T>, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(@NotNull CrossfadeAnimationItem<T> crossfadeAnimationItem) {
                                return Boolean.valueOf(!Intrinsics.areEqual(crossfadeAnimationItem.getKey(), mutableTransitionState.getTargetState()));
                            }
                        });
                    }
                    snapshotStateList2 = snapshotStateList;
                    i6 = (i3 >> 3) & 14;
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    int i11 = i6 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i11 & 112) | (i11 & 14));
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
                    i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    if (((((i7 >> 9) & 14) & 11) ^ 2) == 0 || !composerStartRestartGroup.getSkipping()) {
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(2072159585);
                        if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0 || !composerStartRestartGroup.getSkipping()) {
                            size = snapshotStateList2.size() - 1;
                            if (size >= 0) {
                                i8 = 0;
                                while (true) {
                                    i9 = i8 + 1;
                                    CrossfadeAnimationItem crossfadeAnimationItem = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                    composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem.getKey());
                                    crossfadeAnimationItem.getContent().invoke(composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endMovableGroup();
                                    if (i9 > size) {
                                        break;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    finiteAnimationSpec2 = finiteAnimationSpecTween$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.4
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
                        CrossfadeKt.Crossfade(t, modifier3, finiteAnimationSpec2, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            if ((4 & (~i2)) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MutableTransitionState(t);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableTransitionState<T> mutableTransitionState2 = (MutableTransitionState) objRememberedValue2;
                z = !Intrinsics.areEqual(t, mutableTransitionState2.getTargetState());
                mutableTransitionState2.setTargetState(t);
                transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState2, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
                if (z) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList4 = snapshotStateList;
                        snapshotStateList4.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList4;
                    }
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList5 = snapshotStateList;
                        snapshotStateList5.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList5;
                    }
                }
                snapshotStateList2 = snapshotStateList;
                i6 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i12 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifier2);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem2 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem2.getKey());
                                crossfadeAnimationItem2.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem3 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem3.getKey());
                                crossfadeAnimationItem3.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem4 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem4.getKey());
                                crossfadeAnimationItem4.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem5 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem5.getKey());
                                crossfadeAnimationItem5.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                modifier3 = modifier2;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MutableTransitionState(t);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableTransitionState<T> mutableTransitionState3 = (MutableTransitionState) objRememberedValue2;
                z = !Intrinsics.areEqual(t, mutableTransitionState3.getTargetState());
                mutableTransitionState3.setTargetState(t);
                transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState3, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
                if (z) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList6 = snapshotStateList;
                        snapshotStateList6.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList6;
                    }
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList7 = snapshotStateList;
                        snapshotStateList7.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList7;
                    }
                }
                snapshotStateList2 = snapshotStateList;
                i6 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i13 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i13 & 112) | (i13 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier2);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl3, density3, companion4.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem6 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem6.getKey());
                                crossfadeAnimationItem6.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem7 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem7.getKey());
                                crossfadeAnimationItem7.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem8 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem8.getKey());
                                crossfadeAnimationItem8.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem9 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem9.getKey());
                                crossfadeAnimationItem9.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                modifier3 = modifier2;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.4
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
                    CrossfadeKt.Crossfade(t, modifier3, finiteAnimationSpec2, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((4 & (~i2)) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MutableTransitionState(t);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableTransitionState<T> mutableTransitionState4 = (MutableTransitionState) objRememberedValue2;
                z = !Intrinsics.areEqual(t, mutableTransitionState4.getTargetState());
                mutableTransitionState4.setTargetState(t);
                transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState4, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
                if (z) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit6 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList8 = snapshotStateList;
                        snapshotStateList8.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList8;
                    }
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit7 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList9 = snapshotStateList;
                        snapshotStateList9.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList9;
                    }
                }
                snapshotStateList2 = snapshotStateList;
                i6 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i14 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i14 & 112) | (i14 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifier2);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl4, density4, companion5.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl4, layoutDirection4, companion5.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem10 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem10.getKey());
                                crossfadeAnimationItem10.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem11 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem11.getKey());
                                crossfadeAnimationItem11.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem12 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem12.getKey());
                                crossfadeAnimationItem12.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem13 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem13.getKey());
                                crossfadeAnimationItem13.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                modifier3 = modifier2;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MutableTransitionState(t);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableTransitionState<T> mutableTransitionState5 = (MutableTransitionState) objRememberedValue2;
                z = !Intrinsics.areEqual(t, mutableTransitionState5.getTargetState());
                mutableTransitionState5.setTargetState(t);
                transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState5, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
                if (z) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit8 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList10 = snapshotStateList;
                        snapshotStateList10.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList10;
                    }
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    it2 = snapshotStateList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                    }
                    if (!arrayList.contains(t)) {
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                        arrayList.add(t);
                        Unit unit9 = Unit.INSTANCE;
                    }
                    snapshotStateList.clear();
                    while (r18.hasNext()) {
                        SnapshotStateList snapshotStateList11 = snapshotStateList;
                        snapshotStateList11.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                        snapshotStateList = snapshotStateList11;
                    }
                }
                snapshotStateList2 = snapshotStateList;
                i6 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i15 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i15 & 112) | (i15 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifier2);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl5, measurePolicyRememberBoxMeasurePolicy5, companion6.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl5, density5, companion6.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl5, layoutDirection5, companion6.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem14 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem14.getKey());
                                crossfadeAnimationItem14.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem15 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem15.getKey());
                                crossfadeAnimationItem15.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2072159585);
                    if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem16 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem16.getKey());
                                crossfadeAnimationItem16.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    } else {
                        size = snapshotStateList2.size() - 1;
                        if (size >= 0) {
                            i8 = 0;
                            while (true) {
                                i9 = i8 + 1;
                                CrossfadeAnimationItem crossfadeAnimationItem17 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                                composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem17.getKey());
                                crossfadeAnimationItem17.getContent().invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endMovableGroup();
                                if (i9 > size) {
                                    break;
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                modifier3 = modifier2;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.4
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

                public final void invoke(@Nullable Composer composer2, int i16) {
                    CrossfadeKt.Crossfade(t, modifier3, finiteAnimationSpec2, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        if ((4 & (~i2)) != 0) {
            if (i10 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i4 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new MutableTransitionState(t);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableTransitionState<T> mutableTransitionState6 = (MutableTransitionState) objRememberedValue2;
            z = !Intrinsics.areEqual(t, mutableTransitionState6.getTargetState());
            mutableTransitionState6.setTargetState(t);
            transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState6, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
            if (z) {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                it2 = snapshotStateList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                }
                if (!arrayList.contains(t)) {
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    arrayList.add(t);
                    Unit unit10 = Unit.INSTANCE;
                }
                snapshotStateList.clear();
                while (r18.hasNext()) {
                    SnapshotStateList snapshotStateList12 = snapshotStateList;
                    snapshotStateList12.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                    snapshotStateList = snapshotStateList12;
                }
            } else {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                it2 = snapshotStateList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                }
                if (!arrayList.contains(t)) {
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    arrayList.add(t);
                    Unit unit11 = Unit.INSTANCE;
                }
                snapshotStateList.clear();
                while (r18.hasNext()) {
                    SnapshotStateList snapshotStateList13 = snapshotStateList;
                    snapshotStateList13.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                    snapshotStateList = snapshotStateList13;
                }
            }
            snapshotStateList2 = snapshotStateList;
            i6 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            int i16 = i6 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifier2);
            i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl6, measurePolicyRememberBoxMeasurePolicy6, companion7.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl6, density6, companion7.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl6, layoutDirection6, companion7.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf6.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(2072159585);
                if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem18 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem18.getKey());
                            crossfadeAnimationItem18.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                } else {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem19 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem19.getKey());
                            crossfadeAnimationItem19.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(2072159585);
                if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem110 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem110.getKey());
                            crossfadeAnimationItem110.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                } else {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem111 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem111.getKey());
                            crossfadeAnimationItem111.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            modifier3 = modifier2;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        } else {
            if (i10 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i4 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new MutableTransitionState(t);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableTransitionState<T> mutableTransitionState7 = (MutableTransitionState) objRememberedValue2;
            z = !Intrinsics.areEqual(t, mutableTransitionState7.getTargetState());
            mutableTransitionState7.setTargetState(t);
            transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(mutableTransitionState7, (String) null, composerStartRestartGroup, MutableTransitionState.$stable, 2);
            if (z) {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                it2 = snapshotStateList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                }
                if (!arrayList.contains(t)) {
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    arrayList.add(t);
                    Unit unit12 = Unit.INSTANCE;
                }
                snapshotStateList.clear();
                while (r18.hasNext()) {
                    SnapshotStateList snapshotStateList14 = snapshotStateList;
                    snapshotStateList14.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                    snapshotStateList = snapshotStateList14;
                }
            } else {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                it2 = snapshotStateList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CrossfadeAnimationItem) it2.next()).getKey());
                }
                if (!arrayList.contains(t)) {
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    arrayList.add(t);
                    Unit unit13 = Unit.INSTANCE;
                }
                snapshotStateList.clear();
                while (r18.hasNext()) {
                    SnapshotStateList snapshotStateList15 = snapshotStateList;
                    snapshotStateList15.add(new CrossfadeAnimationItem(t2, ComposableLambdaKt.composableLambdaInstance(-985531785, true, new CrossfadeKt$Crossfade$1$1(transitionUpdateTransition, finiteAnimationSpecTween$default, t2, function3, i3))));
                    snapshotStateList = snapshotStateList15;
                }
            }
            snapshotStateList2 = snapshotStateList;
            i6 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            int i17 = i6 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i17 & 112) | (i17 & 14));
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifier2);
            i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl7, measurePolicyRememberBoxMeasurePolicy7, companion8.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl7, density7, companion8.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl7, layoutDirection7, companion8.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf7.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(2072159585);
                if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem112 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem112.getKey());
                            crossfadeAnimationItem112.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                } else {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem113 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem113.getKey());
                            crossfadeAnimationItem113.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(2072159585);
                if ((((((i6 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem114 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem114.getKey());
                            crossfadeAnimationItem114.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                } else {
                    size = snapshotStateList2.size() - 1;
                    if (size >= 0) {
                        i8 = 0;
                        while (true) {
                            i9 = i8 + 1;
                            CrossfadeAnimationItem crossfadeAnimationItem115 = (CrossfadeAnimationItem) snapshotStateList2.get(i8);
                            composerStartRestartGroup.startMovableGroup(-450543710, crossfadeAnimationItem115.getKey());
                            crossfadeAnimationItem115.getContent().invoke(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endMovableGroup();
                            if (i9 > size) {
                                break;
                                break;
                            }
                            i8 = i9;
                        }
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            modifier3 = modifier2;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.4
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
                CrossfadeKt.Crossfade(t, modifier3, finiteAnimationSpec2, function3, composer2, i | 1, i2);
            }
        });
    }
}
