package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class EditTextPicker extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f47403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Number f47405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f47406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NumberPicker f47407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EditText f47408f;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int length = editable.length();
            EditTextPicker editTextPicker = EditTextPicker.this;
            if (length <= 0) {
                editTextPicker.f47405c = 0;
                return;
            }
            try {
                Class cls = editTextPicker.f47406d;
                if (cls == Integer.class) {
                    editTextPicker.f47405c = Integer.valueOf(editable.toString());
                    return;
                }
                if (cls == Float.class) {
                    editTextPicker.f47405c = Float.valueOf(editable.toString());
                } else if (cls == Long.class) {
                    editTextPicker.f47405c = Long.valueOf(editable.toString());
                } else {
                    editTextPicker.f47405c = Double.valueOf(editable.toString());
                }
            } catch (NumberFormatException unused) {
                editTextPicker.f47405c = 0;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    public class b implements NumberPicker.OnValueChangeListener {
        public b() {
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
            EditTextPicker editTextPicker = EditTextPicker.this;
            editTextPicker.f47404b = i15;
            c cVar = editTextPicker.f47403a;
            if (cVar != null) {
                cVar.a(editTextPicker, i15, editTextPicker.f47405c);
            }
        }
    }

    public interface c {
        void a(EditTextPicker editTextPicker, int i14, Number number);
    }

    public EditTextPicker(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.gcm_text_view_picker, (ViewGroup) this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.first_number);
        this.f47407e = numberPicker;
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        this.f47408f = editText;
        this.f47406d = Double.class;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
        editText.addTextChangedListener(new a());
        numberPicker.setOnValueChangedListener(new b());
    }

    public final void a(int i14, Number number) {
        this.f47404b = i14;
        this.f47407e.setValue(i14);
        this.f47405c = number;
        Class<?> cls = number.getClass();
        this.f47406d = cls;
        EditText editText = this.f47408f;
        if (cls == Integer.class) {
            editText.setText(String.valueOf(this.f47405c.intValue()));
            editText.setInputType(2);
        } else if (cls == Float.class) {
            editText.setText(String.valueOf(this.f47405c.floatValue()));
        } else if (cls != Long.class) {
            editText.setText(String.valueOf(this.f47405c.doubleValue()));
        } else {
            editText.setText(String.valueOf(this.f47405c.longValue()));
            editText.setInputType(2);
        }
    }

    public EditText getEditTextNumber() {
        return this.f47408f;
    }

    public Number getEditTextValue() {
        return this.f47405c;
    }

    public NumberPicker getFirstPicker() {
        return this.f47407e;
    }

    public int getFirstValue() {
        return this.f47404b;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        a(dVar.f47411a, dVar.f47412b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Class cls = this.f47406d;
        int i14 = 0;
        EditText editText = this.f47408f;
        if (cls == Integer.class) {
            return new d(parcelableOnSaveInstanceState, this.f47404b, Integer.valueOf(editText.getText().toString()), i14);
        }
        if (cls == Float.class) {
            return new d(parcelableOnSaveInstanceState, this.f47404b, Float.valueOf(editText.getText().toString()), i14);
        }
        return cls == Long.class ? new d(parcelableOnSaveInstanceState, this.f47404b, Long.valueOf(editText.getText().toString()), i14) : new d(parcelableOnSaveInstanceState, this.f47404b, Double.valueOf(editText.getText().toString()), i14);
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        this.f47407e.setEnabled(z14);
    }

    public void setOnFieldChangeListener(c cVar) {
        this.f47403a = cVar;
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Number f47412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f47413c;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel, 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f47411a = parcel.readInt();
            Class cls = (Class) parcel.readSerializable();
            this.f47413c = cls;
            if (cls == Integer.class) {
                this.f47412b = Integer.valueOf(parcel.readInt());
                return;
            }
            if (cls == Float.class) {
                this.f47412b = Float.valueOf(parcel.readFloat());
            } else if (cls == Long.class) {
                this.f47412b = Long.valueOf(parcel.readLong());
            } else {
                this.f47412b = Double.valueOf(parcel.readDouble());
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f47411a);
            Class cls = this.f47413c;
            parcel.writeSerializable(cls);
            Number number = this.f47412b;
            if (cls == Integer.class) {
                parcel.writeInt(number.intValue());
                return;
            }
            if (cls == Float.class) {
                parcel.writeFloat(number.floatValue());
            } else if (cls == Long.class) {
                parcel.writeLong(number.longValue());
            } else {
                parcel.writeDouble(number.doubleValue());
            }
        }

        public /* synthetic */ d(Parcelable parcelable, int i14, Number number, int i15) {
            this(parcelable, i14, number);
        }

        public /* synthetic */ d(Parcel parcel, int i14) {
            this(parcel);
        }

        private d(Parcelable parcelable, int i14, Number number) {
            super(parcelable);
            this.f47411a = i14;
            this.f47412b = number;
            this.f47413c = number.getClass();
        }
    }

    public EditTextPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditTextPicker(Context context) {
        this(context, null);
    }
}
