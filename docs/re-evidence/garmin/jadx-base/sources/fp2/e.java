package fp2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.t;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfp2/e;", "Landroid/text/TextWatcher;", "", "Lo13/p;", "", "localizedMonths", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;", TtmlNode.TAG_LAYOUT, "Landroid/widget/EditText;", "editText", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;Landroid/widget/EditText;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p<String, String>> f73201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComplexEditText f73202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f73203c;

    public e(List<p<String, String>> list, ComplexEditText complexEditText, EditText editText) {
        complexEditText.getClass();
        editText.getClass();
        this.f73201a = list;
        this.f73202b = complexEditText;
        this.f73203c = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        Integer numI;
        p<String, String> pVar;
        String str;
        if (editable != null && (string = editable.toString()) != null && (numI = t.i(string)) != null) {
            int iIntValue = numI.intValue();
            try {
                List<p<String, String>> list = this.f73201a;
                if (list != null && (pVar = list.get(iIntValue - 1)) != null && (str = pVar.f128595b) != null) {
                    this.f73203c.setText(str, TextView.BufferType.EDITABLE);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception unused) {
                Unit unit2 = Unit.INSTANCE;
            }
        }
        this.f73202b.i();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
