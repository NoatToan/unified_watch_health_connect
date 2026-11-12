package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eqt {
    private emd d;
    private boolean e;

    private eqt() {
        this.e = false;
    }

    static class b {
        private static final eqt e = new eqt();
    }

    public static eqt c() {
        return b.e;
    }

    public boolean a(String str) {
        return e(str) == 1;
    }

    public boolean c(String str) {
        return era.j(str);
    }

    public int e(String str) {
        LogUtil.a("AutoConnectHelper", "uniqueId ", CommonUtil.n(str));
        int iC = SharedPreferenceManager.c(String.valueOf(10000), str, 2);
        LogUtil.a("AutoConnectHelper", "connectMode = ", Integer.valueOf(iC));
        return iC;
    }

    public void b(String str, int i) {
        LogUtil.a("AutoConnectHelper", "uniqueId ", CommonUtil.n(str));
        if (i == 0) {
            i = 2;
        }
        SharedPreferenceManager.d(String.valueOf(10000), str, i);
    }

    public boolean e() {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        Object systemService = BaseApplication.getContext().getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null) {
            return false;
        }
        LogUtil.d("AutoConnectHelper", "top activity is ", componentName.getClassName());
        return esh.c() && ((SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)).isSportServiceRunning();
    }

    public boolean b(String str) {
        return a(str) && !e();
    }

    public boolean e(String str, String str2) {
        synchronized (this) {
            LogUtil.a("AutoConnectHelper", "connectDevice");
            if (!c().b(str2)) {
                LogUtil.a("AutoConnectHelper", "Automatic connection is not supported.");
                return false;
            }
            if (emh.b().g()) {
                LogUtil.a("AutoConnectHelper", "device connected");
                return false;
            }
            if (this.e && !TextUtils.isEmpty(emh.b().d())) {
                LogUtil.a("AutoConnectHelper", "The device that is currently being connected is ", CommonUtil.n(emh.b().d()));
                return false;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.e = true;
                a(str, str2);
                this.d.a();
                return true;
            }
            LogUtil.a("AutoConnectHelper", "query device mac is error");
            return false;
        }
    }

    private void a(String str, String str2) {
        emd emdVar = this.d;
        if (emdVar == null) {
            LogUtil.a("AutoConnectHelper", "initRopeDataManager");
            this.d = new emd(str, str2, null);
        } else {
            emdVar.e(str, str2);
        }
    }

    public void d(String str, String str2) {
        ContentValues next;
        ArrayList<ContentValues> bondedDeviceByProductId = ((DeviceManagerApi) Services.b("PluginDevice", DeviceManagerApi.class)).getBondedDeviceByProductId(str);
        if (bondedDeviceByProductId == null || bondedDeviceByProductId.size() <= 0) {
            return;
        }
        Iterator<ContentValues> it = bondedDeviceByProductId.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getAsString("uniqueId").equals(str2));
        if (next == null) {
            LogUtil.j("AutoConnectHelper", "removeOrAddAutoConnectInfo device info is null");
        } else if (a(next.getAsString("uniqueId"))) {
            b(next);
        } else {
            c(next);
        }
    }

    private void b(ContentValues contentValues) {
        Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("operation", 1);
        intent.putExtra("productId", contentValues.getAsString("productId"));
        intent.putExtra("uniqueId", contentValues.getAsString("uniqueId"));
        intent.putExtra(Wpt.MODE, contentValues.getAsInteger(Wpt.MODE));
        intent.putExtra(TtmlNode.TEXT_EMPHASIS_AUTO, contentValues.getAsInteger(TtmlNode.TEXT_EMPHASIS_AUTO));
        intent.putExtra(EventMonitorRecord.ADD_TIME, contentValues.getAsLong(EventMonitorRecord.ADD_TIME));
        intent.putExtra("name", contentValues.getAsString("name"));
        intent.putExtra("kind", contentValues.getAsString("kind"));
        LogUtil.a("AutoConnectHelper", "addAutoConnectInfo = ", contentValues.getAsString("name"));
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void c(ContentValues contentValues) {
        Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("operation", -1);
        intent.putExtra("productId", contentValues.getAsString("productId"));
        intent.putExtra("uniqueId", contentValues.getAsString("uniqueId"));
        LogUtil.a("AutoConnectHelper", "removeAutoConnectInfo = ", contentValues.getAsString("name"));
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public void e(boolean z) {
        this.e = z;
    }

    public boolean d() {
        return this.e;
    }

    public void b(String str, String str2) {
        LogUtil.a("AutoConnectHelper", "updateMonitorProfileInfo");
        if (!c(str)) {
            LogUtil.a("AutoConnectHelper", "is not Support Auto Connect");
        } else if (!a(str2)) {
            LogUtil.a("AutoConnectHelper", "is share mode");
        } else {
            d(str, str2);
        }
    }
}
