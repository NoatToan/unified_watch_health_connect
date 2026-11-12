package r22;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class g0 extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f149653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f149654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f149655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f149656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f149657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f149658f;

    public interface a {
        void b(double d14);
    }

    public static g0 u6(double d14, String str, String str2, int i14) {
        g0 g0Var = new g0();
        Bundle bundle = new Bundle();
        bundle.putDouble("default_value", d14);
        bundle.putString("unit_of_measure", str);
        bundle.putString("dialog_title", str2);
        bundle.putInt("value_max_length", i14);
        g0Var.setArguments(bundle);
        return g0Var;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f149654b = arguments != null ? arguments.getDouble("default_value", Double.NaN) : Double.NaN;
        this.f149655c = arguments != null ? arguments.getString("unit_of_measure") : "";
        this.f149656d = arguments != null ? arguments.getString("dialog_title") : "";
        this.f149657e = arguments != null ? arguments.getInt("value_max_length", 0) : 0;
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.edit_text_with_unit_dialog, (ViewGroup) null);
        this.f149653a = (EditText) viewInflate.findViewById(R.id.value_input_edit_text);
        boolean zIsNaN = Double.isNaN(this.f149654b);
        EditText editText = this.f149653a;
        if (zIsNaN) {
            editText.setHint(this.f149656d);
        } else {
            editText.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf((int) this.f149654b)));
        }
        if (this.f149657e != 0) {
            this.f149653a.setFilters(new InputFilter[]{new gg1.l0(6), new InputFilter.LengthFilter(this.f149657e)});
        }
        ((TextView) viewInflate.findViewById(R.id.label_unit_of_measure)).setText(this.f149655c);
        return new androidx.appcompat.app.e.a(getActivity()).setView(viewInflate).setTitle(this.f149656d).setPositiveButton(R.string.lbl_ok, new ng1.c1(this, 20)).create();
    }
}
