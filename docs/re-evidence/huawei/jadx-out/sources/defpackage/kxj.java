package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hihealth.HiHealthUserPermission;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kvr f39584b;

    private kxj() {
        this.f39584b = kvr.a();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kxj f39585c = new kxj();
    }

    public static kxj a(Context context) {
        return c.f39585c;
    }

    public long b(HiHealthUserPermission hiHealthUserPermission) {
        LogUtil.d("Debug_HiHealthUserPermissionManager", "insertHealthUserPermissionData()");
        if (hiHealthUserPermission == null) {
            return 200004L;
        }
        return this.f39584b.insert(kvw.b(hiHealthUserPermission));
    }

    public List<HiHealthUserPermission> b(int i) {
        LogUtil.d("Debug_HiHealthUserPermissionManager", "enter queryHealthUserPermissionData appId = ", Integer.valueOf(i));
        return kwf.ac(this.f39584b.query(e(), d(i), null, null, null));
    }

    public List<HiHealthUserPermission> a() {
        return kwf.ac(this.f39584b.query(null, null, null, null, null));
    }

    public boolean b(int i, int i2) {
        Cursor cursorQuery = this.f39584b.query(c(), new String[]{String.valueOf(i), String.valueOf(i2)}, null, null, null);
        if (cursorQuery == null) {
            return false;
        }
        int count = cursorQuery.getCount();
        LogUtil.a("Debug_HiHealthUserPermissionManager", "queryCursor count", Integer.valueOf(count));
        cursorQuery.close();
        if (count == 1) {
            return true;
        }
        if (count == 0) {
            return false;
        }
        LogUtil.d("Debug_HiHealthUserPermissionManager", "queryAppScope scope ilegal");
        return true;
    }

    public HiHealthUserPermission c(int i, int i2) {
        Cursor cursorQuery = this.f39584b.query(c(), new String[]{String.valueOf(i), String.valueOf(i2)}, null, null, null);
        List<HiHealthUserPermission> listAc = kwf.ac(cursorQuery);
        HiHealthUserPermission hiHealthUserPermission = new HiHealthUserPermission();
        if (listAc != null && !listAc.isEmpty()) {
            LogUtil.d("Debug_HiHealthUserPermissionManager", "queryScope hiHealthUserPermission", listAc.toString());
            hiHealthUserPermission = listAc.get(0);
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return hiHealthUserPermission;
    }

    public boolean d(int i, int i2) {
        HiHealthUserPermission hiHealthUserPermissionC = c(i, i2);
        return hiHealthUserPermissionC != null && hiHealthUserPermissionC.getAllowRead() == 1;
    }

    public boolean e(int i, int i2) {
        HiHealthUserPermission hiHealthUserPermissionC = c(i, i2);
        return hiHealthUserPermissionC != null && hiHealthUserPermissionC.getAllowWrite() == 1;
    }

    public void e(int i, int i2, int i3, boolean z) {
        boolean zB = b(i, i2);
        LogUtil.a("Debug_HiHealthUserPermissionManager", "insertOrUpdateUserPermissionRead type = ", Integer.valueOf(i3), ", scopeId = ", Integer.valueOf(i2), ", isChecked = ", Boolean.valueOf(z));
        if (zB) {
            c(i, i2, i3, z);
        } else {
            d(i, i2, i3, z);
        }
    }

    private void c(int i, int i2, int i3, boolean z) {
        LogUtil.a("Debug_HiHealthUserPermissionManager", "insertOrUpdateHasScope update");
        HiHealthUserPermission hiHealthUserPermission = new HiHealthUserPermission();
        hiHealthUserPermission.setAppId(i);
        if (z) {
            if (i3 == 0) {
                hiHealthUserPermission.setAllowRead(1);
                hiHealthUserPermission.setAllowWrite(c(i, i2).getAllowWrite());
            } else if (i3 == 1) {
                hiHealthUserPermission.setAllowWrite(1);
                hiHealthUserPermission.setAllowRead(c(i, i2).getAllowRead());
            } else {
                LogUtil.j("Debug_HiHealthUserPermissionManager", "insertOrUpdateHasScope isChecked type is other number");
            }
        } else if (i3 == 0) {
            hiHealthUserPermission.setAllowRead(2);
            hiHealthUserPermission.setAllowWrite(c(i, i2).getAllowWrite());
        } else if (i3 == 1) {
            hiHealthUserPermission.setAllowWrite(2);
            hiHealthUserPermission.setAllowRead(c(i, i2).getAllowRead());
        } else {
            LogUtil.j("Debug_HiHealthUserPermissionManager", "insertOrUpdateHasScope type is other number");
        }
        hiHealthUserPermission.setScopeId(i2);
        LogUtil.d("Debug_HiHealthUserPermissionManager", hiHealthUserPermission.toString());
        a(hiHealthUserPermission);
    }

    private void d(int i, int i2, int i3, boolean z) {
        LogUtil.a("Debug_HiHealthUserPermissionManager", "insertOrUpdateNoScope insert");
        HiHealthUserPermission hiHealthUserPermission = new HiHealthUserPermission();
        hiHealthUserPermission.setAppId(i);
        if (z) {
            if (i3 == 0) {
                hiHealthUserPermission.setAllowRead(1);
            } else if (i3 == 1) {
                hiHealthUserPermission.setAllowWrite(1);
            } else {
                LogUtil.j("Debug_HiHealthUserPermissionManager", "insertOrUpdateNoScope isChecked type is other number");
            }
        } else if (i3 == 0) {
            hiHealthUserPermission.setAllowRead(2);
        } else if (i3 == 1) {
            hiHealthUserPermission.setAllowWrite(2);
        } else {
            LogUtil.j("Debug_HiHealthUserPermissionManager", "insertOrUpdateNoScope type is other number");
        }
        hiHealthUserPermission.setScopeId(i2);
        b(hiHealthUserPermission);
    }

    public int a(HiHealthUserPermission hiHealthUserPermission) {
        if (hiHealthUserPermission == null) {
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        return this.f39584b.update(kvw.b(hiHealthUserPermission), c(), a(hiHealthUserPermission.getAppId(), hiHealthUserPermission.getScopeId()));
    }

    public int a(int i) {
        LogUtil.a("Debug_HiHealthUserPermissionManager", "enter deleteHealthUserPermissionData appId = ", Integer.valueOf(i));
        int iDelete = this.f39584b.delete(e(), d(i));
        LogUtil.a("Debug_HiHealthUserPermissionManager", "deleteHealthUserPermissionData deleteResult", Integer.valueOf(iDelete));
        return iDelete;
    }

    private String c() {
        return "app_id =? and scope_id =? ";
    }

    private String e() {
        return "app_id =? ";
    }

    private String[] d(int i) {
        return new String[]{Integer.toString(i)};
    }

    private String[] a(int i, int i2) {
        return new String[]{String.valueOf(i), String.valueOf(i2)};
    }
}
