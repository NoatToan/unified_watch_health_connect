package ohos.stage.ability.adapter;

import android.os.Trace;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.DisplayInfo;
import ohos.ace.adapter.DisplayManagerAgent;
import ohos.ace.adapter.WindowViewInterface;

/* JADX INFO: loaded from: classes20.dex */
public class StageFragmentDelegate {
    private static final String LOG_TAG = "StageFragmentDelegate";

    private native void nativeAttachFragment(String str, StageFragment stageFragment);

    private native void nativeDispatchOnBackground(String str);

    private native void nativeDispatchOnCreate(String str, String str2);

    private native void nativeDispatchOnDestroy(String str);

    private native void nativeDispatchOnForeground(String str);

    private native void nativeSetWindowView(String str, WindowViewInterface windowViewInterface);

    public StageFragmentDelegate() {
        ALog.i(LOG_TAG, "Constructor called.");
    }

    public void attachStageFragment(String str, StageFragment stageFragment) {
        Trace.beginSection("attachStageFragment");
        SubWindowManager.getInstance().setActivity(stageFragment.getActivity(), str);
        DisplayManagerAgent.getInstance().setActivity(stageFragment.getActivity());
        DisplayInfo.getInstance().setContext(stageFragment.getActivity());
        nativeAttachFragment(str, stageFragment);
        Trace.endSection();
    }

    public void setWindowView(String str, WindowViewInterface windowViewInterface) {
        Trace.beginSection("setWindowView");
        nativeSetWindowView(str, windowViewInterface);
        Trace.endSection();
    }

    public void dispatchOnCreate(String str, String str2) {
        Trace.beginSection("dispatchOnCreate");
        nativeDispatchOnCreate(str, str2);
        Trace.endSection();
    }

    public void dispatchOnForeground(String str, StageFragment stageFragment) {
        SubWindowManager.getInstance().setActivity(stageFragment.getActivity(), str);
        nativeDispatchOnForeground(str);
    }

    public void dispatchOnBackground(String str) {
        nativeDispatchOnBackground(str);
    }

    public void dispatchOnDestroy(String str) {
        nativeDispatchOnDestroy(str);
        SubWindowManager.getInstance().releaseActivity(str);
    }
}
