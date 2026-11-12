package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.g7i;
import defpackage.mii;
import defpackage.p3j;
import defpackage.vpi;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2747b;
    public int c;
    public int d;
    public boolean e;
    public SeekBar f;
    public TextView g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f2748k;
    public final View.OnKeyListener l;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.j || !seekBarPreference.e) {
                    seekBarPreference.l(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.m(i + seekBarPreference2.f2747b);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.e = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.e = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f2747b != seekBarPreference.f2746a) {
                seekBarPreference.l(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.h && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.f) == null) {
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2748k = new a();
        this.l = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.L0, i, i2);
        this.f2747b = typedArrayObtainStyledAttributes.getInt(p3j.O0, 0);
        e(typedArrayObtainStyledAttributes.getInt(p3j.M0, 100));
        h(typedArrayObtainStyledAttributes.getInt(p3j.P0, 0));
        this.h = typedArrayObtainStyledAttributes.getBoolean(p3j.N0, true);
        this.i = typedArrayObtainStyledAttributes.getBoolean(p3j.Q0, false);
        this.j = typedArrayObtainStyledAttributes.getBoolean(p3j.R0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e(int i) {
        int i2 = this.f2747b;
        if (i < i2) {
            i = i2;
        }
        if (i != this.c) {
            this.c = i;
            notifyChanged();
        }
    }

    public final void h(int i) {
        if (i != this.d) {
            this.d = Math.min(this.c - this.f2747b, Math.abs(i));
            notifyChanged();
        }
    }

    public void i(int i) {
        k(i, true);
    }

    public final void k(int i, boolean z) {
        int i2 = this.f2747b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.c;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f2746a) {
            this.f2746a = i;
            m(i);
            persistInt(i);
            if (z) {
                notifyChanged();
            }
        }
    }

    public void l(SeekBar seekBar) {
        int progress = this.f2747b + seekBar.getProgress();
        if (progress != this.f2746a) {
            if (callChangeListener(Integer.valueOf(progress))) {
                k(progress, false);
            } else {
                seekBar.setProgress(this.f2746a - this.f2747b);
                m(this.f2746a);
            }
        }
    }

    public void m(int i) {
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        g7iVar.itemView.setOnKeyListener(this.l);
        this.f = (SeekBar) g7iVar.a(vpi.f);
        TextView textView = (TextView) g7iVar.a(vpi.g);
        this.g = textView;
        if (this.i) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.g = null;
        }
        SeekBar seekBar = this.f;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f2748k);
        this.f.setMax(this.c - this.f2747b);
        int i = this.d;
        if (i != 0) {
            this.f.setKeyProgressIncrement(i);
        } else {
            this.d = this.f.getKeyProgressIncrement();
        }
        this.f.setProgress(this.f2746a - this.f2747b);
        m(this.f2746a);
        this.f.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2746a = savedState.f2749a;
        this.f2747b = savedState.f2750b;
        this.c = savedState.c;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f2749a = this.f2746a;
        savedState.f2750b = this.f2747b;
        savedState.c = this.c;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        i(getPersistedInt(((Integer) obj).intValue()));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2750b;
        public int c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2749a = parcel.readInt();
            this.f2750b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2749a);
            parcel.writeInt(this.f2750b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mii.f26217k);
    }
}
