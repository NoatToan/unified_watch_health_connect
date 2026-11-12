package com.huami.lib.compose.rainbow.view;

import android.os.Bundle;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetScaffoldState;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.ShapeKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008d\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u000022\u0010\t\u001a.\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\b2(\u0010\f\u001a$\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\b20\b\u0002\u0010\u000f\u001a*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\b20\b\u0002\u0010\u0010\u001a*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\b20\b\u0002\u0010\u0011\u001a*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aÐ\u0001\u0010\u0015\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\u0001\u001a\u00020\u000020\b\u0002\u0010\u000f\u001a*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\b20\b\u0002\u0010\u0010\u001a*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\b20\b\u0002\u0010\u0011\u001a*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aT\u0010\u001b\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/huami/lib/compose/rainbow/view/MultiBottomSheet$Intent;", "", "Lkotlin/ParameterName;", "name", "sheetScreen", "Landroidx/compose/runtime/Composable;", "mainContent", "Landroid/os/Bundle;", Constant.PARAM_SQL_ARGUMENTS, "sheetContent", "Lkotlin/Function0;", "onClosePressed", "topLeftIcon", "topCenterIcon", "topRightIcon", "BottomSheetLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "content", "c", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/material/ModalBottomSheetState;", "sheetState", "ModalBottomSheetLayout", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class BottomSheetKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
        public final /* synthetic */ MutableState<MultiBottomSheet.Intent> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> c;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> d;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> e;
        public final /* synthetic */ int f;
        public final /* synthetic */ Function3<Bundle, Composer, Integer, Unit> g;

        /* JADX INFO: renamed from: com.huami.lib.compose.rainbow.view.BottomSheetKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class C0458a extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ Function3<Bundle, Composer, Integer, Unit> a;
            public final /* synthetic */ MultiBottomSheet.Intent b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0458a(Function3<? super Bundle, ? super Composer, ? super Integer, Unit> function3, MultiBottomSheet.Intent intent, int i) {
                super(2);
                this.a = function3;
                this.b = intent;
                this.c = i;
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
                    this.a.invoke(this.b.getCom.tekartik.sqflite.Constant.PARAM_SQL_ARGUMENTS java.lang.String(), composer, Integer.valueOf(((this.c >> 3) & 112) | 8));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableState<MultiBottomSheet.Intent> mutableState, Function0<Unit> function0, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function4, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, int i, Function3<? super Bundle, ? super Composer, ? super Integer, Unit> function6) {
            super(3);
            this.a = mutableState;
            this.b = function0;
            this.c = function3;
            this.d = function4;
            this.e = function5;
            this.f = i;
            this.g = function6;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
            if (((i & 81) ^ 16) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            MultiBottomSheet.Intent intentA = BottomSheetKt.a(this.a);
            if (intentA == null) {
                return;
            }
            Function0<Unit> function0 = this.b;
            Function3<Function0<Unit>, Composer, Integer, Unit> function3 = this.c;
            Function3<Function0<Unit>, Composer, Integer, Unit> function4 = this.d;
            Function3<Function0<Unit>, Composer, Integer, Unit> function5 = this.e;
            int i2 = this.f;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819893612, true, new C0458a(this.g, intentA, i2));
            int i3 = i2 >> 3;
            BottomSheetKt.c(function0, null, function3, function4, function5, composableLambda, composer, 196608 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i3 & 57344), 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {
        public final /* synthetic */ Function3<Function1<? super MultiBottomSheet.Intent, Unit>, Composer, Integer, Unit> a;
        public final /* synthetic */ Function1<MultiBottomSheet.Intent, Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function3<? super Function1<? super MultiBottomSheet.Intent, Unit>, ? super Composer, ? super Integer, Unit> function3, Function1<? super MultiBottomSheet.Intent, Unit> function1, int i) {
            super(3);
            this.a = function3;
            this.b = function1;
            this.c = i;
        }

        @Composable
        public final void a(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if (((i & 91) ^ 18) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            Function3<Function1<? super MultiBottomSheet.Intent, Unit>, Composer, Integer, Unit> function3 = this.a;
            Function1<MultiBottomSheet.Intent, Unit> function1 = this.b;
            int i2 = this.c;
            composer.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function3.invoke(function1, composer, Integer.valueOf(i2 & 112));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            a(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Modifier a;
        public final /* synthetic */ Function3<Function1<? super MultiBottomSheet.Intent, Unit>, Composer, Integer, Unit> b;
        public final /* synthetic */ Function3<Bundle, Composer, Integer, Unit> c;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> d;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> e;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, Function3<? super Function1<? super MultiBottomSheet.Intent, Unit>, ? super Composer, ? super Integer, Unit> function3, Function3<? super Bundle, ? super Composer, ? super Integer, Unit> function4, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function7, int i, int i2) {
            super(2);
            this.a = modifier;
            this.b = function3;
            this.c = function4;
            this.d = function5;
            this.e = function6;
            this.f = function7;
            this.g = i;
            this.h = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BottomSheetKt.BottomSheetLayout(this.a, this.b, this.c, this.d, this.e, this.f, composer, this.g | 1, this.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CoroutineScope a;
        public final /* synthetic */ BottomSheetScaffoldState b;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.lib.compose.rainbow.view.BottomSheetKt$BottomSheetLayout$closeSheet$1$1", f = "BottomSheet.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BottomSheetScaffoldState b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = bottomSheetScaffoldState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BottomSheetState bottomSheetState = this.b.getBottomSheetState();
                    this.a = 1;
                    if (bottomSheetState.collapse(this) == coroutine_suspended) {
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
        public d(CoroutineScope coroutineScope, BottomSheetScaffoldState bottomSheetScaffoldState) {
            super(0);
            this.a = coroutineScope;
            this.b = bottomSheetScaffoldState;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.e.f(this.a, null, null, new a(this.b, null), 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<MultiBottomSheet.Intent, Unit> {
        public final /* synthetic */ CoroutineScope a;
        public final /* synthetic */ BottomSheetScaffoldState b;
        public final /* synthetic */ MutableState<MultiBottomSheet.Intent> c;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.lib.compose.rainbow.view.BottomSheetKt$BottomSheetLayout$openSheet$1$1", f = "BottomSheet.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MultiBottomSheet.Intent b;
            public final /* synthetic */ BottomSheetScaffoldState c;
            public final /* synthetic */ MutableState<MultiBottomSheet.Intent> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MultiBottomSheet.Intent intent, BottomSheetScaffoldState bottomSheetScaffoldState, MutableState<MultiBottomSheet.Intent> mutableState, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = intent;
                this.c = bottomSheetScaffoldState;
                this.d = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BottomSheetKt.b(this.d, this.b);
                    BottomSheetState bottomSheetState = this.c.getBottomSheetState();
                    this.a = 1;
                    if (bottomSheetState.expand(this) == coroutine_suspended) {
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
        public e(CoroutineScope coroutineScope, BottomSheetScaffoldState bottomSheetScaffoldState, MutableState<MultiBottomSheet.Intent> mutableState) {
            super(1);
            this.a = coroutineScope;
            this.b = bottomSheetScaffoldState;
            this.c = mutableState;
        }

        public final void a(@NotNull MultiBottomSheet.Intent intent) {
            kotlinx.coroutines.e.f(this.a, null, null, new a(intent, this.b, this.c, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultiBottomSheet.Intent intent) {
            a(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, int i) {
            super(2);
            this.a = function3;
            this.b = function0;
            this.c = i;
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
                return;
            }
            Function3<Function0<Unit>, Composer, Integer, Unit> function3 = this.a;
            Function0<Unit> function0 = this.b;
            int i2 = this.c;
            function3.invoke(function0, composer, Integer.valueOf(((i2 >> 3) & 112) | (i2 & 14)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, int i) {
            super(2);
            this.a = function3;
            this.b = function0;
            this.c = i;
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
                return;
            }
            Function3<Function0<Unit>, Composer, Integer, Unit> function3 = this.a;
            Function0<Unit> function0 = this.b;
            int i2 = this.c;
            function3.invoke(function0, composer, Integer.valueOf(((i2 >> 6) & 112) | (i2 & 14)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, int i) {
            super(2);
            this.a = function3;
            this.b = function0;
            this.c = i;
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
                return;
            }
            Function3<Function0<Unit>, Composer, Integer, Unit> function3 = this.a;
            Function0<Unit> function0 = this.b;
            int i2 = this.c;
            function3.invoke(function0, composer, Integer.valueOf(((i2 >> 9) & 112) | (i2 & 14)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ Modifier b;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> c;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> d;
        public final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> e;
        public final /* synthetic */ Function2<Composer, Integer, Unit> f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function0<Unit> function0, Modifier modifier, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function4, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.a = function0;
            this.b = modifier;
            this.c = function3;
            this.d = function4;
            this.e = function5;
            this.f = function2;
            this.g = i;
            this.h = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BottomSheetKt.c(this.a, this.b, this.c, this.d, this.e, this.f, composer, this.g | 1, this.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> a;
        public final /* synthetic */ Modifier b;
        public final /* synthetic */ ModalBottomSheetState c;
        public final /* synthetic */ Function2<Composer, Integer, Unit> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, ModalBottomSheetState modalBottomSheetState, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.a = function3;
            this.b = modifier;
            this.c = modalBottomSheetState;
            this.d = function2;
            this.e = i;
            this.f = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BottomSheetKt.ModalBottomSheetLayout(this.a, this.b, this.c, this.d, composer, this.e | 1, this.f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    @Composable
    @ExperimentalMaterialApi
    public static final void BottomSheetLayout(@Nullable Modifier modifier, @NotNull Function3<? super Function1<? super MultiBottomSheet.Intent, Unit>, ? super Composer, ? super Integer, Unit> function3, @NotNull Function3<? super Bundle, ? super Composer, ? super Integer, Unit> function4, @Nullable Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, @Nullable Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, @Nullable Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function7, @Nullable Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function8;
        int i6;
        int i7;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function9;
        int i8;
        int i9;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function10;
        int i10;
        Modifier modifier3;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function12;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function13;
        Object objRememberedValue;
        Composer.Companion companion;
        BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
        Object objRememberedValue2;
        MutableState mutableState;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function14;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(875054074);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            if ((i2 & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(function4) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changed(function8)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((57344 & i2) == 0) {
                        function9 = function6;
                        if (composerStartRestartGroup.changed(function9)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((458752 & i2) == 0) {
                            function10 = function7;
                            if (composerStartRestartGroup.changed(function10)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i4 |= i10;
                        }
                        if (((374491 & i4) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if (i11 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i7 != 0) {
                                function12 = null;
                            } else {
                                function12 = function9;
                            }
                            if (i9 != 0) {
                                function13 = null;
                            } else {
                                function13 = function10;
                            }
                            composerStartRestartGroup.startReplaceableGroup(-723524056);
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                                b(mutableState, null);
                            }
                            d dVar = new d(coroutineScope, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                            e eVar = new e(coroutineScope, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                            float f2 = 0;
                            Modifier modifier4 = modifier3;
                            BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar, function11, function12, function13, i4, function4)), modifier4, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f2), 0L, 0L, Dp.m2965constructorimpl(f2), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                            function14 = function11;
                            function15 = function12;
                            function10 = function13;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function14 = function8;
                            function15 = function9;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
                    }
                    i4 |= 196608;
                    function10 = function7;
                    if (((374491 & i4) ^ 74898) == 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar2 = new d(coroutineScope2, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar2 = new e(coroutineScope2, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f3 = 0;
                        Modifier modifier5 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar2, function11, function12, function13, i4, function4)), modifier5, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f3), 0L, 0L, Dp.m2965constructorimpl(f3), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar2, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar3 = new d(coroutineScope3, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar3 = new e(coroutineScope3, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f4 = 0;
                        Modifier modifier6 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar3, function11, function12, function13, i4, function4)), modifier6, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f4), 0L, 0L, Dp.m2965constructorimpl(f4), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar3, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
                }
                i4 |= 24576;
                function9 = function6;
                i9 = i3 & 32;
                if (i9 != 0) {
                    if ((458752 & i2) == 0) {
                        function10 = function7;
                        if (composerStartRestartGroup.changed(function10)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if (((374491 & i4) ^ 74898) == 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar4 = new d(coroutineScope4, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar4 = new e(coroutineScope4, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f5 = 0;
                        Modifier modifier7 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar4, function11, function12, function13, i4, function4)), modifier7, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f5), 0L, 0L, Dp.m2965constructorimpl(f5), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar4, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar5 = new d(coroutineScope5, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar5 = new e(coroutineScope5, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f6 = 0;
                        Modifier modifier8 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar5, function11, function12, function13, i4, function4)), modifier8, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f6), 0L, 0L, Dp.m2965constructorimpl(f6), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar5, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
                }
                i4 |= 196608;
                function10 = function7;
                if (((374491 & i4) ^ 74898) == 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar6 = new d(coroutineScope6, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar6 = new e(coroutineScope6, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f7 = 0;
                    Modifier modifier9 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar6, function11, function12, function13, i4, function4)), modifier9, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f7), 0L, 0L, Dp.m2965constructorimpl(f7), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar6, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller7;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar7 = new d(coroutineScope7, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar7 = new e(coroutineScope7, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f8 = 0;
                    Modifier modifier10 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar7, function11, function12, function13, i4, function4)), modifier10, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f8), 0L, 0L, Dp.m2965constructorimpl(f8), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar7, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
            }
            i4 |= 3072;
            function8 = function5;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    function9 = function6;
                    if (composerStartRestartGroup.changed(function9)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    if ((458752 & i2) == 0) {
                        function10 = function7;
                        if (composerStartRestartGroup.changed(function10)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if (((374491 & i4) ^ 74898) == 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller8 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller8);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller8;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar8 = new d(coroutineScope8, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar8 = new e(coroutineScope8, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f9 = 0;
                        Modifier modifier11 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar8, function11, function12, function13, i4, function4)), modifier11, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f9), 0L, 0L, Dp.m2965constructorimpl(f9), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar8, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller9 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller9);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller9;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar9 = new d(coroutineScope9, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar9 = new e(coroutineScope9, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f10 = 0;
                        Modifier modifier12 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar9, function11, function12, function13, i4, function4)), modifier12, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f10), 0L, 0L, Dp.m2965constructorimpl(f10), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar9, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
                }
                i4 |= 196608;
                function10 = function7;
                if (((374491 & i4) ^ 74898) == 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller10 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller10);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller10;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar10 = new d(coroutineScope10, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar10 = new e(coroutineScope10, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f11 = 0;
                    Modifier modifier13 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar10, function11, function12, function13, i4, function4)), modifier13, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f11), 0L, 0L, Dp.m2965constructorimpl(f11), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar10, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller11;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar11 = new d(coroutineScope11, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar11 = new e(coroutineScope11, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f12 = 0;
                    Modifier modifier14 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar11, function11, function12, function13, i4, function4)), modifier14, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f12), 0L, 0L, Dp.m2965constructorimpl(f12), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar11, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
            }
            i4 |= 24576;
            function9 = function6;
            i9 = i3 & 32;
            if (i9 != 0) {
                if ((458752 & i2) == 0) {
                    function10 = function7;
                    if (composerStartRestartGroup.changed(function10)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if (((374491 & i4) ^ 74898) == 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller12 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller12);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller12;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar12 = new d(coroutineScope12, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar12 = new e(coroutineScope12, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f13 = 0;
                    Modifier modifier15 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar12, function11, function12, function13, i4, function4)), modifier15, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f13), 0L, 0L, Dp.m2965constructorimpl(f13), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar12, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller13 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller13);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller13;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar13 = new d(coroutineScope13, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar13 = new e(coroutineScope13, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f14 = 0;
                    Modifier modifier16 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar13, function11, function12, function13, i4, function4)), modifier16, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f14), 0L, 0L, Dp.m2965constructorimpl(f14), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar13, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
            }
            i4 |= 196608;
            function10 = function7;
            if (((374491 & i4) ^ 74898) == 0) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller14 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller14);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller14;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar14 = new d(coroutineScope14, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar14 = new e(coroutineScope14, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f15 = 0;
                Modifier modifier17 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar14, function11, function12, function13, i4, function4)), modifier17, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f15), 0L, 0L, Dp.m2965constructorimpl(f15), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar14, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller15 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller15);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller15;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar15 = new d(coroutineScope15, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar15 = new e(coroutineScope15, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f16 = 0;
                Modifier modifier18 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar15, function11, function12, function13, i4, function4)), modifier18, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f16), 0L, 0L, Dp.m2965constructorimpl(f16), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar15, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
        }
        i4 |= 384;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function8 = function5;
                if (composerStartRestartGroup.changed(function8)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    function9 = function6;
                    if (composerStartRestartGroup.changed(function9)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    if ((458752 & i2) == 0) {
                        function10 = function7;
                        if (composerStartRestartGroup.changed(function10)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if (((374491 & i4) ^ 74898) == 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller16 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller16);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller16;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope16 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar16 = new d(coroutineScope16, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar16 = new e(coroutineScope16, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f17 = 0;
                        Modifier modifier19 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar16, function11, function12, function13, i4, function4)), modifier19, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f17), 0L, 0L, Dp.m2965constructorimpl(f17), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar16, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        } else {
                            function12 = function9;
                        }
                        if (i9 != 0) {
                            function13 = null;
                        } else {
                            function13 = function10;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller17 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller17);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller17;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope17 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                            b(mutableState, null);
                        }
                        d dVar17 = new d(coroutineScope17, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                        e eVar17 = new e(coroutineScope17, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                        float f18 = 0;
                        Modifier modifier110 = modifier3;
                        BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar17, function11, function12, function13, i4, function4)), modifier110, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f18), 0L, 0L, Dp.m2965constructorimpl(f18), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar17, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                        function14 = function11;
                        function15 = function12;
                        function10 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
                }
                i4 |= 196608;
                function10 = function7;
                if (((374491 & i4) ^ 74898) == 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller18 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller18);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller18;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope18 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar18 = new d(coroutineScope18, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar18 = new e(coroutineScope18, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f19 = 0;
                    Modifier modifier111 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar18, function11, function12, function13, i4, function4)), modifier111, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f19), 0L, 0L, Dp.m2965constructorimpl(f19), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar18, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller19 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller19);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller19;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope19 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar19 = new d(coroutineScope19, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar19 = new e(coroutineScope19, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f110 = 0;
                    Modifier modifier112 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar19, function11, function12, function13, i4, function4)), modifier112, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f110), 0L, 0L, Dp.m2965constructorimpl(f110), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar19, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
            }
            i4 |= 24576;
            function9 = function6;
            i9 = i3 & 32;
            if (i9 != 0) {
                if ((458752 & i2) == 0) {
                    function10 = function7;
                    if (composerStartRestartGroup.changed(function10)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if (((374491 & i4) ^ 74898) == 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller110);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller110;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope110 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar110 = new d(coroutineScope110, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar110 = new e(coroutineScope110, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f111 = 0;
                    Modifier modifier113 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar110, function11, function12, function13, i4, function4)), modifier113, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f111), 0L, 0L, Dp.m2965constructorimpl(f111), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar110, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar111 = new d(coroutineScope111, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar111 = new e(coroutineScope111, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f112 = 0;
                    Modifier modifier114 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar111, function11, function12, function13, i4, function4)), modifier114, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f112), 0L, 0L, Dp.m2965constructorimpl(f112), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar111, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
            }
            i4 |= 196608;
            function10 = function7;
            if (((374491 & i4) ^ 74898) == 0) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller112 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller112);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller112;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope112 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar112 = new d(coroutineScope112, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar112 = new e(coroutineScope112, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f113 = 0;
                Modifier modifier115 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar112, function11, function12, function13, i4, function4)), modifier115, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f113), 0L, 0L, Dp.m2965constructorimpl(f113), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar112, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller113 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller113);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller113;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope113 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar113 = new d(coroutineScope113, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar113 = new e(coroutineScope113, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f114 = 0;
                Modifier modifier116 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar113, function11, function12, function13, i4, function4)), modifier116, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f114), 0L, 0L, Dp.m2965constructorimpl(f114), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar113, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
        }
        i4 |= 3072;
        function8 = function5;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((57344 & i2) == 0) {
                function9 = function6;
                if (composerStartRestartGroup.changed(function9)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                if ((458752 & i2) == 0) {
                    function10 = function7;
                    if (composerStartRestartGroup.changed(function10)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if (((374491 & i4) ^ 74898) == 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller114 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller114);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller114;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope114 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar114 = new d(coroutineScope114, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar114 = new e(coroutineScope114, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f115 = 0;
                    Modifier modifier117 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar114, function11, function12, function13, i4, function4)), modifier117, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f115), 0L, 0L, Dp.m2965constructorimpl(f115), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar114, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i7 != 0) {
                        function12 = null;
                    } else {
                        function12 = function9;
                    }
                    if (i9 != 0) {
                        function13 = null;
                    } else {
                        function13 = function10;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller115 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller115);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller115;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope115 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                        b(mutableState, null);
                    }
                    d dVar115 = new d(coroutineScope115, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                    e eVar115 = new e(coroutineScope115, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                    float f116 = 0;
                    Modifier modifier118 = modifier3;
                    BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar115, function11, function12, function13, i4, function4)), modifier118, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f116), 0L, 0L, Dp.m2965constructorimpl(f116), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar115, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                    function14 = function11;
                    function15 = function12;
                    function10 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
            }
            i4 |= 196608;
            function10 = function7;
            if (((374491 & i4) ^ 74898) == 0) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller116 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller116);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller116;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope116 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar116 = new d(coroutineScope116, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar116 = new e(coroutineScope116, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f117 = 0;
                Modifier modifier119 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar116, function11, function12, function13, i4, function4)), modifier119, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f117), 0L, 0L, Dp.m2965constructorimpl(f117), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar116, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller117 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller117);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller117;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope117 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar117 = new d(coroutineScope117, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar117 = new e(coroutineScope117, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f118 = 0;
                Modifier modifier1110 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar117, function11, function12, function13, i4, function4)), modifier1110, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f118), 0L, 0L, Dp.m2965constructorimpl(f118), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar117, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
        }
        i4 |= 24576;
        function9 = function6;
        i9 = i3 & 32;
        if (i9 != 0) {
            if ((458752 & i2) == 0) {
                function10 = function7;
                if (composerStartRestartGroup.changed(function10)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            if (((374491 & i4) ^ 74898) == 0) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller118 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller118);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller118;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope118 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar118 = new d(coroutineScope118, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar118 = new e(coroutineScope118, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f119 = 0;
                Modifier modifier1111 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar118, function11, function12, function13, i4, function4)), modifier1111, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f119), 0L, 0L, Dp.m2965constructorimpl(f119), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar118, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i7 != 0) {
                    function12 = null;
                } else {
                    function12 = function9;
                }
                if (i9 != 0) {
                    function13 = null;
                } else {
                    function13 = function10;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller119 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller119);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller119;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope119 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    b(mutableState, null);
                }
                d dVar119 = new d(coroutineScope119, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
                e eVar119 = new e(coroutineScope119, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
                float f1110 = 0;
                Modifier modifier1112 = modifier3;
                BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar119, function11, function12, function13, i4, function4)), modifier1112, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f1110), 0L, 0L, Dp.m2965constructorimpl(f1110), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar119, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
                function14 = function11;
                function15 = function12;
                function10 = function13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
        }
        i4 |= 196608;
        function10 = function7;
        if (((374491 & i4) ^ 74898) == 0) {
            if (i11 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                function11 = null;
            } else {
                function11 = function8;
            }
            if (i7 != 0) {
                function12 = null;
            } else {
                function12 = function9;
            }
            if (i9 != 0) {
                function13 = null;
            } else {
                function13 = function10;
            }
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1110);
                objRememberedValue = compositionScopedCoroutineScopeCanceller1110;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1110 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                b(mutableState, null);
            }
            d dVar1110 = new d(coroutineScope1110, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
            e eVar1110 = new e(coroutineScope1110, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
            float f1111 = 0;
            Modifier modifier1113 = modifier3;
            BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar1110, function11, function12, function13, i4, function4)), modifier1113, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f1111), 0L, 0L, Dp.m2965constructorimpl(f1111), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar1110, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
            function14 = function11;
            function15 = function12;
            function10 = function13;
        } else {
            if (i11 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                function11 = null;
            } else {
                function11 = function8;
            }
            if (i7 != 0) {
                function12 = null;
            } else {
                function12 = function9;
            }
            if (i9 != 0) {
                function13 = null;
            } else {
                function13 = function10;
            }
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1111);
                objRememberedValue = compositionScopedCoroutineScopeCanceller1111;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1111 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            if (bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                b(mutableState, null);
            }
            d dVar1111 = new d(coroutineScope1111, bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
            e eVar1111 = new e(coroutineScope1111, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableState);
            float f1112 = 0;
            Modifier modifier1114 = modifier3;
            BottomSheetScaffoldKt.m594BottomSheetScaffoldbGncdBI(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892965, true, new a(mutableState, dVar1111, function11, function12, function13, i4, function4)), modifier1114, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, null, null, null, 0, false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 8).getSmall(), Dp.m2965constructorimpl(f1112), 0L, 0L, Dp.m2965constructorimpl(f1112), null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893270, true, new b(function3, eVar1111, i4)), composerStartRestartGroup, ((i4 << 3) & 112) | 805306374, 384, 384, 4189432);
            function14 = function11;
            function15 = function12;
            function10 = function13;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function3, function4, function14, function15, function10, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0 A[PHI: r2 r3
      0x00c0: PHI (r2v17 int) = (r2v11 int), (r2v18 int) binds: [B:64:0x00b0, B:59:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r3v6 androidx.compose.ui.Modifier) = (r3v2 androidx.compose.ui.Modifier), (r3v8 androidx.compose.ui.Modifier) binds: [B:64:0x00b0, B:59:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void ModalBottomSheetLayout(@NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable ModalBottomSheetState modalBottomSheetState, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        ModalBottomSheetState modalBottomSheetState2;
        int i5;
        Modifier modifier3;
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState;
        Modifier modifier4;
        ModalBottomSheetState modalBottomSheetState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(487795266);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(function3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    modalBottomSheetState2 = modalBottomSheetState;
                    int i7 = composerStartRestartGroup.changed(modalBottomSheetState2) ? 256 : 128;
                    i4 |= i7;
                } else {
                    modalBottomSheetState2 = modalBottomSheetState;
                }
                i4 |= i7;
            } else {
                modalBottomSheetState2 = modalBottomSheetState;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if (((i4 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, composerStartRestartGroup, 6, 6);
                        i4 &= -897;
                    }
                    composerStartRestartGroup.endDefaults();
                    ModalBottomSheetKt.m732ModalBottomSheetLayoutBzaUkTc(function3, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), modalBottomSheetStateRememberModalBottomSheetState, ShapeKt.getShapes().getMedium(), 0.0f, ColorKt.getS39(), 0L, 0L, function2, composerStartRestartGroup, (i4 & 14) | (i4 & 896) | ((i4 << 15) & 234881024), 208);
                    modifier4 = modifier3;
                    modalBottomSheetState3 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier3 = modifier2;
                }
                modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState2;
                composerStartRestartGroup.endDefaults();
                ModalBottomSheetKt.m732ModalBottomSheetLayoutBzaUkTc(function3, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), modalBottomSheetStateRememberModalBottomSheetState, ShapeKt.getShapes().getMedium(), 0.0f, ColorKt.getS39(), 0L, 0L, function2, composerStartRestartGroup, (i4 & 14) | (i4 & 896) | ((i4 << 15) & 234881024), 208);
                modifier4 = modifier3;
                modalBottomSheetState3 = modalBottomSheetStateRememberModalBottomSheetState;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                modalBottomSheetState3 = modalBottomSheetState2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(function3, modifier4, modalBottomSheetState3, function2, i2, i3));
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                modalBottomSheetState2 = modalBottomSheetState;
                if (composerStartRestartGroup.changed(modalBottomSheetState2)) {
                }
                i4 |= i7;
            } else {
                modalBottomSheetState2 = modalBottomSheetState;
            }
            i4 |= i7;
        } else {
            modalBottomSheetState2 = modalBottomSheetState;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if (composerStartRestartGroup.changed(function2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if (((i4 & 5851) ^ 1170) == 0) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, composerStartRestartGroup, 6, 6);
                    i4 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState2;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, composerStartRestartGroup, 6, 6);
                    i4 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState2;
                }
            }
            composerStartRestartGroup.endDefaults();
            ModalBottomSheetKt.m732ModalBottomSheetLayoutBzaUkTc(function3, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), modalBottomSheetStateRememberModalBottomSheetState, ShapeKt.getShapes().getMedium(), 0.0f, ColorKt.getS39(), 0L, 0L, function2, composerStartRestartGroup, (i4 & 14) | (i4 & 896) | ((i4 << 15) & 234881024), 208);
            modifier4 = modifier3;
            modalBottomSheetState3 = modalBottomSheetStateRememberModalBottomSheetState;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, composerStartRestartGroup, 6, 6);
                    i4 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState2;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, composerStartRestartGroup, 6, 6);
                    i4 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState2;
                }
            }
            composerStartRestartGroup.endDefaults();
            ModalBottomSheetKt.m732ModalBottomSheetLayoutBzaUkTc(function3, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), modalBottomSheetStateRememberModalBottomSheetState, ShapeKt.getShapes().getMedium(), 0.0f, ColorKt.getS39(), 0L, 0L, function2, composerStartRestartGroup, (i4 & 14) | (i4 & 896) | ((i4 << 15) & 234881024), 208);
            modifier4 = modifier3;
            modalBottomSheetState3 = modalBottomSheetStateRememberModalBottomSheetState;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(function3, modifier4, modalBottomSheetState3, function2, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBottomSheet.Intent a(MutableState<MultiBottomSheet.Intent> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<MultiBottomSheet.Intent> mutableState, MultiBottomSheet.Intent intent) {
        mutableState.setValue(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:105:0x027b  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0183  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:97:0x021f  */
    @Composable
    public static final void c(Function0<Unit> function0, Modifier modifier, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function4, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6;
        int i6;
        int i7;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function7;
        int i8;
        int i9;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function8;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        Alignment.Companion companion;
        Function0<ComposeUiNode> constructor;
        BoxScopeInstance boxScopeInstance;
        int i13;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function9;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function10;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11;
        Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(921036110);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changed(function6)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        function7 = function4;
                        if (composerStartRestartGroup.changed(function7)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((57344 & i2) == 0) {
                            function8 = function5;
                            if (composerStartRestartGroup.changed(function8)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        if ((i3 & 32) != 0) {
                            if ((458752 & i2) == 0) {
                                if (composerStartRestartGroup.changed(function2)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                            }
                            i12 = i4;
                            if (((374491 & i12) ^ 74898) == 0 || !composerStartRestartGroup.getSkipping()) {
                                if (i14 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i5 != 0) {
                                    function6 = null;
                                }
                                if (i7 != 0) {
                                    function7 = null;
                                }
                                if (i9 != 0) {
                                    function8 = null;
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                                companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1376089335);
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
                                boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                                composerStartRestartGroup.startReplaceableGroup(-467868898);
                                if (function6 != null) {
                                    i13 = 29;
                                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                                } else {
                                    i13 = 29;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-467868561);
                                function9 = function7;
                                if (function9 != null) {
                                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                if (function8 != null) {
                                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = function8;
                                modifier2 = modifier3;
                                function11 = function9;
                                function12 = function6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function12 = function6;
                                function11 = function7;
                                function10 = function8;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                        }
                        i11 = 196608;
                        i4 |= i11;
                        i12 = i4;
                        if (((374491 & i12) ^ 74898) == 0) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
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
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        } else {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            constructor = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxWidth$default3);
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
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                    }
                    i4 |= 24576;
                    function8 = function5;
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                        }
                        i12 = i4;
                        if (((374491 & i12) ^ 74898) == 0) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            constructor = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierFillMaxWidth$default4);
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
                            function3MaterializerOf4.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        } else {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            constructor = companion6.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierFillMaxWidth$default5);
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
                            function3MaterializerOf5.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                    }
                    i11 = 196608;
                    i4 |= i11;
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        constructor = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierFillMaxWidth$default6);
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
                        function3MaterializerOf6.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierFillMaxWidth$default7);
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
                        function3MaterializerOf7.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i4 |= 3072;
                function7 = function4;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((57344 & i2) == 0) {
                        function8 = function5;
                        if (composerStartRestartGroup.changed(function8)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                        }
                        i12 = i4;
                        if (((374491 & i12) ^ 74898) == 0) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            constructor = companion9.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierFillMaxWidth$default8);
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
                            Composer composerM899constructorimpl8 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl8, measurePolicyRememberBoxMeasurePolicy8, companion9.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl8, density8, companion9.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl8, layoutDirection8, companion9.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf8.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        } else {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                            constructor = companion10.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierFillMaxWidth$default9);
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
                            Composer composerM899constructorimpl9 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl9, measurePolicyRememberBoxMeasurePolicy9, companion10.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl9, density9, companion10.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl9, layoutDirection9, companion10.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf9.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                    }
                    i11 = 196608;
                    i4 |= i11;
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        constructor = companion11.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierFillMaxWidth$default10);
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
                        Composer composerM899constructorimpl10 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl10, measurePolicyRememberBoxMeasurePolicy10, companion11.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl10, density10, companion11.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl10, layoutDirection10, companion11.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf10.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        constructor = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierFillMaxWidth$default11);
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
                        Composer composerM899constructorimpl11 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11, measurePolicyRememberBoxMeasurePolicy11, companion12.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11, density11, companion12.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11, layoutDirection11, companion12.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i4 |= 24576;
                function8 = function5;
                if ((i3 & 32) != 0) {
                    if ((458752 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                        constructor = companion13.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierFillMaxWidth$default12);
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
                        Composer composerM899constructorimpl12 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl12, measurePolicyRememberBoxMeasurePolicy12, companion13.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl12, density12, companion13.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl12, layoutDirection12, companion13.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf12.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                        constructor = companion14.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierFillMaxWidth$default13);
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
                        Composer composerM899constructorimpl13 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl13, measurePolicyRememberBoxMeasurePolicy13, companion14.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl13, density13, companion14.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl13, layoutDirection13, companion14.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf13.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i11 = 196608;
                i4 |= i11;
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    constructor = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierFillMaxWidth$default14);
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
                    Composer composerM899constructorimpl14 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl14, measurePolicyRememberBoxMeasurePolicy14, companion15.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl14, density14, companion15.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl14, layoutDirection14, companion15.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf14.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                    constructor = companion16.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierFillMaxWidth$default15);
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
                    Composer composerM899constructorimpl15 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl15, measurePolicyRememberBoxMeasurePolicy15, companion16.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl15, density15, companion16.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl15, layoutDirection15, companion16.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf15.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i4 |= 384;
            function6 = function3;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function7 = function4;
                    if (composerStartRestartGroup.changed(function7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((57344 & i2) == 0) {
                        function8 = function5;
                        if (composerStartRestartGroup.changed(function8)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                        }
                        i12 = i4;
                        if (((374491 & i12) ^ 74898) == 0) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                            constructor = companion17.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierFillMaxWidth$default16);
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
                            Composer composerM899constructorimpl16 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl16, measurePolicyRememberBoxMeasurePolicy16, companion17.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl16, density16, companion17.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl16, layoutDirection16, companion17.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf16.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        } else {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default17 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                            constructor = companion18.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierFillMaxWidth$default17);
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
                            Composer composerM899constructorimpl17 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl17, measurePolicyRememberBoxMeasurePolicy17, companion18.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl17, density17, companion18.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl17, layoutDirection17, companion18.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf17.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                    }
                    i11 = 196608;
                    i4 |= i11;
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default18 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                        constructor = companion19.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierFillMaxWidth$default18);
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
                        Composer composerM899constructorimpl18 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl18, measurePolicyRememberBoxMeasurePolicy18, companion19.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl18, density18, companion19.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl18, layoutDirection18, companion19.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf18.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default19 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                        constructor = companion110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierFillMaxWidth$default19);
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
                        Composer composerM899constructorimpl19 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl19, measurePolicyRememberBoxMeasurePolicy19, companion110.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl19, density19, companion110.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl19, layoutDirection19, companion110.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf19.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i4 |= 24576;
                function8 = function5;
                if ((i3 & 32) != 0) {
                    if ((458752 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default110 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                        constructor = companion111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(modifierFillMaxWidth$default110);
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
                        Composer composerM899constructorimpl110 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl110, measurePolicyRememberBoxMeasurePolicy110, companion111.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl110, density110, companion111.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl110, layoutDirection110, companion111.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default111 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                        constructor = companion112.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierFillMaxWidth$default111);
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
                        Composer composerM899constructorimpl111 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl111, measurePolicyRememberBoxMeasurePolicy111, companion112.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl111, density111, companion112.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl111, layoutDirection111, companion112.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i11 = 196608;
                i4 |= i11;
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default112 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    constructor = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierFillMaxWidth$default112);
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
                    Composer composerM899constructorimpl112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl112, measurePolicyRememberBoxMeasurePolicy112, companion113.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl112, density112, companion113.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl112, layoutDirection112, companion113.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default113 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierFillMaxWidth$default113);
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
                    Composer composerM899constructorimpl113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl113, measurePolicyRememberBoxMeasurePolicy113, companion114.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl113, density113, companion114.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl113, layoutDirection113, companion114.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i4 |= 3072;
            function7 = function4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((57344 & i2) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changed(function8)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((i3 & 32) != 0) {
                    if ((458752 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default114 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                        constructor = companion115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierFillMaxWidth$default114);
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
                        Composer composerM899constructorimpl114 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl114, measurePolicyRememberBoxMeasurePolicy114, companion115.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl114, density114, companion115.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl114, layoutDirection114, companion115.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default115 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                        constructor = companion116.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierFillMaxWidth$default115);
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
                        Composer composerM899constructorimpl115 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl115, measurePolicyRememberBoxMeasurePolicy115, companion116.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl115, density115, companion116.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl115, layoutDirection115, companion116.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i11 = 196608;
                i4 |= i11;
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default116 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    constructor = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(modifierFillMaxWidth$default116);
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
                    Composer composerM899constructorimpl116 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl116, measurePolicyRememberBoxMeasurePolicy116, companion117.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl116, density116, companion117.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl116, layoutDirection116, companion117.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default117 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                    constructor = companion118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierFillMaxWidth$default117);
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
                    Composer composerM899constructorimpl117 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl117, measurePolicyRememberBoxMeasurePolicy117, companion118.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl117, density117, companion118.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl117, layoutDirection117, companion118.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i4 |= 24576;
            function8 = function5;
            if ((i3 & 32) != 0) {
                if ((458752 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default118 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                    constructor = companion119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierFillMaxWidth$default118);
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
                    Composer composerM899constructorimpl118 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl118, measurePolicyRememberBoxMeasurePolicy118, companion119.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl118, density118, companion119.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl118, layoutDirection118, companion119.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default119 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                    constructor = companion1110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifierFillMaxWidth$default119);
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
                    Composer composerM899constructorimpl119 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl119, measurePolicyRememberBoxMeasurePolicy119, companion1110.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl119, density119, companion1110.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl119, layoutDirection119, companion1110.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i11 = 196608;
            i4 |= i11;
            i12 = i4;
            if (((374491 & i12) ^ 74898) == 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default1110 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                constructor = companion1111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierFillMaxWidth$default1110);
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
                Composer composerM899constructorimpl1110 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1110, measurePolicyRememberBoxMeasurePolicy1110, companion1111.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1110, density1110, companion1111.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1110, layoutDirection1110, companion1111.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default1111 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                constructor = companion1112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = LayoutKt.materializerOf(modifierFillMaxWidth$default1111);
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
                Composer composerM899constructorimpl1111 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111, measurePolicyRememberBoxMeasurePolicy1111, companion1112.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1111, density1111, companion1112.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1111, layoutDirection1111, companion1112.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
        }
        i4 |= 48;
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 896) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changed(function6)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function7 = function4;
                    if (composerStartRestartGroup.changed(function7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((57344 & i2) == 0) {
                        function8 = function5;
                        if (composerStartRestartGroup.changed(function8)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                        }
                        i12 = i4;
                        if (((374491 & i12) ^ 74898) == 0) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default1112 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1112 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density1112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection1112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                            constructor = companion1113.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1112 = LayoutKt.materializerOf(modifierFillMaxWidth$default1112);
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
                            Composer composerM899constructorimpl1112 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl1112, measurePolicyRememberBoxMeasurePolicy1112, companion1113.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl1112, density1112, companion1113.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl1112, layoutDirection1112, companion1113.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf1112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        } else {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            Modifier modifierFillMaxWidth$default1113 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1113 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density1113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection1113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                            constructor = companion1114.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1113 = LayoutKt.materializerOf(modifierFillMaxWidth$default1113);
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
                            Composer composerM899constructorimpl1113 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl1113, measurePolicyRememberBoxMeasurePolicy1113, companion1114.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl1113, density1113, companion1114.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl1113, layoutDirection1113, companion1114.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf1113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                            composerStartRestartGroup.startReplaceableGroup(-467868898);
                            if (function6 != null) {
                                i13 = 29;
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            } else {
                                i13 = 29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-467868561);
                            function9 = function7;
                            if (function9 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function8 != null) {
                                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = function8;
                            modifier2 = modifier3;
                            function11 = function9;
                            function12 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                    }
                    i11 = 196608;
                    i4 |= i11;
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default1114 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy1114 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                        constructor = companion1115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1114 = LayoutKt.materializerOf(modifierFillMaxWidth$default1114);
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
                        Composer composerM899constructorimpl1114 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1114, measurePolicyRememberBoxMeasurePolicy1114, companion1115.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1114, density1114, companion1115.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1114, layoutDirection1114, companion1115.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default1115 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy1115 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                        constructor = companion1116.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1115 = LayoutKt.materializerOf(modifierFillMaxWidth$default1115);
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
                        Composer composerM899constructorimpl1115 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1115, measurePolicyRememberBoxMeasurePolicy1115, companion1116.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1115, density1115, companion1116.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1115, layoutDirection1115, companion1116.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i4 |= 24576;
                function8 = function5;
                if ((i3 & 32) != 0) {
                    if ((458752 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default1116 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy1116 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1117 = ComposeUiNode.INSTANCE;
                        constructor = companion1117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1116 = LayoutKt.materializerOf(modifierFillMaxWidth$default1116);
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
                        Composer composerM899constructorimpl1116 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1116, measurePolicyRememberBoxMeasurePolicy1116, companion1117.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1116, density1116, companion1117.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1116, layoutDirection1116, companion1117.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default1117 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy1117 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density1117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                        constructor = companion1118.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1117 = LayoutKt.materializerOf(modifierFillMaxWidth$default1117);
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
                        Composer composerM899constructorimpl1117 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1117, measurePolicyRememberBoxMeasurePolicy1117, companion1118.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl1117, density1117, companion1118.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl1117, layoutDirection1117, companion1118.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i11 = 196608;
                i4 |= i11;
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default1118 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1118 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density1118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                    constructor = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1118 = LayoutKt.materializerOf(modifierFillMaxWidth$default1118);
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
                    Composer composerM899constructorimpl1118 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl1118, measurePolicyRememberBoxMeasurePolicy1118, companion1119.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl1118, density1118, companion1119.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl1118, layoutDirection1118, companion1119.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default1119 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1119 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density1119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                    constructor = companion11110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1119 = LayoutKt.materializerOf(modifierFillMaxWidth$default1119);
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
                    Composer composerM899constructorimpl1119 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl1119, measurePolicyRememberBoxMeasurePolicy1119, companion11110.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl1119, density1119, companion11110.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl1119, layoutDirection1119, companion11110.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i4 |= 3072;
            function7 = function4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((57344 & i2) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changed(function8)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((i3 & 32) != 0) {
                    if ((458752 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default11110 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy11110 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11111 = ComposeUiNode.INSTANCE;
                        constructor = companion11111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11110 = LayoutKt.materializerOf(modifierFillMaxWidth$default11110);
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
                        Composer composerM899constructorimpl11110 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11110, measurePolicyRememberBoxMeasurePolicy11110, companion11111.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11110, density11110, companion11111.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11110, layoutDirection11110, companion11111.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default11111 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy11111 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                        constructor = companion11112.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11111 = LayoutKt.materializerOf(modifierFillMaxWidth$default11111);
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
                        Composer composerM899constructorimpl11111 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11111, measurePolicyRememberBoxMeasurePolicy11111, companion11112.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11111, density11111, companion11112.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11111, layoutDirection11111, companion11112.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i11 = 196608;
                i4 |= i11;
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default11112 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11112 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11113 = ComposeUiNode.INSTANCE;
                    constructor = companion11113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11112 = LayoutKt.materializerOf(modifierFillMaxWidth$default11112);
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
                    Composer composerM899constructorimpl11112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11112, measurePolicyRememberBoxMeasurePolicy11112, companion11113.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11112, density11112, companion11113.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11112, layoutDirection11112, companion11113.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default11113 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11113 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                    constructor = companion11114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11113 = LayoutKt.materializerOf(modifierFillMaxWidth$default11113);
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
                    Composer composerM899constructorimpl11113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11113, measurePolicyRememberBoxMeasurePolicy11113, companion11114.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11113, density11113, companion11114.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11113, layoutDirection11113, companion11114.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i4 |= 24576;
            function8 = function5;
            if ((i3 & 32) != 0) {
                if ((458752 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default11114 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11114 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11115 = ComposeUiNode.INSTANCE;
                    constructor = companion11115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11114 = LayoutKt.materializerOf(modifierFillMaxWidth$default11114);
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
                    Composer composerM899constructorimpl11114 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11114, measurePolicyRememberBoxMeasurePolicy11114, companion11115.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11114, density11114, companion11115.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11114, layoutDirection11114, companion11115.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default11115 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11115 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density11115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                    constructor = companion11116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11115 = LayoutKt.materializerOf(modifierFillMaxWidth$default11115);
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
                    Composer composerM899constructorimpl11115 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11115, measurePolicyRememberBoxMeasurePolicy11115, companion11116.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl11115, density11115, companion11116.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl11115, layoutDirection11115, companion11116.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i11 = 196608;
            i4 |= i11;
            i12 = i4;
            if (((374491 & i12) ^ 74898) == 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default11116 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11116 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density11116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion11117 = ComposeUiNode.INSTANCE;
                constructor = companion11117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11116 = LayoutKt.materializerOf(modifierFillMaxWidth$default11116);
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
                Composer composerM899constructorimpl11116 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl11116, measurePolicyRememberBoxMeasurePolicy11116, companion11117.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl11116, density11116, companion11117.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl11116, layoutDirection11116, companion11117.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default11117 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11117 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density11117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                constructor = companion11118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11117 = LayoutKt.materializerOf(modifierFillMaxWidth$default11117);
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
                Composer composerM899constructorimpl11117 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl11117, measurePolicyRememberBoxMeasurePolicy11117, companion11118.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl11117, density11117, companion11118.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl11117, layoutDirection11117, companion11118.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
        }
        i4 |= 384;
        function6 = function3;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function7 = function4;
                if (composerStartRestartGroup.changed(function7)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((57344 & i2) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changed(function8)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((i3 & 32) != 0) {
                    if ((458752 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    i12 = i4;
                    if (((374491 & i12) ^ 74898) == 0) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default11118 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy11118 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion11119 = ComposeUiNode.INSTANCE;
                        constructor = companion11119.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11118 = LayoutKt.materializerOf(modifierFillMaxWidth$default11118);
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
                        Composer composerM899constructorimpl11118 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11118, measurePolicyRememberBoxMeasurePolicy11118, companion11119.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11118, density11118, companion11119.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11118, layoutDirection11118, companion11119.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        Modifier modifierFillMaxWidth$default11119 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1990474327);
                        companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy11119 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1376089335);
                        Density density11119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection11119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                        constructor = companion111110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11119 = LayoutKt.materializerOf(modifierFillMaxWidth$default11119);
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
                        Composer composerM899constructorimpl11119 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11119, measurePolicyRememberBoxMeasurePolicy11119, companion111110.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl11119, density11119, companion111110.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl11119, layoutDirection11119, companion111110.getSetLayoutDirection());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf11119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1253629305);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                        composerStartRestartGroup.startReplaceableGroup(-467868898);
                        if (function6 != null) {
                            i13 = 29;
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        } else {
                            i13 = 29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-467868561);
                        function9 = function7;
                        if (function9 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function8 != null) {
                            IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = function8;
                        modifier2 = modifier3;
                        function11 = function9;
                        function12 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
                }
                i11 = 196608;
                i4 |= i11;
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default111110 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111110 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                    constructor = companion111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111110 = LayoutKt.materializerOf(modifierFillMaxWidth$default111110);
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
                    Composer composerM899constructorimpl111110 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111110, measurePolicyRememberBoxMeasurePolicy111110, companion111111.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111110, density111110, companion111111.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111110, layoutDirection111110, companion111111.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default111111 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111111 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                    constructor = companion111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111111 = LayoutKt.materializerOf(modifierFillMaxWidth$default111111);
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
                    Composer composerM899constructorimpl111111 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111111, measurePolicyRememberBoxMeasurePolicy111111, companion111112.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111111, density111111, companion111112.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111111, layoutDirection111111, companion111112.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i4 |= 24576;
            function8 = function5;
            if ((i3 & 32) != 0) {
                if ((458752 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default111112 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111112 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111113 = ComposeUiNode.INSTANCE;
                    constructor = companion111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111112 = LayoutKt.materializerOf(modifierFillMaxWidth$default111112);
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
                    Composer composerM899constructorimpl111112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111112, measurePolicyRememberBoxMeasurePolicy111112, companion111113.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111112, density111112, companion111113.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111112, layoutDirection111112, companion111113.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default111113 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111113 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                    constructor = companion111114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111113 = LayoutKt.materializerOf(modifierFillMaxWidth$default111113);
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
                    Composer composerM899constructorimpl111113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111113, measurePolicyRememberBoxMeasurePolicy111113, companion111114.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111113, density111113, companion111114.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111113, layoutDirection111113, companion111114.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i11 = 196608;
            i4 |= i11;
            i12 = i4;
            if (((374491 & i12) ^ 74898) == 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default111114 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy111114 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111115 = ComposeUiNode.INSTANCE;
                constructor = companion111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111114 = LayoutKt.materializerOf(modifierFillMaxWidth$default111114);
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
                Composer composerM899constructorimpl111114 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111114, measurePolicyRememberBoxMeasurePolicy111114, companion111115.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111114, density111114, companion111115.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111114, layoutDirection111114, companion111115.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111114.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default111115 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy111115 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                constructor = companion111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111115 = LayoutKt.materializerOf(modifierFillMaxWidth$default111115);
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
                Composer composerM899constructorimpl111115 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111115, measurePolicyRememberBoxMeasurePolicy111115, companion111116.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111115, density111115, companion111116.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111115, layoutDirection111115, companion111116.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111115.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
        }
        i4 |= 3072;
        function7 = function4;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((57344 & i2) == 0) {
                function8 = function5;
                if (composerStartRestartGroup.changed(function8)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            if ((i3 & 32) != 0) {
                if ((458752 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                i12 = i4;
                if (((374491 & i12) ^ 74898) == 0) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default111116 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111116 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111117 = ComposeUiNode.INSTANCE;
                    constructor = companion111117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111116 = LayoutKt.materializerOf(modifierFillMaxWidth$default111116);
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
                    Composer composerM899constructorimpl111116 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111116, measurePolicyRememberBoxMeasurePolicy111116, companion111117.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111116, density111116, companion111117.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111116, layoutDirection111116, companion111117.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111116.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    Modifier modifierFillMaxWidth$default111117 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111117 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density111117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                    constructor = companion111118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111117 = LayoutKt.materializerOf(modifierFillMaxWidth$default111117);
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
                    Composer composerM899constructorimpl111117 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111117, measurePolicyRememberBoxMeasurePolicy111117, companion111118.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl111117, density111117, companion111118.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl111117, layoutDirection111117, companion111118.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111117.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                    composerStartRestartGroup.startReplaceableGroup(-467868898);
                    if (function6 != null) {
                        i13 = 29;
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    } else {
                        i13 = 29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-467868561);
                    function9 = function7;
                    if (function9 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function8 != null) {
                        IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = function8;
                    modifier2 = modifier3;
                    function11 = function9;
                    function12 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
            }
            i11 = 196608;
            i4 |= i11;
            i12 = i4;
            if (((374491 & i12) ^ 74898) == 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default111118 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy111118 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion111119 = ComposeUiNode.INSTANCE;
                constructor = companion111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111118 = LayoutKt.materializerOf(modifierFillMaxWidth$default111118);
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
                Composer composerM899constructorimpl111118 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111118, measurePolicyRememberBoxMeasurePolicy111118, companion111119.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111118, density111118, companion111119.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111118, layoutDirection111118, companion111119.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111118.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default111119 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy111119 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density111119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
                constructor = companion1111110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111119 = LayoutKt.materializerOf(modifierFillMaxWidth$default111119);
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
                Composer composerM899constructorimpl111119 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111119, measurePolicyRememberBoxMeasurePolicy111119, companion1111110.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl111119, density111119, companion1111110.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl111119, layoutDirection111119, companion1111110.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111119.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
        }
        i4 |= 24576;
        function8 = function5;
        if ((i3 & 32) != 0) {
            if ((458752 & i2) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
            }
            i12 = i4;
            if (((374491 & i12) ^ 74898) == 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default1111110 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111110 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1111110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111111 = ComposeUiNode.INSTANCE;
                constructor = companion1111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111110 = LayoutKt.materializerOf(modifierFillMaxWidth$default1111110);
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
                Composer composerM899constructorimpl1111110 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111110, measurePolicyRememberBoxMeasurePolicy1111110, companion1111111.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1111110, density1111110, companion1111111.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1111110, layoutDirection1111110, companion1111111.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1111110.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                Modifier modifierFillMaxWidth$default1111111 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111111 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density1111111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
                constructor = companion1111112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111111 = LayoutKt.materializerOf(modifierFillMaxWidth$default1111111);
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
                Composer composerM899constructorimpl1111111 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111111, measurePolicyRememberBoxMeasurePolicy1111111, companion1111112.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl1111111, density1111111, companion1111112.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl1111111, layoutDirection1111111, companion1111112.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1111111.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                composerStartRestartGroup.startReplaceableGroup(-467868898);
                if (function6 != null) {
                    i13 = 29;
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                } else {
                    i13 = 29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-467868561);
                function9 = function7;
                if (function9 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function8 != null) {
                    IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                function10 = function8;
                modifier2 = modifier3;
                function11 = function9;
                function12 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
        }
        i11 = 196608;
        i4 |= i11;
        i12 = i4;
        if (((374491 & i12) ^ 74898) == 0) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                function6 = null;
            }
            if (i7 != 0) {
                function7 = null;
            }
            if (i9 != 0) {
                function8 = null;
            }
            Modifier modifierFillMaxWidth$default1111112 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111112 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density1111112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion1111113 = ComposeUiNode.INSTANCE;
            constructor = companion1111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111112 = LayoutKt.materializerOf(modifierFillMaxWidth$default1111112);
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
            Composer composerM899constructorimpl1111112 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl1111112, measurePolicyRememberBoxMeasurePolicy1111112, companion1111113.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl1111112, density1111112, companion1111113.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl1111112, layoutDirection1111112, companion1111113.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111112.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
            composerStartRestartGroup.startReplaceableGroup(-467868898);
            if (function6 != null) {
                i13 = 29;
                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
            } else {
                i13 = 29;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-467868561);
            function9 = function7;
            if (function9 != null) {
                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function8 != null) {
                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            function10 = function8;
            modifier2 = modifier3;
            function11 = function9;
            function12 = function6;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                function6 = null;
            }
            if (i7 != 0) {
                function7 = null;
            }
            if (i9 != 0) {
                function8 = null;
            }
            Modifier modifierFillMaxWidth$default1111113 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-1990474327);
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111113 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density1111113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion1111114 = ComposeUiNode.INSTANCE;
            constructor = companion1111114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111113 = LayoutKt.materializerOf(modifierFillMaxWidth$default1111113);
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
            Composer composerM899constructorimpl1111113 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl1111113, measurePolicyRememberBoxMeasurePolicy1111113, companion1111114.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl1111113, density1111113, companion1111114.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl1111113, layoutDirection1111113, companion1111114.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111113.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1253629305);
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 15) & 14));
            composerStartRestartGroup.startReplaceableGroup(-467868898);
            if (function6 != null) {
                i13 = 29;
                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopStart()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(29)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890254, true, new f(function6, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
            } else {
                i13 = 29;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-467868561);
            function9 = function7;
            if (function9 != null) {
                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891170, true, new g(function9, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function8 != null) {
                IconButtonKt.IconButton(function0, SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getTopEnd()), Dp.m2965constructorimpl(16)), Dp.m2965constructorimpl(i13)), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890836, true, new h(function8, function0, i12)), composerStartRestartGroup, (i12 & 14) | 24576, 12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            function10 = function8;
            modifier2 = modifier3;
            function11 = function9;
            function12 = function6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(function0, modifier2, function12, function11, function10, function2, i2, i3));
    }
}
