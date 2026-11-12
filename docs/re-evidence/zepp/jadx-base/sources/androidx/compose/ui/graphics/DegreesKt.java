package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "radians", "degrees", "RadiansToDegrees", "F", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class DegreesKt {
    private static final float RadiansToDegrees = 57.29578f;

    @PublishedApi
    public static final float degrees(float f) {
        return f * RadiansToDegrees;
    }
}
