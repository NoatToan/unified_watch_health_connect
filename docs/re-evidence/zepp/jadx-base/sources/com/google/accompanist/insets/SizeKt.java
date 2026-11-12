package com.google.accompanist.insets;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a)\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "additional", "statusBarsHeight-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "statusBarsHeight", "navigationBarsHeight-3ABfNKs", "navigationBarsHeight", "Lcom/google/accompanist/insets/HorizontalSide;", "side", "navigationBarsWidth-wH6b6FI", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/insets/HorizontalSide;F)Landroidx/compose/ui/Modifier;", "navigationBarsWidth", "insets_release"}, k = 2, mv = {1, 5, 1})
public final class SizeKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f) {
            super(3);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(2045357157);
            InsetsSizeModifier insetsSizeModifier = new InsetsSizeModifier(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getNavigationBars(), null, 0.0f, VerticalSide.Bottom, this.a, 6, null);
            composer.endReplaceableGroup();
            return insetsSizeModifier;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ HorizontalSide a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HorizontalSide horizontalSide, float f) {
            super(3);
            this.a = horizontalSide;
            this.b = f;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(1497351477);
            InsetsSizeModifier insetsSizeModifier = new InsetsSizeModifier(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getNavigationBars(), this.a, this.b, null, 0.0f, 24, null);
            composer.endReplaceableGroup();
            return insetsSizeModifier;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f) {
            super(3);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(328815034);
            InsetsSizeModifier insetsSizeModifier = new InsetsSizeModifier(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getStatusBars(), null, 0.0f, VerticalSide.Top, this.a, 6, null);
            composer.endReplaceableGroup();
            return insetsSizeModifier;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: navigationBarsHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m3311navigationBarsHeight3ABfNKs(@NotNull Modifier modifier, float f) {
        return ComposedModifierKt.composed$default(modifier, null, new a(f), 1, null);
    }

    /* JADX INFO: renamed from: navigationBarsHeight-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3312navigationBarsHeight3ABfNKs$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2965constructorimpl(0);
        }
        return m3311navigationBarsHeight3ABfNKs(modifier, f);
    }

    @NotNull
    /* JADX INFO: renamed from: navigationBarsWidth-wH6b6FI, reason: not valid java name */
    public static final Modifier m3313navigationBarsWidthwH6b6FI(@NotNull Modifier modifier, @NotNull HorizontalSide horizontalSide, float f) {
        return ComposedModifierKt.composed$default(modifier, null, new b(horizontalSide, f), 1, null);
    }

    /* JADX INFO: renamed from: navigationBarsWidth-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3314navigationBarsWidthwH6b6FI$default(Modifier modifier, HorizontalSide horizontalSide, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.m2965constructorimpl(0);
        }
        return m3313navigationBarsWidthwH6b6FI(modifier, horizontalSide, f);
    }

    @NotNull
    /* JADX INFO: renamed from: statusBarsHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m3315statusBarsHeight3ABfNKs(@NotNull Modifier modifier, float f) {
        return ComposedModifierKt.composed$default(modifier, null, new c(f), 1, null);
    }

    /* JADX INFO: renamed from: statusBarsHeight-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3316statusBarsHeight3ABfNKs$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2965constructorimpl(0);
        }
        return m3315statusBarsHeight3ABfNKs(modifier, f);
    }
}
