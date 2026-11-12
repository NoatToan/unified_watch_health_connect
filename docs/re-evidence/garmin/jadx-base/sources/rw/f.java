package rw;

import android.text.Editable;
import android.text.TextWatcher;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw/f;", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f154786a;

    public f(g gVar) {
        this.f154786a = gVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        g gVar = this.f154786a;
        gVar.f154807u.setText(gVar.f154787a.f199875a.a(R.string.string_slash_string_pattern, String.valueOf(gVar.f154809w.getText().length()), "300"));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
