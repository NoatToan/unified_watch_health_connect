package com.xmlywind.sdk.base.views;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.volley.s;
import com.xmlywind.volley.toolbox.k;

/* JADX INFO: loaded from: classes22.dex */
public class AdLogoView extends RelativeLayout {
    private static float d = 8.0f;
    private final int a;
    private ImageView b;
    private TextView c;
    private k.c e;

    public AdLogoView(Context context, int i) {
        super(context);
        this.a = i;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setId(com.xmlywind.sdk.common.a.r());
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(Color.parseColor("#B9B9B9"));
        this.c.setTextSize(1, 12.0f);
        int iB = com.xmlywind.sdk.common.utils.c.b(5.0f, getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.xmlywind.sdk.common.utils.c.b(16.0f, context), com.xmlywind.sdk.common.utils.c.b(16.0f, context));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, com.xmlywind.sdk.common.utils.c.b(16.0f, context));
        this.c.setGravity(17);
        this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (i == 1) {
            layoutParams2.addRule(9);
            layoutParams2.addRule(12);
            int i2 = iB * 2;
            layoutParams2.setMargins(iB, 0, 0, i2);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, iB, i2);
        } else {
            layoutParams.setMargins(iB, 0, 0, 0);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.addRule(1, this.b.getId());
            layoutParams2.addRule(8, this.b.getId());
        }
        this.b.setBackgroundColor(Color.alpha(0));
        addView(this.b, layoutParams);
        addView(this.c, layoutParams2);
    }

    public void a(String str) {
        k kVarB = com.xmlywind.sdk.common.e.f.b();
        if (kVarB != null) {
            this.e = kVarB.a(str, new k.d() { // from class: com.xmlywind.sdk.base.views.AdLogoView.1
                @Override // com.xmlywind.volley.toolbox.k.d
                public void a(k.c cVar, boolean z) {
                    int iB = com.xmlywind.sdk.common.utils.c.b(3.0f, AdLogoView.this.getContext());
                    if (cVar.b() != null) {
                        if (AdLogoView.this.a != 1 && cVar.b().getWidth() > cVar.b().getHeight() * 1.5f) {
                            ((RelativeLayout.LayoutParams) AdLogoView.this.b.getLayoutParams()).setMargins((-iB) * (cVar.b().getWidth() / cVar.b().getHeight()), 0, 0, 0);
                        }
                        AdLogoView.this.b.setImageBitmap(cVar.b());
                    }
                }

                @Override // com.xmlywind.volley.n.a
                public void onErrorResponse(s sVar) {
                }
            });
        }
    }

    public void b(String str) {
        try {
            this.c.setText(str);
        } catch (Throwable th) {
            SigmobLog.e("showAdText error", th);
        }
    }
}
