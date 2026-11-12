package ohos.ace.adapter.capability.editing;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
public class TextInputPluginAosp extends TextInputPluginBase implements TextInputErrorTextHandler {
    private static final String LOG_TAG = "Ace_IME";
    private Editable editable;
    private String hint;
    private final InputMethodManager imm;
    private boolean isRestartInputPending;
    private final Handler mainHandler;
    private boolean stopBackPress;
    private View view;
    private InputConnectionWrapper wrapper;

    public TextInputPluginAosp(View view, int i) {
        super(i);
        this.isRestartInputPending = false;
        this.stopBackPress = true;
        this.wrapper = null;
        this.view = view;
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            this.imm = (InputMethodManager) systemService;
        } else {
            ALog.e(LOG_TAG, "Unable to get INPUT_METHOD_SERVICE");
            this.imm = null;
        }
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    public InputMethodManager getInputMethodManager() {
        return this.imm;
    }

    public InputConnection createInputConnection(View view, EditorInfo editorInfo) {
        int iConvertInputAction;
        ALog.d(LOG_TAG, "createInputConnection");
        TextInputConfiguration configuration = getConfiguration();
        if (!hasClient() || configuration == null) {
            return null;
        }
        editorInfo.inputType = inputTypeFromTextInputType(configuration.getType(), configuration.isObscure());
        editorInfo.imeOptions = 33554432;
        if (configuration.getAction() != TextInputAction.UNSPECIFIED) {
            iConvertInputAction = convertInputAction(configuration.getAction());
        } else {
            iConvertInputAction = (editorInfo.inputType & 131072) != 0 ? 1 : 6;
        }
        if (configuration.getActionLabel() != null && configuration.getActionLabel().length() > 0) {
            editorInfo.actionLabel = configuration.getActionLabel();
            editorInfo.actionId = iConvertInputAction;
        }
        editorInfo.imeOptions |= iConvertInputAction;
        TextInputPluginBase.Delegate delegate = new TextInputPluginBase.Delegate(clientId(), this.editable.toString());
        editorInfo.initialSelStart = Selection.getSelectionStart(this.editable);
        editorInfo.initialSelEnd = Selection.getSelectionEnd(this.editable);
        InputConnectionWrapper inputConnectionWrapper = new InputConnectionWrapper(view, clientId(), delegate, this.editable, this.hint);
        this.wrapper = inputConnectionWrapper;
        return inputConnectionWrapper;
    }

