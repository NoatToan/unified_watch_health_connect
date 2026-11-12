package defpackage;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class w88 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f37714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f37715b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
            return c.e(inputConnection, editable, i, i2, z);
        }

        public void b(EditorInfo editorInfo) {
            if (c.h()) {
                c.b().u(editorInfo);
            }
        }
    }

    public w88(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f37714a = textView;
        this.f37715b = aVar;
        aVar.b(editorInfo);
    }

    public final Editable a() {
        return this.f37714a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f37715b.a(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f37715b.a(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public w88(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }
}
