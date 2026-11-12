package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;

/* JADX INFO: loaded from: classes8.dex */
public class DataTitleShareVideo extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f12883b;
    public ImageView c;
    public ImageView d;
    public boolean e;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DataTitleShareVideo.this.a();
            DataTitleShareVideo.this.getClass();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DataTitleShareVideo.this.getClass();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DataTitleShareVideo.this.getClass();
        }
    }

    public interface d {
    }

    public DataTitleShareVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        LayoutInflater.from(context).inflate(ivi.s1, this);
    }

    public void a() {
        boolean z = !this.e;
        this.e = z;
        if (z) {
            this.d.setImageResource(hoi.H);
        } else {
            this.d.setImageResource(hoi.G);
        }
    }

    public boolean getVolumeFlag() {
        return this.e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12882a = (ImageView) findViewById(bsi.B2);
        this.f12883b = (ImageView) findViewById(bsi.D2);
        this.c = (ImageView) findViewById(bsi.H2);
        ImageView imageView = (ImageView) findViewById(bsi.Q2);
        this.d = imageView;
        imageView.setOnClickListener(new a());
        this.f12882a.setOnClickListener(new b());
        this.f12883b.setOnClickListener(new c());
    }

    public void setOnTitleBarClickListener(d dVar) {
    }
}
