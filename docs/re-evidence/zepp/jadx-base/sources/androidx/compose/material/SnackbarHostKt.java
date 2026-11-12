package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000\u001a<\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001f\u0010 \"\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#*b\b\u0002\u0010(\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0002\b\u0007¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0002\b\u0007¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006)"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "current", "content", "FadeInFadeOutWithScale", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/State;", "animatedOpacity", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "SnackbarFadeInMillis", LogUtil.I, "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "Lkotlin/ParameterName;", "name", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 5, 1})
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$SnackbarHost$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AccessibilityManager $accessibilityManager;
        public final /* synthetic */ SnackbarData $currentSnackbarData;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentSnackbarData = snackbarData;
            this.$accessibilityManager = accessibilityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$currentSnackbarData, this.$accessibilityManager, continuation);
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
                SnackbarData snackbarData = this.$currentSnackbarData;
                if (snackbarData != null) {
                    long millis = SnackbarHostKt.toMillis(snackbarData.getDuration(), this.$currentSnackbarData.getActionLabel() != null, this.$accessibilityManager);
                    this.label = 1;
                    if (DelayKt.delay(millis, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$currentSnackbarData.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$animatedOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", i = {}, l = {FTPCodes.PENDING_FURTHER_INFORMATION}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
        public final /* synthetic */ AnimationSpec<Float> $animation;
        public final /* synthetic */ Function0<Unit> $onAnimationFinish;
        public final /* synthetic */ boolean $visible;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13982(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Continuation<? super C13982> continuation) {
            super(2, continuation);
            this.$alpha = animatable;
            this.$visible = z;
            this.$animation = animationSpec;
            this.$onAnimationFinish = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C13982(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$alpha;
                Float fBoxFloat = Boxing.boxFloat(this.$visible ? 1.0f : 0.0f);
                AnimationSpec<Float> animationSpec = this.$animation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$onAnimationFinish.getA();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$animatedScale$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AnimationSpec<Float> $animation;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
        public final /* synthetic */ boolean $visible;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13991(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, Continuation<? super C13991> continuation) {
            super(2, continuation);
            this.$scale = animatable;
            this.$visible = z;
            this.$animation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C13991(this.$scale, this.$visible, this.$animation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$scale;
                Float fBoxFloat = Boxing.boxFloat(this.$visible ? 1.0f : 0.8f);
                AnimationSpec<Float> animationSpec = this.$animation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8 A[LOOP:0: B:49:0x00b2->B:51:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee A[LOOP:1: B:56:0x00e8->B:58:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0225 A[LOOP:2: B:81:0x01f3->B:84:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0241  */
    /* JADX WARN: Code duplicated, block: B:94:0x0227 A[EDGE_INSN: B:94:0x0227->B:85:0x0227 BREAK  A[LOOP:2: B:81:0x01f3->B:84:0x0225], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void FadeInFadeOutWithScale(final SnackbarData snackbarData, Modifier modifier, final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Object objRememberedValue;
        final FadeInFadeOutState fadeInFadeOutState;
        int i5;
        Function0<ComposeUiNode> constructor;
        int i6;
        List items;
        int size;
        int i7;
        int i8;
        final Modifier modifier4;
        ArrayList arrayList;
        Iterator it2;
        final List mutableList;
        List items2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1656515806);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if (((i3 & 731) ^ 146) == 0 || !composerStartRestartGroup.getSkipping()) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FadeInFadeOutState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                fadeInFadeOutState = (FadeInFadeOutState) objRememberedValue;
                if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                    fadeInFadeOutState.setCurrent(snackbarData);
                    List items3 = fadeInFadeOutState.getItems();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items3, 10));
                    it2 = items3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it2.next()).getKey());
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List<SnackbarData> listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(mutableList);
                    items2 = fadeInFadeOutState.getItems();
                    for (final SnackbarData snackbarData2 : listFilterNotNull) {
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambdaInstance(-985541570, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer2, int i10) {
                                int i11;
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer2.changed(function2) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if (((i11 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                boolean zAreEqual = Intrinsics.areEqual(snackbarData2, snackbarData);
                                int i12 = zAreEqual ? 150 : 75;
                                int i13 = (!zAreEqual || CollectionsKt___CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpecTween = AnimationSpecKt.tween(i12, i13, EasingKt.getLinearEasing());
                                final SnackbarData snackbarData3 = snackbarData2;
                                final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                                State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(tweenSpecTween, zAreEqual, new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
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
                                        if (Intrinsics.areEqual(snackbarData3, fadeInFadeOutState2.getCurrent())) {
                                            return;
                                        }
                                        List<FadeInFadeOutAnimationItem<SnackbarData>> items4 = fadeInFadeOutState2.getItems();
                                        final SnackbarData snackbarData4 = snackbarData3;
                                        h.removeAll((List) items4, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            @NotNull
                                            public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> fadeInFadeOutAnimationItem) {
                                                return Boolean.valueOf(Intrinsics.areEqual(fadeInFadeOutAnimationItem.getKey(), snackbarData4));
                                            }
                                        });
                                        RecomposeScope scope = fadeInFadeOutState2.getScope();
                                        if (scope == null) {
                                            return;
                                        }
                                        scope.invalidate();
                                    }
                                }, composer2, 0, 0);
                                State stateAnimatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i12, i13, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                                Modifier modifierM1347graphicsLayersKFY_QE$default = GraphicsLayerModifierKt.m1347graphicsLayersKFY_QE$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 8184, null);
                                final SnackbarData snackbarData4 = snackbarData2;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1347graphicsLayersKFY_QE$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
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
                                        SemanticsPropertiesKt.m2643setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m2623getPolite0phEisY());
                                        final SnackbarData snackbarData5 = snackbarData4;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* JADX INFO: renamed from: invoke */
                                            public final Boolean getA() {
                                                snackbarData5.dismiss();
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }, 1, null);
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(1863798444);
                                function2.invoke(composer2, Integer.valueOf(i11 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        })));
                    }
                }
                i5 = (i3 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i10 = i5 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i10 & 112) | (i10 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                i6 = (((i5 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i6 >> 9) & 14) & 11) ^ 2) == 0 || !composerStartRestartGroup.getSkipping()) {
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1050268607);
                    if ((((((i5 >> 6) & 112) | 6) & 81) ^ 16) == 0 || !composerStartRestartGroup.getSkipping()) {
                        fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                        items = fadeInFadeOutState.getItems();
                        size = items.size() - 1;
                        if (size >= 0) {
                            i7 = 0;
                            while (true) {
                                i8 = i7 + 1;
                                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items.get(i7);
                                final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.component1();
                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component2 = fadeInFadeOutAnimationItem.component2();
                                composerStartRestartGroup.startMovableGroup(-208579897, snackbarData3);
                                function3Component2.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                        } else {
                                            function3.invoke(snackbarData3, composer2, Integer.valueOf((i3 >> 3) & 112));
                                        }
                                    }
                                }), composerStartRestartGroup, 6);
                                composerStartRestartGroup.endMovableGroup();
                                if (i8 > size) {
                                    break;
                                } else {
                                    i7 = i8;
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
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.3
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
                    SnackbarHostKt.FadeInFadeOutWithScale(snackbarData, modifier4, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if (((i3 & 731) ^ 146) == 0) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FadeInFadeOutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            fadeInFadeOutState = (FadeInFadeOutState) objRememberedValue;
            if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                fadeInFadeOutState.setCurrent(snackbarData);
                List items4 = fadeInFadeOutState.getItems();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items4, 10));
                it2 = items4.iterator();
                while (it2.hasNext()) {
                    arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it2.next()).getKey());
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                fadeInFadeOutState.getItems().clear();
                List<SnackbarData> listFilterNotNull2 = CollectionsKt___CollectionsKt.filterNotNull(mutableList);
                items2 = fadeInFadeOutState.getItems();
                while (r11.hasNext()) {
                    items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambdaInstance(-985541570, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer2, int i11) {
                            int i12;
                            if ((i11 & 14) == 0) {
                                i12 = i11 | (composer2.changed(function2) ? 4 : 2);
                            } else {
                                i12 = i11;
                            }
                            if (((i12 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            boolean zAreEqual = Intrinsics.areEqual(snackbarData2, snackbarData);
                            int i13 = zAreEqual ? 150 : 75;
                            int i14 = (!zAreEqual || CollectionsKt___CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                            TweenSpec tweenSpecTween = AnimationSpecKt.tween(i13, i14, EasingKt.getLinearEasing());
                            final SnackbarData snackbarData4 = snackbarData2;
                            final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                            State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(tweenSpecTween, zAreEqual, new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
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
                                    if (Intrinsics.areEqual(snackbarData4, fadeInFadeOutState2.getCurrent())) {
                                        return;
                                    }
                                    List<FadeInFadeOutAnimationItem<SnackbarData>> items5 = fadeInFadeOutState2.getItems();
                                    final SnackbarData snackbarData5 = snackbarData4;
                                    h.removeAll((List) items5, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> fadeInFadeOutAnimationItem2) {
                                            return Boolean.valueOf(Intrinsics.areEqual(fadeInFadeOutAnimationItem2.getKey(), snackbarData5));
                                        }
                                    });
                                    RecomposeScope scope = fadeInFadeOutState2.getScope();
                                    if (scope == null) {
                                        return;
                                    }
                                    scope.invalidate();
                                }
                            }, composer2, 0, 0);
                            State stateAnimatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i13, i14, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                            Modifier modifierM1347graphicsLayersKFY_QE$default = GraphicsLayerModifierKt.m1347graphicsLayersKFY_QE$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 8184, null);
                            final SnackbarData snackbarData5 = snackbarData2;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1347graphicsLayersKFY_QE$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
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
                                    SemanticsPropertiesKt.m2643setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m2623getPolite0phEisY());
                                    final SnackbarData snackbarData6 = snackbarData5;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* JADX INFO: renamed from: invoke */
                                        public final Boolean getA() {
                                            snackbarData6.dismiss();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }, 1, null);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1863798444);
                            function2.invoke(composer2, Integer.valueOf(i12 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    })));
                }
            }
            i5 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            int i11 = i5 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i11 & 112) | (i11 & 14));
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifier3);
            i6 = (((i5 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            if (((((i6 >> 9) & 14) & 11) ^ 2) == 0) {
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1050268607);
                if ((((((i5 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData4 = (SnackbarData) fadeInFadeOutAnimationItem2.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component3 = fadeInFadeOutAnimationItem2.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData4);
                            function3Component3.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData4, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
                        }
                    }
                } else {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem3 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData5 = (SnackbarData) fadeInFadeOutAnimationItem3.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component4 = fadeInFadeOutAnimationItem3.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData5);
                            function3Component4.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData5, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
                        }
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1050268607);
                if ((((((i5 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem4 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData6 = (SnackbarData) fadeInFadeOutAnimationItem4.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component5 = fadeInFadeOutAnimationItem4.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData6);
                            function3Component5.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData6, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
                        }
                    }
                } else {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem5 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData7 = (SnackbarData) fadeInFadeOutAnimationItem5.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component6 = fadeInFadeOutAnimationItem5.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData7);
                            function3Component6.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData7, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
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
            modifier4 = modifier3;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FadeInFadeOutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            fadeInFadeOutState = (FadeInFadeOutState) objRememberedValue;
            if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                fadeInFadeOutState.setCurrent(snackbarData);
                List items5 = fadeInFadeOutState.getItems();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items5, 10));
                it2 = items5.iterator();
                while (it2.hasNext()) {
                    arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it2.next()).getKey());
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                fadeInFadeOutState.getItems().clear();
                List<SnackbarData> listFilterNotNull3 = CollectionsKt___CollectionsKt.filterNotNull(mutableList);
                items2 = fadeInFadeOutState.getItems();
                while (r11.hasNext()) {
                    items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambdaInstance(-985541570, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer2, int i12) {
                            int i13;
                            if ((i12 & 14) == 0) {
                                i13 = i12 | (composer2.changed(function2) ? 4 : 2);
                            } else {
                                i13 = i12;
                            }
                            if (((i13 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            boolean zAreEqual = Intrinsics.areEqual(snackbarData2, snackbarData);
                            int i14 = zAreEqual ? 150 : 75;
                            int i15 = (!zAreEqual || CollectionsKt___CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                            TweenSpec tweenSpecTween = AnimationSpecKt.tween(i14, i15, EasingKt.getLinearEasing());
                            final SnackbarData snackbarData8 = snackbarData2;
                            final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                            State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(tweenSpecTween, zAreEqual, new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
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
                                    if (Intrinsics.areEqual(snackbarData8, fadeInFadeOutState2.getCurrent())) {
                                        return;
                                    }
                                    List<FadeInFadeOutAnimationItem<SnackbarData>> items6 = fadeInFadeOutState2.getItems();
                                    final SnackbarData snackbarData9 = snackbarData8;
                                    h.removeAll((List) items6, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> fadeInFadeOutAnimationItem6) {
                                            return Boolean.valueOf(Intrinsics.areEqual(fadeInFadeOutAnimationItem6.getKey(), snackbarData9));
                                        }
                                    });
                                    RecomposeScope scope = fadeInFadeOutState2.getScope();
                                    if (scope == null) {
                                        return;
                                    }
                                    scope.invalidate();
                                }
                            }, composer2, 0, 0);
                            State stateAnimatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i14, i15, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                            Modifier modifierM1347graphicsLayersKFY_QE$default = GraphicsLayerModifierKt.m1347graphicsLayersKFY_QE$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 8184, null);
                            final SnackbarData snackbarData9 = snackbarData2;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1347graphicsLayersKFY_QE$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
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
                                    SemanticsPropertiesKt.m2643setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m2623getPolite0phEisY());
                                    final SnackbarData snackbarData10 = snackbarData9;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* JADX INFO: renamed from: invoke */
                                        public final Boolean getA() {
                                            snackbarData10.dismiss();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }, 1, null);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1863798444);
                            function2.invoke(composer2, Integer.valueOf(i13 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    })));
                }
            }
            i5 = (i3 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            int i12 = i5 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier3);
            i6 = (((i5 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            if (((((i6 >> 9) & 14) & 11) ^ 2) == 0) {
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1050268607);
                if ((((((i5 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem6 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData8 = (SnackbarData) fadeInFadeOutAnimationItem6.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component7 = fadeInFadeOutAnimationItem6.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData8);
                            function3Component7.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData8, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
                        }
                    }
                } else {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem7 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData9 = (SnackbarData) fadeInFadeOutAnimationItem7.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component8 = fadeInFadeOutAnimationItem7.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData9);
                            function3Component8.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData9, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
                        }
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1050268607);
                if ((((((i5 >> 6) & 112) | 6) & 81) ^ 16) == 0) {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem8 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData10 = (SnackbarData) fadeInFadeOutAnimationItem8.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component9 = fadeInFadeOutAnimationItem8.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData10);
                            function3Component9.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData10, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
                        }
                    }
                } else {
                    fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                    items = fadeInFadeOutState.getItems();
                    size = items.size() - 1;
                    if (size >= 0) {
                        i7 = 0;
                        while (true) {
                            i8 = i7 + 1;
                            FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem9 = (FadeInFadeOutAnimationItem) items.get(i7);
                            final SnackbarData snackbarData11 = (SnackbarData) fadeInFadeOutAnimationItem9.component1();
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component10 = fadeInFadeOutAnimationItem9.component2();
                            composerStartRestartGroup.startMovableGroup(-208579897, snackbarData11);
                            function3Component10.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                                    } else {
                                        function3.invoke(snackbarData11, composer2, Integer.valueOf((i3 >> 3) & 112));
                                    }
                                }
                            }), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endMovableGroup();
                            if (i8 > size) {
                                break;
                                break;
                            }
                            i7 = i8;
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
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.3
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
                SnackbarHostKt.FadeInFadeOutWithScale(snackbarData, modifier4, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void SnackbarHost(@NotNull final SnackbarHostState snackbarHostState, @Nullable Modifier modifier, @Nullable Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function4;
        Modifier modifier2;
        Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3M668getLambda1$material_release;
        int i4;
        Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function5;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1627730774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    function4 = function3;
                    int i6 = composerStartRestartGroup.changed(function3) ? 256 : 128;
                    i3 |= i6;
                } else {
                    function4 = function3;
                }
                i3 |= i6;
            } else {
                function4 = function3;
            }
            if (((i3 & 731) ^ 146) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        function3M668getLambda1$material_release = ComposableSingletons$SnackbarHostKt.INSTANCE.m668getLambda1$material_release();
                        i3 &= -897;
                    } else {
                        function3M668getLambda1$material_release = function4;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function7 = function3M668getLambda1$material_release;
                    i4 = i3;
                    function5 = function7;
                } else {
                    composerStartRestartGroup.skipCurrentGroup();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier2 = modifier;
                    i4 = i3;
                    function5 = function4;
                }
                SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
                EffectsKt.LaunchedEffect(currentSnackbarData, new AnonymousClass1(currentSnackbarData, (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), composerStartRestartGroup, 0);
                FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier2, function5, composerStartRestartGroup, (i4 & 112) | (i4 & 896), 0);
                Modifier modifier4 = modifier2;
                function6 = function5;
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                function6 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.SnackbarHost.2
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

                public final void invoke(@Nullable Composer composer2, int i7) {
                    SnackbarHostKt.SnackbarHost(snackbarHostState, modifier3, function6, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changed(function3)) {
                }
                i3 |= i6;
            } else {
                function4 = function3;
            }
            i3 |= i6;
        } else {
            function4 = function3;
        }
        if (((i3 & 731) ^ 146) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    function3M668getLambda1$material_release = ComposableSingletons$SnackbarHostKt.INSTANCE.m668getLambda1$material_release();
                    i3 &= -897;
                } else {
                    function3M668getLambda1$material_release = function4;
                }
                composerStartRestartGroup.endDefaults();
                Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function8 = function3M668getLambda1$material_release;
                i4 = i3;
                function5 = function8;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    function3M668getLambda1$material_release = ComposableSingletons$SnackbarHostKt.INSTANCE.m668getLambda1$material_release();
                    i3 &= -897;
                } else {
                    function3M668getLambda1$material_release = function4;
                }
                composerStartRestartGroup.endDefaults();
                Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function9 = function3M668getLambda1$material_release;
                i4 = i3;
                function5 = function9;
            }
            SnackbarData currentSnackbarData2 = snackbarHostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData2, new AnonymousClass1(currentSnackbarData2, (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), composerStartRestartGroup, 0);
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier2, function5, composerStartRestartGroup, (i4 & 112) | (i4 & 896), 0);
            Modifier modifier5 = modifier2;
            function6 = function5;
            modifier3 = modifier5;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    function3M668getLambda1$material_release = ComposableSingletons$SnackbarHostKt.INSTANCE.m668getLambda1$material_release();
                    i3 &= -897;
                } else {
                    function3M668getLambda1$material_release = function4;
                }
                composerStartRestartGroup.endDefaults();
                Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function10 = function3M668getLambda1$material_release;
                i4 = i3;
                function5 = function10;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    function3M668getLambda1$material_release = ComposableSingletons$SnackbarHostKt.INSTANCE.m668getLambda1$material_release();
                    i3 &= -897;
                } else {
                    function3M668getLambda1$material_release = function4;
                }
                composerStartRestartGroup.endDefaults();
                Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function11 = function3M668getLambda1$material_release;
                i4 = i3;
                function5 = function11;
            }
            SnackbarData currentSnackbarData3 = snackbarHostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData3, new AnonymousClass1(currentSnackbarData3, (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), composerStartRestartGroup, 0);
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier2, function5, composerStartRestartGroup, (i4 & 112) | (i4 & 896), 0);
            Modifier modifier6 = modifier2;
            function6 = function5;
            modifier3 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.SnackbarHost.2
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

            public final void invoke(@Nullable Composer composer2, int i7) {
                SnackbarHostKt.SnackbarHost(snackbarHostState, modifier3, function6, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-731820156);
        if ((i2 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt.animatedOpacity.1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        Function0<Unit> function1 = function0;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new C13982(animatable, z, animationSpec, function1, null), composer, (i >> 3) & 14);
        State<Float> stateAsState = animatable.asState();
        composer.endReplaceableGroup();
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-684820976);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new C13991(animatable, z, animationSpec, null), composer, (i >> 3) & 14);
        State<Float> stateAsState = animatable.asState();
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final long toMillis(@NotNull SnackbarDuration snackbarDuration, boolean z, @Nullable AccessibilityManager accessibilityManager) {
        long j;
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }
}
