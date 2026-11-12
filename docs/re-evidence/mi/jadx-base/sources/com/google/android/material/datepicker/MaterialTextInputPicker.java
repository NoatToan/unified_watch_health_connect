package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import defpackage.dwh;
import defpackage.r9h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialTextInputPicker<S> extends dwh<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8673b;
    public DateSelector<S> c;
    public CalendarConstraints d;

    public class a extends r9h<S> {
        public a() {
        }

        @Override // defpackage.r9h
        public void a() {
            Iterator<r9h<S>> it = MaterialTextInputPicker.this.f15991a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // defpackage.r9h
        public void b(S s) {
            Iterator<r9h<S>> it = MaterialTextInputPicker.this.f15991a.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    public static <T> MaterialTextInputPicker<T> u(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8673b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.c.Q(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f8673b)), viewGroup, bundle, this.d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f8673b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
    }
}
