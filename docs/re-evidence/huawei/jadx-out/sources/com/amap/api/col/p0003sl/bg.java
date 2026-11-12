package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<OfflineMapProvince> f2264a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private br f2265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2266c;

    private static boolean a(int i) {
        return i == 4;
    }

    private static boolean a(int i, int i2) {
        return i2 != 1 || i <= 2 || i >= 98;
    }

    private static boolean b(int i) {
        return i == 0 || i == 2 || i == 3 || i == 1 || i == 102 || i == 101 || i == 103 || i == -1;
    }

    public bg(Context context) {
        this.f2266c = context;
        this.f2265b = br.a(context);
    }

    private void a(bm bmVar) {
        br brVar = this.f2265b;
        if (brVar == null || bmVar == null) {
            return;
        }
        brVar.a(bmVar);
    }

    private void b(bm bmVar) {
        br brVar = this.f2265b;
        if (brVar != null) {
            brVar.b(bmVar);
        }
    }

    private static boolean a(OfflineMapProvince offlineMapProvince) {
        if (offlineMapProvince == null) {
            return false;
        }
        Iterator<OfflineMapCity> it = offlineMapProvince.getCityList().iterator();
        while (it.hasNext()) {
            if (it.next().getState() != 4) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList<OfflineMapProvince> a() {
        ArrayList<OfflineMapProvince> arrayList = new ArrayList<>();
        synchronized (this.f2264a) {
            Iterator<OfflineMapProvince> it = this.f2264a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final OfflineMapCity a(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.f2264a) {
            Iterator<OfflineMapProvince> it = this.f2264a.iterator();
            while (it.hasNext()) {
                for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                    if (offlineMapCity.getCode().equals(str)) {
                        return offlineMapCity;
                    }
                }
            }
            return null;
        }
    }

    public final OfflineMapCity b(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.f2264a) {
            Iterator<OfflineMapProvince> it = this.f2264a.iterator();
            while (it.hasNext()) {
                for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                    if (offlineMapCity.getCity().trim().equalsIgnoreCase(str.trim())) {
                        return offlineMapCity;
                    }
                }
            }
            return null;
        }
    }

    public final OfflineMapProvince c(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.f2264a) {
            for (OfflineMapProvince offlineMapProvince : this.f2264a) {
                if (offlineMapProvince.getProvinceName().trim().equalsIgnoreCase(str.trim())) {
                    return offlineMapProvince;
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapCity> b() {
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        synchronized (this.f2264a) {
            Iterator<OfflineMapProvince> it = this.f2264a.iterator();
            while (it.hasNext()) {
                Iterator<OfflineMapCity> it2 = it.next().getCityList().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        return arrayList;
    }

    public final void a(List<OfflineMapProvince> list) {
        OfflineMapProvince next;
        OfflineMapCity next2;
        synchronized (this.f2264a) {
            if (this.f2264a.size() > 0) {
                for (int i = 0; i < this.f2264a.size(); i++) {
                    OfflineMapProvince offlineMapProvince = this.f2264a.get(i);
                    Iterator<OfflineMapProvince> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (offlineMapProvince.getPinyin().equals(next.getPinyin())) {
                            break;
                        }
                        if (offlineMapProvince.getPinyin().equals("quanguogaiyaotu") || offlineMapProvince.getProvinceCode().equals("000001") || offlineMapProvince.getProvinceCode().equals(SmartMsgConstant.SHOW_METHOD_SMART_CARD)) {
                            if (next.getPinyin().equals("quanguogaiyaotu")) {
                                break;
                            }
                        }
                    }
                    if (next != null) {
                        a(offlineMapProvince, next);
                        ArrayList<OfflineMapCity> cityList = offlineMapProvince.getCityList();
                        ArrayList<OfflineMapCity> cityList2 = next.getCityList();
                        for (int i2 = 0; i2 < cityList.size(); i2++) {
                            OfflineMapCity offlineMapCity = cityList.get(i2);
                            Iterator<OfflineMapCity> it2 = cityList2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!offlineMapCity.getPinyin().equals(next2.getPinyin()));
                            if (next2 != null) {
                                a(offlineMapCity, next2);
                            }
                        }
                    }
                }
            } else {
                Iterator<OfflineMapProvince> it3 = list.iterator();
                while (it3.hasNext()) {
                    this.f2264a.add(it3.next());
                }
            }
        }
    }

    private static void a(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
        offlineMapCity.setUrl(offlineMapCity2.getUrl());
        offlineMapCity.setVersion(offlineMapCity2.getVersion());
        offlineMapCity.setSize(offlineMapCity2.getSize());
        offlineMapCity.setCode(offlineMapCity2.getCode());
        offlineMapCity.setPinyin(offlineMapCity2.getPinyin());
        offlineMapCity.setJianpin(offlineMapCity2.getJianpin());
    }

    private static void a(OfflineMapProvince offlineMapProvince, OfflineMapProvince offlineMapProvince2) {
        offlineMapProvince.setUrl(offlineMapProvince2.getUrl());
        offlineMapProvince.setVersion(offlineMapProvince2.getVersion());
        offlineMapProvince.setSize(offlineMapProvince2.getSize());
        offlineMapProvince.setPinyin(offlineMapProvince2.getPinyin());
        offlineMapProvince.setJianpin(offlineMapProvince2.getJianpin());
    }

    public final ArrayList<OfflineMapCity> c() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.f2264a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.f2264a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (offlineMapCity.getState() == 4 || offlineMapCity.getState() == 7) {
                            arrayList.add(offlineMapCity);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapProvince> d() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.f2264a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.f2264a) {
                if (offlineMapProvince != null && (offlineMapProvince.getState() == 4 || offlineMapProvince.getState() == 7)) {
                    arrayList.add(offlineMapProvince);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapCity> e() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.f2264a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.f2264a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (b(offlineMapCity.getState())) {
                            arrayList.add(offlineMapCity);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapProvince> f() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.f2264a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.f2264a) {
                if (offlineMapProvince != null && b(offlineMapProvince.getState())) {
                    arrayList.add(offlineMapProvince);
                }
            }
        }
        return arrayList;
    }

    public final void a(bb bbVar) {
        String pinyin = bbVar.getPinyin();
        synchronized (this.f2264a) {
            loop0: for (OfflineMapProvince offlineMapProvince : this.f2264a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (offlineMapCity.getPinyin().trim().equals(pinyin.trim())) {
                            a(bbVar, offlineMapCity);
                            a(bbVar, offlineMapProvince);
                            break loop0;
                        }
                    }
                }
            }
        }
    }

    private void a(bb bbVar, OfflineMapCity offlineMapCity) {
        int iB = bbVar.c().b();
        if (bbVar.c().equals(bbVar.f2242a)) {
            b(bbVar.t());
        } else {
            if (bbVar.c().equals(bbVar.f)) {
                bbVar.getCity();
                b(bbVar);
                bbVar.t().b();
            }
            if (a(bbVar.getcompleteCode(), bbVar.c().b())) {
                a(bbVar.t());
            }
        }
        offlineMapCity.setState(iB);
        offlineMapCity.setCompleteCode(bbVar.getcompleteCode());
    }

    private void b(bb bbVar) {
        File[] fileArrListFiles = new File(eb.c(this.f2266c)).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && file.exists() && file.getName().contains(bbVar.getAdcode()) && file.getName().endsWith(".zip.tmp.dt")) {
                file.delete();
            }
        }
    }

    private void a(bb bbVar, OfflineMapProvince offlineMapProvince) {
        bm bmVar;
        int iB = bbVar.c().b();
        if (iB == 6) {
            offlineMapProvince.setState(iB);
            offlineMapProvince.setCompleteCode(0);
            b(new bm(offlineMapProvince, this.f2266c));
            try {
                bz.b(offlineMapProvince.getProvinceCode(), this.f2266c);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (a(iB) && a(offlineMapProvince)) {
            if (bbVar.getPinyin().equals(offlineMapProvince.getPinyin())) {
                offlineMapProvince.setState(iB);
                offlineMapProvince.setCompleteCode(bbVar.getcompleteCode());
                offlineMapProvince.setVersion(bbVar.getVersion());
                offlineMapProvince.setUrl(bbVar.getUrl());
                bmVar = new bm(offlineMapProvince, this.f2266c);
                bmVar.a(bbVar.a());
                bmVar.d(bbVar.getCode());
            } else {
                offlineMapProvince.setState(iB);
                offlineMapProvince.setCompleteCode(100);
                bmVar = new bm(offlineMapProvince, this.f2266c);
            }
            bmVar.b();
            a(bmVar);
            bmVar.c();
        }
    }

    public final void g() {
        h();
        this.f2265b = null;
        this.f2266c = null;
    }

    private void h() {
        ArrayList<OfflineMapProvince> arrayList = this.f2264a;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2264a.clear();
            }
        }
    }
}
