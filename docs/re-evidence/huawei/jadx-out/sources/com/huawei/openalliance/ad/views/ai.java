package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes41.dex */
public class ai extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CornerImageView f21138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CornerImageView f21139b;

    public CornerImageView getSplash() {
        return this.f21138a;
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Context> f21140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CornerImageView> f21141b;

        @Override // java.lang.Runnable
        public void run() {
            Context context = this.f21140a.get();
            CornerImageView cornerImageView = this.f21141b.get();
            if (context == null || cornerImageView == null) {
                return;
            }
            cornerImageView.setRectCornerRadius((context.getResources().getDisplayMetrics().widthPixels / 64) * 6);
        }

        public a(Context context, CornerImageView cornerImageView) {
            this.f21140a = new WeakReference<>(context);
            this.f21141b = new WeakReference<>(cornerImageView);
        }
    }

    public CornerImageView getIcon() {
        return this.f21139b;
    }

    private void a(Context context) {
        ((RelativeLayout) LayoutInflater.from(context).inflate(R.layout.hiad_splash_icon_view, this)).setBackgroundColor(0);
        this.f21138a = (CornerImageView) findViewById(R.id.hiad_splash_snapshot);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.f21139b = (CornerImageView) findViewById(R.id.hiad_splash_icon_view);
        this.f21138a.setRectCornerRadius((context.getResources().getDisplayMetrics().widthPixels / 64) * 8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21139b.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        this.f21139b.setLayoutParams(layoutParams);
        CornerImageView cornerImageView = this.f21139b;
        cornerImageView.post(new a(context, cornerImageView));
    }

    public ai(Context context) {
        super(context);
        a(context);
    }
}
