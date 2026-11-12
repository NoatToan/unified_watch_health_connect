package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dr;

/* JADX INFO: loaded from: classes12.dex */
public class AppDownloadButtonStyle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20743b;
    protected Drawable cancelBtnDrawable;
    protected Style normalStyle = new Style();
    protected Style processingStyle = new Style();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Style f20742a = new Style();
    protected Style cancelBtnStyle = new Style();
    protected Style installingStyle = new Style();

    public void setCancelBtnDrawable(Drawable drawable) {
        this.cancelBtnDrawable = drawable;
    }

    public Style getStyle(Context context, AppStatus appStatus) {
        if (appStatus == null) {
            return a();
        }
        int i = AnonymousClass1.f20744a[appStatus.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return this.installingStyle;
            }
            if (i != 4) {
                return a();
            }
        }
        return this.processingStyle;
    }

    public Drawable getCancelBtnDrawable() {
        return this.cancelBtnDrawable;
    }

    public static class Style {
        protected Drawable background;
        protected int textColor;
        protected int textSize = 12;

        public void setTextSize(int i) {
            this.textSize = i;
        }

        public void setTextColor(int i) {
            this.textColor = i;
        }

        public void setBackground(Drawable drawable) {
            this.background = drawable;
        }

        public int getTextSize() {
            return this.textSize;
        }

        public int getTextColor() {
            return this.textColor;
        }

        public Drawable getBackground() {
            return this.background;
        }
    }

    public int e() {
        return as.n(this.f20743b) ? 28 : 18;
    }

    public Style d() {
        return this.f20742a;
    }

    public Style c() {
        return this.cancelBtnStyle;
    }

    public Style b() {
        return this.processingStyle;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public Style a(Context context, AppStatus appStatus, int i) {
        Style styleA;
        if (appStatus == null) {
            return a();
        }
        if (i != 11) {
            styleA = null;
        } else {
            int i2 = AnonymousClass1.f20744a[appStatus.ordinal()];
            if (i2 == 1 || i2 == 2) {
                styleA = a();
            } else if (i2 != 3) {
                styleA = null;
            } else {
                styleA = d();
            }
        }
        return styleA == null ? getStyle(context, appStatus) : styleA;
    }

    public Style a() {
        return this.normalStyle;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.views.AppDownloadButtonStyle$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20744a;

        static {
            int[] iArr = new int[AppStatus.values().length];
            f20744a = iArr;
            try {
                iArr[AppStatus.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20744a[AppStatus.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20744a[AppStatus.INSTALLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20744a[AppStatus.WAITING_FOR_WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20744a[AppStatus.INSTALLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20744a[AppStatus.DOWNLOAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20744a[AppStatus.INSTALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public AppDownloadButtonStyle(Context context) {
        this.f20743b = context;
        this.normalStyle.background = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_normal);
        this.normalStyle.textColor = context.getResources().getColor(R.color.hiad_down_normal_text);
        this.processingStyle.setBackground(dr.b(context, R.drawable.hiad_app_down_btn_processing));
        this.processingStyle.setTextColor(context.getResources().getColor(R.color.hiad_app_down_processing_text));
        this.installingStyle.setBackground(context.getResources().getDrawable(R.drawable.hiad_app_down_btn_installing));
        this.installingStyle.setTextColor(context.getResources().getColor(R.color.hiad_app_down_installing_text));
        this.f20742a.setBackground(context.getResources().getDrawable(R.drawable.hiad_linked_app_down_btn_installing));
        this.f20742a.setTextColor(context.getResources().getColor(R.color.hiad_emui_white));
        this.cancelBtnDrawable = context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn);
    }

    public AppDownloadButtonStyle() {
    }
}
