package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.watchface.videoedit.utils.SafeIntent;
import health.compact.a.LogUtil;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes38.dex */
public class NavigationBarHandler extends SafeBroadcastReceiver {
    private static final String KEY_NAVIGATION_BAR_EXTRA = "minNavigationBar";
    private static final String KEY_NAVIGATION_BAR_STATUS = "navigationbar_is_min";
    private static final String NAVIGATION_ACTION = "com.huawei.navigationbar.statuschange";
    private static final int NAVIGATION_BAR_HIDE = 1;
    private static final int NAVIGATION_BAR_SHOW = 0;
    private static final String TAG = "NavigationBarHandler";
    private final int mBarHeightLand;
    private final int mBarHeightPort;
    private Context mContext;
    private WeakHashMap<Listener, Object> mListeners = new WeakHashMap<>();
    private int mBarStatus = 0;

    public interface Listener {
        void onNavigationBarChanged(boolean z, int i);
    }

    public NavigationBarHandler(Context context) {
        this.mContext = context;
        this.mBarHeightPort = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", OsType.ANDROID));
        this.mBarHeightLand = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", OsType.ANDROID));
        updateStatus();
        notifyNavigationBarChanged();
    }

    @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        boolean booleanExtra;
        if (intent == null) {
            LogUtil.d(TAG, "onReceiveMsgintent is null");
            return;
        }
        if (context == null) {
            LogUtil.d(TAG, "onReceiveMsg context is null");
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        if (NAVIGATION_ACTION.equals(safeIntent.getAction()) && this.mBarStatus != (booleanExtra = safeIntent.getBooleanExtra(KEY_NAVIGATION_BAR_EXTRA, false))) {
            this.mBarStatus = booleanExtra ? 1 : 0;
            notifyNavigationBarChanged();
        }
    }

    public void update() {
        updateStatus();
        notifyNavigationBarChanged();
    }

    private boolean updateStatus() {
        int i = Settings.Global.getInt(this.mContext.getContentResolver(), "navigationbar_is_min", 0);
        if (this.mBarStatus == i) {
            return false;
        }
        this.mBarStatus = i;
        return true;
    }

    public final int getHeight() {
        if (this.mBarStatus == 0) {
            return LayoutHelper.isPort() ? this.mBarHeightPort : this.mBarHeightLand;
        }
        return 0;
    }

    private void notifyNavigationBarChanged() {
        synchronized (this) {
            Iterator<Listener> it = this.mListeners.keySet().iterator();
            while (it.hasNext()) {
                it.next().onNavigationBarChanged(this.mBarStatus == 0, getHeight());
            }
        }
    }
}
