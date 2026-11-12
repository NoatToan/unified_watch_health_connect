package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ayq;
import defpackage.cq5;
import defpackage.d4f;
import defpackage.e8f;
import defpackage.h2j;
import defpackage.iqi;
import defpackage.kwi;
import defpackage.mlq;
import defpackage.njh;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r9h;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<njh<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8678b = " ";
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Long f = null;

    public class a extends com.google.android.material.datepicker.a {
        public final /* synthetic */ TextInputLayout g;
        public final /* synthetic */ TextInputLayout h;
        public final /* synthetic */ r9h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r9h r9hVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.g = textInputLayout2;
            this.h = textInputLayout3;
            this.i = r9hVar;
        }

        @Override // com.google.android.material.datepicker.a
        public void e() {
            RangeDateSelector.this.e = null;
            RangeDateSelector.this.k(this.g, this.h, this.i);
        }

        @Override // com.google.android.material.datepicker.a
        public void f(Long l) {
            RangeDateSelector.this.e = l;
            RangeDateSelector.this.k(this.g, this.h, this.i);
        }
    }

    public class b extends com.google.android.material.datepicker.a {
        public final /* synthetic */ TextInputLayout g;
        public final /* synthetic */ TextInputLayout h;
        public final /* synthetic */ r9h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r9h r9hVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.g = textInputLayout2;
            this.h = textInputLayout3;
            this.i = r9hVar;
        }

        @Override // com.google.android.material.datepicker.a
        public void e() {
            RangeDateSelector.this.f = null;
            RangeDateSelector.this.k(this.g, this.h, this.i);
        }

        @Override // com.google.android.material.datepicker.a
        public void f(Long l) {
            RangeDateSelector.this.f = l;
            RangeDateSelector.this.k(this.g, this.h, this.i);
        }
    }

    public class c implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.c = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.d = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean J() {
        Long l = this.c;
        return (l == null || this.d == null || !i(l.longValue(), this.d.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> K() {
        ArrayList arrayList = new ArrayList();
        Long l = this.c;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.d;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void O(long j) {
        Long l = this.c;
        if (l == null) {
            this.c = Long.valueOf(j);
        } else if (this.d == null && i(l.longValue(), j)) {
            this.d = Long.valueOf(j);
        } else {
            this.d = null;
            this.c = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r9h<njh<Long, Long>> r9hVar) {
        View viewInflate = layoutInflater.inflate(kwi.I, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(iqi.T);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(iqi.S);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (d4f.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f8677a = viewInflate.getResources().getString(h2j.D);
        SimpleDateFormat simpleDateFormatF = mlq.f();
        Long l = this.c;
        if (l != null) {
            editText.setText(simpleDateFormatF.format(l));
            this.e = this.c;
        }
        Long l2 = this.d;
        if (l2 != null) {
            editText2.setText(simpleDateFormatF.format(l2));
            this.f = this.d;
        }
        String strG = mlq.g(viewInflate.getResources(), simpleDateFormatF);
        textInputLayout.setPlaceholderText(strG);
        textInputLayout2.setPlaceholderText(strG);
        editText.addTextChangedListener(new a(strG, simpleDateFormatF, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, r9hVar));
        editText2.addTextChangedListener(new b(strG, simpleDateFormatF, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, r9hVar));
        ayq.o(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int b(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return e8f.d(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(pmi.b0) ? pii.G : pii.E, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void g(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f8677a.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String g0(Context context) {
        Resources resources = context.getResources();
        Long l = this.c;
        if (l == null && this.d == null) {
            return resources.getString(h2j.J);
        }
        Long l2 = this.d;
        if (l2 == null) {
            return resources.getString(h2j.H, cq5.c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(h2j.G, cq5.c(l2.longValue()));
        }
        njh<String, String> njhVarA = cq5.a(l, l2);
        return resources.getString(h2j.I, njhVarA.f27979a, njhVarA.f27980b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public njh<Long, Long> M() {
        return new njh<>(this.c, this.d);
    }

    public final boolean i(long j, long j2) {
        return j <= j2;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<njh<Long, Long>> i0() {
        if (this.c == null || this.d == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new njh(this.c, this.d));
        return arrayList;
    }

    public final void j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f8677a);
        textInputLayout2.setError(" ");
    }

    public final void k(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, r9h<njh<Long, Long>> r9hVar) {
        Long l = this.e;
        if (l == null || this.f == null) {
            g(textInputLayout, textInputLayout2);
            r9hVar.a();
        } else if (!i(l.longValue(), this.f.longValue())) {
            j(textInputLayout, textInputLayout2);
            r9hVar.a();
        } else {
            this.c = this.e;
            this.d = this.f;
            r9hVar.b(M());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
    }
}
