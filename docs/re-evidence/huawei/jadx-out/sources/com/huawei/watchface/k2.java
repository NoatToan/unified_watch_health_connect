package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignatureBean;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.GetMemberSignatureThread;
import com.huawei.watchface.mvp.model.thread.GetWatchFaceSignatureThread;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile k2 f30264b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30265a = new ConcurrentHashMap();

    public static k2 a() {
        if (f30264b == null) {
            synchronized (k2.class) {
                if (f30264b == null) {
                    f30264b = new k2();
                }
            }
        }
        return f30264b;
    }

    public void b(String str, String str2) {
        String str3 = str + "_" + str2;
        HwLog.i("HwWatchfaceSignatureManager", "removeWatchfaceSignature -- signatureKey :" + str3);
        if (this.f30265a.containsKey(str3)) {
            this.f30265a.remove(str3);
        }
    }

    public String a(String str, String str2) {
        if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportWatchfaceSignature()) {
            HwLog.e("HwWatchfaceSignatureManager", "getWatchfaceSignature -- isSupportWatchfaceSignature false");
            return "";
        }
        String str3 = str + "_" + str2;
        HwLog.i("HwWatchfaceSignatureManager", "getWatchfaceSignature -- signatureKey :" + str3);
        return this.f30265a.containsKey(str3) ? (String) this.f30265a.get(str3) : "";
    }

    public boolean a(String str, String str2, int i, boolean z) {
        HwLog.i("HwWatchfaceSignatureManager", "requestWatchfaceSignature hiTopId:" + str + ",version:" + str2 + ",operateType:" + i + ",isVipFree:" + z);
        if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportWatchfaceSignature()) {
            HwLog.e("HwWatchfaceSignatureManager", "requestWatchfaceSignature -- isSupportWatchfaceSignature false");
            return false;
        }
        if (str != null && str2 != null) {
            if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()) == null) {
                HwLog.e("HwWatchfaceSignatureManager", "requestWatchfaceSignature -- instance is null");
                return false;
            }
            GetWatchFaceSignatureThread getWatchFaceSignatureThread = new GetWatchFaceSignatureThread(a(str, z), str2, i);
            String strB = getWatchFaceSignatureThread.b(getWatchFaceSignatureThread.f());
            if (TextUtils.isEmpty(strB)) {
                HwLog.e("HwWatchfaceSignatureManager", "requestWatchfaceSignature -- watchFaceSignature is null");
                return false;
            }
            this.f30265a.put(str + "_" + str2, strB);
            return true;
        }
        HwLog.e("HwWatchfaceSignatureManager", "requestWatchfaceSignature -- hiTopId or version null");
        return false;
    }

    public final String a(String str, boolean z) {
        return !z ? str : WatchResourcesInfo.markUpHiTopId(str);
    }

    public void a(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        HwLog.i("HwWatchfaceSignatureManager", "sendMemberSignature enter vipMembership:" + z);
        if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
            HwLog.i("HwWatchfaceSignatureManager", "sendMemberSignature -- isSupportMemberSignature false");
            return;
        }
        HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.getInstance(Environment.getApplicationContext());
        if (hwWatchFaceManager == null) {
            HwLog.i("HwWatchfaceSignatureManager", "sendMemberSignature hwWatchFaceManager is null");
            return;
        }
        if (z) {
            GetMemberSignatureThread getMemberSignatureThread = new GetMemberSignatureThread();
            WatchFaceSignatureBean watchFaceSignatureBeanB = getMemberSignatureThread.b(getMemberSignatureThread.e());
            if (watchFaceSignatureBeanB == null) {
                HwLog.e("HwWatchfaceSignatureManager", "requestMemberSignature -- memberSignatureBean is null");
                return;
            }
            HwLog.i("HwWatchfaceSignatureManager", "requestMemberSignature code:" + watchFaceSignatureBeanB.getResultCode() + ",info:" + watchFaceSignatureBeanB.getResultInfo());
            String json = GsonHelper.toJson(watchFaceSignatureBeanB.getResult());
            StringBuilder sb = new StringBuilder("sendMemberSignature mMemberSignature:");
            sb.append(json);
            FlavorConfig.safeHwLog("HwWatchfaceSignatureManager", sb.toString());
            hwWatchFaceManager.operateMemberSignature(8, json, iBaseResponseCallback);
            return;
        }
        hwWatchFaceManager.operateMemberSignature(9, null, iBaseResponseCallback);
    }
}
