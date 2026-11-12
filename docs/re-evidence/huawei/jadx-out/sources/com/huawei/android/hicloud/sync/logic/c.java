package com.huawei.android.hicloud.sync.logic;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.android.hicloud.sync.service.aidl.ISyncServiceCallback;
import com.huawei.android.hicloud.sync.service.aidl.LocalId;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import com.huawei.android.hicloud.sync.util.ArrayUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.bcd;
import defpackage.bcf;
import defpackage.bcg;
import defpackage.bcl;
import defpackage.bcm;
import defpackage.bcn;
import defpackage.bcp;
import defpackage.bcq;
import defpackage.bcr;
import defpackage.bcu;
import defpackage.bcw;
import defpackage.bcx;
import defpackage.bda;
import defpackage.bdc;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
abstract class c extends bcm {
    final bcr G;
    JSONArray K;
    String L;
    protected int M;
    final Map<String, SyncData> H = new HashMap(100);
    final Map<String, LocalId> I = new HashMap();
    final Map<String, String> J = new HashMap();
    private final Handler N = new b();
    final ISyncServiceCallback O = new BinderC0055c();

    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                bcw.c("CloudSyncBase", "Begin handleMessage msg.what = " + message.what);
                Bundle bundle = (Bundle) message.obj;
                if (bundle == null) {
                    bcw.e("CloudSyncBase", "Receive bundle is null");
                    return;
                }
                bundle.setClassLoader(c.class.getClassLoader());
                int i = bundle.getInt("resultCode");
                boolean z = bundle.getBoolean("is_in_batches", false);
                bcw.c("CloudSyncBase", "sendInBatches: " + z);
                if (!z || c.this.d(bundle)) {
                    if (c.this.a(message, bundle, z, i)) {
                        bcw.e("CloudSyncBase", "handle message, parse partical result");
                        return;
                    }
                    if (i == 0) {
                        c.this.a(message, bundle, z);
                        return;
                    }
                    bcw.e("CloudSyncBase", "handle message, result error, result = " + i);
                    c.this.a(i);
                }
            } catch (Exception e) {
                bcw.e("CloudSyncBase", "handle message exception " + e.getMessage());
                c.this.a("HandleMessage", e.getMessage(), 5001);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.android.hicloud.sync.logic.c$c, reason: collision with other inner class name */
    class BinderC0055c extends ISyncServiceCallback.Stub {
        BinderC0055c() {
        }

        @Override // com.huawei.android.hicloud.sync.service.aidl.ISyncServiceCallback
        public void handlerEventMsg(int i, int i2, int i3, Bundle bundle) throws RemoteException {
            StringBuilder sb = new StringBuilder("handlerEventMsg, mHandler is null: ");
            sb.append(c.this.N == null);
            bcw.c("CloudSyncBase", sb.toString());
            if (c.this.N == null || c.this.a(i, bundle)) {
                return;
            }
            c.this.N.sendMessage(c.this.N.obtainMessage(i, i2, i3, bundle));
        }
    }

    c(Context context, String str, SyncProcessInterface syncProcessInterface, bcr bcrVar) {
        this.C = context;
        this.w = syncProcessInterface;
        this.G = bcrVar;
        bcw.c("CloudSyncBase", "new CloudSyncBase, version code: 13.3.0.303");
    }

    private void b(boolean z) {
        bcw.c("CloudSyncBase", "uploadLocalData.");
        ArrayList<SyncData> arrayList = new ArrayList<>(10);
        if (!bda.b(this.t)) {
            List<bcf> listA = a(this.t);
            if (listA != null) {
                bcw.c("CloudSyncBase", "dataQueryByID appUpdateDataNum = " + listA.size());
                for (bcf bcfVar : listA) {
                    SyncData syncData = new SyncData();
                    syncData.setLuid(bcfVar.d());
                    syncData.setData(bcfVar.c());
                    syncData.setUnstruct_uuid(bcfVar.h());
                    syncData.setFileList(bcfVar.a());
                    syncData.setUuid(bcfVar.f());
                    syncData.setRecycleStatus(bcfVar.j());
                    syncData.setRecycleTime(bcfVar.i());
                    if (this.J.get(bcfVar.d()) != null) {
                        bcw.c("CloudSyncBase", "set guid , id = " + bcfVar.d() + " , guid = " + this.J.get(bcfVar.d()));
                        syncData.setGuid(this.J.get(bcfVar.d()));
                    }
                    if (bcn.a() >= 107) {
                        syncData.setVersion(bcn.a());
                        syncData.setExtensionData(bcfVar.e());
                        syncData.setExtraParam(bcfVar.b());
                    }
                    arrayList.add(syncData);
                }
                c(arrayList);
            } else {
                bcw.c("CloudSyncBase", "dataQueryByID appUpdateData is null");
            }
        }
        ArrayList arrayList2 = new ArrayList(10);
        if (!bda.b(this.s)) {
            List<bcf> listA2 = a(this.s);
            if (listA2 != null) {
                bcw.c("CloudSyncBase", "dataQueryByID AppAddDataNum = " + listA2.size());
                for (bcf bcfVar2 : listA2) {
                    SyncData syncData2 = new SyncData();
                    syncData2.setLuid(bcfVar2.d());
                    syncData2.setData(bcfVar2.c());
                    syncData2.setFileList(bcfVar2.a());
                    syncData2.setUuid(bcfVar2.f());
                    syncData2.setRecycleStatus(bcfVar2.j());
                    syncData2.setRecycleTime(bcfVar2.i());
                    if (bcn.a() >= 107) {
                        syncData2.setVersion(bcn.a());
                        syncData2.setExtensionData(bcfVar2.e());
                        syncData2.setExtraParam(bcfVar2.b());
                    }
                    arrayList2.add(syncData2);
                }
            } else {
                bcw.c("CloudSyncBase", "dataQueryByID AppAddData is null");
            }
        }
        ArrayList<SyncData> arrayList3 = new ArrayList<>(10);
        if (!bda.b(this.v)) {
            List<bcf> listA3 = a(this.v);
            if (listA3 != null) {
                bcw.c("CloudSyncBase", "dataQueryByID AppLostDataNum = " + listA3.size());
                for (bcf bcfVar3 : listA3) {
                    SyncData syncData3 = new SyncData();
                    syncData3.setLuid(bcfVar3.d());
                    syncData3.setData(bcfVar3.c());
                    syncData3.setFileList(bcfVar3.a());
                    syncData3.setUuid(bcfVar3.f());
                    syncData3.setRecycleStatus(bcfVar3.j());
                    syncData3.setRecycleTime(bcfVar3.i());
                    syncData3.setUnstruct_uuid(bcfVar3.h());
                    if (bcn.a() >= 107) {
                        syncData3.setVersion(bcn.a());
                        syncData3.setExtensionData(bcfVar3.e());
                        syncData3.setExtraParam(bcfVar3.b());
                    }
                    arrayList3.add(syncData3);
                }
                c(arrayList3);
            } else {
                bcw.e("CloudSyncBase", "dataQueryByID lostData is null! ");
            }
        }
        if (s()) {
            bcw.c("CloudSyncBase", "Upload data, haveFile = " + z + ", add.size = " + arrayList2.size() + " , modify.size = " + arrayList.size() + " , delete.size = " + this.u.size() + " , lost.size = " + arrayList3.size());
            if (ArrayUtils.isEmpty(arrayList3) || !bcu.b(this.C)) {
                a(this.x, this.y, arrayList2, arrayList, this.u, z, this.O);
            } else {
                bcw.c("CloudSyncBase", "uploadDataWithLost");
                a(this.x, this.y, arrayList2, arrayList, this.u, arrayList3, z, this.O);
            }
            a(z);
        }
    }

    private void c(Bundle bundle) {
        if (bundle.containsKey("traceId")) {
            this.L = bundle.getString("traceId");
            bcw.c("CloudSyncBase", "getTraceIdAndReportLastSync traceId = " + this.L);
        }
        bdc bdcVarE = bdc.e(this.C);
        String strF = bdcVarE.f();
        String strA = bdcVarE.a();
        String strD = bdcVarE.d();
        String strJ = bdcVarE.j();
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strJ) || TextUtils.isEmpty(strF) || TextUtils.isEmpty(strA)) {
            return;
        }
        a(bcx.b(strF, strA, strD, strJ));
        bdcVarE.b();
    }

    private ArrayList<SyncData> d(Bundle bundle, boolean z) {
        ArrayList<SyncData> arrayList = new ArrayList<>();
        try {
            if (!z) {
                return bundle.getParcelableArrayList("cdata");
            }
            ArrayList<SyncData> arrayListB = bcl.b(this.F.toString());
            this.F = new StringBuffer();
            return arrayListB;
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "getCloudData err: " + e.getMessage());
            return arrayList;
        }
    }

    private void e(Bundle bundle, boolean z) {
        c(bundle);
        if (b(bundle, z)) {
            r();
            i();
        }
    }

    private void f(Bundle bundle, boolean z) throws JSONException {
        ArrayList<UnstructData> arrayList = new ArrayList<>();
        ArrayList<UnstructData> arrayList2 = new ArrayList<>();
        bcq<Integer, List<String>> bcqVar = new bcq<>();
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(this.F.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("sucUnstructData");
                JSONArray jSONArray2 = jSONObject.getJSONArray("failUnstructData");
                JSONArray jSONArrayC = bda.c(jSONObject, "fail_error_code_map");
                arrayList = bcl.d(jSONArray);
                arrayList2 = bcl.d(jSONArray2);
                bcqVar = bcl.c(jSONArrayC);
            } catch (JSONException unused) {
                bcw.d("CloudSyncBase", "download save result error : JSONException");
            }
            this.F = new StringBuffer();
        } else {
            arrayList = bundle.getParcelableArrayList("unstructresult");
            arrayList2 = bundle.getParcelableArrayList("unstructfailresult");
            try {
                bcqVar = (bcq) bundle.getSerializable("fail_error_code_map");
            } catch (ClassCastException e) {
                bcw.d("CloudSyncBase", "download save result error:" + e.toString());
            }
        }
        ArrayList<UnstructData> arrayList3 = arrayList2;
        Map<Integer, List<String>> map = new HashMap<>();
        if (bcqVar != null && (map = bcqVar.d()) != null && !map.isEmpty()) {
            bcw.c("CloudSyncBase", "UnstructData failIdMap = " + map.toString());
            this.E = false;
        }
        Map<Integer, List<String>> map2 = map;
        if (((arrayList == null || arrayList.size() <= 0) && (arrayList3 == null || arrayList3.size() <= 0)) || a((List<UnstructData>) arrayList, (List<UnstructData>) arrayList3, map2, true, 0)) {
            a(arrayList);
            boolean z2 = bundle.getBoolean("isCloudDataParticalSuc", false);
            int i = bundle.getInt("cloudDataParticalErrCode", -1);
            if (z2) {
                d(i);
            } else {
                i();
            }
        }
    }

    private void g(Bundle bundle, boolean z) {
        ArrayList<UnstructData> arrayList = new ArrayList<>();
        ArrayList<UnstructData> arrayList2 = new ArrayList<>();
        bcq<Integer, List<String>> bcqVar = new bcq<>();
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(this.F.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("sucDownUnstructData");
                JSONArray jSONArray2 = jSONObject.getJSONArray("failDownUnstructData");
                JSONArray jSONArrayC = bda.c(jSONObject, "fail_error_code_map");
                arrayList = bcl.d(jSONArray);
                arrayList2 = bcl.d(jSONArray2);
                bcqVar = bcl.c(jSONArrayC);
            } catch (JSONException unused) {
                bcw.d("CloudSyncBase", "download unstruct result error : JSONException");
            }
            this.F = new StringBuffer();
        } else {
            arrayList = bundle.getParcelableArrayList("unstructresult");
            arrayList2 = bundle.getParcelableArrayList("unstructfailresult");
            try {
                bcqVar = (bcq) bundle.getSerializable("fail_error_code_map");
            } catch (ClassCastException e) {
                bcw.d("CloudSyncBase", "download save result error:" + e.toString());
            }
        }
        ArrayList<UnstructData> arrayList3 = arrayList;
        ArrayList<UnstructData> arrayList4 = arrayList2;
        Map<Integer, List<String>> map = new HashMap<>();
        if (bcqVar != null && (map = bcqVar.d()) != null && !map.isEmpty()) {
            bcw.c("CloudSyncBase", "failMap : " + map.toString());
            this.E = false;
        }
        a(arrayList3);
        a((List<UnstructData>) arrayList3, (List<UnstructData>) arrayList4, map, false, 0);
        this.G.c(this.O);
    }

    private void h(Bundle bundle, boolean z) {
        bcw.a("CloudSyncBase", "processQueryCloudDataResult");
        ArrayList<SyncData> arrayListD = d(bundle, z);
        if (arrayListD == null || arrayListD.isEmpty()) {
            bcw.d("CloudSyncBase", "processQueryCloudDataResult cloudData is null or bundle parse err empty");
            int i = bundle.getInt("resultCode", 5002);
            a("ProcessQueryCloudDataResult", "cloudData is null or bundle parse err empty", i != 0 ? i : 5002);
            return;
        }
        if (bundle.getBoolean("isCloudDataParticalSuc", false)) {
            d(arrayListD);
            HashMap map = new HashMap();
            a(bundle, map);
            f(!map.isEmpty() ? map.keySet().iterator().next().intValue() : -1);
        } else {
            d(arrayListD);
            j();
        }
        this.l.clear();
        this.m.clear();
        this.n.clear();
    }

    private void p() {
        List<String> listB = b(this.h);
        a(bcx.e(this.y, h(), this.h.size(), listB == null ? 0 : listB.size()));
        if (listB == null) {
            bcw.d("CloudSyncBase", "App delete struct data result is null");
            return;
        }
        this.h.clear();
        bcw.c("CloudSyncBase", "App delete struct data result.size = " + listB.size());
        c(listB);
    }

    private void q() {
        int size = this.D.size();
        int i = this.B;
        if (size >= i) {
            f(new ArrayList(this.D.subList(0, i)));
        } else {
            f(new ArrayList(this.D));
        }
    }

    private void r() {
        this.D.addAll(this.f);
        this.D.addAll(this.g);
        this.D.addAll(this.i);
    }

    private boolean s() {
        if (bcu.c(this.x, this.C)) {
            return true;
        }
        bcw.c("CloudSyncBase", "Does not meet the sync condition, stop sync");
        a(-3);
        return false;
    }

    private void t() {
        this.p.clear();
        this.o.clear();
        this.r.clear();
        this.q.clear();
        for (String str : this.f974a) {
            if (this.I.get(str) == null) {
                bcw.d("CloudSyncBase", "lIdsMap get add is null");
            } else if (bda.c(this.I.get(str).getHaveFile())) {
                this.p.add(str);
            } else {
                this.o.add(str);
            }
        }
        bcw.c("CloudSyncBase", "addFileId.size = " + this.p.size() + ", addId.size = " + this.o.size());
        for (String str2 : this.f975b) {
            if (this.I.get(str2) == null) {
                bcw.d("CloudSyncBase", "lIdsMap get update is null");
            } else if (bda.c(this.I.get(str2).getHaveFile())) {
                this.r.add(str2);
            } else {
                this.q.add(str2);
            }
        }
        bcw.c("CloudSyncBase", "modifyFileId.size = " + this.r.size() + ", modifyId.size = " + this.q.size());
    }

    private void u() {
        String strE = bda.e();
        bcw.c("CloudSyncBase", "recordServiceDisconnectedTime serviceDisconnectedTime = " + strE + ", traceId = " + this.L);
        bdc.e(this.C).e(this.x, this.y, strE, this.L);
    }

    private boolean v() {
        boolean z;
        if (bda.b(this.r)) {
            z = false;
        } else {
            Iterator<String> it = this.r.iterator();
            while (it.hasNext()) {
                this.t.add(it.next());
                if (this.B == this.t.size() + this.u.size()) {
                    b(true);
                    return true;
                }
            }
            z = true;
        }
        if (!bda.b(this.p)) {
            Iterator<String> it2 = this.p.iterator();
            while (it2.hasNext()) {
                this.s.add(it2.next());
                if (this.B == this.s.size() + this.t.size() + this.u.size()) {
                    b(true);
                    return true;
                }
            }
            z = true;
        }
        if (!bda.b(this.d)) {
            Iterator<String> it3 = this.d.iterator();
            while (it3.hasNext()) {
                this.v.add(it3.next());
                if (this.B == this.s.size() + this.t.size() + this.u.size() + this.v.size()) {
                    b(true);
                    return true;
                }
            }
            z = true;
        }
        if (bda.b(this.p) && bda.b(this.r) && bda.b(this.d)) {
            return z;
        }
        b(true);
        return true;
    }

    private boolean w() {
        boolean z;
        if (bda.b(this.f976c)) {
            z = false;
        } else {
            Iterator<String> it = this.f976c.iterator();
            while (it.hasNext()) {
                this.u.add(it.next());
                if (this.B == this.u.size()) {
                    b(false);
                    return true;
                }
            }
            z = true;
        }
        if (!bda.b(this.q)) {
            Iterator<String> it2 = this.q.iterator();
            while (it2.hasNext()) {
                this.t.add(it2.next());
                if (this.B == this.t.size() + this.u.size()) {
                    b(false);
                    return true;
                }
            }
            z = true;
        }
        if (!bda.b(this.o)) {
            Iterator<String> it3 = this.o.iterator();
            while (it3.hasNext()) {
                this.s.add(it3.next());
                if (this.B == this.s.size() + this.t.size() + this.u.size()) {
                    b(false);
                    return true;
                }
            }
            z = true;
        }
        if (!bda.b(this.d)) {
            Iterator<String> it4 = this.d.iterator();
            while (it4.hasNext()) {
                this.v.add(it4.next());
                if (this.B == this.s.size() + this.t.size() + this.u.size() + this.v.size()) {
                    b(false);
                    return true;
                }
            }
            z = true;
        }
        if (bda.b(this.o) && bda.b(this.q) && bda.b(this.f976c) && bda.b(this.d)) {
            return z;
        }
        b(false);
        return true;
    }

    protected abstract void a(Bundle bundle);

    protected abstract void a(Bundle bundle, boolean z);

    protected abstract void a(String str, String str2, List<SyncData> list, List<SyncData> list2, List<String> list3, List<SyncData> list4, boolean z, ISyncServiceCallback iSyncServiceCallback);

    protected abstract void a(ArrayList<UnstructData> arrayList);

    protected abstract void a(List<SyncData> list, List<String> list2, int i);

    protected abstract ArrayList<String> b(ArrayList<String> arrayList);

    protected abstract void b(Bundle bundle);

    protected abstract void b(List<SyncData> list, List<String> list2);

    protected abstract boolean b(Bundle bundle, boolean z);

    protected abstract void c(ArrayList<SyncData> arrayList);

    protected abstract void c(List<String> list);

    protected abstract void f();

    protected abstract void f(int i);

    void i() {
        bcw.c("CloudSyncBase", "Download data from cloud, needDownloadGuids.size = " + this.D.size());
        if (!this.D.isEmpty()) {
            q();
            return;
        }
        List<String> list = this.h;
        if (list == null || list.isEmpty()) {
            f();
        } else {
            p();
        }
    }

    protected abstract void j();

    protected abstract void k();

    void l() {
        if (d()) {
            t();
            m();
        }
    }

    void m() {
        bcw.c("CloudSyncBase", "process localdata to cloud.");
        this.u = new ArrayList(10);
        this.t = new ArrayList(10);
        this.s = new ArrayList(10);
        this.v = new ArrayList(10);
        if (w() || v()) {
            return;
        }
        bcw.c("CloudSyncBase", "dataSyncEnd: isAllUnstructDataSuccess = " + this.E);
        a(!this.E ? 122 : 0);
        bcw.c("CloudSyncBase", "end process localdata to cloud.");
    }

    protected abstract void n();

    List<SyncData> o() {
        List<bcd> listA = a(this.l, this.m);
        g(listA);
        if (listA == null) {
            bcw.d("CloudSyncBase", "App update struct data result is null");
            return null;
        }
        List<SyncData> listE = e(listA);
        if (s()) {
            return listE;
        }
        return null;
    }

    private List<SyncData> e(List<bcd> list) {
        bcw.c("CloudSyncBase", "App update result size = " + list.size());
        ArrayList arrayList = new ArrayList(100);
        for (bcd bcdVar : list) {
            SyncData syncData = this.H.get(bcdVar.b());
            if (syncData != null) {
                syncData.setLuid(bcdVar.a());
                syncData.setRecycleStatus(bcdVar.e());
                syncData.setDeleteFileList(bcdVar.c());
                syncData.setDownFileList(bcdVar.d());
                arrayList.add(syncData);
            } else {
                bcw.d("CloudSyncBase", "Update result data is null, guid = " + bcdVar.b());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message, Bundle bundle, boolean z, int i) {
        try {
            int i2 = message.what;
            if (i2 != 10002) {
                if (i2 != 10004) {
                    if (i2 == 10007 && bundle.getBoolean("fail_error_need_update_sync_result", false)) {
                        bcw.e("CloudSyncBase", "handle message, upload partial success, and result error, result = " + i);
                        i(bundle, z);
                        return true;
                    }
                } else if (bundle.getBoolean("isCloudDataParticalSuc", false)) {
                    bcw.e("CloudSyncBase", "handle message, after download partial success");
                    f(bundle, z);
                    return true;
                }
            } else if (bundle.getBoolean("isCloudDataParticalSuc", false)) {
                bcw.e("CloudSyncBase", "handle message, download partial success, and result error, result = " + i);
                h(bundle, z);
                return true;
            }
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "parseParticalResult err " + e.getMessage());
        }
        return false;
    }

    private void d(ArrayList<SyncData> arrayList) {
        this.l = new ArrayList<>(10);
        this.m = new ArrayList<>(10);
        this.n = new ArrayList<>(10);
        for (SyncData syncData : arrayList) {
            if (this.f.contains(syncData.getGuid())) {
                this.l.add(syncData);
            } else if (this.g.contains(syncData.getGuid())) {
                syncData.setLuid(this.H.get(syncData.getGuid()).getLuid());
                this.m.add(syncData);
            } else if (this.i.contains(syncData.getGuid())) {
                syncData.setLuid(this.H.get(syncData.getGuid()).getLuid());
                this.n.add(syncData);
            }
        }
    }

    private void i(Bundle bundle, boolean z) {
        ArrayList<SyncData> arrayListE;
        ArrayList<String> arrayListA;
        ArrayList<SyncData> parcelableArrayList;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        bcq<Integer, List<String>> bcqVar = new bcq<>();
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(this.F.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("modifyData");
                JSONArray jSONArray2 = jSONObject.getJSONArray("addData");
                String strE = bda.e(jSONObject, "deleteData");
                JSONArray jSONArrayC = bda.c(jSONObject, "failErrorCodeMap");
                ArrayList<SyncData> arrayListE2 = bcl.e(jSONArray);
                arrayListE = bcl.e(jSONArray2);
                arrayListA = bda.a(strE);
                bcq<Integer, List<String>> bcqVarC = bcl.c(jSONArrayC);
                this.F = new StringBuffer();
                bcqVar = bcqVarC;
                parcelableArrayList = arrayListE2;
            } catch (JSONException e) {
                String str = "processUploadResult error: " + e.getMessage();
                bcw.d("CloudSyncBase", str);
                a("ProcessUploadResult", str, 5001);
                return;
            }
        } else {
            parcelableArrayList = bundle.getParcelableArrayList("cmod");
            arrayListE = bundle.getParcelableArrayList("cadd");
            arrayListA = bda.a(bundle, "cdel");
            try {
                bcqVar = (bcq) bundle.getSerializable("fail_error_code_map");
            } catch (ClassCastException e2) {
                bcw.d("CloudSyncBase", "download save result error:" + e2.toString());
            }
        }
        Map<Integer, List<String>> map = new HashMap<>();
        if (bcqVar != null) {
            map = bcqVar.d() != null ? bcqVar.d() : new HashMap<>();
            if (!map.isEmpty()) {
                bcw.c("CloudSyncBase", "processUpload failMap.size = " + map.size() + ",  failMap = " + map.toString());
                this.E = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (arrayListE == null) {
            bcw.e("CloudSyncBase", "addData is null, new arrayList");
            a("ProcessUploadResult", "addData is null, new arrayList", 5001);
            return;
        }
        if (parcelableArrayList == null) {
            bcw.e("CloudSyncBase", "modifyData is null, new arrayList");
            a("ProcessUploadResult", "modifyData is null, new arrayList", 5001);
            return;
        }
        arrayList.addAll(arrayListE);
        arrayList.addAll(parcelableArrayList);
        ArrayList<String> arrayListB = b(arrayListA);
        List<String> arrayList2 = new ArrayList<>(arrayListB);
        if (b(arrayListE, parcelableArrayList, arrayListB, map) && s()) {
            int i = bundle.getInt("resultCode");
            boolean z2 = bundle.getBoolean("fail_error_need_update_sync_result", false);
            if (bcn.a() >= 100 && z2) {
                a(arrayList, arrayList2, i);
            } else {
                b(arrayList, arrayList2);
            }
        }
    }

    void c(Bundle bundle, boolean z) {
        a(bcx.b(this.x, e()));
        JSONArray jSONArray = this.K;
        if (jSONArray != null && jSONArray.length() > 0) {
            bcw.c("CloudSyncBase", "processEndSync: reportInfoArray = " + this.K.toString());
            this.G.d(this.x, this.K.toString(), false, this.O);
            this.K = null;
        } else {
            this.G.c(this.O);
        }
        bcw.c("CloudSyncBase", "processEndSync: Call app SyncEnd");
        bda.b(this.w);
    }

    boolean e(int i) {
        bcw.c("CloudSyncBase", "isHiCloudVersionMatch, AppAbilityVersion: " + bcn.a());
        if (i != 0 && i >= bcn.a()) {
            return true;
        }
        bcw.e("CloudSyncBase", "HiCloud version not match");
        bcw.c("CloudSyncBase", "Call app HiCloudVersionMatch");
        this.w.hiCloudVersionTooLow(i);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, Bundle bundle) {
        if (i != 10014) {
            return false;
        }
        bcw.c("CloudSyncBase", "SendTimeOutMessage msg.what = " + i);
        long j = bundle.getLong("timeOut", 300000L);
        String string = bundle.getString("timeOutMethod", "");
        Message message = new Message();
        message.what = i;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("resultCode", 0);
        bundle2.putString("timeOutMethod", string);
        message.obj = bundle2;
        this.N.sendMessageDelayed(message, j);
        return true;
    }

    protected void d(int i) {
        bcw.c("CloudSyncBase", "ifParticalSucNeedToStopDown returnCode = " + i);
        a(this.y, i);
    }

    protected boolean h() {
        return bcu.e(this.x, this.y, this.C) && bcn.d() && (this.M >= 104);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Bundle bundle) {
        this.N.removeMessages(PrebakedEffectId.RT_CALENDAR_DATE);
        bcr.d(this.O, 300000L, "allBatchReceiveOver");
        boolean z = bundle.getBoolean("is_send_over", false);
        bcw.c("CloudSyncBase", "sendOverFlag: " + z);
        if (z) {
            return true;
        }
        try {
            byte[] byteArray = bundle.getByteArray("batches_data_bytes_key");
            if (byteArray != null) {
                this.F.append(new String(byteArray, "UTF-8"));
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            bcw.e("CloudSyncBase", "isAllBatchesReceiveOver: " + e.toString());
            this.F = new StringBuffer();
            return true;
        }
    }

    private void e(Bundle bundle) {
        bcw.c("CloudSyncBase", "onExceedLimitResult");
        bcq bcqVar = new bcq();
        String string = bundle.getString("get_exceed_from_channel", "exceed_from_local");
        bcw.c("CloudSyncBase", "limists from = " + string);
        try {
            bcqVar = (bcq) bundle.getSerializable("get_datatypes_limits_result");
        } catch (ClassCastException e) {
            bcw.d("CloudSyncBase", "onExceedLimitResult get map error:" + e.toString());
        }
        Map<String, Long> map = new HashMap<>();
        if (bcqVar != null) {
            map = bcqVar.d();
        }
        if ("exceed_from_service".equals(string)) {
            bda.a(this.C, this.x, map);
        }
        a(this.x, map);
        bcw.c("CloudSyncBase", "onExceedLimitResult do unbind servie");
        this.G.c(this.O);
    }

    protected String c(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCloudDataParticalSuc", true);
            jSONObject.put("cloudDataParticalErrCode", i);
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "buildNotifyMsg err " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public void g() {
        this.G.c(this.O);
    }

    private void g(List<bcd> list) {
        String string;
        int i;
        ArrayList<SyncData> arrayList = this.l;
        int size = 0;
        int size2 = arrayList == null ? 0 : arrayList.size();
        ArrayList<SyncData> arrayList2 = this.m;
        int size3 = arrayList2 == null ? 0 : arrayList2.size();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", this.y);
            if (h()) {
                int iD = d((List<SyncData>) this.l);
                int iD2 = d((List<SyncData>) this.m);
                if (list != null) {
                    Iterator<bcd> it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (it.next().e() == -1) {
                            i++;
                        } else {
                            size++;
                        }
                    }
                } else {
                    i = 0;
                }
                jSONObject.put("addedNum", size2 - iD);
                jSONObject.put("recycleAddedNum", iD);
                jSONObject.put("modifiedNum", size3 - iD2);
                jSONObject.put("recycleModifiedNum", iD2);
                jSONObject.put("AppUpdateResultNum", size);
                jSONObject.put("AppRecycleUpdateResultNum", i);
            } else {
                jSONObject.put("addedNum", size2);
                jSONObject.put("modifiedNum", size3);
                if (list != null) {
                    size = list.size();
                }
                jSONObject.put("AppUpdateResultNum", size);
            }
            bcx.a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("CloudSyncBase", "reportUpdateStructData error: JSONException");
            string = "";
        }
        bcw.c("CloudSyncBase", "updateStructData: " + string);
        a(bcx.b(string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, Bundle bundle, boolean z) throws JSONException {
        this.N.removeMessages(PrebakedEffectId.RT_CALENDAR_DATE);
        switch (message.what) {
            case 10001:
                e(bundle, z);
                break;
            case 10002:
                h(bundle, z);
                break;
            case 10003:
                m();
                break;
            case 10004:
                f(bundle, z);
                break;
            case 10005:
                g(bundle, z);
                break;
            case 10006:
            case 10016:
            case 10018:
            case 10019:
            case 10020:
            case 10021:
            default:
                bcw.e("CloudSyncBase", "Receive error msg, what = " + message.what);
                a("ProcessMessage", "Receive error msg", 5001);
                break;
            case 10007:
                i(bundle, z);
                break;
            case 10008:
                l();
                break;
            case 10009:
                c(bundle, z);
                break;
            case 10010:
                b(bundle);
                break;
            case 10011:
                a(bundle);
                break;
            case 10012:
                k();
                break;
            case 10013:
                u();
                break;
            case PrebakedEffectId.RT_CALENDAR_DATE /* 10014 */:
                f(bundle);
                break;
            case 10015:
                e(bundle);
                break;
            case 10017:
                a(bundle, z);
                break;
            case 10022:
                n();
                break;
        }
    }

    private int d(List<SyncData> list) {
        int i = 0;
        if (list != null) {
            Iterator<SyncData> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getRecycleStatus() == -1) {
                    i++;
                }
            }
        }
        return i;
    }

    private void f(List<String> list) {
        if (s()) {
            this.G.c(this.x, this.y, list, this.O);
            this.D.removeAll(list);
        }
    }

    private void f(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("timeOutMethod", "");
        bcw.c("CloudSyncBase", "ReceiveTimeOutMessage msg.what = 10014, method = " + string);
        if (!TextUtils.equals(string, "endSync") && !TextUtils.equals(string, "endSyncV100")) {
            a(-10);
        } else {
            c(new Bundle(), false);
        }
    }

    private boolean a(Bundle bundle, Map<Integer, List<String>> map) {
        try {
            bcq bcqVar = (bcq) bundle.getSerializable("fail_error_code_map");
            if (bcqVar == null) {
                return true;
            }
            map.putAll(bcqVar.d() != null ? bcqVar.d() : new HashMap<>());
            if (map.isEmpty()) {
                return true;
            }
            bcw.c("CloudSyncBase", "getParticalCloudData failMap.size = " + map.size() + ",  failMap = " + map.toString());
            return true;
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "getParticalCloudData err: " + e.getMessage());
            return false;
        }
    }

    protected void a(String str, String str2, List<SyncData> list, List<SyncData> list2, List<String> list3, boolean z, ISyncServiceCallback iSyncServiceCallback) {
        this.G.a(str, str2, list, list2, list3, z, iSyncServiceCallback);
    }

    private void a(boolean z) {
        if (z) {
            Iterator<String> it = this.t.iterator();
            while (it.hasNext()) {
                this.r.remove(it.next());
            }
            Iterator<String> it2 = this.s.iterator();
            while (it2.hasNext()) {
                this.p.remove(it2.next());
            }
            Iterator<String> it3 = this.v.iterator();
            while (it3.hasNext()) {
                this.d.remove(it3.next());
            }
            return;
        }
        Iterator<String> it4 = this.u.iterator();
        while (it4.hasNext()) {
            this.f976c.remove(it4.next());
        }
        Iterator<String> it5 = this.t.iterator();
        while (it5.hasNext()) {
            this.q.remove(it5.next());
        }
        Iterator<String> it6 = this.s.iterator();
        while (it6.hasNext()) {
            this.o.remove(it6.next());
        }
        Iterator<String> it7 = this.v.iterator();
        while (it7.hasNext()) {
            this.d.remove(it7.next());
        }
    }

    void a(String str, String str2, int i, int i2, int i3) {
        if (a(str, str2, i, i2)) {
            b(str, str2, i3);
        }
    }

    boolean a(String str, String str2, int i, int i2) {
        this.x = str;
        this.y = str2;
        this.z = i;
        this.B = bda.b(i2);
        return s();
    }

    private boolean b(List<SyncData> list, List<SyncData> list2, List<String> list3, Map<Integer, List<String>> map) {
        bcw.c("CloudSyncBase", "Call app updateSyncResult begin");
        a(list, list2, list3, map);
        try {
            this.w.updateSyncResult(this.y, list, list2, list3, map);
            bcw.c("CloudSyncBase", "Call app updateSyncResult end");
            return true;
        } catch (bcp e) {
            a("updateSyncResult", e);
            return false;
        }
    }

    public void a(String str, String str2, List<UnstructData> list) {
        bcw.c("CloudSyncBase", "downUnstructFile ,syncType = " + str + " , unstructArry = " + list.toString());
        this.x = str;
        this.y = str2;
        if (!bcu.c(this.x, this.C)) {
            bcw.c("CloudSyncBase", "downUnstructFile ,switch is close");
            a((List<UnstructData>) null, list, (Map<Integer, List<String>>) null, false, -3);
        } else {
            this.G.b(str, str2, list, this.O);
        }
    }

    protected void b(String str, String str2, int i) {
        bcw.c("CloudSyncBase", "notifySyncModel dataType = " + str2 + ", syncModel = " + i);
        bcn.c();
        n();
    }

    private boolean a(List<UnstructData> list, List<UnstructData> list2, Map<Integer, List<String>> map, boolean z, int i) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", this.y);
            jSONObject.put("isSync", z);
            jSONObject.put("sucUnStructDataNum", list == null ? 0 : list.size());
            jSONObject.put("failUnStructDataNum", list2 == null ? 0 : list2.size());
            jSONObject.put("failErrorCodeMap", map == null ? 0 : map.toString());
            bcx.a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("CloudSyncBase", "unStructDownEnd error: JSONException");
            string = "";
        }
        bcw.c("CloudSyncBase", "Call app unStructDownEnd: " + string);
        a(bcx.d(string));
        try {
            try {
                this.w.onUnstructDataDownloadEnd(this.y, list, list2, map, z, i);
                if (z) {
                    return true;
                }
            } catch (bcp e) {
                if (z) {
                    a("onUnstructDataDownloadEnd", e);
                    if (!z) {
                        bcw.c("CloudSyncBase", "unStructDownEnd: Call app SyncEnd");
                        bda.b(this.w);
                    }
                    return false;
                }
                bcw.d("CloudSyncBase", "onUnstructDataDownloadEnd error: code = " + e.b() + ", msg = " + e.getMessage());
                if (z) {
                    return true;
                }
            }
            bcw.c("CloudSyncBase", "unStructDownEnd: Call app SyncEnd");
            bda.b(this.w);
            return true;
        } catch (Throwable th) {
            if (!z) {
                bcw.c("CloudSyncBase", "unStructDownEnd: Call app SyncEnd");
                bda.b(this.w);
            }
            throw th;
        }
    }

    public void a(String str, List<String> list, List<String> list2) {
        bcw.c("CloudSyncBase", "App call: endSync");
        this.G.d(str, list, list2, this.O);
    }

    public void a(int i, String str) {
        bcw.c("CloudSyncBase", "report: returnCode = " + i + ", errorReason: " + str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("business_id", "local_app_report");
            jSONObject.put("returnCode", i);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, str);
            bcx.a(jSONObject);
            if (this.K == null) {
                this.K = new JSONArray();
            }
            this.K.put(jSONObject);
        } catch (JSONException unused) {
            bcw.c("CloudSyncBase", "report error: JSONException");
        }
    }

    public void a(String str, int i, String str2) {
        bcw.c("CloudSyncBase", "reportSyncRsn syncType = " + str);
        this.A = i;
        try {
            String packageName = this.C.getPackageName();
            this.G.b(str, packageName, this.C.getPackageManager().getPackageInfo(packageName, 0).versionName, str2, this.O);
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "reportSyncRsn error: " + e.toString());
        }
    }

    public void a(String str, String str2, int i, JSONObject jSONObject) {
        this.A = i;
        try {
            String packageName = this.C.getPackageName();
            String str3 = this.C.getPackageManager().getPackageInfo(packageName, 0).versionName;
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2 = new JSONObject(jSONObject.toString());
            }
            if (i != -1) {
                jSONObject2.put("syncRsn", i);
            }
            bcx.a(jSONObject2);
            bcw.a("CloudSyncBase", "reportSyncInfo = " + jSONObject2.toString());
            this.G.c(str, str2, packageName, str3, jSONObject2.toString(), this.O);
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "reportSyncInfo error: " + e.toString());
        }
    }

    @Override // defpackage.bcm
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.G.d(this.x, str, true, this.O);
    }

    private void a(List<SyncData> list, List<SyncData> list2, List<String> list3, Map<Integer, List<String>> map) {
        String string;
        int size = list == null ? 0 : list.size();
        int size2 = list2 == null ? 0 : list2.size();
        int size3 = list3 != null ? list3.size() : 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", this.y);
            if (h()) {
                int iD = d(list);
                int iD2 = d(list2);
                jSONObject.put("addedNum", size - iD);
                jSONObject.put("recycleAddedNum", iD);
                jSONObject.put("modifiedNum", size2 - iD2);
                jSONObject.put("recycleModifiedNum", iD2);
            } else {
                jSONObject.put("addedNum", size);
                jSONObject.put("modifiedNum", size2);
                jSONObject.put("deletedNum", size3);
            }
            if (map != null) {
                jSONObject.put("failErrorCodeMap", map.toString());
            }
            bcx.a(jSONObject);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            bcw.d("CloudSyncBase", "reportUpdateSyncResult error: JSONException");
            string = "";
        }
        bcw.c("CloudSyncBase", "Call app updateSyncResult, " + string);
        a(bcx.e(string));
    }

    public int a(Map<String, String> map, String str) {
        if (map != null && map.size() != 0) {
            bcw.c("CloudSyncBase", "EtagOperator to batUpdate4Luid");
            int iB = new bcg().b(map, str);
            bcw.c("CloudSyncBase", "contact recycle replaceEtagLuid, result = " + iB);
            if (iB != 0) {
                return -1;
            }
            return iB;
        }
        bcw.e("CloudSyncBase", "replaceEtagLuid luidMap is null or size is 0");
        return -2;
    }

    public void a(Context context, String str, List<String> list) {
        HashMap map = new HashMap();
        for (String str2 : list) {
            long jA = bdc.e(context).a(str, str2);
            if (-1 != jA) {
                map.put(str2, Long.valueOf(jA));
            }
        }
        this.x = str;
        if (bda.c(this.C, str, list, map)) {
            bcw.c("CloudSyncBase", "getExceedLimitNum: " + str + " in 24 hours, get limists from sp");
            a(map);
            return;
        }
        bcw.c("CloudSyncBase", "clear sp limits");
        bdc.e(context).a(str, list);
        bdc.e(context).b(str, list);
        bcw.c("CloudSyncBase", "getExceedLimitNum: " + str + " upper 24 hours, get limists from server");
        this.G.b(str, list, this.O);
    }

    private void a(Map<String, Long> map) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("resultCode", 0);
            bundle.putString("get_exceed_from_channel", "exceed_from_local");
            bcq bcqVar = new bcq();
            bcqVar.e(map);
            bundle.putSerializable("get_datatypes_limits_result", bcqVar);
            this.O.handlerEventMsg(10015, 0, 0, bundle);
        } catch (Exception e) {
            bcw.d("CloudSyncBase", "getExceedLimitsFromSp error: " + e.getMessage());
        }
    }
}
