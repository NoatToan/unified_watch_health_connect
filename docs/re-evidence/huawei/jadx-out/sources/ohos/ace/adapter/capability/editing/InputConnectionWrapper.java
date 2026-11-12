package ohos.ace.adapter.capability.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
class InputConnectionWrapper extends BaseInputConnection {
    private static final int CLIENT_ID_NONE = -1;
    private static final String LOG_TAG = "Ace_IME";
    private final View aceView;
    private int batchCount;
    private final int clientId;
    private final TextInputDelegate delegate;
    private final Editable editable;
    private int extractedTextRequestToken;
    private final String hint;
    private InputMethodManager imm;
    private boolean pendingNewLineSync;

    InputConnectionWrapper(View view, int i, TextInputDelegate textInputDelegate, Editable editable, String str) {
        super(view, true);
        this.pendingNewLineSync = false;
        this.extractedTextRequestToken = 0;
        this.aceView = view;
        this.clientId = i;
        this.delegate = textInputDelegate;
        this.editable = editable;
        this.batchCount = 0;
        this.hint = str;
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            this.imm = (InputMethodManager) systemService;
        }
    }

    public void keyboardHeightChanged(int i) {
        ALog.d(LOG_TAG, "keyboardHeightChanged height " + i);
        if (i == 0) {
            this.delegate.notifyKeyboardClosedByUser(this.clientId);
        }
    }

    public void clearPendingNewLineSync() {
        this.pendingNewLineSync = false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        if (extractedTextRequest == null || this.editable == null) {
            return null;
        }
        if (extractedTextRequest.token != 0) {
            this.extractedTextRequestToken = extractedTextRequest.token;
        }
        ExtractedText extractedText = new ExtractedText();
        extractedText.selectionStart = Selection.getSelectionStart(this.editable);
        extractedText.selectionEnd = Selection.getSelectionEnd(this.editable);
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.startOffset = 0;
        extractedText.flags = 0;
        if ((extractedTextRequest.flags & 1) != 0) {
            extractedText.text = new SpannableString(this.editable);
            return extractedText;
        }
        extractedText.text = this.editable.toString();
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.editable;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.batchCount++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.batchCount--;
        onStateUpdated();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        int i2;
        int selectionStart = Selection.getSelectionStart(this.editable);
        int selectionEnd = Selection.getSelectionEnd(this.editable);
        boolean z = selectionEnd - selectionStart > 0;
        if (z) {
            this.delegate.setSelectedState(z, charSequence, selectionStart, selectionEnd);
        }
        if (charSequence != null && (i2 = this.clientId) != -1) {
            this.delegate.handleCommitTextForClient(i2, charSequence.toString());
        }
        boolean zCommitText = super.commitText(charSequence, i);
        onStateUpdated();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (Selection.getSelectionStart(this.editable) == -1) {
            this.delegate.setDeletedFlag(true);
            return true;
        }
        boolean zDeleteSurroundingText = super.deleteSurroundingText(i, i2);
        this.delegate.setDeletedFlag(zDeleteSurroundingText);
        onStateUpdated();
        return zDeleteSurroundingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean composingRegion = super.setComposingRegion(i, i2);
        if (Selection.getSelectionStart(this.editable) < Selection.getSelectionEnd(this.editable)) {
            this.delegate.setSelectedState(Selection.getSelectionStart(this.editable), Selection.getSelectionEnd(this.editable));
        }
        onStateUpdated();
        return composingRegion;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean composingText;
        if (charSequence.length() == 0) {
            composingText = super.commitText(charSequence, i);
        } else {
            composingText = super.setComposingText(charSequence, i);
        }
        if (Selection.getSelectionStart(this.editable) < Selection.getSelectionEnd(this.editable)) {
            this.delegate.setSelectedState(Selection.getSelectionStart(this.editable), Selection.getSelectionEnd(this.editable));
        }
        this.delegate.setComposingText(charSequence.toString());
        onStateUpdated();
        return composingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this.editable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this.editable);
        if (composingSpanEnd > composingSpanStart) {
            this.delegate.setFinishComposingText(this.editable.toString().substring(composingSpanStart, composingSpanEnd), composingSpanStart);
        }
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean selection = super.setSelection(i, i2);
        onStateUpdated();
        return selection;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        ALog.d(LOG_TAG, "action & keycode: " + keyEvent.getAction() + " , " + keyEvent.getKeyCode());
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (keyEvent.getKeyCode() == 67) {
            return deleteSelection(keyEvent);
        }
        if (keyEvent.getKeyCode() == 22) {
            moveToRight();
            return true;
        }
        if (keyEvent.getKeyCode() == 21) {
            moveToLeft();
            return true;
        }
        return enterCharacter(keyEvent);
    }

    private void processNewLine() {
        if (this.batchCount > 0) {
            this.pendingNewLineSync = true;
        }
        Editable editable = this.editable;
        if (editable != null) {
            if (BaseInputConnection.getComposingSpanEnd(this.editable) > BaseInputConnection.getComposingSpanStart(editable)) {
                super.finishComposingText();
            }
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        TextInputAction textInputAction;
        ALog.d(LOG_TAG, "performEditorAction: " + i);
        if (i == 0) {
            textInputAction = TextInputAction.UNSPECIFIED;
        } else if (i == 1) {
            textInputAction = TextInputAction.NONE;
        } else if (i == 2) {
            textInputAction = TextInputAction.GO;
        } else if (i == 3) {
            textInputAction = TextInputAction.SEARCH;
        } else if (i == 4) {
            textInputAction = TextInputAction.SEND;
        } else if (i == 5) {
            textInputAction = TextInputAction.NEXT;
        } else if (i == 7) {
            textInputAction = TextInputAction.PREVIOUS;
        } else if (i == TextInputAction.NEW_LINE.getValue()) {
            textInputAction = TextInputAction.NEW_LINE;
            processNewLine();
        } else {
            textInputAction = TextInputAction.DONE;
        }
        this.delegate.performAction(this.clientId, textInputAction);
        return true;
    }

    private void onStateUpdated() {
        if (this.batchCount > 0 || this.imm == null) {
            return;
        }
        int selectionStart = Selection.getSelectionStart(this.editable);
        int selectionEnd = Selection.getSelectionEnd(this.editable);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this.editable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this.editable);
        this.imm.updateSelection(this.aceView, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        ExtractedText extractedText = new ExtractedText();
        Editable editable = this.editable;
        int length = editable.length();
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.startOffset = 0;
        extractedText.selectionStart = selectionStart;
        extractedText.selectionEnd = selectionEnd;
        extractedText.flags = 0;
        extractedText.text = editable.subSequence(0, length);
        this.imm.updateExtractedText(this.aceView, this.extractedTextRequestToken, extractedText);
        if (this.pendingNewLineSync) {
            this.pendingNewLineSync = false;
        } else {
            this.delegate.updateEditingState(this.clientId, this.editable.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        }
    }

    public void updateInputFilterErrorText(String str) {
        this.delegate.updateInputFilterErrorText(this.clientId, str);
    }

    private static int sanitizeIndex(int i, Editable editable) {
        return Math.max(0, Math.min(editable.length(), i));
    }

    private boolean deleteSelection(KeyEvent keyEvent) {
        int iSanitizeIndex = sanitizeIndex(Selection.getSelectionStart(this.editable), this.editable);
        int iSanitizeIndex2 = sanitizeIndex(Selection.getSelectionEnd(this.editable), this.editable);
        if (iSanitizeIndex2 > iSanitizeIndex) {
            Selection.setSelection(this.editable, iSanitizeIndex);
            this.editable.delete(iSanitizeIndex, iSanitizeIndex2);
            this.delegate.setDeletedFlag(true);
            onStateUpdated();
            return true;
        }
        if (iSanitizeIndex > 0) {
            if (!TextKeyListener.getInstance().onKeyDown(null, this.editable, keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            this.delegate.setDeletedFlag(true);
            onStateUpdated();
            return true;
        }
        ALog.w(LOG_TAG, "illegal selection.");
        return false;
    }

    private void moveToRight() {
        int iMin = Math.min(this.editable.length(), Selection.getSelectionStart(this.editable) + 1);
        setSelection(iMin, iMin);
    }

    private void moveToLeft() {
        int iMax = Math.max(0, Selection.getSelectionStart(this.editable) - 1);
        setSelection(iMax, iMax);
    }

    private boolean enterCharacter(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar == 0) {
            return false;
        }
        int iMax = Math.max(Selection.getSelectionEnd(this.editable), 0);
        int iMax2 = Math.max(Selection.getSelectionStart(this.editable), 0);
        if (iMax != iMax2) {
            this.editable.delete(iMax2, iMax);
        }
        this.editable.insert(iMax2, String.valueOf((char) unicodeChar));
        int i = iMax2 + 1;
        setSelection(i, i);
        return true;
    }
}
