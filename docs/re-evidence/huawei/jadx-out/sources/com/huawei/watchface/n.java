package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class n {
    public static n i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30496c;
    public boolean d = true;
    public CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public z f = new z();
    public z g = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f30494a = new z();
    public z h = new z();

    public static n e() {
        if (i == null) {
            synchronized (n.class) {
                if (i == null) {
                    i = new n();
                    HwLog.i("AodManager", "AodManager instance end ");
                    i.f();
                }
            }
        }
        return i;
    }

    public void a(String str, String str2) {
        z zVar;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (zVar = this.f) == null) {
            HwLog.e("AodManager", "addAodList paramName or  paramContent is null ");
            return;
        }
        if (zVar.a(str)) {
            return;
        }
        HwLog.e("AodManager", "addAodList paramName： " + str + ":::::" + str2);
        this.f.a(str.trim(), str2.trim());
    }

    public void b() {
        synchronized (this) {
            HwLog.i("AodManager", "clearLocalList");
            z zVar = this.g;
            if (zVar != null && this.f30494a != null) {
                zVar.a();
                this.f30494a.a();
            }
        }
    }

    public void c() {
        b();
        this.f30496c = "";
        this.d = true;
    }

    public String d() {
        StringBuilder sb = new StringBuilder("");
        for (WatchResourcesInfo watchResourcesInfo : this.e) {
            String watchInfoId = watchResourcesInfo.getWatchInfoId();
            String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
            if (watchInfoId != null && watchInfoVersion != null) {
                StringBuffer stringBuffer = new StringBuffer(",");
                stringBuffer.append(watchInfoId);
                stringBuffer.append("_");
                stringBuffer.append(watchInfoVersion);
                sb.append(stringBuffer.toString());
            }
        }
        String string = sb.toString();
        HwLog.i("AodManager", "getWatchFaceIdStore result: " + string);
        return string;
    }

    public void f() {
        if (IntegerUtils.a(NewSystemParamManager.getSystemParam(SystemParamNames.CLIENT_SUPPORT_AOD, "")) == 1) {
            this.f30495b = true;
            HwLog.i("AodManager", "getSurportAod : " + this.f30495b);
            return;
        }
        HwLog.i("AodManager", "getSurportAod : " + this.f30495b);
        this.f30495b = false;
    }

    public boolean g() {
        return this.f30495b;
    }

    public String h(String str) {
        HwLog.i("AodManager", "getJsCancelInstallWatchFaceResult(): " + str);
        return f(str);
    }

    public String i(String str) {
        HwLog.i("AodManager", "getStopTransfer(): " + str);
        return e(str);
    }

    public boolean j(String str) {
        HwLog.i("AodManager", "isStopTransfer() id :" + str);
        z zVar = this.g;
        return zVar != null && zVar.b(str);
    }

    public String k(String str) {
        HwLog.i("AodManager", "operateDeviceid hiTopId : " + str);
        String strB = b(str);
        this.f30496c = strB;
        return strB;
    }

    public String l(String str) {
        HwLog.i("AodManager", "setCommonStopTransferCallbackToH5(): " + str);
        return f(str);
    }

    public String g(String str) {
        z zVar;
        HwLog.i("AodManager", "getHiTopId2ByTransmitDeleteWatchFaceResultMap enter : ");
        if (!g() || (zVar = this.h) == null || !zVar.a(str)) {
            return str;
        }
        HwLog.i("AodManager", "getHiTopId2ByTransmitDeleteWatchFaceResultMap hiTopId2 : " + this.h.c(str) + ",hiTopId: " + str);
        String strC = this.h.c(str);
        this.h.e(str);
        return strC;
    }

    public String c(String str) {
        HwLog.i("AodManager", "getCallTransmitProgressJsFunction(): " + str);
        return f(str);
    }

    public String b(String str) {
        HwLog.i("AodManager", "applyHiTopId hiTopId aodlist: " + this.f30495b);
        if (!g() || this.g == null) {
            return str;
        }
        HwLog.i("AodManager", "applyHiTopId hiTopId : ::::" + this.g.a(str) + "hiTopId:::" + str + "json :" + GsonHelper.toJson(this.g.f30681b));
        return e(str);
    }

    public void a() {
        z zVar = this.f;
        if (zVar == null) {
            return;
        }
        zVar.a();
    }

    public String f(String str) {
        if (!g() || this.g == null) {
            return str;
        }
        HwLog.i("AodManager", "getHiTopId2 : " + str + "json :" + GsonHelper.toJson(this.g.f30680a));
        if (!this.g.a(str)) {
            return str;
        }
        HwLog.i("AodManager", "getHiTopId2 hiTopId2 : " + this.g.c(str));
        return this.g.c(str);
    }

    public String e(String str) {
        z zVar;
        HwLog.i("AodManager", "aod getHihop1(): " + str);
        if (!g() || (zVar = this.g) == null || !zVar.b(str)) {
            return str;
        }
        String strD = this.g.d(str);
        String strSubstring = SafeString.substring(strD, 0, strD.indexOf("$#%"));
        HwLog.i("AodManager", "getHihop1: return Hihop1 :" + strSubstring);
        return strSubstring;
    }

    public void a(boolean z) {
        HwLog.i("AodManager", "DeviceChange : " + z);
        if (z) {
            e().a();
        }
    }

    public void b(WatchResourcesInfo watchResourcesInfo) {
        z zVar;
        if (!g() || (zVar = this.f) == null || this.f30494a == null || !zVar.a(watchResourcesInfo.getWatchInfoId())) {
            return;
        }
        String watchInfoId = watchResourcesInfo.getWatchInfoId();
        String strC = this.f.c(watchInfoId);
        if (!this.d || this.f30494a.a(watchInfoId)) {
            return;
        }
        HwLog.i("AodManager", "setChangeHopidList :" + watchInfoId + ",hitopid2:" + strC + "");
        this.f30494a.a(watchInfoId, strC, watchInfoId + "$#%" + watchResourcesInfo.getWatchInfoVersion());
    }

    public void a(String str, String str2, ConcurrentHashMap concurrentHashMap) {
        HwLog.i("AodManager", "removeSaveDownhop : mWatchFaceDownloadList:" + GsonHelper.toJson(concurrentHashMap.keySet()));
        z zVar = this.g;
        if (zVar == null || !zVar.a(str)) {
            return;
        }
        concurrentHashMap.remove(this.g.c(str) + "_" + str2);
        HwLog.i("AodManager", "removeSaveDownhop if ：:::::" + str + ":::::" + this.g.c(str) + "_" + str2);
    }

    public String d(String str) {
        z zVar = this.g;
        if (zVar == null || !zVar.b(str)) {
            return str;
        }
        String strD = this.g.d(str);
        HwLog.i("AodManager", "aod getCancelInstallWatchFacehiTopId befor: " + str);
        String strSubstring = SafeString.substring(strD, 0, strD.indexOf("$#%"));
        HwLog.i("AodManager", "aod getCancelInstallWatchFacehiTopId after: " + strSubstring);
        return strSubstring;
    }

    public void a(WatchResourcesInfo watchResourcesInfo) {
        String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
        String watchInfoId = watchResourcesInfo.getWatchInfoId();
        if (this.g == null) {
            return;
        }
        HwLog.i("AodManager", "deldetUserSelectWatchFace Aod hiTopId: " + watchInfoId + ", version: " + watchInfoVersion);
        StringBuilder sb = new StringBuilder("deldetUserSelectWatchFace Aod json delde befor : ");
        sb.append(GsonHelper.toJson(this.g.f30680a));
        HwLog.i("AodManager", sb.toString());
        if (this.g.b(watchInfoId)) {
            String strD = this.g.d(watchInfoId);
            String strSubstring = SafeString.substring(strD, 0, strD.indexOf("$#%"));
            WatchResourcesInfo watchResourcesInfo2 = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchResourcesInfo(strSubstring);
            watchResourcesInfo.setWatchInfoId(strSubstring);
            if (watchResourcesInfo2 != null) {
                watchInfoVersion = watchResourcesInfo2.getWatchInfoVersion();
                watchResourcesInfo.setWatchInfoVersion(watchInfoVersion);
            }
            HwLog.i("AodManager", "deldetUserSelectWatchFace Aod hiTopIdVersion : " + strD + "hiTopId:" + strSubstring + "  version:" + watchInfoVersion + ":::");
            a(strSubstring);
            this.g.e(strSubstring);
        } else if (this.g.a(watchInfoId)) {
            this.g.e(watchInfoId);
            a(watchInfoId);
        }
        HwLog.i("AodManager", "deldetUserSelectWatchFace Aod json delde after : " + GsonHelper.toJson(this.g.f30680a));
    }

    public final void a(String str) {
        z zVar = this.h;
        if (zVar == null || zVar.a(str)) {
            return;
        }
        z zVar2 = this.h;
        String strC = this.g.c(str);
        z zVar3 = this.g;
        zVar2.a(str, strC, zVar3.d(zVar3.c(str)));
    }

    public void a(HashMap map, ArrayList arrayList) {
        synchronized (this) {
            HwLog.i("AodManager", "setpresentMap::" + map.size());
            CopyOnWriteArrayList copyOnWriteArrayList = this.e;
            if (copyOnWriteArrayList != null && this.f30494a != null) {
                copyOnWriteArrayList.clear();
                for (String str : this.f30494a.f30680a.keySet()) {
                    String strC = this.f30494a.c(str);
                    if (map.containsKey(str) && !map.containsKey(strC)) {
                        HwLog.i("AodManager", "add hideWatchFaceIdStore for:" + str + "_" + strC);
                        WatchResourcesInfo watchResourcesInfo = (WatchResourcesInfo) map.get(str);
                        if (watchResourcesInfo != null) {
                            WatchResourcesInfo watchResourcesInfo2 = new WatchResourcesInfo();
                            watchResourcesInfo2.setWatchInfoId(watchResourcesInfo.getWatchInfoId());
                            watchResourcesInfo2.setWatchInfoVersion(watchResourcesInfo.getWatchInfoVersion());
                            watchResourcesInfo2.setWatchInfoName(watchResourcesInfo.getWatchInfoName());
                            watchResourcesInfo2.setWatchInfoBrief(watchResourcesInfo.getWatchInfoBrief());
                            watchResourcesInfo2.setWatchInfoSize(watchResourcesInfo.getWatchInfoSize());
                            watchResourcesInfo2.setFailedNum(watchResourcesInfo.getFailedNum());
                            watchResourcesInfo2.setVipFreeWatchFace(watchResourcesInfo.isVipFreeWatchFace());
                            watchResourcesInfo2.setWatchExpandType(watchResourcesInfo.getWatchExpandType());
                            watchResourcesInfo2.setWatchInfoType(watchResourcesInfo.getWatchInfoType());
                            watchResourcesInfo2.setWatchScreen(watchResourcesInfo.getWatchScreen());
                            watchResourcesInfo.setWatchInfoId(strC);
                            this.g.a(str, strC, this.f30494a.d(strC));
                            this.e.add(watchResourcesInfo2);
                            HwLog.i("AodManager", "add setpresentMap :" + str + "_" + watchResourcesInfo.getWatchInfoVersion() + "???" + this.f30494a.d(strC));
                        }
                    }
                }
                arrayList.addAll(this.e);
                HwLog.i("AodManager", "hashWatchFaces for::" + map.size());
                HwLog.i("AodManager", "setpresentMap over::" + this.d + ":::::" + GsonHelper.toJson(this.g.f30680a));
                this.d = false;
            }
        }
    }

    public boolean a(String str, String str2, String str3) {
        WatchResourcesInfo currentWatchFace;
        z zVar = this.g;
        if (zVar == null || !zVar.a(str) || (currentWatchFace = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getCurrentWatchFace()) == null) {
            return false;
        }
        HwLog.i("AodManager", "showToast hiTopId:" + str + "value::" + this.g.c(str) + "Currenthitop::" + currentWatchFace.getWatchInfoId());
        return TextUtils.equals(this.g.c(str), currentWatchFace.getWatchInfoId());
    }
}
