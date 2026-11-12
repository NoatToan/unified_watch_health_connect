package com.google.accompanist.insets;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "scrollImeOffScreenWhenVisible", "scrollImeOnScreenWhenNotVisible", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberImeNestedScrollConnection", "(ZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "insets_release"}, k = 2, mv = {1, 5, 1})
public final class ImeNestedScrollConnectionKt {
    @ExperimentalAnimatedInsets
    @Composable
    @NotNull
    public static final NestedScrollConnection rememberImeNestedScrollConnection(boolean z, boolean z2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1142640271);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Object objValueOf = Boolean.valueOf(z);
        Object objValueOf2 = Boolean.valueOf(z2);
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(objValueOf) | composer.changed(view) | composer.changed(objValueOf2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ImeNestedScrollConnection(view, z, z2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ImeNestedScrollConnection imeNestedScrollConnection = (ImeNestedScrollConnection) objRememberedValue;
        composer.endReplaceableGroup();
        return imeNestedScrollConnection;
    }
}
