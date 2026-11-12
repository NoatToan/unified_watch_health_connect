package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.dti;
import defpackage.e6n;
import defpackage.eii;
import defpackage.g6n;
import defpackage.g7i;
import defpackage.gwi;
import defpackage.n5j;
import defpackage.p5q;
import defpackage.s6g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import miuix.appcompat.widget.Spinner;
import miuix.flexible.view.HyperCellLayout;

/* JADX INFO: loaded from: classes3.dex */
public class DropDownPreference extends BasePreference {
    public static final Class<?>[] t = {Context.class, AttributeSet.class};
    public static final CharSequence[] u = new CharSequence[0];
    public ArrayAdapter e;
    public ArrayAdapter f;
    public String g;
    public boolean h;
    public Spinner i;
    public CharSequence[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f26808k;
    public Drawable[] l;
    public g7i m;
    public boolean n;
    public float o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f26809r;
    public final AdapterView.OnItemSelectedListener s;

    public class a implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: miuix.preference.DropDownPreference$a$a, reason: collision with other inner class name */
        public class RunnableC1035a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26812a;

            public RunnableC1035a(String str) {
                this.f26812a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f26812a.equals(DropDownPreference.this.z()) || !DropDownPreference.this.callChangeListener(this.f26812a)) {
                    return;
                }
                DropDownPreference.this.H(this.f26812a);
            }
        }

        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DropDownPreference.this.J(i);
            if (i < 0 || i >= DropDownPreference.this.f26808k.length) {
                return;
            }
            DropDownPreference.this.f26809r.post(new RunnableC1035a((String) DropDownPreference.this.f26808k[i]));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownPreference.this.e.notifyDataSetChanged();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g7i f26815a;

        public c(g7i g7iVar) {
            this.f26815a = g7iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownPreference.this.I(this.f26815a);
            DropDownPreference.this.i.setOnItemSelectedListener(DropDownPreference.this.s);
        }
    }

    public class d implements Spinner.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g7i f26817a;

        public d(g7i g7iVar) {
            this.f26817a = g7iVar;
        }

        @Override // miuix.appcompat.widget.Spinner.h
        public void a() {
            this.f26817a.itemView.setActivated(false);
        }
    }

    public class e implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g7i f26819a;

        public e(g7i g7iVar) {
            this.f26819a = g7iVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                view.setPressed(true);
            }
            if (motionEvent.getAction() == 1) {
                this.f26819a.itemView.setActivated(true);
                if (DropDownPreference.this.i != null) {
                    DropDownPreference.this.i.performClick();
                    DropDownPreference.this.i.setActivated(false);
                }
                TextView textView = (TextView) this.f26819a.itemView.findViewById(R.id.title);
                if (textView != null) {
                    textView.setActivated(false);
                }
                TextView textView2 = (TextView) this.f26819a.itemView.findViewById(R.id.summary);
                if (textView2 != null) {
                    textView2.setActivated(false);
                }
            }
            return false;
        }
    }

    public static class f extends g6n {
        public CharSequence[] g;

        public f(Context context, AttributeSet attributeSet, int i, int i2) {
            int[] iArr;
            super(context, 0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.h0, i, i2);
            this.f18653a = p5q.q(typedArrayObtainStyledAttributes, n5j.k0, 0);
            this.g = p5q.q(typedArrayObtainStyledAttributes, n5j.n0, 0);
            this.f18654b = p5q.q(typedArrayObtainStyledAttributes, n5j.m0, 0);
            this.e = p5q.b(typedArrayObtainStyledAttributes, n5j.o0, 0, false);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(n5j.l0, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId > 0) {
                TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                iArr = new int[typedArrayObtainTypedArray.length()];
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    iArr[i3] = typedArrayObtainTypedArray.getResourceId(i3, 0);
                }
                typedArrayObtainTypedArray.recycle();
            } else {
                iArr = null;
            }
            h(iArr);
        }

        public CharSequence[] k() {
            return this.g;
        }

        public void l(CharSequence[] charSequenceArr) {
            this.g = charSequenceArr;
        }
    }

    public static class g implements e6n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DropDownPreference f26821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayAdapter f26822b;

        public g(DropDownPreference dropDownPreference, ArrayAdapter arrayAdapter) {
            this.f26821a = dropDownPreference;
            this.f26822b = arrayAdapter;
        }

        @Override // e6n.c
        public boolean a(int i) {
            if (i >= this.f26821a.f26808k.length || i < 0) {
                return false;
            }
            return TextUtils.equals(this.f26821a.z(), this.f26821a.f26808k[i]);
        }
    }

    public DropDownPreference(Context context) {
        this(context, null);
    }

    public final ArrayAdapter A(Context context, AttributeSet attributeSet, String str) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(ArrayAdapter.class).getConstructor(t);
            constructor.setAccessible(true);
            return (ArrayAdapter) constructor.newInstance(context, attributeSet);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Can't find Adapter: " + str, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e3);
        } catch (InstantiationException e4) {
            e = e4;
            throw new IllegalStateException("Could not instantiate the Adapter: " + str, e);
        } catch (NoSuchMethodException e5) {
            throw new IllegalStateException("Error creating Adapter " + str, e5);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new IllegalStateException("Could not instantiate the Adapter: " + str, e);
        }
    }

    public final void B(g7i g7iVar) {
        View view;
        if (g7iVar == null || (view = g7iVar.itemView) == null || !(view instanceof HyperCellLayout) || !this.n) {
            return;
        }
        Context context = getContext();
        int i = gwi.f19400a;
        ArrayAdapter arrayAdapter = this.f;
        this.e = new e6n(context, i, arrayAdapter, new g(this, arrayAdapter));
    }

    public void C(boolean z) {
        this.p = z;
    }

    public void D(CharSequence[] charSequenceArr) {
        this.j = charSequenceArr;
        ArrayAdapter arrayAdapter = this.f;
        if (arrayAdapter instanceof f) {
            ((f) arrayAdapter).g(charSequenceArr);
        } else {
            arrayAdapter.clear();
            this.f.addAll(charSequenceArr);
            this.f26808k = this.j;
        }
        Spinner spinner = this.i;
        if (spinner != null) {
            spinner.setSelection(y(z()));
        }
        notifyChanged();
    }

    public void E(Drawable[] drawableArr) {
        ArrayAdapter arrayAdapter = this.f;
        if (arrayAdapter instanceof f) {
            ((f) arrayAdapter).i(drawableArr);
            this.l = ((f) this.f).c();
        }
        notifyChanged();
    }

    public void F(CharSequence[] charSequenceArr) {
        ArrayAdapter arrayAdapter = this.f;
        if (arrayAdapter instanceof f) {
            ((f) arrayAdapter).l(charSequenceArr);
            this.e.notifyDataSetChanged();
            this.f26808k = charSequenceArr;
        }
    }

    public void G(CharSequence[] charSequenceArr) {
        ArrayAdapter arrayAdapter = this.f;
        if (arrayAdapter instanceof f) {
            ((f) arrayAdapter).j(charSequenceArr);
            notifyChanged();
        }
    }

    public void H(String str) {
        boolean z = !TextUtils.equals(this.g, str);
        if (z || !this.h) {
            this.g = str;
            this.h = true;
            persistString(str);
            if (z) {
                notifyChanged();
            }
        }
    }

    public final void I(g7i g7iVar) {
        View view;
        TextView textView;
        if (g7iVar == null || (view = g7iVar.itemView) == null || !(view instanceof HyperCellLayout) || !this.n || (textView = (TextView) view.findViewById(R.id.text1)) == null) {
            return;
        }
        textView.setText((CharSequence) this.i.getSelectedItem());
    }

    public final void J(int i) {
        View view;
        CharSequence[] charSequenceArr;
        g7i g7iVar = this.m;
        if (g7iVar == null || (view = g7iVar.itemView) == null || !(view instanceof HyperCellLayout) || !this.n) {
            return;
        }
        CharSequence charSequence = (i < 0 || (charSequenceArr = this.j) == null || i >= charSequenceArr.length) ? null : charSequenceArr[i];
        TextView textView = (TextView) view.findViewById(R.id.text1);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.preference.Preference
    public void notifyChanged() {
        super.notifyChanged();
        if (this.e != null) {
            this.f26809r.post(new b());
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.n = s6g.f(getContext()) == 2;
        int layoutResource = getLayoutResource();
        int i = gwi.c;
        if (layoutResource == i || layoutResource == gwi.f19401b) {
            if (this.n) {
                i = gwi.f19401b;
            }
            setLayoutResource(i);
        }
    }

    @Override // miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        this.m = g7iVar;
        this.n = s6g.f(getContext()) == 2;
        if (this.e.getCount() > 0) {
            this.i = (Spinner) g7iVar.itemView.findViewById(dti.m);
            B(g7iVar);
            this.i.setImportantForAccessibility(2);
            x(this.i);
            this.i.setAdapter((SpinnerAdapter) this.e);
            this.i.setOnItemSelectedListener(null);
            this.i.setSelection(y(z()));
            this.i.post(new c(g7iVar));
            this.i.setOnSpinnerDismissListener(new d(g7iVar));
            if (this.p) {
                Spinner spinner = this.i;
                spinner.setWindowManagerFlags(2 | spinner.getWindowManagerFlag());
            } else {
                Spinner spinner2 = this.i;
                spinner2.setWindowManagerFlags(spinner2.getWindowManagerFlag() & (-3));
            }
            float f2 = this.o;
            if (f2 != Float.MAX_VALUE) {
                this.i.setDimAmount(f2);
            }
        }
        g7iVar.itemView.setOnTouchListener(new e(g7iVar));
        super.onBindViewHolder(g7iVar);
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        H(savedState.f26810a);
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f26810a = z();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        H(getPersistedString((String) obj));
    }

    @Override // androidx.preference.Preference
    public void performClick(View view) {
        Spinner spinner = this.i;
        if (spinner != null) {
            spinner.performClick();
        }
    }

    public final void u() {
        ArrayAdapter arrayAdapter = this.f;
        if (arrayAdapter instanceof f) {
            this.j = ((f) arrayAdapter).a();
            this.f26808k = ((f) this.f).k();
            this.l = ((f) this.f).c();
            return;
        }
        int count = arrayAdapter.getCount();
        this.j = new CharSequence[this.f.getCount()];
        for (int i = 0; i < count; i++) {
            this.j[i] = this.f.getItem(i).toString();
        }
        this.f26808k = this.j;
        this.l = null;
    }

    public ArrayAdapter w() {
        Context context = getContext();
        ArrayAdapter arrayAdapter = this.f;
        return new e6n(context, arrayAdapter, new g(this, arrayAdapter));
    }

    public final void x(Spinner spinner) {
        spinner.setClickable(false);
        spinner.setLongClickable(false);
        spinner.setContextClickable(false);
    }

    public final int y(String str) {
        if (this.f26808k == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f26808k;
            if (i >= charSequenceArr.length) {
                return -1;
            }
            if (TextUtils.equals(charSequenceArr[i], str)) {
                return i;
            }
            i++;
        }
    }

    public String z() {
        return this.g;
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26810a;

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
            this.f26810a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f26810a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.f);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = true;
        this.q = false;
        this.f26809r = new Handler();
        this.s = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.h0, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(n5j.i0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(n5j.j0, true);
        this.q = typedArrayObtainStyledAttributes.getBoolean(n5j.o0, false);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f = A(context, attributeSet, string);
        } else {
            this.f = new f(context, attributeSet, i, i2);
        }
        this.e = w();
        u();
        C(z);
    }
}
