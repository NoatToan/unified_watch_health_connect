package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bd.h;
import bd.i;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public boolean O0;
    public SeekBar P0;
    public TextView Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final a U0;
    public final b V0;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i14, boolean z14) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (z14 && (seekBarPreference.T0 || !seekBarPreference.O0)) {
                seekBarPreference.F(seekBar);
                return;
            }
            int i15 = i14 + seekBarPreference.L0;
            TextView textView = seekBarPreference.Q0;
            if (textView != null) {
                textView.setText(String.valueOf(i15));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.O0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.O0 = false;
            if (seekBar.getProgress() + seekBarPreference.L0 != seekBarPreference.K0) {
                seekBarPreference.F(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.R0 && (i14 == 21 || i14 == 22)) || i14 == 23 || i14 == 66 || (seekBar = seekBarPreference.P0) == null) {
                return false;
            }
            return seekBar.onKeyDown(i14, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.U0 = new a();
        this.V0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17517k, i14, i15);
        this.L0 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i16 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i17 = this.L0;
        i16 = i16 < i17 ? i17 : i16;
        if (i16 != this.M0) {
            this.M0 = i16;
            i();
        }
        int i18 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i18 != this.N0) {
            this.N0 = Math.min(this.M0 - this.L0, Math.abs(i18));
            i();
        }
        this.R0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.T0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(int i14, boolean z14) {
        int i15 = this.L0;
        if (i14 < i15) {
            i14 = i15;
        }
        int i16 = this.M0;
        if (i14 > i16) {
            i14 = i16;
        }
        if (i14 != this.K0) {
            this.K0 = i14;
            TextView textView = this.Q0;
            if (textView != null) {
                textView.setText(String.valueOf(i14));
            }
            if (C()) {
                int i17 = ~i14;
                if (C()) {
                    i17 = this.f10148b.d().getInt(this.f10159l, i17);
                }
                if (i14 != i17) {
                    SharedPreferences.Editor editorC = this.f10148b.c();
                    editorC.putInt(this.f10159l, i14);
                    if (!this.f10148b.f17492e) {
                        editorC.apply();
                    }
                }
            }
            if (z14) {
                i();
            }
        }
    }

    public final void F(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.L0;
        if (progress != this.K0) {
            if (a(Integer.valueOf(progress))) {
                E(progress, false);
                return;
            }
            seekBar.setProgress(this.K0 - this.L0);
            int i14 = this.K0;
            TextView textView = this.Q0;
            if (textView != null) {
                textView.setText(String.valueOf(i14));
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void m(h hVar) {
        super.m(hVar);
        hVar.itemView.setOnKeyListener(this.V0);
        this.P0 = (SeekBar) hVar.d(R.id.seekbar);
        TextView textView = (TextView) hVar.d(R.id.seekbar_value);
        this.Q0 = textView;
        if (this.S0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.Q0 = null;
        }
        SeekBar seekBar = this.P0;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.U0);
        this.P0.setMax(this.M0 - this.L0);
        int i14 = this.N0;
        SeekBar seekBar2 = this.P0;
        if (i14 != 0) {
            seekBar2.setKeyProgressIncrement(i14);
        } else {
            this.N0 = seekBar2.getKeyProgressIncrement();
        }
        this.P0.setProgress(this.K0 - this.L0);
        int i15 = this.K0;
        TextView textView2 = this.Q0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i15));
        }
        this.P0.setEnabled(h());
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i14) {
        return Integer.valueOf(typedArray.getInt(i14, 0));
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.q(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.q(cVar.getSuperState());
        this.K0 = cVar.f10178a;
        this.L0 = cVar.f10179b;
        this.M0 = cVar.f10180c;
        i();
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f10166t) {
            return absSavedState;
        }
        c cVar = new c(absSavedState);
        cVar.f10178a = this.K0;
        cVar.f10179b = this.L0;
        cVar.f10180c = this.M0;
        return cVar;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (C()) {
            iIntValue = this.f10148b.d().getInt(this.f10159l, iIntValue);
        }
        E(iIntValue, true);
    }

    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10180c;

        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f10178a = parcel.readInt();
            this.f10179b = parcel.readInt();
            this.f10180c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f10178a);
            parcel.writeInt(this.f10179b);
            parcel.writeInt(this.f10180c);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context) {
        this(context, null);
    }
}
