package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class TimeView extends TextView {
    public static final long e = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TimeZone f12045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleDateFormat f12046b;
    public final Handler c;
    public final Runnable d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimeView.this.c();
        }
    }

    public TimeView(Context context) {
        super(context);
        this.f12045a = TimeZone.getDefault();
        this.f12046b = new SimpleDateFormat(TimeUtils.FORMAT_H_M, Locale.US);
        this.c = new Handler();
        this.d = new a();
    }

    public final String b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(!DateFormat.is24HourFormat(getContext()) ? "hh:mm" : TimeUtils.FORMAT_H_M, Locale.getDefault());
        simpleDateFormat.setTimeZone(this.f12045a);
        return simpleDateFormat.format(new Date(j));
    }

    public final void c() {
        d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e(jCurrentTimeMillis);
        long j = e;
        this.c.postDelayed(this.d, j - (jCurrentTimeMillis % j));
    }

    public final void d() {
        this.c.removeCallbacks(this.d);
    }

    public final void e(long j) {
        setText(b(j));
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            c();
        } else {
            d();
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        this.f12045a = timeZone;
    }

    public TimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12045a = TimeZone.getDefault();
        this.f12046b = new SimpleDateFormat(TimeUtils.FORMAT_H_M, Locale.US);
        this.c = new Handler();
        this.d = new a();
    }

    public TimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12045a = TimeZone.getDefault();
        this.f12046b = new SimpleDateFormat(TimeUtils.FORMAT_H_M, Locale.US);
        this.c = new Handler();
        this.d = new a();
    }
}
