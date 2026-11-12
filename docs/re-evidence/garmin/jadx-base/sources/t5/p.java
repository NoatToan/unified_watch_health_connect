package t5;

import android.text.Layout;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.browser.trusted.c f162455a = new androidx.browser.trusted.c(29);

    public static final int a(Layout layout, int i14, boolean z14) {
        if (i14 <= 0) {
            return 0;
        }
        if (i14 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i14);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i14 || lineEnd == i14) {
            if (lineStart == i14) {
                if (z14) {
                    return lineForOffset - 1;
                }
            } else if (!z14) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final boolean b(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
