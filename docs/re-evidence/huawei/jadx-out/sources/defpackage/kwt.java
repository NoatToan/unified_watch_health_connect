package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyi f39567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kus f39568c;

    private kwt() {
        this.f39568c = kus.b();
        this.f39567b = new kyi();
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final kwt f39569b = new kwt();
    }

    public static kwt b() {
        return a.f39569b;
    }

    public int g(int i) {
        Object objD = this.f39567b.d(i);
        if (objD != null) {
            return ((Integer) objD).intValue();
        }
        return m(i);
    }

    public int a(int i, int i2, int i3) {
        return d(i, i2, i3);
    }

    public int d(kym kymVar) {
        return b(kymVar);
    }

    public int c(int i) {
        return kwf.f(this.f39568c.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null), "device_id");
    }

    public int d(int i) {
        return kwf.f(this.f39568c.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null), "app_id");
    }

    public List<Integer> e(int i) {
        return kwf.i(this.f39568c.query("user_id =? and device_id >=? and app_id >=? ", e(i, 0, 0), null, null, null));
    }

    public List<Integer> f(int i) {
        return kwf.i(this.f39568c.query("user_id =? and device_id >?  and app_id >? ", e(i, 0, 0), null, null, null));
    }

    public List<Integer> a(int i, int i2) {
        return kwf.i(this.f39568c.query("user_id =? and device_id =? and app_id >? ", e(i, i2, 0), null, null, null));
    }

    public List<Integer> d(int i, int i2) {
        return kwf.i(this.f39568c.query("user_id =? and device_id >=? and app_id =? ", e(i, 0, i2), null, null, null));
    }

    public List<Integer> h(int i) {
        return kwf.i(this.f39568c.query("user_id =? and device_id >?  and app_id >?  and sync_status =? and need_uploaddata =? ", new String[]{Integer.toString(i), Integer.toString(0), Integer.toString(0), Integer.toString(1), Integer.toString(1)}, null, null, null));
    }

    public List<Integer> b(int i) {
        return kwf.i(this.f39568c.query("user_id =? and device_id >?  and app_id >?  and sync_status =? ", new String[]{Integer.toString(i), Integer.toString(0), Integer.toString(0), Integer.toString(1)}, null, null, null));
    }

    public List<Integer> b(int i, int i2) {
        return kwf.i(this.f39568c.query("user_id =? and app_id =? and device_id >?  and app_id >?  and sync_status =? ", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(0), Integer.toString(0), Integer.toString(1)}, null, null, null));
    }

    public List<Integer> i(int i) {
        return kwf.i(this.f39568c.query("user_id =? and device_id >?  and app_id >? ", new String[]{Integer.toString(i), Integer.toString(0), Integer.toString(0)}, null, null, null), "device_id");
    }

    public List<kym> c(int i, List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("user_id =? ");
        String[] strArr = new String[size + 1];
        strArr[0] = Integer.toString(i);
        kwb.e("_id", list, stringBuffer, strArr, 1);
        return kwf.h(this.f39568c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public long a(kym kymVar) {
        if (kymVar == null) {
            return 0L;
        }
        return this.f39568c.update(kvw.a(kymVar), c(), e(kymVar.i(), kymVar.d(), kymVar.b()));
    }

    public long c(kym kymVar) {
        if (kymVar == null) {
            return 0L;
        }
        return this.f39568c.update(kvw.b(kymVar), c(), e(kymVar.i(), kymVar.d(), kymVar.b()));
    }

    public List<kym> e(int i, int i2) {
        return kwf.h(this.f39568c.query("user_id =? and device_id >?  and sync_status =? ", new String[]{Integer.toString(i), Integer.toString(0), Integer.toString(i2)}, null, null, null));
    }

    public List<kym> c(int i, int i2) {
        return kwf.h(this.f39568c.query("user_id =? and device_id =? and app_id >? ", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(0)}, null, null, null));
    }

    public kym j(int i) {
        return kwf.f(this.f39568c.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null));
    }

    public kym b(int i, int i2, int i3) {
        return kwf.f(this.f39568c.query(c(), e(i, i3, i2), null, null, null));
    }

    public int e(long j, int i) {
        return kwf.f(this.f39568c.query("cloud_device =? and app_id =? ", new String[]{Long.toString(j), Integer.toString(i)}, null, null, null), "device_id");
    }

    public List<Integer> c(Context context, Long l, int i) {
        try {
            List<Integer> listA = b().a(l.longValue());
            if (!HiCommonUtil.b(listA)) {
                return listA;
            }
            HiDeviceInfo hiDeviceInfoE = liq.e(context, l.longValue());
            if (hiDeviceInfoE != null && "-1".equals(hiDeviceInfoE.getDeviceUniqueCode())) {
                int iA = b().a(i, kwy.b(context).c(hiDeviceInfoE.getDeviceUniqueCode()), kud.a().c());
                if (iA > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(iA));
                    return arrayList;
                }
                return new ArrayList(0);
            }
            return new ArrayList(0);
        } catch (lif e) {
            ReleaseLogUtil.e("Debug_ClientManager", "Failed to getOneBindDevice:", ExceptionUtils.c(e));
            return new ArrayList(0);
        }
    }

    public List<Integer> a(long j) {
        return kwf.i(this.f39568c.query("cloud_device =? ", new String[]{Long.toString(j)}, null, null, null));
    }

    private long g(kym kymVar) {
        LogUtil.d("Debug_ClientManager", "insertClientData()");
        long jInsert = this.f39568c.insert(kvw.e(kymVar));
        LogUtil.d("Debug_ClientManager", "insertClientData() add  insert = ", Long.valueOf(jInsert));
        b(jInsert, kymVar);
        return jInsert;
    }

    private void b(long j, kym kymVar) {
        if (j <= 0) {
            return;
        }
        LogUtil.d("Debug_ClientManager", "insertClientData() addCache  clientID = ", Long.valueOf(j), ", hiHealthContext = ", kymVar);
        kymVar.a((int) j);
        int i = kymVar.i();
        int iD = kymVar.d();
        int iB = kymVar.b();
        kyj kyjVarC = kyj.c();
        kyjVarC.a(i);
        kyjVarC.d(iB, i);
        kyjVarC.b(i, iD);
        List<Integer> listC = kyjVarC.c(kymVar.i(), kymVar.d());
        LogUtil.a("Debug_ClientManager", "insertClientData() add  insert = ", Long.valueOf(j), ", cache clients = ", HiJsonUtil.d(listC));
        HiDeviceInfo hiDeviceInfoB = kwy.d().b(iD);
        if (hiDeviceInfoB != null) {
            LogUtil.a("Debug_ClientManager", "add cache by key is deviceUuid ,clients = ", HiJsonUtil.d(listC));
            kyjVarC.c(i, hiDeviceInfoB.getDeviceUniqueCode(), listC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    private int m(int i) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    int iN = n(i);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return iN;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("HiH_ClientManager", "getStatClient ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private int n(int i) {
        int iF = kwf.f(this.f39568c.query(c(), e(i, 0, 0), null, null, null), "_id");
        if (iF <= 0) {
            kym kymVar = new kym(i, 0, 0);
            kymVar.h(0);
            kymVar.c(1);
            iF = (int) g(kymVar);
        }
        LogUtil.d("Debug_ClientManager", "getStatClientByUser userClient = ", Integer.valueOf(iF));
        this.f39567b.b(i, Integer.valueOf(iF));
        return iF;
    }

    private boolean l(int i) {
        List<Integer> listD = kwi.b().d();
        if (listD == null) {
            LogUtil.d("Debug_ClientManager", "isKitAppId kitAppIds = null");
            return false;
        }
        LogUtil.d("Debug_ClientManager", "isKitAppId appId = ", Integer.valueOf(i), " kitAppIds = ", listD.toString());
        Iterator<Integer> it = listD.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    private int d(int i, int i2, int i3) throws Throwable {
        boolean zB;
        LogUtil.d("Debug_ClientManager", "getStatClientByUser deviceID = ", Integer.valueOf(i2), ",userID = ", Integer.valueOf(i));
        int iF = kwf.f(this.f39568c.query(c(), e(i, i2, i3), null, null, null), "_id");
        if (iF > 0) {
            return iF;
        }
        try {
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    int iC = c(i, i2, i3);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return iC;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("HiH_ClientManager", "getClient: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private int c(int i, int i2, int i3) {
        int iF = kwf.f(this.f39568c.query(c(), e(i, i2, i3), null, null, null), "_id");
        if (iF <= 0) {
            kym kymVar = new kym(i, i2, i3);
            if (l(i3)) {
                kymVar.h(4);
                kymVar.c(0);
            } else {
                kymVar.h(0);
                kymVar.c(1);
            }
            iF = (int) g(kymVar);
        }
        LogUtil.d("Debug_ClientManager", "getStatClientByDevice client = ", Integer.valueOf(iF));
        return iF;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    private int b(kym kymVar) throws Throwable {
        boolean zB;
        boolean z = false;
        int iF = kwf.f(this.f39568c.query(c(), e(kymVar.i(), kymVar.d(), kymVar.b()), null, null, null), "_id");
        if (iF > 0) {
            return iF;
        }
        try {
            try {
                LogUtil.d("Debug_ClientManager", "getClientByAllSync hiHealthContext = ", kymVar);
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    int iE = e(kymVar);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return iE;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("HiH_ClientManager", "getSyncClient: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (z) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private int e(kym kymVar) {
        int iF = kwf.f(this.f39568c.query(c(), e(kymVar.i(), kymVar.d(), kymVar.b()), null, null, null), "_id");
        if (iF <= 0) {
            kymVar.c(1);
            iF = (int) g(kymVar);
        }
        LogUtil.d("Debug_ClientManager", "getClientByAllSync client = ", Integer.valueOf(iF));
        return iF;
    }

    private String c() {
        return "user_id =? and device_id =? and app_id =? ";
    }

    private String[] e(int i, int i2, int i3) {
        return new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)};
    }

    public void f(int i, int i2) {
        b(i, b(i, i2));
    }

    private void b(int i, List<Integer> list) {
        if (list == null) {
            LogUtil.e("Debug_ClientManager", "clientid list is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("need_uploaddata", (Integer) 0);
        Hashtable<Integer, List<Integer>> hashtableG = lgp.g();
        if (hashtableG != null) {
            List<Integer> list2 = hashtableG.get(Integer.valueOf(i));
            if (!HiCommonUtil.b(list2)) {
                list.removeAll(list2);
            }
            lgp.c(i);
        }
        for (Integer num : list) {
            if (0 >= this.f39568c.update(contentValues, "_id =? ", new String[]{Integer.toString(num.intValue())})) {
                LogUtil.a("Debug_ClientManager", "updateClientNeedFlag false clientid=", num);
            }
        }
    }

    public int o(int i) {
        return kwf.f(this.f39568c.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null), "user_id");
    }

    public List<kym> a(int i) {
        return kwf.h(this.f39568c.query("user_id =? and device_id >? ", new String[]{Integer.toString(i), Integer.toString(0)}, null, null, null));
    }

    public long k(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("need_uploaddata", (Integer) 1);
        return this.f39568c.update(contentValues, "_id =? ", new String[]{Integer.toString(i)});
    }

    public void a() {
        this.f39567b.a();
    }
}
