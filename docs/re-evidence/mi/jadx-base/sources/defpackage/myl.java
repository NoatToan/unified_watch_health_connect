package defpackage;

import com.duokan.airkan.common.aidl.ParcelDeviceData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class myl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f27352b = "ServiceList";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<kyl> f27353a = Collections.synchronizedList(new ArrayList());

    public synchronized boolean a(kyl kylVar) {
        if (b(kylVar) != null) {
            voe.a(f27352b, "already exist.");
            return false;
        }
        kyl kylVar2 = new kyl(kylVar);
        kylVar2.e = kylVar.f24425a;
        voe.c(f27352b, "add new. name:" + kylVar2.f24425a + " type:" + kylVar2.f24426b + " ip:" + kylVar2.b());
        this.f27353a.add(kylVar2);
        return true;
    }

    public kyl b(kyl kylVar) {
        synchronized (this.f27353a) {
            try {
                for (kyl kylVar2 : this.f27353a) {
                    if (kylVar2.a(kylVar)) {
                        return kylVar2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized ParcelDeviceData[] c() {
        ParcelDeviceData[] parcelDeviceDataArr;
        synchronized (this.f27353a) {
            ArrayList arrayList = new ArrayList();
            for (kyl kylVar : this.f27353a) {
                if ("_adb._airkan.".equalsIgnoreCase(kylVar.f24426b)) {
                    ParcelDeviceData parcelDeviceData = new ParcelDeviceData(kylVar.e, kylVar.f24426b, kylVar.b(), null);
                    parcelDeviceData.h = kylVar.g;
                    arrayList.add(parcelDeviceData);
                } else {
                    yaf yafVar = new yaf();
                    yafVar.f(kylVar.f);
                    ParcelDeviceData parcelDeviceData2 = new ParcelDeviceData(kylVar.e, kylVar.f24426b, kylVar.b(), kylVar.f, yafVar.d(), yafVar.b(), yafVar.e());
                    parcelDeviceData2.o = yafVar.a();
                    parcelDeviceData2.p = yafVar.c();
                    arrayList.add(parcelDeviceData2);
                }
            }
            parcelDeviceDataArr = (ParcelDeviceData[]) arrayList.toArray(new ParcelDeviceData[arrayList.size()]);
            voe.a(f27352b, "generate devices list done");
        }
        return parcelDeviceDataArr;
    }

    public synchronized List<kyl> d() {
        return this.f27353a;
    }

    public synchronized void e(kyl kylVar) {
        try {
            kyl kylVarB = b(kylVar);
            if (kylVarB != null) {
                voe.a(f27352b, "found, remove: " + kylVarB.e);
                this.f27353a.remove(kylVarB);
            } else {
                voe.d(f27352b, "not found: " + kylVar.e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
