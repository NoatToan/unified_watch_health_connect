package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import defpackage.njh;
import defpackage.r9h;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    boolean J();

    Collection<Long> K();

    S M();

    void O(long j);

    View Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r9h<S> r9hVar);

    int b(Context context);

    String g0(Context context);

    Collection<njh<Long, Long>> i0();
}
