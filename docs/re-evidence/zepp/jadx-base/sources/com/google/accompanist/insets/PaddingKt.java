package com.google.accompanist.insets;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a5\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0086\b\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0086\b\u001a5\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\b\u001aV\u0010\u0014\u001a\u00020\u0011*\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0014\u001a\u00020\u0011*\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010#\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/Modifier;", "", Constants.ENABLED, "systemBarsPadding", "start", "top", "end", "bottom", "statusBarsPadding", "navigationBarsPadding", "imePadding", "cutoutPadding", "navigationBarsWithImePadding", "Lcom/google/accompanist/insets/WindowInsets$Type;", "Landroidx/compose/ui/unit/Dp;", "additionalHorizontal", "additionalVertical", "Landroidx/compose/foundation/layout/PaddingValues;", "toPaddingValues-nbWgWpA", "(Lcom/google/accompanist/insets/WindowInsets$Type;ZZZZFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/PaddingValues;", "toPaddingValues", "additionalStart", "additionalTop", "additionalEnd", "additionalBottom", "toPaddingValues-s2pLCVw", "(Lcom/google/accompanist/insets/WindowInsets$Type;ZZZZFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/PaddingValues;", "Lcom/google/accompanist/insets/Insets;", "insets", "applyStart", "applyTop", "applyEnd", "applyBottom", "rememberInsetsPaddingValues-s2pLCVw", "(Lcom/google/accompanist/insets/Insets;ZZZZFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/PaddingValues;", "rememberInsetsPaddingValues", "insets_release"}, k = 2, mv = {1, 5, 1})
public final class PaddingKt {

