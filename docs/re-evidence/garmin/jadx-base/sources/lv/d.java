package lv;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import dv.l;
import java.util.ArrayList;
import lo.o3;

/* JADX INFO: loaded from: classes7.dex */
public class d extends dv.b implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f115031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f115032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115033d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f115034e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f115035f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f115036g = new a();

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            TextView textView;
            d dVar = d.this;
            if (dVar.getActivity() == null || (textView = (TextView) dVar.getActivity().getCurrentFocus()) == null || textView.length() <= 0) {
                return;
            }
            View viewFocusSearch = textView.focusSearch(66);
            if (viewFocusSearch != null) {
                viewFocusSearch.requestFocus();
            } else {
                ((InputMethodManager) dVar.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
        }
    }

    public interface b {
        void T7(long j8);
    }

    @Override // dv.l
    public final View R() {
        return requireView().findViewById(R.id.device_scanning_image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dv.b, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f115031b = (b) context;
        } catch (ClassCastException unused) {
            i2.f(a2.BIC, "DeviceAntIdInputFragm", context.toString() + " must implement DeviceAntIdInputListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f115032c = arguments.getString("NEXT_BUTTON", "");
            this.f115033d = arguments.getInt("DEVICE_IMAGE", -1);
            this.f115034e = arguments.getLong("LEFT_PEDAL_ID", -1L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm3_bic_device_enter_ant_id, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f115034e == -1) {
            u6(getString(R.string.title_enter_left_pedal_id_number));
        } else {
            u6(getString(R.string.lbl_enter_right_pedal_id));
        }
        m activity = getActivity();
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(2, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        ImageView imageView = (ImageView) view2.findViewById(R.id.device_scanning_image);
        int i14 = this.f115033d;
        if (i14 != -1) {
            imageView.setImageResource(i14);
        }
        ((TextView) view2.findViewById(R.id.device_scanning_info_message)).setText(getString(R.string.vector_pedal_id_instruction));
        v6(R.id.id_1, view2);
        v6(R.id.id_2, view2);
        v6(R.id.id_3, view2);
        v6(R.id.id_4, view2);
        v6(R.id.id_5, view2);
        v6(R.id.id_6, view2);
        v6(R.id.id_7, view2);
        ((EditText) this.f115035f.get(0)).requestFocus();
        Button button = (Button) view2.findViewById(R.id.btn_next);
        if (!TextUtils.isEmpty(this.f115032c)) {
            button.setText(this.f115032c);
        }
        button.setOnClickListener(new js0.d(this, 20));
    }

    public final void v6(int i14, View view2) {
        EditText editText = (EditText) view2.findViewById(i14);
        editText.setFilters(new InputFilter[]{new o3(0, 9), new InputFilter.LengthFilter(1)});
        editText.addTextChangedListener(this.f115036g);
        editText.setOnKeyListener(new c());
        this.f115035f.add(editText);
    }

    public final void w6() {
        new androidx.appcompat.app.e.a(getContext()).setMessage(getString(R.string.lbl_error_title_wrong_number)).setTitle(getString(R.string.dialog_title_error)).setCancelable(true).setPositiveButton(getString(android.R.string.ok), new jm0.c(21)).create().show();
    }
}
