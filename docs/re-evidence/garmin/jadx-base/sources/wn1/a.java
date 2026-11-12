package wn1;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import c22.y3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import ew1.h1;

/* JADX INFO: loaded from: classes10.dex */
public class a extends DialogFragment implements TextWatcher {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f186174k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f186175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f186176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f186177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f186178d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wb0.a f186179e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputFilter[] f186180f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f186181g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f186182h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f186183i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f186184j = -1;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.d("FieldEntryDialogFragment", ".onCreate()");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f186181g = arguments.getString("KEY_TITLE");
            this.f186182h = arguments.getString("KEY_INITIAL_VALUE");
            this.f186183i = arguments.getString("KEY_INITIAL_EXCEPTION");
            this.f186184j = arguments.getInt("KEY_MAX_LENGTH");
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        i2.d("FieldEntryDialogFragment", ".onCreateDialog()");
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.gcm3_field_entry_with_exception_dialog, (ViewGroup) null);
        this.f186175a = viewInflate;
        this.f186176b = (EditText) viewInflate.findViewById(R.id.field_value);
        if (!TextUtils.isEmpty(this.f186182h)) {
            this.f186176b.setText(this.f186182h);
            this.f186176b.setSelectAllOnFocus(true);
        }
        this.f186176b.setInputType(524432);
        this.f186176b.addTextChangedListener(this);
        InputFilter[] inputFilterArr = this.f186180f;
        if (inputFilterArr != null) {
            this.f186176b.setFilters(inputFilterArr);
        }
        this.f186177c = (TextView) this.f186175a.findViewById(R.id.exception);
        boolean zIsEmpty = TextUtils.isEmpty(this.f186183i);
        TextView textView = this.f186177c;
        if (zIsEmpty) {
            textView.setVisibility(4);
        } else {
            textView.setText(this.f186183i);
            this.f186177c.setVisibility(0);
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(getActivity());
        aVar.setView(this.f186175a).setTitle(this.f186181g).setPositiveButton(getActivity().getString(R.string.lbl_done), this.f186178d);
        return aVar.create();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f186176b.removeCallbacks(null);
        y3.b(this.f186176b);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f186176b.postDelayed(new v.b0(this, 19), 200L);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        if (charSequence != null) {
            String string = charSequence.toString();
            wb0.a aVar = this.f186179e;
            if (aVar != null) {
                int iB = aVar.b(this.f186184j, string);
                if (iB == 0) {
                    this.f186177c.setVisibility(4);
                    return;
                }
                this.f186177c.setText(this.f186179e.a(iB));
                this.f186177c.setTextColor(getContext().getColor(R.color.gcm_text_danger_action));
                this.f186177c.setVisibility(0);
            }
        }
    }
}
