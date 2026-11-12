package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class i1i {
    public static void a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(charSequence) || AbstractJsonLexerKt.NULL.equals(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
    }

    public static void b(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }
}
