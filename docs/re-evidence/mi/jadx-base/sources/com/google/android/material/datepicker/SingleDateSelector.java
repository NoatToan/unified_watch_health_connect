package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import defpackage.r9h;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f8679a;

    public class a extends com.google.android.material.datepicker.a {
        public final /* synthetic */ r9h g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, r9h r9hVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.g = r9hVar;
        }

        @Override // com.google.android.material.datepicker.a
        public void e() {
            this.g.a();
        }

        @Override // com.google.android.material.datepicker.a
        public void f(Long l) {
            if (l == null) {
                SingleDateSelector.this.d();
            } else {
                SingleDateSelector.this.O(l.longValue());
            }
            this.g.b(SingleDateSelector.this.M());
        }
    }

    public class b implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f8679a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean J() {
        return this.f8679a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> K() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f8679a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void O(long j) {
        this.f8679a = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r9h<Long> r9hVar) {
        View viewInflate = layoutInflater.inflate(kwi.H, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(iqi.R);
        EditText editText = textInputLayout.getEditText();
        if (d4f.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatF = mlq.f();
        String strG = mlq.g(viewInflate.getResources(), simpleDateFormatF);
        textInputLayout.setPlaceholderText(strG);
        Long l = this.f8679a;
        if (l != null) {
            editText.setText(simpleDateFormatF.format(l));
        }
        editText.addTextChangedListener(new a(strG, simpleDateFormatF, textInputLayout, calendarConstraints, r9hVar));
        ayq.o(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int b(Context context) {
        return e8f.d(context, pii.G, MaterialDatePicker.class.getCanonicalName());
    }

    public final void d() {
        this.f8679a = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long M() {
        return this.f8679a;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String g0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f8679a;
        if (l == null) {
            return resources.getString(h2j.y);
        }
        return resources.getString(h2j.x, cq5.j(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<njh<Long, Long>> i0() {
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f8679a);
    }
}
