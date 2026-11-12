package ohos.ace.plugin.timeplugin;

import android.content.Context;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes46.dex */
public class TimePlugin {
    private static final String LOG_TAG = "TimePlugin";
    private Context mContext_;

    public native void nativeInit();

    public TimePlugin(Context context) {
        this.mContext_ = context;
        nativeInit();
    }

    public int getTimeZone(String[] strArr) {
        strArr[0] = TimeZone.getDefault().getID();
        return 0;
    }
}
