package sf0;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ LineBreakConfig.Builder a() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout e(CharSequence charSequence, TextPaint textPaint, int i14, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z14, TextUtils.TruncateAt truncateAt, int i15, boolean z15) {
        return new BoringLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, metrics, z14, truncateAt, i15, z15);
    }
}
