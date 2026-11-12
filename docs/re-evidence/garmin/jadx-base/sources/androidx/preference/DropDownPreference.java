package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bd.h;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter V0;
    public Spinner W0;
    public final a X0;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
            if (i14 >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String string = dropDownPreference.R0[i14].toString();
                if (string.equals(dropDownPreference.S0) || !dropDownPreference.a(string)) {
                    return;
                }
                dropDownPreference.F(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.X0 = new a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.V0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.Q0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        ArrayAdapter arrayAdapter = this.V0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void m(h hVar) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) hVar.itemView.findViewById(com.garmin.android.apps.connectmobile.R.id.spinner);
        this.W0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.V0);
        this.W0.setOnItemSelectedListener(this.X0);
        Spinner spinner2 = this.W0;
        String str = this.S0;
        if (str == null || (charSequenceArr = this.R0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.m(hVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void n() {
        this.W0.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public DropDownPreference(Context context) {
        this(context, null);
    }
}
