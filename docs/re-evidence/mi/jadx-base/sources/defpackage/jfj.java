package defpackage;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final class jfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f22743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22744b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final CharSequence g;

    public jfj(EditText editText) {
        this.f22743a = new SpannableStringBuilder(editText.getText());
        this.f22744b = editText.getTextSize();
        this.e = editText.getInputType();
        this.g = editText.getHint();
        this.c = editText.getMinLines();
        this.d = editText.getMaxLines();
        this.f = editText.getBreakStrategy();
    }

    public void a(EditText editText) {
        editText.setText(this.f22743a);
        editText.setTextSize(0, this.f22744b);
        editText.setMinLines(this.c);
        editText.setMaxLines(this.d);
        editText.setInputType(this.e);
        editText.setHint(this.g);
        editText.setBreakStrategy(this.f);
    }
}
