package com.huawei.health.basesport.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ControlButtonLayout extends BaseControlButton {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f6211c;
    private IBaseResponseCallback d;

    public ControlButtonLayout(Context context) {
        super(context);
    }

    public ControlButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.health.basesport.controls.BaseControlButton
    protected void onPauseClickEvents() {
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(101, 101);
        }
    }

    @Override // com.huawei.health.basesport.controls.BaseControlButton
    protected void onPlayClickEvents() {
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100, 100);
        }
    }

    @Override // com.huawei.health.basesport.controls.BaseControlButton
    protected void onStopClickEvents() {
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(102, 102);
        }
    }

    public void setClickCallback(IBaseResponseCallback iBaseResponseCallback) {
        this.d = iBaseResponseCallback;
    }

    public void setScreenSwitchLength(ImageView imageView, ImageView imageView2) {
        this.f6211c = imageView;
        this.mVoiceIcon = imageView2;
    }

    @Override // com.huawei.health.basesport.controls.BaseControlButton
    public void setMoveLength() {
        int left;
        int width;
        if (this.f6211c == null || this.mVoiceIcon == null) {
            LogUtil.e("Track_ControlButtonLayout", "mScreenSwitch mVoiceIcon view is null");
            return;
        }
        if (LanguageUtil.ba(this.mContext)) {
            left = this.f6211c.getLeft() - this.mVoiceIcon.getRight();
            width = this.mPauseButton.getWidth();
        } else {
            left = this.mVoiceIcon.getLeft() - this.f6211c.getRight();
            width = this.mPauseButton.getWidth();
        }
        this.mMoveLength = ((left - (width * 2)) / 6) + (this.mPauseButton.getWidth() / 2);
    }

    public void d() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.basesport.controls.ControlButtonLayout.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ControlButtonLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ControlButtonLayout.this.showBtnStopAndPlay();
            }
        });
    }

    public void b() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.basesport.controls.ControlButtonLayout.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ControlButtonLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ControlButtonLayout.this.foldBtnStopAndPlay();
            }
        });
    }

    public void setHidePauseAndStopButton() {
        this.mHandler.sendEmptyMessage(103);
    }

    public void e() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.basesport.controls.ControlButtonLayout.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ControlButtonLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ControlButtonLayout.this.mHandler.sendEmptyMessage(104);
            }
        });
    }

    public CircleProgressButton getStopButton() {
        return this.mStopButton;
    }

    public void setPauseButtonPading() {
        this.mPauseButton.setPadding(0, 0, 0, 0);
    }

    public void setIsNeedMoveVoiceIcon(int i) {
        this.mVoiceIconMoveLength = i;
    }
}
