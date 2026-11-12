package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class vu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<ImageView> f21487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dn f21488c;
    private Context d;
    private Boolean e;
    private com.huawei.openalliance.ad.utils.bd.a f;

    @Override // java.lang.Runnable
    public void run() {
        if (this.d == null) {
            return;
        }
        sn snVar = new sn();
        snVar.b(false);
        snVar.c(true);
        snVar.b("icon");
        snVar.d(this.f21486a);
        Boolean bool = this.e;
        if (bool != null && !bool.booleanValue()) {
            snVar.c(fp.b(this.d).e());
        }
        so soVarA = new sl(this.d, snVar).a();
        if (soVarA == null) {
            return;
        }
        String strA = soVarA.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String strC = this.f21488c.c(strA);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        com.huawei.openalliance.ad.utils.bd.a(this.d, strC, new com.huawei.openalliance.ad.utils.bd.a() { // from class: com.huawei.openalliance.ad.vu.1
            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a(final Drawable drawable) {
                if (drawable == null) {
                    return;
                }
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.vu.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ImageView imageView;
                        if (vu.this.f != null) {
                            vu.this.f.a(drawable);
                        }
                        if (vu.this.f21487b == null || vu.this.f21487b.get() == null || (imageView = (ImageView) vu.this.f21487b.get()) == null) {
                            return;
                        }
                        imageView.setBackground(null);
                        imageView.setImageDrawable(drawable);
                    }
                });
            }

            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a() {
                if (vu.this.f != null) {
                    vu.this.f.a();
                }
            }
        });
    }

    public vu(Context context, String str, ImageView imageView, Boolean bool) {
        this.f21486a = str;
        this.f21487b = new WeakReference<>(imageView);
        context = context != null ? context.getApplicationContext() : context;
        this.d = context;
        this.f21488c = dk.a(context, "normal");
        this.e = bool;
    }
}
