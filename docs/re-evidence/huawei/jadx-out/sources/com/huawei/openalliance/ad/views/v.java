package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.sg;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentRecord f21357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21358b;

    protected abstract String getTAG();

    protected void setAdData(ContentRecord contentRecord) {
        this.f21357a = contentRecord;
    }

    @Override // android.view.View
    public boolean performClick() {
        try {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.views.v.2
                @Override // java.lang.Runnable
                public void run() {
                    hw.a(v.this.getTAG(), "performClick, cheating: %s", Boolean.valueOf(sg.a(v.this.getContext(), v.this.f21357a, stackTrace, v.this, sg.f20255b).a()));
                }
            });
        } catch (Throwable th) {
            hw.c(getTAG(), "check click ex: %s", th.getClass().getSimpleName());
        }
        return super.performClick();
    }

    public void j() {
        try {
            if (as.a(this.f21357a) && (this instanceof AppDownloadButton)) {
                return;
            }
            post(new Runnable() { // from class: com.huawei.openalliance.ad.views.v.3
                @Override // java.lang.Runnable
                public void run() {
                    final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.views.v.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            hw.b(v.this.getTAG(), "checkValidDisplay, cheating: %s", Boolean.valueOf(sg.a(v.this.getContext(), v.this.f21357a, stackTrace, v.this, sg.f20256c).a()));
                        }
                    });
                }
            });
        } catch (Throwable th) {
            hw.c(getTAG(), "checkValidDisplay ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (System.currentTimeMillis() - this.f21358b < 10000) {
                return super.dispatchTouchEvent(motionEvent);
            }
            this.f21358b = System.currentTimeMillis();
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.views.v.1
                @Override // java.lang.Runnable
                public void run() {
                    hw.a(v.this.getTAG(), "dispatchTouch, cheating: %s", Boolean.valueOf(sg.a(v.this.getContext(), v.this.f21357a, stackTrace, v.this, sg.f20254a).a()));
                }
            });
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            hw.c(getTAG(), "check touch ex: %s", th.getClass().getSimpleName());
        }
    }

    public v(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f21358b = 0L;
    }

    public v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21358b = 0L;
    }

    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21358b = 0L;
    }

    public v(Context context) {
        super(context);
        this.f21358b = 0L;
    }
}
