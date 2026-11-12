package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public class yad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c4n<yad> f39982b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputMethodManager f39983a;

    public class a extends c4n<yad> {
        @Override // defpackage.c4n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public yad a(Object obj) {
            return new yad((Context) obj, null);
        }
    }

    public /* synthetic */ yad(Context context, a aVar) {
        this(context);
    }

    public static yad a(Context context) {
        return f39982b.b(context);
    }

    public void b(EditText editText) {
        this.f39983a.hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
    }

    public void c(EditText editText) {
        editText.requestFocus();
        this.f39983a.viewClicked(editText);
        this.f39983a.showSoftInput(editText, 0);
    }

    public yad(Context context) {
        this.f39983a = (InputMethodManager) context.getApplicationContext().getSystemService("input_method");
    }
}
