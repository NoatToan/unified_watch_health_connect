package ohos.stage.ability.adapter;

import android.content.Intent;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.DisplayManagerAgent;
import ohos.ace.adapter.WindowViewInterface;

/* JADX INFO: loaded from: classes46.dex */
public class StageActivityDelegate {
    private static final String LOG_TAG = "StageActivityDelegate";
    private static final List<INTENTCALLBACK> intentCallbackList = new ArrayList();

    public interface INTENTCALLBACK {
        void onResult(int i, int i2, Intent intent);
    }

    private native void nativeAttachStageActivity(String str, StageActivity stageActivity);

    private native void nativeCreateAbilityDelegator(String str, String str2, String str3, String str4);

    private native void nativeDispatchOnAbilityResult(String str, int i, int i2, String str2);

    private native void nativeDispatchOnBackground(String str);

    private native void nativeDispatchOnCreate(String str, String str2);

    private native void nativeDispatchOnDestroy(String str);

    private native void nativeDispatchOnForeground(String str);

    private native void nativeDispatchOnNewWant(String str, String str2);

    private native void nativeFoldStatusChangeCallback(String str, int i);

    private native void nativeSetWindowView(String str, WindowViewInterface windowViewInterface);

    public static void addIntentCallback(INTENTCALLBACK intentcallback) {
        if (intentcallback != null) {
            intentCallbackList.add(intentcallback);
        }
    }

    public static void triggerIntentCallback(int i, int i2, Intent intent) {
        List<INTENTCALLBACK> list = intentCallbackList;
        if (list != null) {
            Iterator<INTENTCALLBACK> it = list.iterator();
            while (it.hasNext()) {
                it.next().onResult(i, i2, intent);
            }
        }
    }

    public StageActivityDelegate() {
        ALog.i(LOG_TAG, "Constructor called.");
    }

    public void attachStageActivity(String str, StageActivity stageActivity) {
        Trace.beginSection("attachStageActivity");
        nativeAttachStageActivity(str, stageActivity);
        SubWindowManager.getInstance().setActivity(stageActivity, str);
        DisplayManagerAgent.getInstance().setActivity(stageActivity);
        Trace.endSection();
    }

    public void dispatchOnCreate(String str, String str2) {
        Trace.beginSection("attachStageActivity");
        nativeDispatchOnCreate(str, str2);
        Trace.endSection();
    }

    public void dispatchOnDestroy(String str) {
        ALog.i(LOG_TAG, "dispatchOnDestroy called");
        nativeDispatchOnDestroy(str);
        SubWindowManager.getInstance().releaseActivity(str);
    }

    public void dispatchOnNewWant(String str, String str2) {
        ALog.i(LOG_TAG, "dispatchOnNewWant called");
        nativeDispatchOnNewWant(str, str2);
    }

    public void dispatchOnForeground(String str, StageActivity stageActivity) {
        ALog.i(LOG_TAG, "DispatchOnForeground called");
        nativeDispatchOnForeground(str);
        SubWindowManager.getInstance().setActivity(stageActivity, str);
    }

    public void dispatchOnBackground(String str) {
        ALog.i(LOG_TAG, "DispatchOnBackground called");
        nativeDispatchOnBackground(str);
    }

    public void setWindowView(String str, WindowViewInterface windowViewInterface) {
        Trace.beginSection("setWindowView");
        nativeSetWindowView(str, windowViewInterface);
        Trace.endSection();
    }

    public void createAbilityDelegator(String str, String str2, String str3, String str4) {
        nativeCreateAbilityDelegator(str, str2, str3, str4);
    }

    public void dispatchOnActivityResult(String str, int i, int i2, String str2, Intent intent) {
        ALog.i(LOG_TAG, "dispatchOnActivityResult called");
        triggerIntentCallback(i, i2, intent);
        nativeDispatchOnAbilityResult(str, i, i2, str2);
    }

    public void dispatchFoldStatusChange(String str, int i) {
        nativeFoldStatusChangeCallback(str, i);
    }
}
