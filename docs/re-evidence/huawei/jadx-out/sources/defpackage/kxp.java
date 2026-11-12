package defpackage;

import android.database.Cursor;
import com.huawei.hihealth.WearKitPermission;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwa f39592c;

    private kxp() {
        this.f39592c = kwa.e();
    }

    static class a {
        private static final kxp d = new kxp();
    }

    public static kxp b() {
        return a.d;
    }

    public List<WearKitPermission> d() {
        return kwf.ah(this.f39592c.query(null, null, null, null, null));
    }

    public List<WearKitPermission> c(int i) {
        LogUtil.d("Debug_WearKitManager", "enter queryWearKitData appId = ", Integer.valueOf(i));
        return kwf.ah(this.f39592c.query(a(), d(i), null, null, null));
    }

    public void a(int i, int i2, boolean z) {
        long jA;
        WearKitPermission wearKitPermissionA = a(i, i2);
        LogUtil.d("Debug_WearKitManager", "appId = ", Integer.valueOf(i));
        if (wearKitPermissionA != null) {
            LogUtil.a("Debug_WearKitManager", "insertOrUpdate update");
            if (z) {
                wearKitPermissionA.setAllow(1);
            } else {
                wearKitPermissionA.setAllow(0);
            }
            wearKitPermissionA.setModifiedTime(String.valueOf(System.currentTimeMillis()));
            jA = b(wearKitPermissionA);
        } else {
            LogUtil.a("Debug_WearKitManager", "insertOrUpdate insert");
            WearKitPermission wearKitPermission = new WearKitPermission();
            wearKitPermission.setAppId(i);
            if (z) {
                wearKitPermission.setAllow(1);
            } else {
                wearKitPermission.setAllow(0);
            }
            wearKitPermission.setModifiedTime(String.valueOf(System.currentTimeMillis()));
            wearKitPermission.setScopeId(i2);
            jA = a(wearKitPermission);
        }
        LogUtil.a("Debug_WearKitManager", "insertOrUpdate result = ", Long.valueOf(jA));
    }

    public int b(int i) {
        return this.f39592c.delete(c(), d(i));
    }

    private String c() {
        return "app_id =? ";
    }

    private WearKitPermission a(int i, int i2) {
        Cursor cursorQuery = this.f39592c.query(e(), new String[]{String.valueOf(i), String.valueOf(i2)}, null, null, null);
        List<WearKitPermission> listAh = kwf.ah(cursorQuery);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (njy.e(listAh)) {
            return null;
        }
        return listAh.get(0);
    }

    private String a() {
        return "app_id =? ";
    }

    private String e() {
        return "app_id =? and scope_id =? ";
    }

    private int b(WearKitPermission wearKitPermission) {
        return this.f39592c.update(kvw.d(wearKitPermission), e(), b(wearKitPermission.getAppId(), wearKitPermission.getScopeId()));
    }

    private long a(WearKitPermission wearKitPermission) {
        return this.f39592c.insert(kvw.d(wearKitPermission));
    }

    private String[] d(int i) {
        return new String[]{String.valueOf(i)};
    }

    private String[] b(int i, int i2) {
        return new String[]{String.valueOf(i), String.valueOf(i2)};
    }
}
