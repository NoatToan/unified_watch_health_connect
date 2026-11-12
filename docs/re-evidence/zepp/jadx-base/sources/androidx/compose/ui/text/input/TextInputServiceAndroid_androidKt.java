package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\"\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "", "update", "", "bits", "flag", "", "hasFlag", "", "DEBUG_CLASS", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class TextInputServiceAndroid_androidKt {

    @NotNull
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 6;
        if (ImeAction.m2785equalsimpl0(imeAction, companion.m2789getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m2785equalsimpl0(imeAction, companion.m2793getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m2785equalsimpl0(imeAction, companion.m2791getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m2785equalsimpl0(imeAction, companion.m2792getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m2785equalsimpl0(imeAction, companion.m2794getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m2785equalsimpl0(imeAction, companion.m2795getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m2785equalsimpl0(imeAction, companion.m2796getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m2785equalsimpl0(imeAction, companion.m2790getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2828getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2822getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2824getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2827getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2829getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2823getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2826getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else {
            if (!KeyboardType.m2818equalsimpl0(keyboardType, companion2.m2825getNumberPasswordPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 18;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m2785equalsimpl0(imeOptions.getImeAction(), companion.m2789getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m2807equalsimpl0(capitalization, companion3.m2811getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m2807equalsimpl0(capitalization, companion3.m2814getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m2807equalsimpl0(capitalization, companion3.m2813getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m2724getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m2719getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}
