package com.huawei.ui.commonui.scrollview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.uikit.phone.hwbottomnavigationview.widget.HwBottomNavigationView;
import defpackage.lsy;
import defpackage.qqf;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBottomView extends HwBottomNavigationView {
    public HealthBottomView(Context context) {
        super(context);
    }

    public HealthBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b(final String str, final int i, final boolean z) {
        lsy.a(new Runnable() { // from class: com.huawei.ui.commonui.scrollview.HealthBottomView.1
            @Override // java.lang.Runnable
            public void run() {
                final Drawable drawableD = HealthBottomView.this.d(str);
                if (drawableD == null) {
                    LogUtil.e("HealthBottomView", "can not get the image");
                } else {
                    HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.commonui.scrollview.HealthBottomView.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            HealthBottomView.this.d(drawableD, i, z);
                        }
                    });
                }
            }
        });
    }

    public void b(final CharSequence charSequence, final String str, final int i, final boolean z) {
        lsy.a(new Runnable() { // from class: com.huawei.ui.commonui.scrollview.HealthBottomView.3
            @Override // java.lang.Runnable
            public void run() {
                final Drawable drawableD = HealthBottomView.this.d(str);
                if (drawableD == null) {
                    LogUtil.e("HealthBottomView", "can not get the image");
                } else {
                    HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.commonui.scrollview.HealthBottomView.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HealthBottomView.this.b(charSequence, drawableD, i, z);
                        }
                    });
                }
            }
        });
    }

    public void d(final int i, final String str, final int i2, final boolean z) {
        lsy.a(new Runnable() { // from class: com.huawei.ui.commonui.scrollview.HealthBottomView.5
            @Override // java.lang.Runnable
            public void run() {
                final Drawable drawableD = HealthBottomView.this.d(str);
                if (drawableD == null) {
                    LogUtil.e("HealthBottomView", "can not get the image");
                } else {
                    HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.commonui.scrollview.HealthBottomView.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            HealthBottomView.this.d(i, drawableD, i2, z);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable d(String str) {
        return qqf.b(BaseApplication.getContext(), str);
    }
}
