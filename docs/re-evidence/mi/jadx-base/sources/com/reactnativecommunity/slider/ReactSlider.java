package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class ReactSlider extends AppCompatSeekBar {
    public static int g = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f10531b;
    public double c;
    public double d;
    public double e;
    public double f;

    public class a implements Callable<BitmapDrawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10532a;

        public a(String str) {
            this.f10532a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitmapDrawable call() {
            Bitmap bitmapDecodeStream;
            try {
                if (this.f10532a.startsWith("http://") || this.f10532a.startsWith("https://") || this.f10532a.startsWith("file://") || this.f10532a.startsWith("asset://") || this.f10532a.startsWith("data:")) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(new URL(this.f10532a).openStream());
                } else {
                    bitmapDecodeStream = BitmapFactory.decodeResource(ReactSlider.this.getResources(), ReactSlider.this.getResources().getIdentifier(this.f10532a, "drawable", ReactSlider.this.getContext().getPackageName()));
                }
                return new BitmapDrawable(ReactSlider.this.getResources(), bitmapDecodeStream);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public ReactSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10531b = 0.0d;
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
        a();
    }

    private void a() {
    }

    private void d() {
        if (this.e == 0.0d) {
            this.f = (this.c - this.f10531b) / ((double) g);
        }
        setMax(getTotalSteps());
        e();
    }

    private void e() {
        double d = this.d;
        double d2 = this.f10531b;
        setProgress((int) Math.round(((d - d2) / (this.c - d2)) * ((double) getTotalSteps())));
    }

    private double getStepValue() {
        double d = this.e;
        return d > 0.0d ? d : this.f;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.c - this.f10531b) / getStepValue());
    }

    public final BitmapDrawable b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new a(str)).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public double c(int i) {
        return i == getMax() ? this.c : (((double) i) * getStepValue()) + this.f10531b;
    }

    public void setMaxValue(double d) {
        this.c = d;
        d();
    }

    public void setMinValue(double d) {
        this.f10531b = d;
        d();
    }

    public void setStep(double d) {
        this.e = d;
        d();
    }

    public void setThumbImage(String str) {
        if (str == null) {
            setThumb(getThumb());
        } else {
            setThumb(b(str));
            setSplitTrack(false);
        }
    }

    public void setValue(double d) {
        this.d = d;
        e();
    }
}
