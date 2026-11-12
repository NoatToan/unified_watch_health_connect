package b;

import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    public static /* synthetic */ RenderNode C() {
        return new RenderNode("OffscreenLayer.shadow");
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ RenderNode g() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder h(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder l(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void p() {
    }
}
