package p7;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.a0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a0 {
    @Override // androidx.core.view.a0
    public final androidx.core.view.e a(View view2, androidx.core.view.e eVar) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(eVar);
        }
        androidx.core.view.e.f fVar = eVar.f6414a;
        if (fVar.getSource() == 2) {
            return eVar;
        }
        ClipData clipDataB = fVar.b();
        int flags = fVar.getFlags();
        TextView textView = (TextView) view2;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z14 = false;
        for (int i14 = 0; i14 < clipDataB.getItemCount(); i14++) {
            ClipData.Item itemAt = clipDataB.getItemAt(i14);
            if ((flags & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z14) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z14 = true;
                }
            }
        }
        return null;
    }
}
