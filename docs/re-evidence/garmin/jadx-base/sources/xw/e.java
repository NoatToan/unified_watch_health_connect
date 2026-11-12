package xw;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxw/e;", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f192296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b f192297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f192298c;

    public e(p0 p0Var, com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b bVar, TextView textView) {
        this.f192296a = p0Var;
        this.f192297b = bVar;
        this.f192298c = textView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b bVar = this.f192297b;
        EditText editText = bVar.f30936l;
        if (editText == null) {
            s.m("messageEditText");
            throw null;
        }
        int length = editText.getText().length();
        p0 p0Var = this.f192296a;
        p0Var.f105807a = length;
        this.f192298c.setText(bVar.getString(R.string.lbl_character_limit, String.valueOf(47 - p0Var.f105807a)));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
