package x5;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx5/y;", "Lx5/x;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<x, Unit> f188966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputConnection f188967b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(InputConnection inputConnection, e23.l<? super x, Unit> lVar) {
        this.f188966a = lVar;
        this.f188967b = inputConnection;
    }

    @Override // x5.x
    public final void a() {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f188967b = null;
        }
    }

    public void b(InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f188967b != null) {
            a();
            this.f188966a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i14, int i15) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i14, i15);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i14, int i15) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i14);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i14, int i15) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i14, i15);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i14, int i15) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i14, i15);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i14, int i15) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i14, i15);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i14) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i14, int i15) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i14, i15);
        }
        return false;
    }
}
