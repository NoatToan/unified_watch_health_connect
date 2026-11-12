package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.bb;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<OfflineMapProvince> f31350a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zcs f31351b;
    public Context c;

    public qbs(Context context) {
        this.c = context;
        this.f31351b = zcs.b(context);
    }

    public static void g(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
        offlineMapCity.setUrl(offlineMapCity2.getUrl());
        offlineMapCity.setVersion(offlineMapCity2.getVersion());
        offlineMapCity.setSize(offlineMapCity2.getSize());
        offlineMapCity.setCode(offlineMapCity2.getCode());
        offlineMapCity.setPinyin(offlineMapCity2.getPinyin());
        offlineMapCity.setJianpin(offlineMapCity2.getJianpin());
    }

    public static void h(OfflineMapProvince offlineMapProvince, OfflineMapProvince offlineMapProvince2) {
        offlineMapProvince.setUrl(offlineMapProvince2.getUrl());
        offlineMapProvince.setVersion(offlineMapProvince2.getVersion());
        offlineMapProvince.setSize(offlineMapProvince2.getSize());
        offlineMapProvince.setPinyin(offlineMapProvince2.getPinyin());
        offlineMapProvince.setJianpin(offlineMapProvince2.getJianpin());
    }

    public static boolean j(int i) {
        return i == 4;
    }

    public static boolean k(int i, int i2) {
        return i2 != 1 || i <= 2 || i >= 98;
    }

    public static boolean l(OfflineMapProvince offlineMapProvince) {
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

    public static boolean q(int i) {
        return i == 0 || i == 2 || i == 3 || i == 1 || i == 102 || i == 101 || i == 103 || i == -1;
    }

    public final OfflineMapCity a(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.f31350a) {
            try {
                Iterator<OfflineMapProvince> it = this.f31350a.iterator();
                while (it.hasNext()) {
                    for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                        if (offlineMapCity.getCode().equals(str)) {
                            return offlineMapCity;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList<OfflineMapProvince> b() {
        ArrayList<OfflineMapProvince> arrayList = new ArrayList<>();
        synchronized (this.f31350a) {
            try {
                Iterator<OfflineMapProvince> it = this.f31350a.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void c(gcs gcsVar) {
        zcs zcsVar = this.f31351b;
        if (zcsVar == null || gcsVar == null) {
            return;
        }
        zcsVar.e(gcsVar);
    }

    public final void d(bb bbVar) {
        String pinyin = bbVar.getPinyin();
        synchronized (this.f31350a) {
            try {
                loop0: for (OfflineMapProvince offlineMapProvince : this.f31350a) {
                    if (offlineMapProvince != null) {
                        for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                            if (offlineMapCity.getPinyin().trim().equals(pinyin.trim())) {
                                e(bbVar, offlineMapCity);
                                f(bbVar, offlineMapProvince);
                                break loop0;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(bb bbVar, OfflineMapCity offlineMapCity) {
        int iD = bbVar.B().d();
        if (bbVar.B().equals(bbVar.f)) {
            o(bbVar.W());
        } else {
            if (bbVar.B().equals(bbVar.f5972k)) {
                bbVar.getCity();
                p(bbVar);
                bbVar.W().n();
            }
            if (k(bbVar.getcompleteCode(), bbVar.B().d())) {
                c(bbVar.W());
            }
        }
        offlineMapCity.setState(iD);
        offlineMapCity.setCompleteCode(bbVar.getcompleteCode());
    }

    public final void f(bb bbVar, OfflineMapProvince offlineMapProvince) {
        gcs gcsVar;
        int iD = bbVar.B().d();
        if (iD == 6) {
            offlineMapProvince.setState(iD);
            offlineMapProvince.setCompleteCode(0);
            o(new gcs(offlineMapProvince, this.c));
            try {
                bes.k(offlineMapProvince.getProvinceCode(), this.c);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (j(iD) && l(offlineMapProvince)) {
            if (bbVar.getPinyin().equals(offlineMapProvince.getPinyin())) {
                offlineMapProvince.setState(iD);
                offlineMapProvince.setCompleteCode(bbVar.getcompleteCode());
                offlineMapProvince.setVersion(bbVar.getVersion());
                offlineMapProvince.setUrl(bbVar.getUrl());
                gcsVar = new gcs(offlineMapProvince, this.c);
                gcsVar.m(bbVar.u());
                gcsVar.d(bbVar.getCode());
            } else {
                offlineMapProvince.setState(iD);
                offlineMapProvince.setCompleteCode(100);
                gcsVar = new gcs(offlineMapProvince, this.c);
            }
            gcsVar.n();
            c(gcsVar);
            gcsVar.a();
        }
    }

    public final void i(List<OfflineMapProvince> list) {
        OfflineMapProvince next;
        OfflineMapCity next2;
        synchronized (this.f31350a) {
            try {
                if (this.f31350a.size() > 0) {
                    for (int i = 0; i < this.f31350a.size(); i++) {
                        OfflineMapProvince offlineMapProvince = this.f31350a.get(i);
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
                            if (offlineMapProvince.getPinyin().equals("quanguogaiyaotu") || offlineMapProvince.getProvinceCode().equals("000001") || offlineMapProvince.getProvinceCode().equals("100000")) {
                                if (next.getPinyin().equals("quanguogaiyaotu")) {
                                    break;
                                }
                            }
                        }
                        if (next != null) {
                            h(offlineMapProvince, next);
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
                                    g(offlineMapCity, next2);
                                }
                            }
                        }
                    }
                } else {
                    Iterator<OfflineMapProvince> it3 = list.iterator();
                    while (it3.hasNext()) {
                        this.f31350a.add(it3.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final OfflineMapCity m(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.f31350a) {
            try {
                Iterator<OfflineMapProvince> it = this.f31350a.iterator();
                while (it.hasNext()) {
                    for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                        if (offlineMapCity.getCity().trim().equalsIgnoreCase(str.trim())) {
                            return offlineMapCity;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList<OfflineMapCity> n() {
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        synchronized (this.f31350a) {
            try {
                Iterator<OfflineMapProvince> it = this.f31350a.iterator();
                while (it.hasNext()) {
                    Iterator<OfflineMapCity> it2 = it.next().getCityList().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void o(gcs gcsVar) {
        zcs zcsVar = this.f31351b;
        if (zcsVar != null) {
            zcsVar.k(gcsVar);
        }
    }

    public final void p(bb bbVar) {
        File[] fileArrListFiles = new File(zns.h0(this.c)).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && file.exists() && file.getName().contains(bbVar.getAdcode()) && file.getName().endsWith(".zip.tmp.dt")) {
                file.delete();
            }
        }
    }

    public final OfflineMapProvince r(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.f31350a) {
            try {
                for (OfflineMapProvince offlineMapProvince : this.f31350a) {
                    if (offlineMapProvince.getProvinceName().trim().equalsIgnoreCase(str.trim())) {
                        return offlineMapProvince;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList<OfflineMapCity> s() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.f31350a) {
            try {
                arrayList = new ArrayList<>();
                for (OfflineMapProvince offlineMapProvince : this.f31350a) {
                    if (offlineMapProvince != null) {
                        for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                            if (offlineMapCity.getState() == 4 || offlineMapCity.getState() == 7) {
                                arrayList.add(offlineMapCity);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapProvince> t() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.f31350a) {
            try {
                arrayList = new ArrayList<>();
                for (OfflineMapProvince offlineMapProvince : this.f31350a) {
                    if (offlineMapProvince != null && (offlineMapProvince.getState() == 4 || offlineMapProvince.getState() == 7)) {
                        arrayList.add(offlineMapProvince);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapCity> u() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.f31350a) {
            try {
                arrayList = new ArrayList<>();
                for (OfflineMapProvince offlineMapProvince : this.f31350a) {
                    if (offlineMapProvince != null) {
                        for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                            if (q(offlineMapCity.getState())) {
                                arrayList.add(offlineMapCity);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapProvince> v() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.f31350a) {
            try {
                arrayList = new ArrayList<>();
                for (OfflineMapProvince offlineMapProvince : this.f31350a) {
                    if (offlineMapProvince != null && q(offlineMapProvince.getState())) {
                        arrayList.add(offlineMapProvince);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void w() {
        x();
        this.f31351b = null;
        this.c = null;
    }

    public final void x() {
        ArrayList<OfflineMapProvince> arrayList = this.f31350a;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f31350a.clear();
            }
        }
    }
}
