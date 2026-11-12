package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u000b\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0013\u0010\r\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "", "highContrastAlpha", "lowContrastAlpha", "contentAlpha", "(FFLandroidx/compose/runtime/Composer;I)F", "getHigh", "(Landroidx/compose/runtime/Composer;I)F", "high", "getMedium", FirebaseAnalytics.Param.MEDIUM, "getDisabled", "disabled", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class ContentAlpha {
    public static final int $stable = 0;

    @NotNull
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    @Composable
    private final float contentAlpha(float f, float f2, Composer composer, int i) {
        composer.startReplaceableGroup(-1499253717);
        long jM1222unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 0).isLight() ? ColorKt.m1265luminance8_81llA(jM1222unboximpl) >= 0.5d : ColorKt.m1265luminance8_81llA(jM1222unboximpl) <= 0.5d) {
            f = f2;
        }
        composer.endReplaceableGroup();
        return f;
    }

    @Composable
    @JvmName(name = "getDisabled")
    public final float getDisabled(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-651892877);
        float fContentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return fContentAlpha;
    }

    @Composable
    @JvmName(name = "getHigh")
    public final float getHigh(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1305244065);
        float fContentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return fContentAlpha;
    }

    @Composable
    @JvmName(name = "getMedium")
    public final float getMedium(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(575700177);
        float fContentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return fContentAlpha;
    }
}
