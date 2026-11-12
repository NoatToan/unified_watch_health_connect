package com.huawei.indoorequip.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes40.dex */
public class WaitingDotView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView[] f17816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f17817b;
    private Context d;
    private int e;

    static /* synthetic */ int c(WaitingDotView waitingDotView) {
        int i = waitingDotView.e;
        waitingDotView.e = i + 1;
        return i;
    }

    static class d implements Runnable {
        private WeakReference<WaitingDotView> d;

        d(WaitingDotView waitingDotView) {
            this.d = new WeakReference<>(waitingDotView);
        }

        @Override // java.lang.Runnable
        public void run() {
            WaitingDotView waitingDotView = this.d.get();
            if (waitingDotView != null) {
                if (waitingDotView.e < 3) {
                    waitingDotView.f17816a[waitingDotView.e].setTextColor(Color.rgb(26, 26, 26));
                    WaitingDotView.c(waitingDotView);
                } else {
                    for (int i = 0; i < 3; i++) {
                        waitingDotView.f17816a[i].setTextColor(0);
                    }
                    waitingDotView.e = 0;
                }
                waitingDotView.f17817b.postDelayed(this, 600L);
            }
        }
    }

    public WaitingDotView(Context context) {
        this(context, null);
    }

    public WaitingDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaitingDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 1;
        this.f17817b = new Handler();
        this.d = context;
        a();
        b();
    }

    private void a() {
        this.f17816a = new HealthTextView[3];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        for (int i = 0; i < 3; i++) {
            this.f17816a[i] = new HealthTextView(this.d);
            this.f17816a[i].setText(Html.fromHtml("&#8226;"));
            this.f17816a[i].setTextSize(10.0f);
            if (i == 0) {
                this.f17816a[i].setTextColor(Color.rgb(26, 26, 26));
            } else {
                this.f17816a[i].setTextColor(0);
                layoutParams.leftMargin = 12;
            }
            this.f17816a[i].setLayoutParams(layoutParams);
            addView(this.f17816a[i]);
        }
    }

    private void b() {
        this.f17817b.postDelayed(new d(this), 600L);
    }
}
