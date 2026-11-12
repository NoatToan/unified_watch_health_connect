package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;

/* JADX INFO: loaded from: classes16.dex */
public class CustomAdViewDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23385b;
    private int d;
    private int e;

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            LogUtil.a("CustomAdViewDialog", "mClickTime ", Integer.valueOf(this.e));
            if (c(getContext(), motionEvent)) {
                this.e++;
            }
            if (this.e == 2) {
                LogUtil.a("CustomAdViewDialog", "dialog dismiss");
                dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int dimensionPixelSize = this.f23384a.getResources().getDimensionPixelSize(R.dimen.dialog_content_margin_24dp);
            int dimensionPixelSize2 = this.f23384a.getResources().getDimensionPixelSize(R.dimen.dialog_ad_image_height);
            int i = this.f23385b;
            if (i > 0) {
                dimensionPixelSize2 = (int) ((dimensionPixelSize2 * this.d) / i);
            }
            attributes.width = dimensionPixelSize2 + (dimensionPixelSize * 2);
            window.setAttributes(attributes);
        }
        super.show();
    }

    private boolean c(Context context, MotionEvent motionEvent) {
        if (context == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        return x < i || x > decorView.getWidth() + scaledWindowTouchSlop || y < i || y > decorView.getHeight() + scaledWindowTouchSlop;
    }

    public boolean a() {
        ImageView imageView = (ImageView) findViewById(R.id.ad_image);
        if (imageView == null) {
            LogUtil.a("CustomAdViewDialog", "isWidthHeightZero(), adImage = null");
            return true;
        }
        LogUtil.a("CustomAdViewDialog", "isWidthHeightZero(), width = ", Integer.valueOf(imageView.getWidth()), " Height = ", Integer.valueOf(imageView.getHeight()));
        return imageView.getWidth() <= 0 || imageView.getHeight() <= 0;
    }

    /* JADX INFO: loaded from: classes43.dex */
    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23386c;

        public Builder(Context context) {
            this.f23386c = context;
        }
    }
}
