package ohos.ace.adapter.capability.editing;

import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class TextInputPluginBase {
    private static final int CLIENT_ID_NONE = -1;
    private static final String LOG_TAG = "Ace_IME";
    private int clientId = -1;
    private TextInputConfiguration config;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void notifyKeyboardClosedByUser(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void performAction(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void updateEditingState(int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void updateInputFilterErrorText(int i, String str);

    protected abstract void finishComposing();

    protected abstract void hideTextInput();

    protected native void nativeInit(int i);

    protected void onClosed() {
    }

    protected abstract void onInited();

    protected void onSetTextEditingState(TextEditState textEditState) {
    }

    public abstract void release();

    protected abstract void showTextInput(boolean z);

    public TextInputPluginBase(int i) {
        try {
            nativeInit(i);
        } catch (UnsatisfiedLinkError unused) {
            ALog.e(LOG_TAG, "nativeInit method is not found.");
        }
    }

    protected static class SelectedRange {
        public final int selectionEnd;
        public final int selectionStart;

        public SelectedRange(int i, int i2) {
            this.selectionStart = i;
            this.selectionEnd = i2;
        }
    }

    public static class Delegate implements TextInputDelegate {
        private static final String APPEND_TEXT = "appendText";
        private static final String COMPOSING_END = "composingEnd";
        private static final String COMPOSING_START = "composingStart";
        private static final String IS_DELETE = "isDelete";
        private static final String SELECTION_END = "selectionEnd";
        private static final String SELECTION_START = "selectionStart";
        private static final String TEXT = "text";
        private static Map<Integer, String> lastValueMap = new HashMap();
        private static final Map<Integer, String> lastCommittedTexts = new HashMap();
        private static final Map<Integer, SelectedRange> selectedRange = new HashMap();
        private boolean isSelected = false;
        private boolean isComposing = false;
        private boolean isNewCommitText = false;
        private boolean isDeleted = false;
        private int finishComposingTextStart = -1;
        private int lastComposingEnd = -1;
        private int lastComposingStart = -1;
        private int lastSelectionEnd = -1;
        private int lastSelectionStart = -1;
        private int lastSelectionEndFromCommit = -1;
        private int lastSelectionStartFromCommit = -1;
        private String needUpdatedText = null;
        private String finishComposingText = null;
        private String composingText = null;

        public Delegate(int i, String str) {
            lastValueMap.put(Integer.valueOf(i), str);
        }

        static class DiffResult {
            public final int curSelEnd;
            public final int curSelStart;
            private String newAppendText;
            public final int preSelEnd;
            public final int preSelStart;

            public DiffResult(int i, int i2, int i3, int i4, String str) {
                this.preSelStart = i;
                this.preSelEnd = i2;
                this.curSelStart = i3;
                this.curSelEnd = i4;
                this.newAppendText = str;
            }

            public void setNewAppendText(String str) {
                this.newAppendText = str;
            }

            public String getNewAppendText() {
                return this.newAppendText;
            }
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void updateEditingState(int i, String str, int i2, int i3, int i4, int i5) {
            int i6;
            if (validateInput(str, i2, i3, i4, i5)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    setJsonDefault(jSONObject, str, i2, i3);
                    String str2 = lastValueMap.get(Integer.valueOf(i));
                    if (this.isSelected && this.needUpdatedText != null) {
                        processSelectedFromCommitText(i, jSONObject, str, str2);
                    } else if (this.lastSelectionEnd > this.lastSelectionStart) {
                        jSONObject.put(APPEND_TEXT, getAppendText(str, i3));
                        this.lastSelectionEnd = -1;
                        this.lastSelectionStart = -1;
                        setComposedState(false, -1, -1);
                    } else {
                        if (str2 != null) {
                            i6 = -1;
                            if (isDelete(i, jSONObject, str, str2, i3)) {
                                jSONObject.put(IS_DELETE, true);
                                setComposedState(false, -1, -1);
                            }
                        } else {
                            i6 = -1;
                        }
                        if (i5 > i4 && isSingleLetterInput(str2, str, i4, i5)) {
                            jSONObject.put(APPEND_TEXT, substringSafe(str, i5 - 1, i5));
                            setComposedState(false, i6, i6);
                        } else {
                            handleOtherInput(jSONObject, str, i, i4, i5);
                        }
                    }
                    tryModifyText(jSONObject, str, str2, i3, i);
                    TextInputPluginBase.updateEditingState(i, jSONObject.toString());
                } catch (JSONException unused) {
                    ALog.e(TextInputPluginBase.LOG_TAG, "failed parse editing config json");
                }
                lastValueMap.put(Integer.valueOf(i), str);
                reset();
            }
        }

        private boolean processDeletedFromCommitText(int i, String str, String str2, JSONObject jSONObject) throws JSONException {
            if (str == null || str2 == null) {
                return false;
            }
            int length = str2.length() - str.length();
            int i2 = jSONObject.getInt(SELECTION_START);
            int i3 = jSONObject.getInt(SELECTION_END);
            if (length <= 0 || i2 != i3) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(substringSafe(str2, 0, i2));
            sb.append(substringSafe(str2, i3 + length, str2.length()));
            return str.equals(sb.toString());
        }

        private void processSelectedFromCommitText(int i, JSONObject jSONObject, String str, String str2) throws JSONException {
            int i2;
            int i3;
            Map<Integer, String> map = lastCommittedTexts;
            String strRemove = map.containsKey(Integer.valueOf(i)) ? map.remove(Integer.valueOf(i)) : "";
            if (!"".equals(this.needUpdatedText) || "".equals(strRemove)) {
                strRemove = this.needUpdatedText;
            }
            jSONObject.put(APPEND_TEXT, strRemove);
            if (strRemove != null && strRemove.isEmpty() && (i2 = this.lastSelectionStartFromCommit) >= 0 && (i3 = this.lastSelectionEndFromCommit) >= 0 && i2 < i3) {
                if (this.isDeleted) {
                    jSONObject.put(IS_DELETE, true);
                } else {
                    String str3 = this.composingText;
                    if (str3 != null && !str3.isEmpty()) {
                        jSONObject.put(APPEND_TEXT, this.composingText);
                    } else if (processDeletedFromCommitText(i, str, str2, jSONObject)) {
                        jSONObject.put(IS_DELETE, true);
                    }
                }
            }
            this.isSelected = false;
            this.needUpdatedText = null;
            setComposedState(false, -1, -1);
        }

        private boolean validateInput(String str, int i, int i2, int i3, int i4) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (i >= 0 && i <= length && i2 >= 0 && i2 <= length && i <= i2) {
                if (i3 == -1 && i4 == -1) {
                    return true;
                }
                if (i3 >= 0 && i3 <= length && i4 >= 0 && i4 <= length && i3 <= i4) {
                    return true;
                }
            }
            return false;
        }

        private boolean isDelete(int i, JSONObject jSONObject, String str, String str2, int i2) throws JSONException {
            int length;
            if (str == null || str2 == null || (length = str2.length() - str.length()) <= 0) {
                return false;
            }
            if (length == 1) {
                if (str.equals(substringSafe(str2, 0, i2) + substringSafe(str2, i2 + 1, str2.length()))) {
                    return true;
                }
            }
            Map<Integer, SelectedRange> map = selectedRange;
            if (map != null && map.containsKey(Integer.valueOf(i))) {
                SelectedRange selectedRange2 = map.get(Integer.valueOf(i));
                int i3 = selectedRange2.selectionStart;
                int i4 = selectedRange2.selectionEnd;
                if (i3 >= 0 && i4 > i3 && i4 - i3 == length) {
                    if (str.equals(substringSafe(str2, 0, i3) + substringSafe(str2, i4, str2.length()))) {
                        return true;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(substringSafe(str2, 0, i2));
            int i5 = length + i2;
            sb.append(substringSafe(str2, i5, str2.length()));
            String string = sb.toString();
            int iOptInt = jSONObject.optInt(SELECTION_START);
            if (iOptInt >= 0 && iOptInt == i2 && str.equals(string)) {
                jSONObject.put(COMPOSING_START, i2);
                jSONObject.put(COMPOSING_END, i5);
                return true;
            }
            return this.isDeleted;
        }

        private String getNewInputStr(String str, String str2, int i, int i2, int i3) {
            if (str == null) {
                return str2;
            }
            int length = str2.length() - str.length();
            if (i2 != -1 && i3 > i2 + 1) {
                if (length == 0) {
                    return "";
                }
                return substringSafe(str2, i2, i3);
            }
            int i4 = i - length;
            if (i4 < 0 || i > str2.length()) {
                return "";
            }
            return substringSafe(str2, Math.max(i4, 0), Math.min(i, str2.length()));
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void setFinishComposingText(String str, int i) {
            this.finishComposingText = str;
            this.finishComposingTextStart = i;
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void setComposingText(String str) {
            this.composingText = str;
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void setDeletedFlag(boolean z) {
            this.isDeleted = z;
        }

        public static void release() {
            lastValueMap.clear();
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void performAction(int i, TextInputAction textInputAction) {
            if (textInputAction == null) {
                return;
            }
            TextInputPluginBase.performAction(i, textInputAction.getValue());
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void updateInputFilterErrorText(int i, String str) {
            if (str.length() > 0) {
                TextInputPluginBase.updateInputFilterErrorText(i, str);
            }
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void notifyKeyboardClosedByUser(int i) {
            TextInputPluginBase.notifyKeyboardClosedByUser(i);
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void setSelectedState(boolean z, CharSequence charSequence, int i, int i2) {
            this.isSelected = z;
            this.needUpdatedText = charSequence.toString();
            this.lastSelectionStartFromCommit = i;
            this.lastSelectionEndFromCommit = i2;
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void handleCommitTextForClient(int i, String str) {
            Map<Integer, String> map = lastCommittedTexts;
            String str2 = map.get(Integer.valueOf(i));
            if (str2 != null && " ".equals(str2)) {
                map.put(Integer.valueOf(i), str2 + str);
                return;
            }
            map.put(Integer.valueOf(i), str);
        }

        private void setComposedState(boolean z, int i, int i2) {
            this.isComposing = z;
            this.lastComposingStart = i;
            this.lastComposingEnd = i2;
        }

        private void setJsonDefault(JSONObject jSONObject, String str, int i, int i2) throws JSONException {
            jSONObject.put("text", str);
            jSONObject.put(SELECTION_START, i);
            jSONObject.put(SELECTION_END, i2);
            jSONObject.put(COMPOSING_START, -1);
            jSONObject.put(COMPOSING_END, -1);
            jSONObject.put(IS_DELETE, false);
        }

        private void processSelectedInputEnglish(JSONObject jSONObject, String str, int i, int i2, int i3) throws JSONException {
            Map<Integer, SelectedRange> map = selectedRange;
            if (map == null || !map.containsKey(Integer.valueOf(i))) {
                return;
            }
            SelectedRange selectedRange2 = map.get(Integer.valueOf(i));
            int i4 = selectedRange2.selectionStart;
            int i5 = selectedRange2.selectionEnd;
            String strOptString = jSONObject.optString("text");
            int length = str.length();
            int length2 = strOptString.length();
            if (i4 < 0 || i5 <= i4 || i5 - i4 != (length - length2) + (i3 - i2)) {
                return;
            }
            if ((substringSafe(strOptString, 0, i2) + substringSafe(strOptString, i3, strOptString.length())).equals(substringSafe(str, 0, i4) + substringSafe(str, i5, str.length()))) {
                jSONObject.put(APPEND_TEXT, substringSafe(strOptString, i2, i3));
            }
        }

        private void handleComposingText(JSONObject jSONObject, String str, int i, int i2, int i3) throws JSONException {
            int i4;
            if (this.isNewCommitText) {
                this.isNewCommitText = false;
                setComposedState(false, -1, -1);
                return;
            }
            if (i2 != -1 && i3 > i2) {
                jSONObject.put(COMPOSING_END, i2);
                if (this.isComposing && (i4 = this.lastComposingEnd) < i3) {
                    jSONObject.put(COMPOSING_END, i4);
                    jSONObject.put(COMPOSING_START, i2);
                } else {
                    processSelectedInputEnglish(jSONObject, str, i, i2, i3);
                }
                setComposedState(true, i2, i3);
                return;
            }
            if (this.isComposing) {
                jSONObject.put(COMPOSING_START, this.lastComposingStart);
                jSONObject.put(COMPOSING_END, this.lastComposingEnd);
            }
            setComposedState(false, -1, -1);
        }

        @Override // ohos.ace.adapter.capability.editing.TextInputDelegate
        public void setSelectedState(int i, int i2) {
            this.lastSelectionStart = i;
            this.lastSelectionEnd = i2;
        }

        private String getAppendText(String str, int i) {
            if (str == null || str.isEmpty()) {
                return "";
            }
            int i2 = i - (this.lastSelectionEnd - this.lastSelectionStart);
            if (i2 <= 0) {
                i2 = 0;
            }
            return substringSafe(str, i2, Math.min(str.length(), i));
        }

        private boolean isSingleLetterInput(String str, String str2, int i, int i2) {
            int i3;
            return str != null && i2 <= str2.length() && i <= str2.length() && (i3 = i2 + (-1)) <= str.length() && i <= str.length() && str2.length() - str.length() == 1 && Character.isLetter(str2.charAt(i3)) && i <= i2 && substringSafe(str, i, i3).equals(substringSafe(str2, i, i3)) && substringSafe(str, i, i3).matches("[a-zA-Z]+");
        }

        private void reset() {
            lastCommittedTexts.clear();
            this.isSelected = false;
            this.lastSelectionEnd = -1;
            this.lastSelectionStart = -1;
            this.needUpdatedText = null;
            this.finishComposingText = null;
            this.composingText = null;
            this.isDeleted = false;
            this.lastSelectionEndFromCommit = -1;
            this.lastSelectionStartFromCommit = -1;
        }

        private boolean isAppendText(String str, String str2, String str3, int i) {
            int length;
            int i2;
            if (str == null || str2 == null || str3 == null || i < 0 || i > str2.length() || (length = str2.length() - str.length()) <= 0 || (i2 = i - length) < 0 || length != str3.length()) {
                return false;
            }
            return str.equals(substringSafe(str2, 0, i2) + str2.substring(i));
        }

        private String getCommitText(String str, String str2, int i, JSONObject jSONObject, int i2) throws JSONException {
            String strRemove = lastCommittedTexts.remove(Integer.valueOf(i2));
            String str3 = this.composingText;
            if (str3 != null && str3.length() > 0) {
                String str4 = strRemove + this.composingText;
                if (str4.equals(substringSafe(str2, Math.max(0, i - str4.length()), Math.min(i, str2.length())))) {
                    strRemove = str4;
                }
                this.composingText = null;
            }
            int iMax = Math.max(i - strRemove.length(), 0);
            if (str.length() > iMax) {
                String str5 = substringSafe(str, 0, iMax) + strRemove + str.substring(iMax);
                if (str2.length() != str.length() + strRemove.length() || (!str5.equals(str2) && !this.isComposing)) {
                    jSONObject.put(COMPOSING_START, iMax);
                    jSONObject.put(COMPOSING_END, iMax + (strRemove.length() - (str2.length() - str.length())));
                    tryModifyComposeText(jSONObject, str, str2, strRemove);
                    this.isNewCommitText = true;
                    return strRemove;
                }
            }
            return strRemove;
        }

        private void handleOtherInput(JSONObject jSONObject, String str, int i, int i2, int i3) throws JSONException {
            String newInputStr;
            String commitText;
            boolean zIsAppendText;
            String str2 = lastValueMap.get(Integer.valueOf(i));
            int i4 = jSONObject.getInt(SELECTION_END);
            if (!lastCommittedTexts.containsKey(Integer.valueOf(i))) {
                newInputStr = getNewInputStr(str2, str, i4, i2, i3);
            } else {
                if (str2 != null) {
                    commitText = getCommitText(str2, str, i4, jSONObject, i);
                    zIsAppendText = isAppendText(str2, str, commitText, i4);
                } else {
                    newInputStr = null;
                }
                if (commitText != null && !commitText.isEmpty()) {
                    jSONObject.put(APPEND_TEXT, commitText);
                }
                if (!zIsAppendText && i2 == -1) {
                    setComposedState(false, -1, -1);
                    return;
                } else {
                    handleComposingText(jSONObject, str2, i, i2, i3);
                }
            }
            commitText = newInputStr;
            zIsAppendText = false;
            if (commitText != null) {
                jSONObject.put(APPEND_TEXT, commitText);
            }
            if (!zIsAppendText) {
            }
            handleComposingText(jSONObject, str2, i, i2, i3);
        }

        private void tryModifyComposeText(JSONObject jSONObject, String str, String str2, String str3) throws JSONException {
            int iMax = Math.max(0, jSONObject.getInt(COMPOSING_START));
            int iMin = Math.min(str.length(), jSONObject.getInt(COMPOSING_END));
            if (iMax >= iMin) {
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.replace(iMax, iMin, str3);
            if (sb.toString().equals(str2)) {
                return;
            }
            int iMax2 = Math.max(0, jSONObject.getInt(COMPOSING_START) - 1);
            int iMin2 = Math.min(str.length(), jSONObject.getInt(COMPOSING_END) - 1);
            if (iMin2 > 0 && new StringBuilder(str).replace(iMax2, iMin2, str3).toString().equals(str2)) {
                jSONObject.put(COMPOSING_START, jSONObject.getInt(COMPOSING_START) - 1);
                jSONObject.put(COMPOSING_END, jSONObject.getInt(COMPOSING_END) - 1);
            }
        }

        private void handleSelectionError(String str, String str2, JSONObject jSONObject, int i, int i2) throws JSONException {
            if (str == null || str2 == null || i != i2 || str.length() != str2.length() || str.equals(str2) || jSONObject.has(APPEND_TEXT)) {
                return;
            }
            jSONObject.put(APPEND_TEXT, "");
        }

        private void tryModifyText(JSONObject jSONObject, String str, String str2, int i, int i2) throws JSONException {
            DiffResult diffResult;
            if (str == null || str2 == null || i < 0 || i > str.length()) {
                return;
            }
            int i3 = jSONObject.getInt(COMPOSING_START);
            int i4 = jSONObject.getInt(COMPOSING_END);
            if (i3 < 0 || i4 <= 0 || i3 == i4) {
                Map<Integer, SelectedRange> map = selectedRange;
                if (map.containsKey(Integer.valueOf(i2))) {
                    i3 = map.get(Integer.valueOf(i2)).selectionStart;
                    i4 = map.get(Integer.valueOf(i2)).selectionEnd;
                }
            }
            int i5 = i3;
            int i6 = i4;
            handleSelectionError(str, str2, jSONObject, i5, i6);
            if (i5 > i6 || !jSONObject.has(APPEND_TEXT)) {
                return;
            }
            jSONObject.getString(APPEND_TEXT);
            if (isCorrectData(str2, str, i5, i6, jSONObject.getString(APPEND_TEXT))) {
                return;
            }
            DiffResult diffResult2 = getDiffResult(str2, str, i5, i);
            if (diffResult2.preSelStart != diffResult2.preSelEnd) {
                diffResult = diffResult2;
                jSONObject.put(COMPOSING_START, diffResult.preSelStart);
                jSONObject.put(COMPOSING_END, diffResult.preSelEnd);
            } else {
                if (i5 != i6 || i6 == diffResult2.preSelEnd) {
                    diffResult = diffResult2;
                } else {
                    String strSubstringSafe = substringSafe(str, Math.max(i5, 0), Math.min(i - 1, str.length()));
                    diffResult = diffResult2;
                    if (isCorrectData(str2, str, i5, i6, strSubstringSafe)) {
                        diffResult.setNewAppendText(strSubstringSafe);
                    }
                }
                jSONObject.put(COMPOSING_START, -1);
                jSONObject.put(COMPOSING_END, -1);
            }
            jSONObject.put(APPEND_TEXT, diffResult.getNewAppendText());
        }

        private boolean isCorrectData(String str, String str2, int i, int i2, String str3) {
            if (str == null || str2 == null || i < 0 || i2 < 0 || i > str.length() || i2 > str.length() || i > i2) {
                return false;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.replace(i, i2, str3);
            return sb.toString().equals(str2);
        }

        private DiffResult getDiffResult(String str, String str2, int i, int i2) {
            String strSubstringSafe;
            int length = str2.length();
            int length2 = str.length();
            int i3 = 0;
            while (i3 < length && i3 < length2 && str2.charAt(i3) == str.charAt(i3)) {
                i3++;
            }
            do {
                length--;
                length2--;
                if (length < i3 || length2 < i3) {
                    break;
                }
            } while (str2.charAt(length) == str.charAt(length2));
            int i4 = length2 + 1;
            int i5 = length + 1;
            String strSubstringSafe2 = substringSafe(str2, i3, Math.max(i5, i2));
            if (i2 > i5) {
                i4 += i2 - i5;
            }
            int i6 = i4;
            if (i2 < i5 && i5 - i2 == 1 && " ".equals(substringSafe(str2, i2, i2 + 1))) {
                int iMax = Math.max(i, 0);
                strSubstringSafe = substringSafe(str2, iMax, Math.max(i2, iMax));
            } else {
                strSubstringSafe = strSubstringSafe2;
            }
            return new DiffResult(i3, i6, i3, i5, strSubstringSafe);
        }

        private String substringSafe(String str, int i, int i2) {
            int iMax;
            int iMin;
            if (str == null || str.isEmpty() || (iMax = Math.max(0, i)) >= (iMin = Math.min(i2, str.length()))) {
                return "";
            }
            return str.substring(iMax, iMin);
        }
    }

    protected boolean hasClient() {
        return this.clientId != -1;
    }

    protected int clientId() {
        return this.clientId;
    }

    protected TextInputConfiguration getConfiguration() {
        return this.config;
    }

    private void setTextInputClient(int i, String str) {
        this.clientId = i;
        try {
            this.config = TextInputConfiguration.fromJson(new JSONObject(str));
            onInited();
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "failed parse editing config json");
        }
    }

    private void setTextInputEditingState(String str) {
        try {
            onSetTextEditingState(TextEditState.fromJson(new JSONObject(str)));
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "failed parse editing state json");
        }
    }

    private void clearTextInputClient() {
        this.clientId = -1;
        onClosed();
    }

    protected void setSelectedRange(SelectedRange selectedRange) {
        if (hasClient()) {
            Delegate.selectedRange.put(Integer.valueOf(clientId()), selectedRange);
        }
    }
}
