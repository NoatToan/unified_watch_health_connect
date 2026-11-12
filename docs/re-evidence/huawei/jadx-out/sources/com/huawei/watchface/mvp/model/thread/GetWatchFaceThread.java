package com.huawei.watchface.mvp.model.thread;

import com.google.gson.JsonSyntaxException;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.c2;
import com.huawei.watchface.c5;
import com.huawei.watchface.d0;
import com.huawei.watchface.e4;
import com.huawei.watchface.e5;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.m1;
import com.huawei.watchface.mvp.model.datatype.WatchFaceListBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultInfo"), @d0(name = "resultCode"), @d0(name = "list-hitopId,isCharge,price")})
public class GetWatchFaceThread extends BaseHttpRequest<WatchFaceListBean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30362c = "GetWatchFaceThread";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30364b;

    public GetWatchFaceThread(boolean z, boolean z2) {
        this.f30363a = z;
        this.f30364b = z2;
    }

    public final boolean a(WatchFaceListBean watchFaceListBean) {
        List<WatchFaceListBean.WatchFaceBean> watchFaceBeanList = watchFaceListBean.getWatchFaceBeanList();
        ArrayList arrayList = new ArrayList(3);
        boolean zJ = CommonUtils.J();
        e4.f(Environment.getApplicationContext(), zJ ? "1" : "0");
        int i = zJ ? 6 : 3;
        if (watchFaceBeanList != null) {
            HwLog.i(f30362c, "isSuitableWatchFaceList before deal list size:" + watchFaceBeanList.size());
            Iterator<WatchFaceListBean.WatchFaceBean> it = watchFaceBeanList.iterator();
            while (it.hasNext() && arrayList.size() < i) {
                WatchFaceListBean.WatchFaceBean next = it.next();
                String version = next.getVersion();
                if (version == null) {
                    HwLog.i(f30362c, "isSuitableWatchFaceList faceBeanVersion is null");
                } else {
                    String str = f30362c;
                    HwLog.i(str, "isSuitableWatchFaceList faceBeanVersion hitopId:" + next.getHitopId() + ",price：" + next.getPrice() + ",isCharge：" + next.getIsCharge() + ",resolution：" + next.getResolution());
                    if (!ArrayUtils.isEmpty(next.getTitle()) && next.getTitle().get(0) != null) {
                        HwLog.i(str, "isSuitableWatchFaceList title:" + next.getTitle().get(0).getTitle());
                    }
                    String[] strArrSplit = version.split("\\.");
                    if (strArrSplit.length >= 3 && IntegerUtils.c(strArrSplit[2], 10) < 9000) {
                        arrayList.add(next);
                    }
                }
            }
            watchFaceListBean.setWatchFaceBeanList(arrayList);
        }
        return arrayList.size() > 0;
    }

    public WatchFaceListBean b(String str) {
        return e(str);
    }

    public String c(String str) {
        HwLog.i(f30362c, "getResponse version: " + str + "-isBihHotTest:" + this.f30363a);
        return a(WatchFaceHttpUtil.I(), d(str), b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WatchFaceSignBean watchFaceSignBeanC = WatchFaceHttpUtil.C();
        if (watchFaceSignBeanC != null) {
            linkedHashMap.put(HwPayConstant.KEY_SIGN, watchFaceSignBeanC.getSign());
        } else {
            HwLog.e(f30362c, "getWatchFaceParams sign is null!");
            GetSignThread getSignThread = new GetSignThread();
            WatchFaceSignBean watchFaceSignBeanB = getSignThread.b(getSignThread.e());
            linkedHashMap.put(HwPayConstant.KEY_SIGN, watchFaceSignBeanB != null ? watchFaceSignBeanB.getSign() : "");
        }
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, str);
        linkedHashMap.put("filetype", "hwt");
        linkedHashMap.put("type", "1");
        linkedHashMap.put("versionCode", c());
        linkedHashMap.put("begin", "1");
        if (CommonUtils.J()) {
            linkedHashMap.put("length", "24");
        } else {
            linkedHashMap.put("length", "12");
        }
        linkedHashMap.put("resourceType", 1);
        linkedHashMap.put("isVipVersion", Integer.valueOf(CommonUtils.B()));
        linkedHashMap.put("contentPrivType", "1,2,3,4");
        linkedHashMap.put("subType", "0");
        Object[] objArr = c2.a(Environment.getApplicationContext()).u() || m1.b().a() == 1;
        if (objArr == true && !e5.c().g()) {
            HwLog.i(f30362c, "is child model");
            linkedHashMap.put("chargeFlag", 0);
            linkedHashMap.put("listCode", "hottest");
            linkedHashMap.put("sourceFlag", "0");
        } else if (!this.f30363a || objArr == true) {
            linkedHashMap.put("listCode", "hottest");
            linkedHashMap.put("sourceFlag", "0");
            if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
                HwLog.i(f30362c, "is isOversea");
                linkedHashMap.put("chargeFlag", Integer.valueOf(this.f30364b ? 1 : 0));
            } else {
                HwLog.i(f30362c, "cn is not BihHotTest");
                linkedHashMap.put("chargeFlag", -1);
            }
        } else {
            HwLog.i(f30362c, "is BihHotTest");
            linkedHashMap.put("listCode", "bihottest");
            linkedHashMap.put("sourceFlag", "1");
            linkedHashMap.put("chargeFlag", -1);
        }
        linkedHashMap.put("phoneId", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdAsTheme(true));
        return WatchFaceHttpUtil.a(linkedHashMap);
    }

    public final WatchFaceListBean e(String str) {
        try {
            if (str == null) {
                HwLog.e(f30362c, "isDealRightReceive receive is null!");
                return null;
            }
            WatchFaceListBean watchFaceListBean = (WatchFaceListBean) c5.a().a(str, WatchFaceListBean.class);
            if (watchFaceListBean == null) {
                HwLog.e(f30362c, "isDealRightReceive watch face unknown error!");
                return null;
            }
            int iC = IntegerUtils.c(watchFaceListBean.getResultCode(), 10);
            String str2 = f30362c;
            HwLog.i(str2, "isDealRightReceive errCode : " + iC);
            if (!a(watchFaceListBean)) {
                HwLog.w(str2, "isDealRightReceive response not suitable");
                return null;
            }
            if (watchFaceListBean.getWatchFaceBeanList() == null) {
                HwLog.w(str2, "isDealRightReceive failed.");
                return null;
            }
            HwLog.i(str2, "isDealRightReceive after deal list size:" + watchFaceListBean.getWatchFaceBeanList().size());
            return watchFaceListBean;
        } catch (JsonSyntaxException e) {
            HwLog.e(f30362c, "isDealRightReceive JsonSyntaxException: " + HwLog.printException((Exception) e));
            return null;
        } catch (Exception e2) {
            HwLog.e(f30362c, "isDealRightReceive exception: " + HwLog.printException(e2));
            return null;
        }
    }

    private LinkedHashMap b() {
        HwLog.i(f30362c, "generateCommonHeaders() enter");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap);
        linkedHashMap.put("x-screen", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceScreen(false, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0));
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("x-accountBrand", String.valueOf(q0.b()));
        linkedHashMap.put("x-appBrand", String.valueOf(q0.b()));
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put(WatchFaceConstant.CIPHER_VERSION, "2");
        c2.a(Environment.getApplicationContext()).a(linkedHashMap, d());
        if (this.f30363a) {
            linkedHashMap.put("personalSwitch", "1");
            return linkedHashMap;
        }
        linkedHashMap.put("personalSwitch", "0");
        return linkedHashMap;
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }
}
