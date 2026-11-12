package bi2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbi2/c;", "Landroid/text/TextWatcher;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f18116a;

    public c(f fVar) {
        this.f18116a = fVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Object obj;
        if (editable != null) {
            if (editable.length() <= 0) {
                obj = editable;
                obj = null;
            }
            obj = editable;
            f fVar = this.f18116a;
            if (obj != null) {
                try {
                    int i14 = Integer.parseInt(obj.toString());
                    int iD = fVar.d();
                    StyledTextView styledTextView = fVar.f18147l;
                    if (i14 < iD) {
                        fVar.getF18140e().getClass();
                        styledTextView.setVisibility(0);
                        styledTextView.setText(fVar.h());
                        obj = Unit.INSTANCE;
                    } else if (i14 > fVar.c()) {
                        EditText editText = fVar.f18144i;
                        editText.setText(fVar.f18149n);
                        editText.setSelection(editText.length());
                        obj = editText;
                    } else {
                        styledTextView.setVisibility(8);
                        obj = Unit.INSTANCE;
                    }
                } catch (NumberFormatException unused) {
                    hi2.d dVarB = fVar.getF18140e();
                    obj.toString();
                    dVarB.getClass();
                    obj = Unit.INSTANCE;
                }
                if (obj != null) {
                    return;
                }
            }
            fVar.getF18140e().getClass();
            StyledTextView styledTextView2 = fVar.f18147l;
            styledTextView2.setVisibility(0);
            styledTextView2.setText(fVar.h());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        this.f18116a.f18149n = charSequence != null ? charSequence.toString() : null;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
