package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.textinput.ReactEditText;

/* JADX INFO: loaded from: classes4.dex */
public class cdj extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReactEditText f5220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pd8 f5221b;
    public boolean c;
    public String d;

    public cdj(InputConnection inputConnection, ReactContext reactContext, ReactEditText reactEditText) {
        super(inputConnection, false);
        this.d = null;
        this.f5221b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.f5220a = reactEditText;
    }

    public final void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f5221b.dispatchEvent(new ifj(this.f5220a.getId(), str));
    }

    public final void b(String str) {
        if (this.c) {
            this.d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = "Backspace";
            }
            b(string);
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.c = false;
        String str = this.d;
        if (str != null) {
            a(str);
            this.d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                a("Enter");
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.f5220a.getSelectionStart();
        int selectionEnd = this.f5220a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.f5220a.getSelectionStart();
        b((selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f5220a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
