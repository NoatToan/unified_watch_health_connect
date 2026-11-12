package iv2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv2/f;", "Landroid/text/TextWatcher;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f95232a;

    public f(g gVar) {
        this.f95232a = gVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            if (editable.length() <= 0) {
                editable = null;
            }
            g gVar = this.f95232a;
            if (editable == null) {
                StyledTextView styledTextView = gVar.f95243k;
                if (styledTextView != null) {
                    styledTextView.setVisibility(0);
                    return;
                } else {
                    s.m("errorMessageText");
                    throw null;
                }
            }
            try {
                int i14 = Integer.parseInt(editable.toString());
                if (i14 >= gVar.f95245m && i14 <= gVar.f95246n) {
                    StyledTextView styledTextView2 = gVar.f95243k;
                    if (styledTextView2 != null) {
                        styledTextView2.setVisibility(8);
                        return;
                    } else {
                        s.m("errorMessageText");
                        throw null;
                    }
                }
                if (i14 > gVar.f95246n) {
                    EditText editText = gVar.f95239g;
                    if (editText == null) {
                        s.m("inputField");
                        throw null;
                    }
                    editText.setText(gVar.f95244l);
                    editText.setSelection(editText.length());
                }
                StyledTextView styledTextView3 = gVar.f95243k;
                if (styledTextView3 != null) {
                    styledTextView3.setVisibility(0);
                } else {
                    s.m("errorMessageText");
                    throw null;
                }
            } catch (NumberFormatException unused) {
                h hVar = gVar.f95237e;
                editable.toString();
                hVar.getClass();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        this.f95232a.f95244l = charSequence != null ? charSequence.toString() : null;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
