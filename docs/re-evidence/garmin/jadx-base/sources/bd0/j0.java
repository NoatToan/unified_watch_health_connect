package bd0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class j0 extends androidx.appcompat.app.e.a implements DialogInterface.OnClickListener, TextWatcher, DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f17581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.app.e f17583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f17584d;

    public interface a {
        void a();

        void b(String str);

        void onCancel();
    }

    @SuppressLint({"InflateParams"})
    public j0(Context context, String str, int i14, a aVar) {
        super(context);
        this.f17581a = null;
        this.f17582b = null;
        this.f17583c = null;
        this.f17584d = null;
        this.f17584d = new i0(this, i14 * 1000, 1000L);
        this.f17582b = aVar;
        setCancelable(false);
        setTitle(R.string.lbl_device_setup);
        setMessage(context.getString(R.string.pairing_gdi_authentication_enter_number, TextUtils.isEmpty(str) ? "" : str));
        setPositiveButton(R.string.lbl_done, this);
        setNegativeButton(R.string.lbl_cancel, this);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_prompt_enter_device_passkey, (ViewGroup) null);
        this.f17581a = (EditText) viewInflate.findViewById(R.id.device_passkey_input);
        setView(viewInflate);
        androidx.appcompat.app.e eVarCreate = create();
        this.f17583c = eVarCreate;
        eVarCreate.setOnShowListener(this);
        eVarCreate.show();
    }

    public final void a() {
        i0 i0Var = this.f17584d;
        if (i0Var != null) {
            i0Var.cancel();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        a();
        dialogInterface.dismiss();
        a aVar = this.f17582b;
        if (i14 != -1) {
            aVar.onCancel();
        } else {
            aVar.b(this.f17581a.getText().toString());
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.f17583c.e(-1).setEnabled(false);
        EditText editText = this.f17581a;
        editText.addTextChangedListener(this);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 1);
        this.f17584d.start();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        this.f17583c.e(-1).setEnabled(charSequence.length() == 6);
    }
}
