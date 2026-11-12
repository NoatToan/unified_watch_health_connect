package x5;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
@o13.e
public interface s {
    void a(int i14, int i15, int i16, int i17);

    void b();

    void c();

    void d();

    boolean isActive();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i14, ExtractedText extractedText);
}
