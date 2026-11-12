package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes20.dex */
public class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s0 f30560c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f30561a = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f30562b = new ReentrantLock();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f30564b;

        public a(String str, String str2) {
            this.f30563a = str;
            this.f30564b = str2;
        }

        public String a() {
            return this.f30563a;
        }

        public String b() {
            return this.f30564b;
        }

        public static a a(String str) {
            if (str == null || !str.contains("_")) {
                return new a(str, null);
            }
            String[] strArrSplit = str.split("_");
            return new a(strArrSplit[0], strArrSplit[1]);
        }
    }

    public static s0 a() {
        if (f30560c == null) {
            synchronized (s0.class) {
                if (f30560c == null) {
                    f30560c = new s0();
                }
            }
        }
        return f30560c;
    }

    public static List c(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(WatchResourcesInfo.markDownHiTopId(str));
        arrayList.add(n.e().f(str).trim());
        return arrayList;
    }

    public boolean b(String str) {
        FlavorConfig.safeHwLog("FileContentHolder", "exists name: " + str);
        a aVarA = a.a(str);
        List listC = c(aVarA.a());
        for (int i = 0; i < listC.size(); i++) {
            String str2 = ((String) listC.get(i)) + "_" + aVarA.b();
            HwLog.i("FileContentHolder", "exists tmpUUID: " + str2);
            if (this.f30561a.containsKey(str2)) {
                HwLog.i("FileContentHolder", "exists matched id: " + str2);
                return true;
            }
        }
        return false;
    }

    public Map d(String str) {
        HwLog.i("FileContentHolder", "remove uuid=" + str);
        a aVarA = a.a(str);
        List listC = c(aVarA.f30563a);
        for (int i = 0; i < listC.size(); i++) {
            String str2 = ((String) listC.get(i)) + "_" + aVarA.f30564b;
            HwLog.i("FileContentHolder", "get tmpUUID=" + str2);
            Map map = (Map) this.f30561a.remove(str2);
            if (map != null) {
                return map;
            }
        }
        return null;
    }

    public void a(String str, Map map) {
        HwLog.i("FileContentHolder", "put uuid=" + str);
        HwLog.i("FileContentHolder", "put files=" + map);
        a(str).putAll(map);
    }

    public final Map a(String str) {
        Map map = (Map) this.f30561a.get(str);
        if (map == null) {
            this.f30562b.lock();
            map = (Map) this.f30561a.get(str);
            if (map == null) {
                map = new HashMap();
                this.f30561a.put(str, map);
            }
            this.f30562b.unlock();
        }
        return map;
    }

    public r0 a(String str, String str2) {
        HwLog.i("FileContentHolder", "get uuid=" + str);
        HwLog.i("FileContentHolder", "get fileName=" + str2);
        if (TextUtils.isEmpty(str)) {
            HwLog.i("FileContentHolder", "get uuid is null");
            return null;
        }
        a aVarA = a.a(str);
        List listC = c(aVarA.f30563a);
        for (int i = 0; i < listC.size(); i++) {
            String str3 = ((String) listC.get(i)) + "_" + aVarA.f30564b;
            HwLog.i("FileContentHolder", "get tmpUUID=" + str3);
            Map map = (Map) this.f30561a.get(str3);
            if (map != null) {
                return a(map, str2);
            }
        }
        return null;
    }

    public static r0 a(Map map, String str) {
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            return null;
        }
        return new r0(str, bArr);
    }
}
