package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.utlis.SearchDeviceThreadManager;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes43.dex */
public class tap {
    private CountDownLatch e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<rba> f48875c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<rba> f48874b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<dru> f48873a = new ArrayList();
    private SearchDeviceThreadManager f = SearchDeviceThreadManager.b();
    private List<dru> d = new ArrayList(16);
    private HashMap<String, Integer> i = new HashMap<>(16);

    private void b() {
        this.f48875c.clear();
        rej rejVar = new rej(null);
        if (njy.e(rejVar.d())) {
            LogUtil.j("DeviceSearchUtil", "alldevices is null");
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        }
        this.f48875c.addAll(rejVar.d());
        LogUtil.a("DeviceSearchUtil", "allDevices size: ", Integer.valueOf(this.f48875c.size()));
    }

    public Map<String, Object> a(String str) {
        if (njy.e(this.f48875c)) {
            b();
        }
        this.f48874b.clear();
        this.f48873a.clear();
        this.e = new CountDownLatch(2);
        this.f.e(new SearchDeviceThreadManager.SearchCallback() { // from class: tap.1
            @Override // com.huawei.ui.device.utlis.SearchDeviceThreadManager.SearchCallback
            public void onSearchResult(List<rba> list) {
                tap.this.f48874b = list;
                tap.this.e.countDown();
            }
        });
        d();
        this.f.d(str, this.f48875c);
        try {
            this.e.await();
        } catch (InterruptedException e) {
            LogUtil.e("DeviceSearchUtil", "loadData failed, cause InterruptedException happened: " + e.getCause());
        }
        HashMap map = new HashMap();
        if (njy.e(this.f48874b)) {
            return map;
        }
        map.put("ALL_DEVICE_KEY", this.f48874b);
        map.put("CONNECTED_DEVICE_KEY", this.f48873a);
        return map;
    }

    private void d() {
        LogUtil.a("DeviceSearchUtil", "enter initList");
        this.d.clear();
        ThreadPoolManager.c().execute(new Runnable() { // from class: tap.5
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(16);
                ArrayList arrayList2 = new ArrayList(16);
                tap.this.d(arrayList, arrayList2);
                ArrayList arrayList3 = new ArrayList(16);
                for (ContentValues contentValues : dmp.d().f()) {
                    String asString = contentValues.getAsString("productId");
                    String asString2 = contentValues.getAsString("uniqueId");
                    if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                        LogUtil.j("DeviceSearchUtil", "initDeviceList : productId or deviceIdentify is empty");
                    } else {
                        elh elhVarD = ResourceManager.c().d(asString);
                        if (elhVarD != null && !elhVarD.l().b().trim().isEmpty()) {
                            dru druVarB = ekd.b(elhVarD);
                            druVarB.a(contentValues);
                            druVarB.d(new dsa("deviceUsedTime").b(dxw.d(), contentValues.getAsString("uniqueId")));
                            arrayList3.add(druVarB);
                        }
                    }
                }
                if (njy.b(arrayList3)) {
                    arrayList.addAll(arrayList3);
                }
                Collections.sort(arrayList2);
                Collections.sort(arrayList);
                arrayList.addAll(0, arrayList2);
                tap.this.f48873a = arrayList;
                LogUtil.a("DeviceSearchUtil", "productInfoList size: ", Integer.valueOf(arrayList.size()));
                tap.this.e.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<dru> list, List<dru> list2) {
        LogUtil.a("DeviceSearchUtil", "enter setList");
        ArrayList<dxy> arrayListJ = lvl.j();
        int i = arrayListJ.size() > 1 ? 2 : 1;
        LogUtil.a("DeviceSearchUtil", "enter setList displayType：", Integer.valueOf(i));
        int iA = a(arrayListJ);
        for (dxy dxyVar : arrayListJ) {
            dru druVar = new dru();
            druVar.d(1);
            druVar.c(i);
            druVar.c(dxyVar);
            if (dxyVar.c() == 1 && dxyVar.b() == 2) {
                if (iA > 1) {
                    druVar.d(System.currentTimeMillis() + ((long) this.i.get(dxyVar.d()).intValue()));
                } else {
                    druVar.d(System.currentTimeMillis());
                }
                LogUtil.a("DeviceSearchUtil", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear current connected time:", Long.valueOf(System.currentTimeMillis()), ",compareTime:", Long.valueOf(druVar.c()));
                e(list2, druVar);
            } else {
                druVar.d(dxyVar.j());
                LogUtil.a("DeviceSearchUtil", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear last connected time:", Long.valueOf(dxyVar.j()));
                list.add(druVar);
            }
        }
        LogUtil.a("DeviceSearchUtil", "has wear deviceInfoForWears : ", arrayListJ.toArray());
    }

    private void e(List<dru> list, dru druVar) {
        if (!list.isEmpty()) {
            Object objI = list.get(0).i();
            if (objI instanceof dxy) {
                if (((dxy) objI).b() == 2) {
                    LogUtil.a("DeviceSearchUtil", "add to normal");
                    a(list, druVar);
                    return;
                } else {
                    LogUtil.a("DeviceSearchUtil", "add to first");
                    list.add(0, druVar);
                    return;
                }
            }
            return;
        }
        list.add(druVar);
    }

    private void a(List<dru> list, dru druVar) {
        if (list.size() > 1) {
            list.add(1, druVar);
        } else {
            list.add(druVar);
        }
    }

    private int a(ArrayList<dxy> arrayList) {
        ArrayList arrayList2 = new ArrayList(16);
        int i = 0;
        for (dxy dxyVar : arrayList) {
            if (dxyVar.c() == 1 && dxyVar.b() == 2) {
                i++;
                dru druVar = new dru();
                druVar.c(dxyVar);
                druVar.d(dxyVar.j());
                arrayList2.add(druVar);
            }
        }
        if (i > 1) {
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                dxy dxyVar2 = (dxy) ((dru) arrayList2.get(i2)).i();
                LogUtil.d("DeviceSearchUtil", "getConnectedDevices connectedDevice name:", dxyVar2.i());
                this.i.put(dxyVar2.d(), Integer.valueOf((size - i2) * 10));
            }
        }
        LogUtil.a("DeviceSearchUtil", "getConnectedDevices connectedCount:", Integer.valueOf(i));
        return i;
    }
}
