package fp2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfp2/g;", "Landroid/text/TextWatcher;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;", TtmlNode.TAG_LAYOUT, "Landroid/widget/EditText;", "editText", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;Landroid/widget/EditText;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexEditText f73205a;

    public g(ComplexEditText complexEditText, EditText editText) {
        complexEditText.getClass();
        editText.getClass();
        this.f73205a = complexEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f73205a.i();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
