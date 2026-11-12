package com.xmlywind.sdk.base.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.volley.s;
import com.xmlywind.volley.toolbox.k;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class VideoButtonWidget extends RelativeLayout {
    private ImageView a;
    private int b;

    public VideoButtonWidget(Context context, int i) {
        super(context);
        int iB = com.xmlywind.sdk.common.utils.c.b(30.0f, context);
        this.b = iB;
        a(iB / 2);
        int i2 = this.b;
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        int i3 = this.b / 2;
        int color = Color.parseColor("#ffffff");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(i3);
        gradientDrawable.setAlpha(102);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams);
    }

    private void a(int i) {
        this.a = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(13);
        this.a.setImageBitmap(d.CLOSE.a());
        this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.a.setImageAlpha(204);
        addView(this.a, layoutParams);
    }

    private void b(final String str) {
        k kVarB = com.xmlywind.sdk.common.e.f.b();
        if (kVarB != null) {
            kVarB.a(str, new k.d() { // from class: com.xmlywind.sdk.base.views.VideoButtonWidget.1
                @Override // com.xmlywind.volley.toolbox.k.d
                public void a(k.c cVar, boolean z) {
                    Bitmap bitmapB = cVar.b();
                    if (bitmapB != null) {
                        VideoButtonWidget.this.a.setImageBitmap(bitmapB);
                    } else {
                        SigmobLog.d(String.format("%s returned null bitmap", str));
                    }
                }

                @Override // com.xmlywind.volley.n.a
                public void onErrorResponse(s sVar) {
                    SigmobLog.d("Failed to load image.", sVar);
                }
            });
        }
    }

    public void a(Bitmap bitmap) {
        this.a.setImageBitmap(bitmap);
    }

    public void a(BaseAdUnit baseAdUnit) {
        ImageView imageView;
        d dVar;
        if (baseAdUnit == null || baseAdUnit.getEndcardCloseImage() != 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            setBackground(gradientDrawable);
            int i = this.b;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.addRule(13);
            this.a.setLayoutParams(layoutParams);
            imageView = this.a;
            dVar = d.CLOSE_OLD;
        } else {
            imageView = this.a;
            dVar = d.CLOSE;
        }
        imageView.setImageBitmap(dVar.a());
    }

    public void a(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            b(str);
        } else if (lowerCase.startsWith("file://")) {
            try {
                this.a.setImageURI(Uri.fromFile(new File(str)));
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
    }
}
