package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class dab {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f31569c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<IBaseResponseCallback> f31568a = new ArrayList<>();

    public static void d(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f31569c) {
            if (!f31568a.contains(iBaseResponseCallback)) {
                f31568a.add(iBaseResponseCallback);
            }
        }
    }

    public static void b(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f31569c) {
            f31568a.remove(iBaseResponseCallback);
        }
    }

    public static void d(Context context, String str) {
        LogUtil.a("LocalBroadcastManager", "sendBroadcast:", str);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager == null) {
            LogUtil.j("LocalBroadcastManager", "sendBroadcast, but localBroadcastManager is null");
            return;
        }
        if (str.equals("com.huawei.bone.action.FITNESS_USERINFO_UPDATED")) {
            UserInfomation userInfomationC = cuq.a(context).c();
            if (userInfomationC == null) {
                LogUtil.j("LocalBroadcastManager", "userInfo not useful,do not send localBR-ACTION_FITNESS_USERINFO_UPDATED");
                return;
            }
            Intent intent = new Intent(str);
            intent.putExtra("userInfo", userInfomationC);
            localBroadcastManager.sendBroadcast(intent);
            b();
            return;
        }
        localBroadcastManager.sendBroadcast(new Intent(str));
    }

    public static void b() {
        LogUtil.a("LocalBroadcastManager", "enter notifyCallback.");
        synchronized (f31569c) {
            Iterator<IBaseResponseCallback> it = f31568a.iterator();
            while (it.hasNext()) {
                it.next().a(0, null);
            }
        }
    }
}
