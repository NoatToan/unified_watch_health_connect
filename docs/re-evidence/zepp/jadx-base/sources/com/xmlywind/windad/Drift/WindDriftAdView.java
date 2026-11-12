package com.xmlywind.windad.Drift;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.ad.Constants;
import com.xmlywind.sdk.a.a;
import com.xmlywind.sdk.a.b;
import com.xmlywind.sdk.base.views.GifImageView;
import com.xmlywind.sdk.common.utils.c;
import com.xmlywind.sdk.common.utils.d;
import com.xmlywind.sdk.common.utils.r;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.WindAdError;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public final class WindDriftAdView extends RelativeLayout {
    public WindDriftAdListener a;
    private final Handler b;
    private b c;
    private GifImageView d;
    private String e;
    private boolean f;

    public class DriftAdListener implements a {
        private DriftAdListener() {
        }

        @Override // com.xmlywind.sdk.a.a
        public void onDriftAdClose(final String str) {
            WindDriftAdView.this.b.post(new Runnable() { // from class: com.xmlywind.windad.Drift.WindDriftAdView.DriftAdListener.4
                @Override // java.lang.Runnable
                public void run() {
                    WindDriftAdListener windDriftAdListener = WindDriftAdView.this.a;
                    if (windDriftAdListener != null) {
                        windDriftAdListener.onDriftAdClosed(str);
                    }
                }
            });
        }

        @Override // com.xmlywind.sdk.a.a
        public void onDriftAdError(int i, String str, String str2) {
            WindDriftAdListener windDriftAdListener;
            if (WindDriftAdView.this.f || (windDriftAdListener = WindDriftAdView.this.a) == null) {
                return;
            }
            windDriftAdListener.onDriftAdError(new WindAdAdapterError(i, str), str2);
        }

        @Override // com.xmlywind.sdk.a.a
        public void onDriftAdPresent(final String str) {
            WindDriftAdView.this.f = true;
            WindDriftAdView.this.c.c();
            WindDriftAdView.this.b.post(new Runnable() { // from class: com.xmlywind.windad.Drift.WindDriftAdView.DriftAdListener.3
                @Override // java.lang.Runnable
                public void run() {
                    WindDriftAdListener windDriftAdListener = WindDriftAdView.this.a;
                    if (windDriftAdListener != null) {
                        windDriftAdListener.onDriftAdExposure(str);
                    }
                }
            });
        }

        @Override // com.xmlywind.sdk.a.a
        public void onDriftAdReceive(final String str) {
            Handler handler;
            Runnable runnable;
            File fileB = WindDriftAdView.this.c.b();
            if (fileB != null) {
                if (fileB.getName().substring(fileB.getName().lastIndexOf(".") + 1).equalsIgnoreCase(Constants.GIF_PATH)) {
                    WindDriftAdView.this.d.setMovie(Movie.decodeByteArray(d.e(fileB.getAbsolutePath()), 0, d.e(fileB.getAbsolutePath()).length));
                } else {
                    WindDriftAdView.this.d.setImageBitmap(BitmapFactory.decodeFile(fileB.getAbsolutePath()));
                }
                WindDriftAdView.this.setVisibility(0);
                if (WindDriftAdView.this.f) {
                    return;
                }
                handler = WindDriftAdView.this.b;
                runnable = new Runnable() { // from class: com.xmlywind.windad.Drift.WindDriftAdView.DriftAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        WindDriftAdListener windDriftAdListener = WindDriftAdView.this.a;
                        if (windDriftAdListener != null) {
                            windDriftAdListener.onDriftAdLoadSuccess(str);
                        }
                    }
                };
            } else {
                if (WindDriftAdView.this.f) {
                    return;
                }
                handler = WindDriftAdView.this.b;
                runnable = new Runnable() { // from class: com.xmlywind.windad.Drift.WindDriftAdView.DriftAdListener.2
                    @Override // java.lang.Runnable
                    public void run() {
                        WindDriftAdListener windDriftAdListener = WindDriftAdView.this.a;
                        if (windDriftAdListener != null) {
                            WindAdError windAdError = WindAdError.ERROR_SIGMOB_FILE_DOWNLOAD;
                            windDriftAdListener.onDriftAdError(new WindAdAdapterError(windAdError.getErrorCode(), windAdError.getMessage()), str);
                        }
                    }
                };
            }
            handler.post(runnable);
        }
    }

    public WindDriftAdView(Context context, String str, WindDriftAdListener windDriftAdListener) {
        super(context);
        this.f = false;
        this.c = new b(context, str, new DriftAdListener());
        this.b = new Handler(Looper.getMainLooper());
        this.d = new GifImageView(context);
        this.a = windDriftAdListener;
        this.e = str;
        setVisibility(4);
        setupLayout(context);
        b bVar = this.c;
        if (bVar != null) {
            bVar.c();
            return;
        }
        WindDriftAdListener windDriftAdListener2 = this.a;
        if (windDriftAdListener2 != null) {
            windDriftAdListener2.onDriftAdError(new WindAdAdapterError(WindAdError.ERROR_SIGMOB_REQUEST.getErrorCode(), "ad is null"), str);
        }
    }

    private void setupLayout(Context context) {
        setBackgroundColor(0);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(com.xmlywind.sdk.common.a.r());
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(0, c.b(10.0f, context), c.b(10.0f, context), 0);
        GifImageView gifImageView = this.d;
        com.xmlywind.sdk.base.views.d dVar = com.xmlywind.sdk.base.views.d.GRAYCLOSE;
        gifImageView.setImageBitmap(dVar.a());
        this.d.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(this.d, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9);
        layoutParams3.addRule(12);
        TextView textView = new TextView(context);
        textView.setId(com.xmlywind.sdk.common.a.r());
        textView.setText("广告");
        textView.setTextColor(-1);
        textView.setBackgroundColor(Color.parseColor("#dadada"));
        textView.setGravity(3);
        textView.setTextSize(1, 10.0f);
        relativeLayout.addView(textView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(c.b(20.0f, context), c.b(20.0f, context));
        layoutParams4.addRule(7, relativeLayout.getId());
        layoutParams4.addRule(6, relativeLayout.getId());
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(dVar.a());
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.windad.Drift.WindDriftAdView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.setVisibility(8);
                WindDriftAdView.this.c.e();
                r.a(this);
                WindDriftAdView windDriftAdView = WindDriftAdView.this;
                WindDriftAdListener windDriftAdListener = windDriftAdView.a;
                if (windDriftAdListener != null) {
                    windDriftAdListener.onDriftAdViewClosed(windDriftAdView.e);
                }
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.windad.Drift.WindDriftAdView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WindDriftAdView.this.c.a();
            }
        });
        addView(relativeLayout, layoutParams);
        addView(imageView, layoutParams4);
    }
}
