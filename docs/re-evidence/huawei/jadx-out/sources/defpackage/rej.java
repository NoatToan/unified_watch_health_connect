package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class rej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f47217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private edm f47218b;
    private String d;
    private JSONObject g;
    private List<raz> e = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<rba> f47219c = new ArrayList(16);
    private List<Map<String, List<eds>>> i = new ArrayList(16);

    public rej(List<String> list) {
        this.e.clear();
        this.f47219c.clear();
        this.i.clear();
        e();
        j();
        c();
        a(list);
        b();
    }

    private void e() {
        edm indexBean = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexBean();
        this.f47218b = indexBean;
        if (indexBean != null) {
            this.d = indexBean.b();
        }
    }

    private void j() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        File fileC = eek.c(eek.c() + this.d);
        if (fileC == null) {
            return;
        }
        this.g = eek.b(fileC);
    }

    private void c() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        File fileE = eek.e(eek.c() + this.d);
        if (fileE == null) {
            return;
        }
        this.f47217a = eek.b(fileE);
    }

    private void a(List<String> list) {
        edm edmVar = this.f47218b;
        if (edmVar == null) {
            LogUtil.j("GetDeviceListUtils", "setDeviceList, indexallBean is null");
            return;
        }
        List<edq> listE = edmVar.e();
        if (listE == null || listE.isEmpty()) {
            LogUtil.j("GetDeviceListUtils", "setDeviceList, deviceKindBeans is empty");
            return;
        }
        for (edq edqVar : listE) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(16);
            List<eds> listA = edqVar.a();
            if (listA == null) {
                LogUtil.j("GetDeviceListUtils", "setDeviceList, devicePluginInfos is empty");
            } else if (list == null || list.contains(edqVar.c())) {
                Iterator<eds> it = listA.iterator();
                while (it.hasNext()) {
                    c(linkedHashMap, it.next());
                }
                if (!linkedHashMap.isEmpty()) {
                    if ("SMART_HEADPHONES".equals(edqVar.c())) {
                        d(linkedHashMap);
                    }
                    String strA = a(edqVar.d());
                    if (!coq.d(this.e)) {
                        List<raz> list2 = this.e;
                        if (list2.get(list2.size() - 1).b().equals(strA)) {
                            List<Map<String, List<eds>>> list3 = this.i;
                            list3.get(list3.size() - 1).putAll(linkedHashMap);
                        }
                    }
                    raz razVar = new raz();
                    razVar.d(a(edqVar.d()));
                    razVar.e(edqVar.c());
                    razVar.a(a(edqVar.b()));
                    this.e.add(razVar);
                    this.i.add(linkedHashMap);
                }
            }
        }
    }

    private void d(Map<String, List<eds>> map) {
        List<eds> list = map.get("IDS_device_honor_band");
        if (list == null) {
            return;
        }
        Iterator<eds> it = list.iterator();
        while (it.hasNext()) {
            eds next = it.next();
            if (next != null && "IDS_DEVICE_HONOUR_WIRED_830_41".equals(next.n())) {
                it.remove();
                break;
            }
        }
        if (list.size() == 0) {
            map.remove("IDS_device_honor_band");
        }
    }

    private void c(Map<String, List<eds>> map, eds edsVar) {
        if (!eev.d(edsVar.a())) {
            LogUtil.j("GetDeviceListUtils", "app version is not supported");
            return;
        }
        if (njy.e(edsVar.aa()) || !PermissionDialogHelper.d(edsVar.aa().get(0))) {
            String strY = edsVar.y();
            if (Utils.o()) {
                if (TextUtils.equals(strY, "2") || TextUtils.equals(strY, "3")) {
                    c(edsVar, map);
                    return;
                }
                return;
            }
            if (TextUtils.equals(strY, "1") || TextUtils.equals(strY, "3")) {
                b(map, edsVar);
            }
        }
    }

    private void c(eds edsVar, Map<String, List<eds>> map) {
        if (!dxm.j()) {
            List<String> listAa = edsVar.aa();
            if (listAa.contains("b29df4e3-b1f7-4e40-960d-4cfb63ccca05") || listAa.contains("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4")) {
                return;
            }
            b(map, edsVar);
            return;
        }
        b(map, edsVar);
    }

    private void b(Map<String, List<eds>> map, eds edsVar) {
        List<eds> arrayList;
        if (!c(edsVar)) {
            LogUtil.j("GetDeviceListUtils", "setDeviceMap,uuid list is empty");
            return;
        }
        String strH = edsVar.h();
        if (!map.containsKey(strH) || (arrayList = map.get(strH)) == null) {
            arrayList = new ArrayList<>(16);
        }
        arrayList.add(edsVar);
        map.put(strH, arrayList);
    }

    private boolean c(eds edsVar) {
        List<edp> listI = edsVar.i();
        if (coq.d(listI)) {
            LogUtil.a("GetDeviceListUtils", "this device not support different brand");
            return true;
        }
        List<String> listAa = edsVar.aa();
        if (coq.d(listAa)) {
            LogUtil.j("GetDeviceListUtils", "setOtherBrandInfo, uuidList is null");
            return false;
        }
        if (listAa.contains("a4da0665-b209-4dfe-8617-cad54daf1b1f")) {
            edp edpVar = listI.get(0);
            if (edpVar.c().contains(BaseApplication.getContext().getResources().getConfiguration().locale.getCountry())) {
                edsVar.d(edpVar.a());
                edsVar.b(a(edpVar.a()));
            }
        }
        if (!listAa.contains("f98754bd-bc30-4c72-8d25-a1d17e13671b")) {
            return true;
        }
        edp edpVar2 = listI.get(0);
        if (!edpVar2.c().contains(BaseApplication.getContext().getResources().getConfiguration().locale.getCountry())) {
            return true;
        }
        edsVar.d(edpVar2.a());
        edsVar.b(a(edpVar2.a()));
        return true;
    }

    public String a(String str) {
        List<String> listE = eek.e(str, this.g, this.f47217a);
        if (listE.size() > 0) {
            return listE.get(0);
        }
        LogUtil.j("GetDeviceListUtils", "getDeviceContext,value is empty");
        return "";
    }

    private void b() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            Iterator<Map.Entry<String, List<eds>>> it = this.i.get(i).entrySet().iterator();
            while (it.hasNext()) {
                List<eds> value = it.next().getValue();
                if (value == null || value.isEmpty()) {
                    LogUtil.j("GetDeviceListUtils", "mapDeviceInfo, allDeviceItems is empty");
                } else {
                    rba rbaVar = new rba();
                    rbaVar.b(a(value.get(0).g()));
                    rbaVar.e(i);
                    rbaVar.a(i);
                    rbaVar.j(1);
                    this.f47219c.add(rbaVar);
                    Iterator<eds> it2 = value.iterator();
                    while (it2.hasNext()) {
                        d(it2.next());
                    }
                }
            }
            raz razVar = this.e.get(i);
            if (razVar != null && !TextUtils.isEmpty(razVar.a())) {
                rba rbaVar2 = new rba();
                rbaVar2.e(i);
                rbaVar2.a(i);
                rbaVar2.j(5);
                rbaVar2.d(razVar.a());
                this.f47219c.add(rbaVar2);
            }
        }
    }

    private void d(eds edsVar) {
        String strL;
        rba rbaVar = new rba();
        rbaVar.c(edsVar.f());
        rbaVar.d(edsVar.aa());
        rbaVar.b(edsVar.g());
        rbaVar.f(edsVar.r());
        rbaVar.c(edsVar.u());
        rbaVar.a(edsVar.ac());
        rbaVar.a(edsVar.s());
        rbaVar.j(3);
        rbaVar.h(edsVar.v());
        rbaVar.e(edsVar.d());
        rbaVar.b(edsVar.c());
        rbaVar.c(edsVar.t());
        if (edsVar.f() == 1) {
            List<String> listAa = edsVar.aa();
            if (coq.d(listAa)) {
                LogUtil.j("GetDeviceListUtils", "setDeviceInfo, uuidList is empty");
                return;
            }
            edn ednVarC = lvi.c(listAa.get(0), false);
            if (ednVarC == null) {
                LogUtil.j("GetDeviceListUtils", "deviceInfoNew is null");
                return;
            } else {
                rbaVar.d(ednVarC.i());
                rbaVar.c(ednVarC.h());
                rbaVar.d(ednVarC.y());
            }
        } else {
            rbaVar.d(a(edsVar.n()));
            rbaVar.c(a(edsVar.o()));
            if (!dxm.j()) {
                strL = edsVar.b();
                if (TextUtils.isEmpty(strL)) {
                    strL = edsVar.l();
                }
            } else {
                strL = edsVar.l();
            }
            rbaVar.e(strL);
        }
        this.f47219c.add(rbaVar);
    }

    public List<raz> a() {
        return this.e;
    }

    public List<rba> d() {
        return this.f47219c;
    }
}
