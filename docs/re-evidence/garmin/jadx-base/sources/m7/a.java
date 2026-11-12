package m7;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class a {

    /* JADX INFO: renamed from: m7.a$a, reason: collision with other inner class name */
    public static class C2222a {
        private C2222a() {
        }

        public static void a(EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(EditorInfo editorInfo, boolean z14) {
            editorInfo.setStylusHandwritingEnabled(z14);
        }
    }

    @Deprecated
    public a() {
    }

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            C2222a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i14 >= 30) {
            C2222a.a(editorInfo, charSequence);
            return;
        }
        int i15 = editorInfo.initialSelStart;
        int i16 = editorInfo.initialSelEnd;
        int i17 = i15 > i16 ? i16 : i15;
        if (i15 <= i16) {
            i15 = i16;
        }
        int length = charSequence.length();
        if (i17 < 0 || i15 > length) {
            c(editorInfo, null, 0, 0);
            return;
        }
        int i18 = editorInfo.inputType & 4095;
        if (i18 == 129 || i18 == 225 || i18 == 18) {
            c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c(editorInfo, charSequence, i17, i15);
            return;
        }
        int i19 = i15 - i17;
        int i24 = i19 > 1024 ? 0 : i19;
        int i25 = 2048 - i24;
        int iMin = Math.min(charSequence.length() - i15, i25 - Math.min(i17, (int) (((double) i25) * 0.8d)));
        int iMin2 = Math.min(i17, i25 - iMin);
        int i26 = i17 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i26))) {
            i26++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i15 + iMin) - 1))) {
            iMin--;
        }
        int i27 = iMin2 + i24;
        c(editorInfo, i24 != i19 ? TextUtils.concat(charSequence.subSequence(i26, i26 + iMin2), charSequence.subSequence(i15, iMin + i15)) : charSequence.subSequence(i26, i27 + iMin + i26), iMin2, i27);
    }

    public static void b(EditorInfo editorInfo, boolean z14) {
        if (Build.VERSION.SDK_INT >= 35) {
            b.a(editorInfo, z14);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z14);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i14, int i15) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i14);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i15);
    }
}
