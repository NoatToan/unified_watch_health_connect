package com.xiaomi.smarthome.framework.plugin.rn.fixbug;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidBug5497Workaround {
    private static volatile AndroidBug5497Workaround instance;
    private FrameLayout.LayoutParams frameLayoutParams;
    private View mChildOfContent;
    private FrameLayout mContent;
    private boolean mShouldFitSoftKeyboard = false;
    private int usableHeightPrevious;

    private AndroidBug5497Workaround() {
    }

    private int computeUsableHeight() {
        Rect rect = new Rect();
        this.mChildOfContent.getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }

    public static AndroidBug5497Workaround getInstance() {
        if (instance == null) {
            synchronized (AndroidBug5497Workaround.class) {
                try {
                    if (instance == null) {
                        instance = new AndroidBug5497Workaround();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void possiblyResizeChildOfContent() {
        int iComputeUsableHeight;
        if (this.mChildOfContent == null || this.frameLayoutParams == null || (iComputeUsableHeight = computeUsableHeight()) == this.usableHeightPrevious) {
            return;
        }
        int height = this.mChildOfContent.getRootView().getHeight();
        int i = height - iComputeUsableHeight;
        if (i > height / 4) {
            this.frameLayoutParams.height = height - i;
        } else {
            this.frameLayoutParams.height = this.mContent.getHeight();
        }
        this.mChildOfContent.requestLayout();
        this.usableHeightPrevious = iComputeUsableHeight;
    }

    public void assistActivity(Activity activity) {
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        this.mContent = frameLayout;
        View childAt = frameLayout.getChildAt(0);
        this.mChildOfContent = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.smarthome.framework.plugin.rn.fixbug.AndroidBug5497Workaround.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (AndroidBug5497Workaround.this.mShouldFitSoftKeyboard) {
                    AndroidBug5497Workaround.this.possiblyResizeChildOfContent();
                }
            }
        });
        this.frameLayoutParams = (FrameLayout.LayoutParams) this.mChildOfContent.getLayoutParams();
    }

    public void cleanInstance() {
        this.mChildOfContent = null;
        this.frameLayoutParams = null;
        this.mContent = null;
        instance = null;
    }

    public void setShouldFitSoftKeybord(boolean z) {
        this.mShouldFitSoftKeyboard = z;
    }
}
