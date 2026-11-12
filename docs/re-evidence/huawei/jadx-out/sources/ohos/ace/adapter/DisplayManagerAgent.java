package ohos.ace.adapter;

import android.app.Activity;
import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes20.dex */
public class DisplayManagerAgent {
    private static final String TAG = "DisplayManagerAgent";
    private static volatile DisplayManagerAgent sInstance;
    private Activity activity;
    private DisplayManager.DisplayListener displayListener;
    private DisplayManager displayManager;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnDisplayAdded(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnDisplayChanged(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnDisplayRemoved(int i);

    private native void nativeSetupDisplayManagerAgent();

    private DisplayManagerAgent() {
        ALog.d(TAG, "DisplayManagerAgent created.");
    }

    public static final DisplayManagerAgent getInstance() {
        if (sInstance == null) {
            synchronized (DisplayManagerAgent.class) {
                if (sInstance == null) {
                    sInstance = new DisplayManagerAgent();
                }
            }
        }
        return sInstance;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
        this.displayManager = (DisplayManager) activity.getSystemService("display");
        nativeSetupDisplayManagerAgent();
    }

    public boolean isFoldable() {
        ALog.d(TAG, "isFoldable called.");
        Activity activity = this.activity;
        if (activity != null) {
            return FoldManager.isFoldable(activity);
        }
        ALog.e(TAG, "activity is null");
        return false;
    }

    public int getFoldStatus() {
        ALog.d(TAG, "getFoldStatus called.");
        Activity activity = this.activity;
        if (activity != null) {
            return FoldManager.getFoldStatus(activity);
        }
        ALog.e(TAG, "activity is null");
        return 0;
    }

    public void registerDisplayListener() {
        ALog.d(TAG, "onChange called.");
        if (this.displayListener == null) {
            DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: ohos.ace.adapter.DisplayManagerAgent.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i) {
                    DisplayManagerAgent.this.nativeOnDisplayAdded(i);
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i) {
                    DisplayManagerAgent.this.nativeOnDisplayRemoved(i);
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i) {
                    ALog.d(DisplayManagerAgent.TAG, "displayId = " + i);
                    DisplayManagerAgent.this.nativeOnDisplayChanged(i);
                }
            };
            this.displayListener = displayListener;
            this.displayManager.registerDisplayListener(displayListener, null);
        }
    }

    public void unregisterDisplayListener() {
        ALog.d(TAG, "offChange called.");
        DisplayManager.DisplayListener displayListener = this.displayListener;
        if (displayListener != null) {
            this.displayManager.unregisterDisplayListener(displayListener);
            this.displayListener = null;
        }
    }
}
