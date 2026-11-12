package com.google.accompanist.insets;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "consumeWindowInsets", "windowInsetsAnimationsEnabled", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideWindowInsets", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/google/accompanist/insets/WindowInsets;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalWindowInsets", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalWindowInsets", "insets_release"}, k = 2, mv = {1, 5, 1})
public final class WindowInsetsKt {

    @NotNull
    private static final ProvidableCompositionLocal<WindowInsets> a = CompositionLocalKt.staticCompositionLocalOf(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/accompanist/insets/WindowInsets;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WindowInsets> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowInsets invoke() {
            return WindowInsets.INSTANCE.getEmpty();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(2);
            this.a = function2;
            this.b = i;
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
                this.a.invoke(composer, Integer.valueOf((this.b >> 6) & 14));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function2<Composer, Integer, Unit> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.a = z;
            this.b = z2;
            this.c = function2;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            WindowInsetsKt.ProvideWindowInsets(this.a, this.b, this.c, composer, this.d | 1, this.e);
        }
    }

    @Composable
    public static final void ProvideWindowInsets(final boolean z, final boolean z2, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1609298763);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                z = true;
            }
            if (i5 != 0) {
                z2 = true;
            }
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RootWindowInsets();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final RootWindowInsets rootWindowInsets = (RootWindowInsets) objRememberedValue;
            EffectsKt.DisposableEffect(view, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.insets.WindowInsetsKt.ProvideWindowInsets.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    final ViewWindowInsetObserver viewWindowInsetObserver = new ViewWindowInsetObserver(view);
                    viewWindowInsetObserver.observeInto$insets_release(rootWindowInsets, z, z2);
                    return new DisposableEffectResult() { // from class: com.google.accompanist.insets.WindowInsetsKt$ProvideWindowInsets$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            viewWindowInsetObserver.stop();
                        }
                    };
                }
            }, composerStartRestartGroup, 8);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{a.provides(rootWindowInsets)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899147, true, new b(function2, i3)), composerStartRestartGroup, 56);
        }
        boolean z3 = z;
        boolean z4 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z3, z4, function2, i, i2));
    }

    @NotNull
    public static final ProvidableCompositionLocal<WindowInsets> getLocalWindowInsets() {
        return a;
    }
}
