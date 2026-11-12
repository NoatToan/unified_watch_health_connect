package np2;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnp2/c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f126872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputEditText f126873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f126874c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnp2/c$a;", "Landroid/text/TextWatcher;", "Lcom/google/android/material/textfield/TextInputLayout;", TtmlNode.TAG_LAYOUT, "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextInputLayout f126875a;

        public a(TextInputLayout textInputLayout) {
            textInputLayout.getClass();
            this.f126875a = textInputLayout;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            this.f126875a.setError(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.layout_edit_text);
        viewFindViewById.getClass();
        this.f126872a = (TextInputLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.edit_text_input);
        viewFindViewById2.getClass();
        this.f126873b = (TextInputEditText) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.button_submit);
        viewFindViewById3.getClass();
        this.f126874c = (Button) viewFindViewById3;
    }
}
