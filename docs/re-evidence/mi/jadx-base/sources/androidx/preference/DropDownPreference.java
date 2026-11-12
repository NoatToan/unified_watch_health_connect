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
import defpackage.g7i;
import defpackage.mii;
import defpackage.vpi;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context l;
    public final ArrayAdapter m;
    public Spinner n;
    public final AdapterView.OnItemSelectedListener o;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String string = DropDownPreference.this.r()[i].toString();
                if (string.equals(DropDownPreference.this.s()) || !DropDownPreference.this.callChangeListener(string)) {
                    return;
                }
                DropDownPreference.this.w(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mii.c);
    }

    private int y(String str) {
        CharSequence[] charSequenceArrR = r();
        if (str == null || charSequenceArrR == null) {
            return -1;
        }
        for (int length = charSequenceArrR.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArrR[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    public void notifyChanged() {
        super.notifyChanged();
        ArrayAdapter arrayAdapter = this.m;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        Spinner spinner = (Spinner) g7iVar.itemView.findViewById(vpi.h);
        this.n = spinner;
        spinner.setAdapter((SpinnerAdapter) this.m);
        this.n.setOnItemSelectedListener(this.o);
        this.n.setSelection(y(s()));
        super.onBindViewHolder(g7iVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void onClick() {
        this.n.performClick();
    }

    public ArrayAdapter x() {
        return new ArrayAdapter(this.l, R.layout.simple_spinner_dropdown_item);
    }

    public final void z() {
        this.m.clear();
        if (o() != null) {
            for (CharSequence charSequence : o()) {
                this.m.add(charSequence.toString());
            }
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.o = new a();
        this.l = context;
        this.m = x();
        z();
    }
}
