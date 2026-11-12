package com.google.accompanist.systemuicontroller;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u0019\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/google/accompanist/systemuicontroller/SystemUiController;", "rememberSystemUiController", "(Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/systemuicontroller/SystemUiController;", "Landroidx/compose/ui/graphics/Color;", "a", "J", "BlackScrim", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "BlackScrimmed", "systemuicontroller_release"}, k = 2, mv = {1, 5, 1})
public final class SystemUiControllerKt {
    private static final long a = ColorKt.Color$default(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    @NotNull
    private static final Function1<Color, Color> b = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "original", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Color, Color> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final long a(long j) {
            return ColorKt.m1258compositeOverOWjLjI(SystemUiControllerKt.a, j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Color invoke(Color color) {
            return Color.m1202boximpl(a(color.m1222unboximpl()));
        }
    }

    @Composable
    @NotNull
    public static final SystemUiController rememberSystemUiController(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1044854347);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new AndroidSystemUiController(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AndroidSystemUiController androidSystemUiController = (AndroidSystemUiController) objRememberedValue;
        composer.endReplaceableGroup();
        return androidSystemUiController;
    }
}
