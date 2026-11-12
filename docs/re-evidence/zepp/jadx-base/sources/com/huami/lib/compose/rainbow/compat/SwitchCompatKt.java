package com.huami.lib.compose.rainbow.compat;

import androidx.compose.animation.core.AnimationSpec;
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
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.FixedThreshold;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SwipeableDefaults;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
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
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u001a\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aK\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u001d*\u00020\u001c2\u0006\u0010\u001e\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100 H\u0001¢\u0006\u0004\b#\u0010$\"\u001f\u0010)\u001a\u00020%8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(\"\u001f\u0010,\u001a\u00020%8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(\"\u001f\u0010/\u001a\u00020%8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0019\u00100\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010&\"\u0019\u00102\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u0010&\"\u0019\u00104\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b3\u0010&\"\u0019\u00106\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u0010&\"\u0019\u00108\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b7\u0010&\"\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0010098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0019\u0010>\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b=\u0010&\"\u0019\u0010@\u001a\u00020%8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b?\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", Constants.ENABLED, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lcom/huami/lib/compose/rainbow/compat/SwitchColors;", "colors", "SwitchCompat", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lcom/huami/lib/compose/rainbow/compat/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/State;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "a", "(Landroidx/compose/foundation/layout/BoxScope;ZZLcom/huami/lib/compose/rainbow/compat/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trackColor", "trackWidth", "strokeWidth", GoogleApiAvailabilityLight.a, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "onValueChange", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/material/SwipeableState;", "rememberSwipeableStateFor", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "Landroidx/compose/ui/unit/Dp;", "F", "getTrackWidth", "()F", "TrackWidth", "b", "getTrackStrokeWidth", "TrackStrokeWidth", "c", "getThumbDiameter", "ThumbDiameter", "ThumbRippleRadius", "e", "DefaultSwitchPadding", "f", "SwitchWidth", "g", "SwitchHeight", "h", "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "i", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", z.j, "ThumbDefaultElevation", hl.k, "ThumbPressedElevation", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class SwitchCompatKt {
    private static final float a;
    private static final float b;
    private static final float c;
    private static final float d;
    private static final float e;
    private static final float f;
    private static final float g;
    private static final float h;

    @NotNull
    private static final TweenSpec<Float> i;
    private static final float j;
    private static final float k;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Boolean, Boolean, ThresholdConfig> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
            return invoke(bool.booleanValue(), bool2.booleanValue());
        }

        @NotNull
        public final ThresholdConfig invoke(boolean z, boolean z2) {
            return new FractionalThreshold(0.5f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function1<Boolean, Unit> b;
        public final /* synthetic */ Modifier c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ MutableInteractionSource e;
        public final /* synthetic */ SwitchColors f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, int i, int i2) {
            super(2);
            this.a = z;
            this.b = function1;
            this.c = modifier;
            this.d = z2;
            this.e = mutableInteractionSource;
            this.f = switchColors;
            this.g = i;
            this.h = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SwitchCompatKt.SwitchCompat(this.a, this.b, this.c, this.d, this.e, this.f, composer, this.g | 1, this.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<DrawScope, Unit> {
        public final /* synthetic */ State<Color> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(State<Color> state) {
            super(1);
            this.a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DrawScope drawScope) {
            SwitchCompatKt.d(drawScope, SwitchCompatKt.b(this.a), drawScope.mo193toPx0680j_4(SwitchCompatKt.getTrackWidth()), drawScope.mo193toPx0680j_4(SwitchCompatKt.getTrackStrokeWidth()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Density, IntOffset> {
        public final /* synthetic */ State<Float> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(State<Float> state) {
            super(1);
            this.a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
            return IntOffset.m3034boximpl(m3370invokeBjo55l4(density));
        }

        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m3370invokeBjo55l4(@NotNull Density density) {
            return IntOffsetKt.IntOffset(kotlin.math.c.roundToInt(this.a.getValue().floatValue()), 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ BoxScope a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SwitchColors d;
        public final /* synthetic */ State<Float> e;
        public final /* synthetic */ InteractionSource f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, InteractionSource interactionSource, int i) {
            super(2);
            this.a = boxScope;
            this.b = z;
            this.c = z2;
            this.d = switchColors;
            this.e = state;
            this.f = interactionSource;
            this.g = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SwitchCompatKt.a(this.a, this.b, this.c, this.d, this.e, this.f, composer, this.g | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.lib.compose.rainbow.compat.SwitchCompatKt$rememberSwipeableStateFor$1", f = "SwitchCompat.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ T b;
        public final /* synthetic */ SwipeableState<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(T t, SwipeableState<T> swipeableState, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = t;
            this.c = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(this.b, this.c.getCurrentValue())) {
                    SwipeableState<T> swipeableState = this.c;
                    T t = this.b;
                    this.a = 1;
                    if (SwipeableState.animateTo$default(swipeableState, t, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class h<T> extends Lambda implements Function1<T, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull T t) {
            return Boolean.TRUE;
        }
    }

    static {
        float fM2965constructorimpl = Dp.m2965constructorimpl(34);
        a = fM2965constructorimpl;
        b = Dp.m2965constructorimpl(22);
        float fM2965constructorimpl2 = Dp.m2965constructorimpl(18);
        c = fM2965constructorimpl2;
        d = Dp.m2965constructorimpl(0);
        e = Dp.m2965constructorimpl(2);
        f = fM2965constructorimpl;
        g = fM2965constructorimpl2;
        h = Dp.m2965constructorimpl(fM2965constructorimpl - fM2965constructorimpl2);
        i = new TweenSpec<>(100, 0, null, 6, null);
        j = Dp.m2965constructorimpl(1);
        k = Dp.m2965constructorimpl(6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0171  */
    /* JADX WARN: Code duplicated, block: B:102:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x0191  */
    /* JADX WARN: Code duplicated, block: B:106:0x0194  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x024e  */
    /* JADX WARN: Code duplicated, block: B:120:0x025a  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x014f  */
    @Composable
    public static final void SwitchCompat(boolean z, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SwitchColors switchColors, @Nullable Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        SwitchColors switchColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        Modifier modifier4;
        boolean z5;
        MutableInteractionSource mutableInteractionSource4;
        SwitchColors switchColorsM3371colorsSQMK_m0;
        Object objRememberedValue;
        Function1<? super Boolean, Unit> function2;
        boolean z6;
        Composer composer2;
        Modifier modifierM371toggleableO2vRcR0;
        boolean z7;
        Composer composer3;
        Function0<ComposeUiNode> constructor;
        Modifier modifier5;
        MutableInteractionSource mutableInteractionSource5;
        SwitchColors switchColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-935886348);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((57344 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i2 & 458752) == 0) {
                        if ((i3 & 32) == 0) {
                            switchColors2 = switchColors;
                            int i11 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i4 |= i11;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i4 |= i11;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if (((374491 & i4) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            if (i7 != 0) {
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
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                modifier4 = modifier3;
                                z5 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            } else {
                                i9 = i4;
                                modifier4 = modifier3;
                                z5 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColorsM3371colorsSQMK_m0 = switchColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            float fMo193toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            if (function1 == null) {
                                function2 = c.a;
                            } else {
                                function2 = function1;
                            }
                            SwipeableState swipeableStateRememberSwipeableStateFor = rememberSwipeableStateFor(boolValueOf, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                            } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Modifier modifierM316requiredSizeVpY3zN4 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY, companion.getCenter(), false, 2, null), e), f, g);
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
                            int i12 = i9 << 3;
                            a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor.getOffset(), mutableInteractionSource4, composer3, (i12 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i12 & 458752));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            modifier5 = modifier4;
                            z3 = z5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            switchColors3 = switchColorsM3371colorsSQMK_m0;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            modifier4 = modifier2;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                        i9 = i4;
                        composerStartRestartGroup.endDefaults();
                        float fMo193toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        if (function1 == null) {
                            function2 = c.a;
                        } else {
                            function2 = function1;
                        }
                        SwipeableState swipeableStateRememberSwipeableStateFor2 = rememberSwipeableStateFor(boolValueOf2, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                        } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf2.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Modifier modifierM316requiredSizeVpY3zN5 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY2, companion3.getCenter(), false, 2, null), e), f, g);
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
                        int i13 = i9 << 3;
                        a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor2.getOffset(), mutableInteractionSource4, composer3, (i13 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i13 & 458752));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        modifier5 = modifier4;
                        z3 = z5;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors3 = switchColorsM3371colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors3 = switchColors2;
                        composer3 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
                }
                i4 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 458752) == 0) {
                    if ((i3 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i4 |= i11;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i4 |= i11;
                } else {
                    switchColors2 = switchColors;
                }
                if (((374491 & i4) ^ 74898) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    float fMo193toPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = c.a;
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor3 = rememberSwipeableStateFor(boolValueOf3, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                    } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf3.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN6 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY3, companion5.getCenter(), false, 2, null), e), f, g);
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
                    int i14 = i9 << 3;
                    a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor3.getOffset(), mutableInteractionSource4, composer3, (i14 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i14 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM3371colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    float fMo193toPx0680j_7 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = c.a;
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor4 = rememberSwipeableStateFor(boolValueOf4, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                    } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf4.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN7 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY4, companion7.getCenter(), false, 2, null), e), f, g);
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
                    int i15 = i9 << 3;
                    a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor4.getOffset(), mutableInteractionSource4, composer3, (i15 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i15 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM3371colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
            }
            i4 |= 3072;
            z3 = z2;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i2 & 458752) == 0) {
                    if ((i3 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i4 |= i11;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i4 |= i11;
                } else {
                    switchColors2 = switchColors;
                }
                if (((374491 & i4) ^ 74898) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    float fMo193toPx0680j_8 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                    Boolean boolValueOf5 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = c.a;
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor5 = rememberSwipeableStateFor(boolValueOf5, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                    } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf5.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN8 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY5, companion9.getCenter(), false, 2, null), e), f, g);
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
                    int i16 = i9 << 3;
                    a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor5.getOffset(), mutableInteractionSource4, composer3, (i16 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i16 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM3371colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    float fMo193toPx0680j_9 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = c.a;
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor6 = rememberSwipeableStateFor(boolValueOf6, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                    } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf6.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN9 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY6, companion11.getCenter(), false, 2, null), e), f, g);
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
                    int i17 = i9 << 3;
                    a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor6.getOffset(), mutableInteractionSource4, composer3, (i17 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i17 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM3371colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
            }
            i4 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 458752) == 0) {
                if ((i3 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i4 |= i11;
                } else {
                    switchColors2 = switchColors;
                }
                i4 |= i11;
            } else {
                switchColors2 = switchColors;
            }
            if (((374491 & i4) ^ 74898) == 0) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                float fMo193toPx0680j_10 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                Boolean boolValueOf7 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = c.a;
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor7 = rememberSwipeableStateFor(boolValueOf7, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf7.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN10 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY7, companion13.getCenter(), false, 2, null), e), f, g);
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
                int i18 = i9 << 3;
                a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor7.getOffset(), mutableInteractionSource4, composer3, (i18 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i18 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM3371colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                float fMo193toPx0680j_11 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                Boolean boolValueOf8 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = c.a;
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor8 = rememberSwipeableStateFor(boolValueOf8, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf8.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion15 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN11 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY8, companion15.getCenter(), false, 2, null), e), f, g);
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
                int i19 = i9 << 3;
                a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor8.getOffset(), mutableInteractionSource4, composer3, (i19 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM3371colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
        }
        i4 |= 384;
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i2 & 458752) == 0) {
                    if ((i3 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i4 |= i11;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i4 |= i11;
                } else {
                    switchColors2 = switchColors;
                }
                if (((374491 & i4) ^ 74898) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    float fMo193toPx0680j_12 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                    Boolean boolValueOf9 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = c.a;
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor9 = rememberSwipeableStateFor(boolValueOf9, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                    } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf9.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN12 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY9, companion17.getCenter(), false, 2, null), e), f, g);
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
                    int i110 = i9 << 3;
                    a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor9.getOffset(), mutableInteractionSource4, composer3, (i110 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i110 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM3371colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
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
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i9 = i4;
                        } else {
                            i9 = i4;
                            modifier4 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM3371colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    float fMo193toPx0680j_13 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                    Boolean boolValueOf10 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = c.a;
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor10 = rememberSwipeableStateFor(boolValueOf10, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                    } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf10.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion19 = Alignment.INSTANCE;
                    Modifier modifierM316requiredSizeVpY3zN13 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY10, companion19.getCenter(), false, 2, null), e), f, g);
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
                    int i111 = i9 << 3;
                    a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor10.getOffset(), mutableInteractionSource4, composer3, (i111 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i111 & 458752));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    modifier5 = modifier4;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM3371colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
            }
            i4 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 458752) == 0) {
                if ((i3 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i4 |= i11;
                } else {
                    switchColors2 = switchColors;
                }
                i4 |= i11;
            } else {
                switchColors2 = switchColors;
            }
            if (((374491 & i4) ^ 74898) == 0) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                float fMo193toPx0680j_14 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                Boolean boolValueOf11 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = c.a;
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor11 = rememberSwipeableStateFor(boolValueOf11, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf11.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion111 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN14 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY11, companion111.getCenter(), false, 2, null), e), f, g);
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
                int i112 = i9 << 3;
                a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor11.getOffset(), mutableInteractionSource4, composer3, (i112 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i112 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM3371colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                float fMo193toPx0680j_15 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                Boolean boolValueOf12 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = c.a;
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor12 = rememberSwipeableStateFor(boolValueOf12, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf12.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion113 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN15 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY12, companion113.getCenter(), false, 2, null), e), f, g);
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
                int i113 = i9 << 3;
                a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor12.getOffset(), mutableInteractionSource4, composer3, (i113 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i113 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM3371colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
        }
        i4 |= 3072;
        z3 = z2;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((57344 & i2) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i2 & 458752) == 0) {
                if ((i3 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i4 |= i11;
                } else {
                    switchColors2 = switchColors;
                }
                i4 |= i11;
            } else {
                switchColors2 = switchColors;
            }
            if (((374491 & i4) ^ 74898) == 0) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                float fMo193toPx0680j_16 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                Boolean boolValueOf13 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = c.a;
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor13 = rememberSwipeableStateFor(boolValueOf13, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf13.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion115 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN16 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY13, companion115.getCenter(), false, 2, null), e), f, g);
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
                int i114 = i9 << 3;
                a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor13.getOffset(), mutableInteractionSource4, composer3, (i114 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i114 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM3371colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
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
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i9 = i4;
                    } else {
                        i9 = i4;
                        modifier4 = modifier3;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM3371colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                float fMo193toPx0680j_17 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
                Boolean boolValueOf14 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = c.a;
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor14 = rememberSwipeableStateFor(boolValueOf14, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
                } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf14.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion117 = Alignment.INSTANCE;
                Modifier modifierM316requiredSizeVpY3zN17 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY14, companion117.getCenter(), false, 2, null), e), f, g);
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
                int i115 = i9 << 3;
                a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor14.getOffset(), mutableInteractionSource4, composer3, (i115 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i115 & 458752));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                modifier5 = modifier4;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM3371colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
        }
        i4 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 458752) == 0) {
            if ((i3 & 32) == 0) {
                switchColors2 = switchColors;
                if (composerStartRestartGroup.changed(switchColors2)) {
                }
                i4 |= i11;
            } else {
                switchColors2 = switchColors;
            }
            i4 |= i11;
        } else {
            switchColors2 = switchColors;
        }
        if (((374491 & i4) ^ 74898) == 0) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
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
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i9 = i4;
                } else {
                    i9 = i4;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
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
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i9 = i4;
                } else {
                    i9 = i4;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            float fMo193toPx0680j_18 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
            Boolean boolValueOf15 = Boolean.valueOf(z);
            if (function1 == null) {
                function2 = c.a;
            } else {
                function2 = function1;
            }
            SwipeableState swipeableStateRememberSwipeableStateFor15 = rememberSwipeableStateFor(boolValueOf15, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
            } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf15.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
            Alignment.Companion companion119 = Alignment.INSTANCE;
            Modifier modifierM316requiredSizeVpY3zN18 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY15, companion119.getCenter(), false, 2, null), e), f, g);
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
            int i116 = i9 << 3;
            a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor15.getOffset(), mutableInteractionSource4, composer3, (i116 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i116 & 458752));
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            modifier5 = modifier4;
            z3 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM3371colorsSQMK_m0;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
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
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i9 = i4;
                } else {
                    i9 = i4;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
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
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = SwitchDefaults.INSTANCE.m3371colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i9 = i4;
                } else {
                    i9 = i4;
                    modifier4 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM3371colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            float fMo193toPx0680j_19 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(h);
            Boolean boolValueOf16 = Boolean.valueOf(z);
            if (function1 == null) {
                function2 = c.a;
            } else {
                function2 = function1;
            }
            SwipeableState swipeableStateRememberSwipeableStateFor16 = rememberSwipeableStateFor(boolValueOf16, function2, i, composerStartRestartGroup, (i9 & 14) | 384, 0);
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
            Modifier modifierThen16 = modifier4.then(modifierM371toggleableO2vRcR0);
            Map mapMapOf16 = r.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo193toPx0680j_19), Boolean.TRUE));
            Orientation orientation16 = Orientation.Horizontal;
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            Modifier modifierM819swipeablepPrIpRY16 = SwipeableKt.m819swipeablepPrIpRY(modifierThen16, swipeableStateRememberSwipeableStateFor16, mapMapOf16, orientation16, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : mutableInteractionSource4, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(T t, T t2) {
                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                }
            } : a.a, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf16.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : 0.0f);
            Alignment.Companion companion1111 = Alignment.INSTANCE;
            Modifier modifierM316requiredSizeVpY3zN19 = SizeKt.m316requiredSizeVpY3zN4(PaddingKt.m281padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM819swipeablepPrIpRY16, companion1111.getCenter(), false, 2, null), e), f, g);
            composer3 = composer2;
            composer3.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(companion1111.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(1376089335);
            Density density16 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection16 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
            constructor = companion1112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierM316requiredSizeVpY3zN19);
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
            Composer composerM899constructorimpl16 = Updater.m899constructorimpl(composer3);
            Updater.m906setimpl(composerM899constructorimpl16, measurePolicyRememberBoxMeasurePolicy16, companion1112.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl16, density16, companion1112.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl16, layoutDirection16, companion1112.getSetLayoutDirection());
            composer3.enableReusing();
            function3MaterializerOf16.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            composer3.startReplaceableGroup(-1253629305);
            int i117 = i9 << 3;
            a(BoxScopeInstance.INSTANCE, z, z5, switchColorsM3371colorsSQMK_m0, swipeableStateRememberSwipeableStateFor16.getOffset(), mutableInteractionSource4, composer3, (i117 & 112) | 6 | ((i9 >> 3) & 896) | ((i9 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i117 & 458752));
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            modifier5 = modifier4;
            z3 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM3371colorsSQMK_m0;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function1, modifier5, z3, mutableInteractionSource5, switchColors3, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Composable
    public static final void a(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, InteractionSource interactionSource, Composer composer, int i2) {
        int i3;
        ?? r2;
        int i4;
        long jC;
        Composer composerStartRestartGroup = composer.startRestartGroup(585522134);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i3 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if (((374491 & i3) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i5 = (i3 >> 15) & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            boolean zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SwitchCompatKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5);
            float f2 = snapshotStateList.isEmpty() ^ true ? k : j;
            int i6 = ((i3 >> 3) & 896) | ((i3 >> 6) & 14) | (i3 & 112);
            State<Color> stateTrackColor = switchColors.trackColor(z2, z, composerStartRestartGroup, i6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            boolean zChanged2 = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new d(stateTrackColor);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z2, z, composerStartRestartGroup, i6);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM2965constructorimpl = Dp.m2965constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m2979unboximpl() + f2);
            composerStartRestartGroup.startReplaceableGroup(585523623);
            if (!Color.m1213equalsimpl0(c(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 8).m642getSurface0d7_KjU()) || elevationOverlay == null) {
                r2 = 0;
                i4 = -3686930;
                jC = c(stateThumbColor);
            } else {
                r2 = 0;
                jC = elevationOverlay.mo672apply7g2Lkgo(c(stateThumbColor), fM2965constructorimpl, composerStartRestartGroup, 512);
                i4 = -3686930;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = boxScope.align(companion2, companion3.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(i4);
            boolean zChanged3 = composerStartRestartGroup.changed(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new e(state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m110backgroundbw27NRU(ShadowKt.m922shadowziNgDLE(SizeKt.m315requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue4), interactionSource, RippleKt.m880rememberRipple9IZ8Weo(false, d, 0L, composerStartRestartGroup, 54, 4)), c), f2, RoundedCornerShapeKt.getCircleShape(), r2), jC, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, r2);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(boxScope, z, z2, switchColors, state, interactionSource, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    private static final long c(State<Color> state) {
        return state.getValue().m1222unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DrawScope drawScope, long j2, float f2, float f3) {
        float f4 = (f3 / 2) - 4;
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j2, androidx.compose.ui.geometry.OffsetKt.Offset(f4, Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f2 - f4, Offset.m984getYimpl(drawScope.mo1584getCenterF1C5BW0())), f3, StrokeCap.INSTANCE.m1482getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return c;
    }

    public static final float getTrackStrokeWidth() {
        return b;
    }

    public static final float getTrackWidth() {
        return a;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(@NotNull final T t, @NotNull final Function1<? super T, Unit> function1, @Nullable AnimationSpec<Float> animationSpec, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2126508167);
        if ((i3 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new SwipeableState(t, animationSpec, h.a);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final SwipeableState<T> swipeableState = (SwipeableState) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue2;
        int i4 = i2 & 8;
        EffectsKt.LaunchedEffect(t, mutableState.getValue(), new g(t, swipeableState, null), composer, (i2 & 14) | i4);
        EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.huami.lib.compose.rainbow.compat.SwitchCompatKt.rememberSwipeableStateFor.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                if (!Intrinsics.areEqual(t, swipeableState.getCurrentValue())) {
                    function1.invoke((T) swipeableState.getCurrentValue());
                    MutableState<Boolean> mutableState2 = mutableState;
                    mutableState2.setValue(Boolean.valueOf(!mutableState2.getValue().booleanValue()));
                }
                return new DisposableEffectResult() { // from class: com.huami.lib.compose.rainbow.compat.SwitchCompatKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, composer, i4);
        composer.endReplaceableGroup();
        return swipeableState;
    }
}
