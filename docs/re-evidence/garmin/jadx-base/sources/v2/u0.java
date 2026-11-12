package v2;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
public interface u0 {
    void a(int i14, int i15, int i16, int i17);

    void b();

    void c();

    boolean isActive();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i14, ExtractedText extractedText);
}
