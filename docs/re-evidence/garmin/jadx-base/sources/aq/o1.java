package aq;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o1 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f12135b;

    public /* synthetic */ o1(EditText editText, int i14) {
        this.f12134a = i14;
        this.f12135b = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
        switch (this.f12134a) {
            case 0:
                if (i14 == 6) {
                    EditText editText = this.f12135b;
                    editText.clearFocus();
                    v22.e.b(editText);
                }
                break;
            default:
                if (i14 == 6) {
                    EditText editText2 = this.f12135b;
                    editText2.clearFocus();
                    v22.e.b(editText2);
                }
                break;
        }
        return true;
    }
}
