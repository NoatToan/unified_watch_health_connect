package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.app.Activity;
import android.content.Intent;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RnCallbackHelper {
    private static final String TAG = "rn_callback_helper";
    private final HashMap<Integer, ActivityResultParser> mCallbacks;

    public interface ActivityResultParser {
        void onActivityResult(int i, int i2, Intent intent);
    }

    public static final class Holder {
        private static final RnCallbackHelper INSTANCE = new RnCallbackHelper();

        private Holder() {
        }
    }

    public static RnCallbackHelper getInstance() {
        return Holder.INSTANCE;
    }

    public void clear() {
        this.mCallbacks.clear();
    }

    public boolean hasRequest(Integer num) {
        return this.mCallbacks.containsKey(num);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        ActivityResultParser activityResultParserRemove;
        synchronized (this.mCallbacks) {
            activityResultParserRemove = this.mCallbacks.remove(Integer.valueOf(i2));
        }
        if (activityResultParserRemove != null) {
            activityResultParserRemove.onActivityResult(i, i2, intent);
            return true;
        }
        RnPluginLog.w(TAG, "onActivityResult with unknown request id " + i2);
        return false;
    }

    public void registerCallback(Integer num, ActivityResultParser activityResultParser) {
        this.mCallbacks.put(num, activityResultParser);
    }

    public void startActivityForResult(Activity activity, Intent intent, int i, ActivityResultParser activityResultParser) {
        if (activityResultParser != null) {
            registerCallback(Integer.valueOf(i), activityResultParser);
        }
        if (activity == null) {
            return;
        }
        activity.startActivityForResult(intent, i);
    }

    private RnCallbackHelper() {
        this.mCallbacks = new HashMap<>();
    }
}
