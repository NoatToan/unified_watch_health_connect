package ohos.ace.adapter.capability.editing;

/* JADX INFO: loaded from: classes20.dex */
public interface TextInputDelegate {
    void handleCommitTextForClient(int i, String str);

    void notifyKeyboardClosedByUser(int i);

    void performAction(int i, TextInputAction textInputAction);

    void setComposingText(String str);

    void setDeletedFlag(boolean z);

    void setFinishComposingText(String str, int i);

    void setSelectedState(int i, int i2);

    void setSelectedState(boolean z, CharSequence charSequence, int i, int i2);

    void updateEditingState(int i, String str, int i2, int i3, int i4, int i5);

    void updateInputFilterErrorText(int i, String str);
}