    public void keyboardHeightChanged(int i) {
        InputConnectionWrapper inputConnectionWrapper = this.wrapper;
        if (inputConnectionWrapper != null) {
            inputConnectionWrapper.keyboardHeightChanged(i);
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputPluginBase
    public void showTextInput(boolean z) {
        ALog.d(LOG_TAG, "showTextInput");
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.editing.TextInputPluginAosp.1
            @Override // java.lang.Runnable
            public void run() {
                TextInputPluginAosp.this.view.requestFocus();
                if (TextInputPluginAosp.this.imm != null) {
                    TextInputPluginAosp.this.imm.restartInput(TextInputPluginAosp.this.view);
                    TextInputPluginAosp.this.imm.showSoftInput(TextInputPluginAosp.this.view, 0);
                }
            }
        });
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputPluginBase
    public void hideTextInput() {
        ALog.d(LOG_TAG, "hideTextInput");
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.editing.TextInputPluginAosp.2
            @Override // java.lang.Runnable
            public void run() {
                if (TextInputPluginAosp.this.imm != null) {
                    TextInputPluginAosp.this.imm.hideSoftInputFromWindow(TextInputPluginAosp.this.view.getApplicationWindowToken(), 0);
                }
            }
        });
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputPluginBase
    public void finishComposing() {
        ALog.d(LOG_TAG, "finishComposing");
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.editing.TextInputPluginAosp.3
            @Override // java.lang.Runnable
            public void run() {
                if (TextInputPluginAosp.this.imm != null) {
                    TextInputPluginAosp.this.imm.restartInput(TextInputPluginAosp.this.view);
                }
            }
        });
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputErrorTextHandler
    public void onTextInputErrorTextChanged(String str) {
        InputConnectionWrapper inputConnectionWrapper = this.wrapper;
        if (inputConnectionWrapper != null) {
            inputConnectionWrapper.updateInputFilterErrorText(str);
        }
    }

    public boolean isStopBackPress() {
        return this.stopBackPress;
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputPluginBase
    protected void onInited() {
        this.editable = Editable.Factory.getInstance().newEditable("");
        TextInputConfiguration configuration = getConfiguration();
        if (configuration != null) {
            ArrayList arrayList = new ArrayList();
            String inputFilterRule = configuration.getInputFilterRule();
            if (!inputFilterRule.isEmpty()) {
                TextInputFilter textInputFilter = new TextInputFilter(inputFilterRule);
                textInputFilter.setTextInputErrorTextHandler(this);
                arrayList.add(textInputFilter);
            }
            if (arrayList.size() > 0) {
                this.editable.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
            }
        }
        this.isRestartInputPending = true;
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputPluginBase
    protected void onSetTextEditingState(TextEditState textEditState) {
        if (textEditState == null) {
            ALog.e(LOG_TAG, "onSetTextEditingState: state is null");
            return;
        }
        this.hint = textEditState.getHint();
        this.stopBackPress = textEditState.getStopBackPress();
        InputConnectionWrapper inputConnectionWrapper = this.wrapper;
        if (inputConnectionWrapper != null) {
            inputConnectionWrapper.clearPendingNewLineSync();
        }
        if (!this.isRestartInputPending && textEditState.getText().equals(this.editable.toString())) {
            applyStateToSelection(textEditState);
            InputMethodManager inputMethodManager = this.imm;
            if (inputMethodManager != null) {
                inputMethodManager.updateSelection(this.view, Math.max(Selection.getSelectionStart(this.editable), 0), Math.max(Selection.getSelectionEnd(this.editable), 0), BaseInputConnection.getComposingSpanStart(this.editable), BaseInputConnection.getComposingSpanEnd(this.editable));
            }
        } else {
            int composingSpanStart = BaseInputConnection.getComposingSpanStart(this.editable);
            int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this.editable);
            Editable editable = this.editable;
            editable.replace(0, editable.length(), textEditState.getText());
            applyStateToSelection(textEditState);
            InputMethodManager inputMethodManager2 = this.imm;
            if (inputMethodManager2 != null) {
                inputMethodManager2.restartInput(this.view);
                restoreComposingRegionAfterRestart(textEditState, composingSpanStart, composingSpanEnd);
            }
            this.isRestartInputPending = false;
        }
        setSelectedRange(new TextInputPluginBase.SelectedRange(Selection.getSelectionStart(this.editable), Selection.getSelectionEnd(this.editable)));
    }

    @Override // ohos.ace.adapter.capability.editing.TextInputPluginBase
    public void release() {
        this.view = null;
        TextInputPluginBase.Delegate.release();
    }

    private void applyStateToSelection(TextEditState textEditState) {
        int selectionStart = textEditState.getSelectionStart();
        int selectionEnd = textEditState.getSelectionEnd();
        if (selectionStart >= 0 && selectionStart <= this.editable.length() && selectionEnd >= 0 && selectionEnd <= this.editable.length()) {
            Selection.setSelection(this.editable, selectionStart, selectionEnd);
        } else {
            Selection.removeSelection(this.editable);
        }
    }

    /* JADX INFO: renamed from: ohos.ace.adapter.capability.editing.TextInputPluginAosp$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction;

        static {
            int[] iArr = new int[TextInputAction.values().length];
            $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction = iArr;
            try {
                iArr[TextInputAction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.GO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.SEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.NEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.PREVIOUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.NEW_LINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[TextInputAction.UNSPECIFIED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static int convertInputAction(TextInputAction textInputAction) {
        switch (AnonymousClass4.$SwitchMap$ohos$ace$adapter$capability$editing$TextInputAction[textInputAction.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return TextInputAction.NEW_LINE.getValue();
            default:
                return 0;
        }
    }

    private static int inputTypeFromTextInputType(TextInputType textInputType, boolean z) {
        int i;
        if (textInputType == TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputType.NUMBER) {
            return 2;
        }
        if (textInputType == TextInputType.NUMBER_PASSWORD) {
            return 18;
        }
        if (textInputType == TextInputType.PHONE) {
            return 3;
        }
        ALog.d(LOG_TAG, "other text input type");
        if (textInputType == TextInputType.MULTILINE) {
            i = 131073;
        } else if (textInputType == TextInputType.EMAIL_ADDRESS) {
            i = 33;
        } else if (textInputType == TextInputType.URL) {
            i = 17;
        } else if (textInputType == TextInputType.VISIBLE_PASSWORD) {
            i = 145;
        } else {
            ALog.d(LOG_TAG, "only use class text type");
            i = 1;
        }
        return z ? i | 524416 : i;
    }

    private void restoreComposingRegionAfterRestart(TextEditState textEditState, int i, int i2) {
        if (this.wrapper == null || i < 0 || i2 <= i) {
            return;
        }
        int length = textEditState.getText().length();
        int selectionEnd = textEditState.getSelectionEnd();
        int iMax = Math.max(0, Math.min(i, length));
        int iMin = selectionEnd >= 0 ? Math.min(selectionEnd, length) : 0;
        if (iMin <= iMax) {
            return;
        }
        this.wrapper.setComposingRegion(iMax, iMin);
    }
}