    /* JADX INFO: renamed from: com.google.accompanist.insets.PaddingKt$cutoutPadding$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, boolean z3, boolean z4) {
            super(3);
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-246025298);
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getDisplayCutout(), this.a, this.b, this.c, this.d, 0.0f, 0.0f, 0.0f, 0.0f, composer, 0, 480));
            composer.endReplaceableGroup();
            return modifierPadding;
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.insets.PaddingKt$navigationBarsPadding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C15051 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15051(boolean z, boolean z2, boolean z3) {
            super(3);
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-91240551);
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getNavigationBars(), this.a, false, this.b, this.c, 0.0f, 0.0f, 0.0f, 0.0f, composer, 0, 484));
            composer.endReplaceableGroup();
            return modifierPadding;
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.insets.PaddingKt$systemBarsPadding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C15081 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15081(boolean z) {
            super(3);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(492845840);
            WindowInsets.Type systemBars = ((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getSystemBars();
            boolean z = this.a;
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw(systemBars, z, z, z, z, 0.0f, 0.0f, 0.0f, 0.0f, composer, 0, 480));
            composer.endReplaceableGroup();
            return modifierPadding;
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.insets.PaddingKt$systemBarsPadding$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, boolean z3, boolean z4) {
            super(3);
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(492847071);
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getSystemBars(), this.a, this.b, this.c, this.d, 0.0f, 0.0f, 0.0f, 0.0f, composer, 0, 480));
            composer.endReplaceableGroup();
            return modifierPadding;
        }
    }

    @NotNull
    public static final Modifier cutoutPadding(@NotNull Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4) {
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(z, z2, z3, z4), 1, null);
    }

    public static /* synthetic */ Modifier cutoutPadding$default(Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(z, z2, z3, z4), 1, null);
    }

    @NotNull
    public static final Modifier imePadding(@NotNull Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.google.accompanist.insets.PaddingKt.imePadding.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(637062173);
                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier2, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getIme(), true, false, true, true, 0.0f, 0.0f, 0.0f, 0.0f, composer, 27696, 484));
                composer.endReplaceableGroup();
                return modifierPadding;
            }
        }, 1, null);
    }

    @NotNull
    public static final Modifier navigationBarsPadding(@NotNull Modifier modifier, boolean z, boolean z2, boolean z3) {
        return ComposedModifierKt.composed$default(modifier, null, new C15051(z2, z3, z), 1, null);
    }

    public static /* synthetic */ Modifier navigationBarsPadding$default(Modifier modifier, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return ComposedModifierKt.composed$default(modifier, null, new C15051(z2, z3, z), 1, null);
    }

    @NotNull
    public static final Modifier navigationBarsWithImePadding(@NotNull Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.google.accompanist.insets.PaddingKt.navigationBarsWithImePadding.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(-1141332164);
                WindowInsets.Type ime = ((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getIme();
                WindowInsets.Type navigationBars = ((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getNavigationBars();
                composer.startReplaceableGroup(-3686552);
                boolean zChanged = composer.changed(ime) | composer.changed(navigationBars);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(ime, navigationBars);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier2, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw((WindowInsets.Type) objRememberedValue, true, false, true, true, 0.0f, 0.0f, 0.0f, 0.0f, composer, 27696, 484));
                composer.endReplaceableGroup();
                return modifierPadding;
            }
        }, 1, null);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberInsetsPaddingValues-s2pLCVw, reason: not valid java name */
    public static final PaddingValues m3308rememberInsetsPaddingValuess2pLCVw(@NotNull Insets insets, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, float f3, float f4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1008551796);
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        if ((i2 & 16) != 0) {
            z4 = true;
        }
        if ((i2 & 32) != 0) {
            f = Dp.m2965constructorimpl(0);
        }
        if ((i2 & 64) != 0) {
            f2 = Dp.m2965constructorimpl(0);
        }
        if ((i2 & 128) != 0) {
            f3 = Dp.m2965constructorimpl(0);
        }
        if ((i2 & 256) != 0) {
            f4 = Dp.m2965constructorimpl(0);
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(density) | composer.changed(insets);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InsetsPaddingValues(insets, density);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) objRememberedValue;
        insetsPaddingValues.setApplyStart(z);
        insetsPaddingValues.setApplyTop(z2);
        insetsPaddingValues.setApplyEnd(z3);
        insetsPaddingValues.setApplyBottom(z4);
        insetsPaddingValues.m3306setAdditionalStart0680j_4(f);
        insetsPaddingValues.m3307setAdditionalTop0680j_4(f2);
        insetsPaddingValues.m3305setAdditionalEnd0680j_4(f3);
        insetsPaddingValues.m3304setAdditionalBottom0680j_4(f4);
        composer.endReplaceableGroup();
        return insetsPaddingValues;
    }

    @NotNull
    public static final Modifier statusBarsPadding(@NotNull Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.google.accompanist.insets.PaddingKt.statusBarsPadding.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(-1764407723);
                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(modifier2, PaddingKt.m3308rememberInsetsPaddingValuess2pLCVw(((WindowInsets) composer.consume(WindowInsetsKt.getLocalWindowInsets())).getStatusBars(), false, true, false, false, 0.0f, 0.0f, 0.0f, 0.0f, composer, 384, TypedValues.PositionType.TYPE_PERCENT_X));
                composer.endReplaceableGroup();
                return modifierPadding;
            }
        }, 1, null);
    }

    @NotNull
    public static final Modifier systemBarsPadding(@NotNull Modifier modifier, boolean z) {
        return ComposedModifierKt.composed$default(modifier, null, new C15081(z), 1, null);
    }

    public static /* synthetic */ Modifier systemBarsPadding$default(Modifier modifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return ComposedModifierKt.composed$default(modifier, null, new C15081(z), 1, null);
    }

    @Deprecated(message = "Replaced with rememberInsetsPaddingValues()", replaceWith = @ReplaceWith(expression = "rememberInsetsPaddingValues(\n            insets = this,\n            applyStart = start,\n            applyTop = top,\n            applyEnd = end,\n            applyBottom = bottom,\n            additionalStart = additionalHorizontal,\n            additionalTop = additionalVertical,\n            additionalEnd = additionalHorizontal,\n            additionalBottom = additionalVertical\n        )", imports = {"com.google.accompanist.insets.rememberInsetsPaddingValues"}))
    @Composable
    @NotNull
    /* JADX INFO: renamed from: toPaddingValues-nbWgWpA, reason: not valid java name */
    public static final PaddingValues m3309toPaddingValuesnbWgWpA(@NotNull WindowInsets.Type type, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(563104912);
        boolean z5 = (i2 & 1) != 0 ? true : z;
        boolean z6 = (i2 & 2) != 0 ? true : z2;
        boolean z7 = (i2 & 4) != 0 ? true : z3;
        boolean z8 = (i2 & 8) != 0 ? true : z4;
        float fM2965constructorimpl = (i2 & 16) != 0 ? Dp.m2965constructorimpl(0) : f;
        float fM2965constructorimpl2 = (i2 & 32) != 0 ? Dp.m2965constructorimpl(0) : f2;
        int i3 = i << 6;
        PaddingValues paddingValuesM3308rememberInsetsPaddingValuess2pLCVw = m3308rememberInsetsPaddingValuess2pLCVw(type, z5, z6, z7, z8, fM2965constructorimpl, fM2965constructorimpl2, fM2965constructorimpl, fM2965constructorimpl2, composer, (i & 14) | (i & 112) | (i & 896) | (i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i3) | (i3 & 234881024), 0);
        composer.endReplaceableGroup();
        return paddingValuesM3308rememberInsetsPaddingValuess2pLCVw;
    }

    @Deprecated(message = "Replaced with rememberInsetsPaddingValues()", replaceWith = @ReplaceWith(expression = "rememberInsetsPaddingValues(\n            insets = this,\n            applyStart = start,\n            applyTop = top,\n            applyEnd = end,\n            applyBottom = bottom,\n            additionalStart = additionalStart,\n            additionalTop = additionalTop,\n            additionalEnd = additionalEnd,\n            additionalBottom = additionalBottom\n        )", imports = {"com.google.accompanist.insets.rememberInsetsPaddingValues"}))
    @Composable
    @NotNull
    /* JADX INFO: renamed from: toPaddingValues-s2pLCVw, reason: not valid java name */
    public static final PaddingValues m3310toPaddingValuess2pLCVw(@NotNull WindowInsets.Type type, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, float f3, float f4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(563106599);
        PaddingValues paddingValuesM3308rememberInsetsPaddingValuess2pLCVw = m3308rememberInsetsPaddingValuess2pLCVw(type, (i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? true : z4, (i2 & 16) != 0 ? Dp.m2965constructorimpl(0) : f, (i2 & 32) != 0 ? Dp.m2965constructorimpl(0) : f2, (i2 & 64) != 0 ? Dp.m2965constructorimpl(0) : f3, (i2 & 128) != 0 ? Dp.m2965constructorimpl(0) : f4, composer, (i & 14) | (i & 112) | (i & 896) | (i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (i & 234881024), 0);
        composer.endReplaceableGroup();
        return paddingValuesM3308rememberInsetsPaddingValuess2pLCVw;
    }

    @NotNull
    public static final Modifier systemBarsPadding(@NotNull Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4) {
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass2(z, z2, z3, z4), 1, null);
    }

    public static /* synthetic */ Modifier systemBarsPadding$default(Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass2(z, z2, z3, z4), 1, null);
    }
}
