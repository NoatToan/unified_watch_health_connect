package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.cq5;
import defpackage.h2j;
import defpackage.mlq;
import defpackage.u8p;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends u8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateFormat f8681b;
    public final CalendarConstraints c;
    public final String d;
    public final Runnable e;
    public Runnable f;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class RunnableC0216a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f8682a;

        public RunnableC0216a(String str) {
            this.f8682a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = a.this.f8680a;
            DateFormat dateFormat = a.this.f8681b;
            Context context = textInputLayout.getContext();
            textInputLayout.setError(context.getString(h2j.A) + "\n" + String.format(context.getString(h2j.C), this.f8682a) + "\n" + String.format(context.getString(h2j.B), dateFormat.format(new Date(mlq.j().getTimeInMillis()))));
            a.this.e();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f8684a;

        public b(long j) {
            this.f8684a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f8680a.setError(String.format(a.this.d, cq5.c(this.f8684a)));
            a.this.e();
        }
    }

    public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f8681b = dateFormat;
        this.f8680a = textInputLayout;
        this.c = calendarConstraints;
        this.d = textInputLayout.getContext().getString(h2j.F);
        this.e = new RunnableC0216a(str);
    }

    public final Runnable d(long j) {
        return new b(j);
    }

    public abstract void e();

    public abstract void f(Long l);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.u8p, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f8680a.removeCallbacks(this.e);
        this.f8680a.removeCallbacks(this.f);
        this.f8680a.setError(null);
        f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.f8681b.parse(charSequence.toString());
            this.f8680a.setError(null);
            long time = date.getTime();
            if (this.c.g().n(time) && this.c.m(time)) {
                f(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableD = d(time);
            this.f = runnableD;
            g(this.f8680a, runnableD);
        } catch (ParseException unused) {
            g(this.f8680a, this.e);
        }
    }
}
