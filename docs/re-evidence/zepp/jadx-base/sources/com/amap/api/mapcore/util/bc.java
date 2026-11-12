package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bc {
    public ArrayList<OfflineMapProvince> a = new ArrayList<>();
    private bn b;
    private Context c;

    public bc(Context context) {
        this.c = context;
        this.b = bn.a(context);
    }

    private void a(bi biVar) {
        bn bnVar = this.b;
        if (bnVar == null || biVar == null) {
            return;
        }
        bnVar.a(biVar);
    }

    private static boolean a(int i) {
        return i == 0 || i == 2 || i == 3 || i == 1 || i == 102 || i == 101 || i == 103 || i == -1;
    }

    private void b(bi biVar) {
        bn bnVar = this.b;
        if (bnVar != null) {
            bnVar.b(biVar);
        }
    }

    public final OfflineMapProvince c(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.a) {
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince.getProvinceName().trim().equalsIgnoreCase(str.trim())) {
                    return offlineMapProvince;
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapProvince> d() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null && (offlineMapProvince.getState() == 4 || offlineMapProvince.getState() == 7)) {
                    arrayList.add(offlineMapProvince);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapCity> e() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (a(offlineMapCity.getState())) {
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
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null && a(offlineMapProvince.getState())) {
                    arrayList.add(offlineMapProvince);
                }
            }
        }
        return arrayList;
    }

    public final void g() {
        ArrayList<OfflineMapProvince> arrayList = this.a;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.a.clear();
            }
        }
        this.b = null;
        this.c = null;
    }

    private static boolean a(OfflineMapProvince offlineMapProvince) {
        if (offlineMapProvince == null) {
            return false;
        }
        Iterator<OfflineMapCity> it2 = offlineMapProvince.getCityList().iterator();
        while (it2.hasNext()) {
            if (it2.next().getState() != 4) {
                return false;
            }
        }
        return true;
    }

    public final OfflineMapCity b(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it2 = this.a.iterator();
            while (it2.hasNext()) {
                for (OfflineMapCity offlineMapCity : it2.next().getCityList()) {
                    if (offlineMapCity.getCity().trim().equalsIgnoreCase(str.trim())) {
                        return offlineMapCity;
                    }
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapProvince> a() {
        ArrayList<OfflineMapProvince> arrayList = new ArrayList<>();
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it2 = this.a.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapCity> c() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
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

    public final OfflineMapCity a(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it2 = this.a.iterator();
            while (it2.hasNext()) {
                for (OfflineMapCity offlineMapCity : it2.next().getCityList()) {
                    if (offlineMapCity.getCode().equals(str)) {
                        return offlineMapCity;
                    }
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapCity> b() {
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it2 = this.a.iterator();
            while (it2.hasNext()) {
                Iterator<OfflineMapCity> it3 = it2.next().getCityList().iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next());
                }
            }
        }
        return arrayList;
    }

    private void b(ax axVar) {
        File[] fileArrListFiles = new File(er.c(this.c)).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && file.exists() && file.getName().contains(axVar.getAdcode()) && file.getName().endsWith(".zip.tmp.dt")) {
                file.delete();
            }
        }
    }

    public final void a(List<OfflineMapProvince> list) {
        OfflineMapProvince next;
        OfflineMapCity next2;
        synchronized (this.a) {
            if (this.a.size() > 0) {
                for (int i = 0; i < this.a.size(); i++) {
                    OfflineMapProvince offlineMapProvince = this.a.get(i);
                    Iterator<OfflineMapProvince> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (offlineMapProvince.getPinyin().equals(next.getPinyin())) {
                            break;
                        }
                        if (offlineMapProvince.getPinyin().equals("quanguogaiyaotu") || offlineMapProvince.getProvinceCode().equals("000001") || offlineMapProvince.getProvinceCode().equals("100000")) {
                            if (next.getPinyin().equals("quanguogaiyaotu")) {
                                break;
                            }
                        }
                    }
                    if (next != null) {
                        offlineMapProvince.setUrl(next.getUrl());
                        offlineMapProvince.setVersion(next.getVersion());
                        offlineMapProvince.setSize(next.getSize());
                        offlineMapProvince.setPinyin(next.getPinyin());
                        offlineMapProvince.setJianpin(next.getJianpin());
                        ArrayList<OfflineMapCity> cityList = offlineMapProvince.getCityList();
                        ArrayList<OfflineMapCity> cityList2 = next.getCityList();
                        for (int i2 = 0; i2 < cityList.size(); i2++) {
                            OfflineMapCity offlineMapCity = cityList.get(i2);
                            Iterator<OfflineMapCity> it3 = cityList2.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (!offlineMapCity.getPinyin().equals(next2.getPinyin()));
                            if (next2 != null) {
                                offlineMapCity.setUrl(next2.getUrl());
                                offlineMapCity.setVersion(next2.getVersion());
                                offlineMapCity.setSize(next2.getSize());
                                offlineMapCity.setCode(next2.getCode());
                                offlineMapCity.setPinyin(next2.getPinyin());
                                offlineMapCity.setJianpin(next2.getJianpin());
                            }
                        }
                    }
                }
            } else {
                Iterator<OfflineMapProvince> it4 = list.iterator();
                while (it4.hasNext()) {
                    this.a.add(it4.next());
                }
            }
        }
    }

    public final void a(ax axVar) {
        bi biVar;
        String pinyin = axVar.getPinyin();
        synchronized (this.a) {
            loop0: for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (offlineMapCity.getPinyin().trim().equals(pinyin.trim())) {
                            int iB = axVar.l.b();
                            if (axVar.l.equals(axVar.a)) {
                                b(axVar.p());
                            } else {
                                if (axVar.l.equals(axVar.f)) {
                                    axVar.getCity();
                                    b(axVar);
                                    axVar.p().b();
                                }
                                int i = axVar.getcompleteCode();
                                if (axVar.l.b() != 1 || i <= 2 || i >= 98) {
                                    a(axVar.p());
                                }
                            }
                            offlineMapCity.setState(iB);
                            offlineMapCity.setCompleteCode(axVar.getcompleteCode());
                            int iB2 = axVar.l.b();
                            if (iB2 == 6) {
                                offlineMapProvince.setState(iB2);
                                offlineMapProvince.setCompleteCode(0);
                                b(new bi(offlineMapProvince, this.c));
                                try {
                                    bv.a(offlineMapProvince.getProvinceCode(), this.c);
                                    break loop0;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    break loop0;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    break loop0;
                                }
                            }
                            if (!(iB2 == 4) || !a(offlineMapProvince)) {
                                break loop0;
                                break loop0;
                            }
                            if (axVar.getPinyin().equals(offlineMapProvince.getPinyin())) {
                                offlineMapProvince.setState(iB2);
                                offlineMapProvince.setCompleteCode(axVar.getcompleteCode());
                                offlineMapProvince.setVersion(axVar.getVersion());
                                offlineMapProvince.setUrl(axVar.getUrl());
                                biVar = new bi(offlineMapProvince, this.c);
                                biVar.a(axVar.a());
                                biVar.d(axVar.getCode());
                            } else {
                                offlineMapProvince.setState(iB2);
                                offlineMapProvince.setCompleteCode(100);
                                biVar = new bi(offlineMapProvince, this.c);
                            }
                            biVar.b();
                            a(biVar);
                            biVar.c();
                            break loop0;
                        }
                    }
                }
            }
        }
    }
}
