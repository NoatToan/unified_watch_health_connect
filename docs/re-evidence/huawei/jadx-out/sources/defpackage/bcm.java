package defpackage;

import android.content.Context;
import com.huawei.android.hicloud.sync.logic.SyncProcessInterface;
import com.huawei.android.hicloud.sync.service.aidl.LocalId;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bcm {
    public int A;
    public Context C;
    public SyncProcessInterface w;
    public String x;
    public String y;
    public int z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f974a = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f975b = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f976c = new ArrayList(10);
    public List<String> d = new ArrayList(10);
    List<String> e = new ArrayList(10);
    public List<String> f = new ArrayList(10);
    public List<String> g = new ArrayList(10);
    public List<String> h = new ArrayList(10);
    public List<String> i = new ArrayList(10);
    List<String> j = new ArrayList(10);
    ArrayList<SyncData> k = new ArrayList<>(10);
    public ArrayList<SyncData> l = null;
    public ArrayList<SyncData> m = null;
    public ArrayList<SyncData> n = null;
    public final ArrayList<String> o = new ArrayList<>(10);
    public final ArrayList<String> p = new ArrayList<>(10);
    public final ArrayList<String> q = new ArrayList<>(10);
    public final ArrayList<String> r = new ArrayList<>(10);
    public List<String> s = null;
    public List<String> t = null;
    public List<String> u = null;
    public List<String> v = null;
    public int B = 0;
    public final ArrayList<String> D = new ArrayList<>();
    public boolean E = true;
    public StringBuffer F = new StringBuffer();

    public void a(String str, bcp bcpVar) {
        bcw.d("SyncProcessBase", "Call app processAplicationException: interfacesName = " + str + ", code = " + bcpVar.b() + ", msg = " + bcpVar.getMessage());
        a(bcx.e(this.y, str, bcpVar.b(), bcpVar.getMessage()));
        a(-6);
    }

    List<LocalId> b(int i) {
        bcw.c("SyncProcessBase", "Call app queryLocalIds start: dataType = " + this.y + ", status = " + i);
        try {
            return this.w.queryLocalIds(this.y, i);
        } catch (bcp e) {
            a("queryLocalIds", e);
            return null;
        } catch (Exception e2) {
            a("queryLocalIds", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app queryLocalIds end: dataType = " + this.y);
        }
    }

    List<bbz> c() {
        try {
            bcw.c("SyncProcessBase", "Call app processLocalModifyCloudDelete start: dataType = " + this.y);
            return this.w.processLocalModifyCloudDelete(this.y, this.j);
        } catch (Exception e) {
            a("processLocalModifyCloudDelete", e);
            return null;
        } catch (bcp e2) {
            a("processLocalModifyCloudDelete", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app processLocalModifyCloudDelete end: dataType = " + this.y);
        }
    }

    public boolean d() {
        try {
            bcw.c("SyncProcessBase", "Call app onUploadSyncStart start: dataType = " + this.y);
            this.w.onUploadSyncStart(this.y);
            return true;
        } catch (bcp e) {
            a("onUploadSyncStart", e);
            return false;
        } catch (Exception e2) {
            a("onUploadSyncStart", e2);
            return false;
        } finally {
            bcw.c("SyncProcessBase", "Call app onUploadSyncStart end: dataType = " + this.y);
        }
    }

    public List<Object> e() {
        try {
            bcw.c("SyncProcessBase", "Call app getUpdateDataResults start: dataType = " + this.y);
            return this.w.getUpdateDataResults();
        } catch (bcp e) {
            a("getUpdateDataResults", e);
            return null;
        } catch (Exception e2) {
            a("getUpdateDataResults", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app getUpdateDataResults end: dataType = " + this.y);
        }
    }

    void a(String str, Exception exc) {
        bcw.d("SyncProcessBase", "Call app processAppUnCatchedException: interfacesName = " + str + ", msg = " + exc.getMessage());
        a(bcx.e(this.y, str, 5003, exc.getMessage()));
        a(-6);
    }

    public void a(String str, String str2, int i) {
        bcw.d("SyncProcessBase", "Call app processSdkInnerException: interfacesName = " + str + ", code = " + i + ", msg = " + str2);
        a(bcx.a(this.y, str, str2, i));
        a(i);
    }

    public List<String> b(List<String> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            bcw.c("SyncProcessBase", "Call app deleteData start: dataType = " + this.y + ", idList.size = " + arrayList.size());
            return this.w.deleteData(this.y, arrayList);
        } catch (Exception e) {
            a("deleteData", e);
            return null;
        } catch (bcp e2) {
            a("deleteData", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app deleteData end: dataType = " + this.y);
        }
    }

    bbz a(SyncData syncData) {
        bcw.c("SyncProcessBase", "Call app addCompare start: dataType = " + this.y + ", localAddedId.size = " + this.f974a.size() + ", data = " + syncData.toString());
        try {
            return this.w.addCompare(this.y, this.f974a, syncData);
        } catch (bcp e) {
            a("addCompare", e);
            return null;
        } catch (Exception e2) {
            a("addCompare", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app addCompare end: dataType = " + this.y);
        }
    }

    bbz a(String str, SyncData syncData) {
        bcw.c("SyncProcessBase", "Call app conflictCompare start: dataType = " + this.y);
        try {
            return this.w.conflictCompare(this.y, str, syncData);
        } catch (bcp e) {
            a("conflictCompare", e);
            return null;
        } catch (Exception e2) {
            a("conflictCompare", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app conflictCompare end: dataType = " + this.y);
        }
    }

    boolean b() {
        bcw.c("SyncProcessBase", "Call App onDownloadSyncStart start: dataType = " + this.y);
        HashMap map = new HashMap(10);
        a(map, "cadd", this.f);
        a(map, "cmod", this.g);
        a(map, "cdel", this.h);
        try {
            this.w.onDownloadSyncStart(this.y, map);
            return true;
        } catch (bcp e) {
            a("onDownloadSyncStart", e);
            return false;
        } catch (Exception e2) {
            a("onDownloadSyncStart", e2);
            return false;
        } finally {
            bcw.c("SyncProcessBase", "Call App onDownloadSyncStart end: dataType = " + this.y);
        }
    }

    public List<bcd> a(List<SyncData> list, List<SyncData> list2) {
        bcw.c("SyncProcessBase", "Call app updateStructData start: dataType = " + this.y + ", addDataList size = " + list.size() + " , updateDataList size = " + list2.size());
        try {
            return this.w.updateStructData(this.y, list, list2);
        } catch (bcp e) {
            a("updateStructData", e);
            return null;
        } catch (Exception e2) {
            a("updateStructData", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app updateStructData end: dataType = " + this.y);
        }
    }

    public List<bcf> a(List<String> list) {
        bcw.c("SyncProcessBase", "Call app dataQueryByID start: dataType = " + this.y + ", size = " + list.size());
        try {
            return this.w.dataQueryByID(this.y, list);
        } catch (bcp e) {
            a("dataQueryByID", e);
            return null;
        } catch (Exception e2) {
            a("dataQueryByID", e2);
            return null;
        } finally {
            bcw.c("SyncProcessBase", "Call app dataQueryByID end: dataType = " + this.y);
        }
    }

    boolean a() {
        bcw.c("SyncProcessBase", "Call app onDownloadSyncStart start: dataType = " + this.y);
        HashMap map = new HashMap(10);
        a(map, "ladd", this.f974a);
        a(map, "lmod", this.f975b);
        a(map, "ldel", this.f976c);
        a(map, "Lconflict", this.e);
        a(map, "cadd", this.f);
        a(map, "cmod", this.g);
        a(map, "cdel", this.h);
        a(map, "cconflict", this.i);
        try {
            this.w.onDownloadSyncStart(this.y, map);
            return true;
        } catch (bcp e) {
            a("onDownloadSyncStart", e);
            return false;
        } catch (Exception e2) {
            a("onDownloadSyncStart", e2);
            return false;
        } finally {
            bcw.c("SyncProcessBase", "Call app onDownloadSyncStart end: dataType = " + this.y);
        }
    }

    private void a(Map<String, Integer> map, String str, List<String> list) {
        if (map == null || str == null) {
            return;
        }
        map.put(str, Integer.valueOf(list == null ? 0 : list.size()));
    }

    public void a(int i) {
        bcw.c("SyncProcessBase", "Call app onDataSyncEnd start: dataType = " + this.y + ", resultCode = " + i);
        try {
            this.w.onDataSyncEnd(this.y, i);
        } catch (bcp e) {
            bcw.d("SyncProcessBase", "Call app processAplicationException: interfacesName = onDataSyncEnd, code = " + e.b() + ", msg = " + e.getMessage());
            a(bcx.e(this.y, "onDataSyncEnd", e.b(), e.getMessage()));
        } catch (Exception e2) {
            a(bcx.e(this.y, "onDataSyncEnd", 5003, e2.getMessage()));
        } finally {
            bcw.c("SyncProcessBase", "Call app onDataSyncEnd end: dataType = " + this.y);
        }
        this.E = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void a(String str, int i) {
        bcw.c("SyncProcessBase", "Call app onDataSyncEnd start: dataType = " + str + ", resultCode = " + i);
        try {
            this.w.onDataSyncEnd(str, i);
        } catch (bcp e) {
            bcw.d("SyncProcessBase", "Call app processAplicationException: interfacesName = onDataSyncEnd, code = " + e.b() + ", msg = " + e.getMessage());
            a(bcx.e(this.y, "onDataSyncEnd", e.b(), e.getMessage()));
        } catch (Exception e2) {
            a(bcx.e(this.y, "onDataSyncEnd", 5003, e2.getMessage()));
        } finally {
            bcw.c("SyncProcessBase", "Call app onDataSyncEnd end: dataType = " + str);
        }
        str = 1;
        this.E = true;
    }

    public void a(String str, Map<String, Long> map) {
        try {
            StringBuilder sb = new StringBuilder("Call App: onExceedLimitResult start: ");
            sb.append(map == null ? null : map.toString());
            bcw.c("SyncProcessBase", sb.toString());
            this.w.onGetExceedLimitsResult(str, map);
        } catch (bcp e) {
            bcw.d("SyncProcessBase", "Call App: onExceedLimitResult error: code = " + e.b() + ", msg = " + e.getMessage());
        } catch (Exception e2) {
            bcw.d("SyncProcessBase", "Call App: onExceedLimitResult error: " + e2.getMessage());
        } finally {
            bcw.c("SyncProcessBase", "Call App: onExceedLimitResult end: syncType = " + str);
        }
    }

    protected void a(String str) {
        throw null;
    }
}
