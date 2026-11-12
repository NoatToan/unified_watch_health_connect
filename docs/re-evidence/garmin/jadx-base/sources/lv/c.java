package lv;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
        if (i14 == 67 && keyEvent.getAction() == 0) {
            Editable text = ((AppCompatEditText) view2).getText();
            View viewFocusSearch = view2.focusSearch(17);
            if (text != null && text.length() > 0) {
                text.delete(0, 1);
                return true;
            }
            if (viewFocusSearch != null) {
                Editable text2 = ((AppCompatEditText) viewFocusSearch).getText();
                if (text2 != null && text2.length() > 0) {
                    text2.delete(0, 1);
                }
                viewFocusSearch.requestFocus();
                return true;
            }
        }
        return false;
    }
}
