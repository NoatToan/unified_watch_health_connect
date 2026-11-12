package com.huawei.haf.application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BroadcastManager {
    private static final Map<BroadcastReceiver, List<BroadcastReceiver>> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, BroadcastReceiver> f5792a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f5793c = new Object();

    private BroadcastManager() {
    }

    public static void c(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        c(broadcastReceiver, intentFilter, null, "android.intent.action.LOCALE_CHANGED");
    }

    public static void l(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, "android.intent.action.LOCALE_CHANGED")) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void f(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        b(broadcastReceiver, intentFilter, SecurityConstant.e, false, "com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY");
    }

    public static void i(BroadcastReceiver broadcastReceiver) {
        h(broadcastReceiver);
        g(broadcastReceiver);
        j(broadcastReceiver);
    }

    public static void p(BroadcastReceiver broadcastReceiver) {
        r(broadcastReceiver);
        q(broadcastReceiver);
        t(broadcastReceiver);
    }

    public static void h(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        c(broadcastReceiver, intentFilter, null, "android.intent.action.SCREEN_ON");
    }

    public static void r(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, "android.intent.action.SCREEN_ON")) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void g(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        c(broadcastReceiver, intentFilter, null, "android.intent.action.SCREEN_OFF");
    }

    public static void q(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, "android.intent.action.SCREEN_OFF")) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void j(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        c(broadcastReceiver, intentFilter, null, "android.intent.action.USER_PRESENT");
    }

    public static void t(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, "android.intent.action.USER_PRESENT")) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void b(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(Constants.CLICK_STATUS_BAR_ACTION);
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        b(broadcastReceiver, intentFilter, Constants.SYSTEM_UI_PERMISSION, true, Constants.CLICK_STATUS_BAR_ACTION);
    }

    public static void k(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, Constants.CLICK_STATUS_BAR_ACTION)) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void d(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        b(broadcastReceiver, intentFilter, SecurityConstant.f5920a, false, HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
    }

    public static void n(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, HwWatchFaceApi.ACTION_FOREGROUND_STATUS)) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, new IntentFilter("com.huawei.haf.intent.action.PROCESS_STATUS_CHANGE"));
    }

    public static void m(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void e(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.haf.intent.action.DEBUG_SWITCH_LOG");
        intentFilter.addAction("com.huawei.haf.intent.action.DEBUG_SWITCH_APP");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        b(broadcastReceiver, intentFilter, "android.permission.SET_DEBUG_APP", true, "com.huawei.haf.intent.action.DEBUG_SWITCH_LOG");
    }

    public static void o(BroadcastReceiver broadcastReceiver) {
        if (b(broadcastReceiver, "com.huawei.haf.intent.action.DEBUG_SWITCH_LOG")) {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        }
    }

    private static void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, String str2) {
        if (broadcastReceiver == null) {
            return;
        }
        synchronized (f5793c) {
            a(broadcastReceiver, intentFilter, str, -1, str2);
        }
    }

    private static void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, boolean z, String str2) {
        int i;
        if (broadcastReceiver == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            i = z ? 2 : 4;
        } else {
            i = -1;
        }
        synchronized (f5793c) {
            a(broadcastReceiver, intentFilter, str, i, str2);
        }
    }

    private static void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i, String str2) {
        Map<String, BroadcastReceiver> map = f5792a;
        BroadcastReceiver broadcastReceiverD = map.get(str2);
        if (broadcastReceiverD == null) {
            broadcastReceiverD = d(str2);
        }
        Map<BroadcastReceiver, List<BroadcastReceiver>> map2 = d;
        List<BroadcastReceiver> arrayList = map2.get(broadcastReceiverD);
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            arrayList.add(broadcastReceiver);
            map.put(str2, broadcastReceiverD);
            map2.put(broadcastReceiverD, arrayList);
            e(broadcastReceiverD, intentFilter, str, i);
        } else if (arrayList.contains(broadcastReceiver)) {
            LogUtil.e("HAF_BroadcastManager", "duplicate registration exists action=", str2, ", receiver=", broadcastReceiver.toString());
        } else {
            arrayList.add(broadcastReceiver);
        }
        int size = arrayList.size();
        if (!Constants.CLICK_STATUS_BAR_ACTION.equals(str2) || size % 10 == 1) {
            LogUtil.b("HAF_BroadcastManager", "registerSystemReceiver action=", str2, ", size=", Integer.valueOf(size), ", map=", Integer.valueOf(map2.size()));
        }
    }

    private static void e(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        Context contextB = BaseApplication.b();
        if (i < 0) {
            contextB.registerReceiver(broadcastReceiver, intentFilter, str, null);
        } else {
            contextB.registerReceiver(broadcastReceiver, intentFilter, str, null, i);
        }
    }

    private static BroadcastReceiver d(String str) {
        if ("com.huawei.haf.intent.action.DEBUG_SWITCH_LOG".equals(str)) {
            return new DebugSwitchReceiver();
        }
        return new InnerBroadcastReceiver();
    }

    private static boolean b(BroadcastReceiver broadcastReceiver, String str) {
        if (broadcastReceiver == null) {
            return false;
        }
        synchronized (f5793c) {
            d(broadcastReceiver, str);
        }
        return true;
    }

    private static void d(BroadcastReceiver broadcastReceiver, String str) {
        Map<String, BroadcastReceiver> map = f5792a;
        BroadcastReceiver broadcastReceiver2 = map.get(str);
        List<BroadcastReceiver> list = broadcastReceiver2 != null ? d.get(broadcastReceiver2) : null;
        if (list == null) {
            return;
        }
        if (!list.remove(broadcastReceiver)) {
            LogUtil.b("HAF_BroadcastManager", "duplicate deregistration exists action=", str, ", receiver=", broadcastReceiver.toString());
            return;
        }
        int size = list.size();
        if (size == 0) {
            s(broadcastReceiver2);
            d.remove(broadcastReceiver2);
            map.remove(str);
        }
        if (!Constants.CLICK_STATUS_BAR_ACTION.equals(str) || size % 10 == 0) {
            LogUtil.b("HAF_BroadcastManager", "unregisterSystemReceiver action=", str, ", size=", Integer.valueOf(size), ", map=", Integer.valueOf(d.size()));
        }
    }

    private static void s(BroadcastReceiver broadcastReceiver) {
        try {
            BaseApplication.b().unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            LogUtil.e("HAF_BroadcastManager", "unregisterSystemReceiver ex=", LogUtil.c(e));
        }
    }

    static class InnerBroadcastReceiver extends BroadcastReceiver {
        private InnerBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(action) && !"com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY".equals(action)) {
                LogUtil.b("HAF_BroadcastManager", "onReceive ", intent);
            }
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
    }
}
