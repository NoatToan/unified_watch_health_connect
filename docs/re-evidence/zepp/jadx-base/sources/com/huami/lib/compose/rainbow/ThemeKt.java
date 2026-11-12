package com.huami.lib.compose.rainbow;

import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import com.huami.module.darkmode.AppNightModeHelper;
import defpackage.jk7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0006\u0010\b\u001a\u00020\u0000\"\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0016\u0010\u0011\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "forceDarkTheme", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "RainbowTheme", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isDarkModeTheme", "Landroidx/compose/material/Colors;", "a", "Landroidx/compose/material/Colors;", "DarkColorPalette", "b", "LightColorPalette", "c", "Z", "forceDarkTheme1", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class ThemeKt {

    @NotNull
    private static final Colors a = ColorsKt.m658darkColors2qZNXz8$default(ColorKt.getP3_night(), ColorKt.getP3_night(), ColorKt.getP6(), 0, ColorKt.getS10_night(), ColorKt.getS38_night(), 0, ColorKt.getS1_night(), 0, 0, 0, 0, 3912, null);

    @NotNull
    private static final Colors b = ColorsKt.m659lightColors2qZNXz8((3912 & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284612846L) : ColorKt.getP3_light(), (3912 & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : ColorKt.getP3_light(), (3912 & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : ColorKt.getP6(), (3912 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278290310L) : 0, (3912 & 16) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : ColorKt.getS10_light(), (3912 & 32) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : ColorKt.getS38_light(), (3912 & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4289724448L) : 0, (3912 & 128) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : ColorKt.getS1_light(), (3912 & 256) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : 0, (3912 & 512) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : 0, (3912 & 1024) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : 0, (3912 & 2048) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : 0);
    private static boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SystemUiController a;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SystemUiController systemUiController, long j, boolean z) {
            super(0);
            this.a = systemUiController;
            this.b = j;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            jk7.h(this.a, this.b, this.c, false, null, 12, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function2<Composer, Integer, Unit> b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.a = z;
            this.b = function2;
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ThemeKt.RainbowTheme(this.a, this.b, composer, this.c | 1, this.d);
        }
    }

    @Composable
    public static final void RainbowTheme(boolean z, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-667671995);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if (((i3 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                z = false;
            }
            c = z;
            Colors colors = (isDarkModeTheme() || c) ? a : b;
            SystemUiController systemUiControllerRememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(composerStartRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            boolean zIsLight = materialTheme.getColors(composerStartRestartGroup, 8).isLight();
            long jM642getSurface0d7_KjU = materialTheme.getColors(composerStartRestartGroup, 8).m642getSurface0d7_KjU();
            Color colorM1202boximpl = Color.m1202boximpl(jM642getSurface0d7_KjU);
            Boolean boolValueOf = Boolean.valueOf(zIsLight);
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            boolean zChanged = composerStartRestartGroup.changed(colorM1202boximpl) | composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(boolValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(systemUiControllerRememberSystemUiController, jM642getSurface0d7_KjU, zIsLight);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            MaterialThemeKt.MaterialTheme(colors, null, ShapeKt.getShapes(), function2, composerStartRestartGroup, ((i3 << 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 384, 2);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z, function2, i, i2));
    }

    public static final boolean isDarkModeTheme() {
        return AppNightModeHelper.isDarkMode() || c;
    }
}
