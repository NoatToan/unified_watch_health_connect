package defpackage;

import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class fxr {
    private static String d;

    public static void b(final IBaseResponseCallback iBaseResponseCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j("MemberDeviceBenefitsUtils", "getDeviceBenefits browseMode, return");
            return;
        }
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: fxr.5
                @Override // java.lang.Runnable
                public void run() {
                    fxr.b(iBaseResponseCallback);
                }
            });
        } else if (!TextUtils.isEmpty(d) || !CommonUtil.bg()) {
            LogUtil.a("MemberDeviceBenefitsUtils", "mDeviceSn is not empty or not huawei system");
            a(iBaseResponseCallback);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fxo
                @Override // java.lang.Runnable
                public final void run() {
                    fxr.d(iBaseResponseCallback);
                }
            });
        }
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback) {
        String strC = qhu.c(BaseApplication.getContext());
        d = strC;
        LogUtil.a("MemberDeviceBenefitsUtils", "getDeviceSn end is deviceSn empty", Boolean.valueOf(TextUtils.isEmpty(strC)));
        a(iBaseResponseCallback);
    }

    private static void a(IBaseResponseCallback iBaseResponseCallback) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.a("MemberDeviceBenefitsUtils", "getDeviceBenefits payApi is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (CommonUtil.bg() && !TextUtils.isEmpty(d)) {
            arrayList.add(new DeviceBenefitQueryParam.Builder().setDeviceType(PhoneInfoUtils.getDeviceModel()).setDeviceSn(d).setBenefitType(DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_PERF_PURCHASE).setDeviceCategory(DeviceBenefitQueryParam.DeviceCategory.DEVICE_CATEGORY_PHONE.getCategory()).setDeviceSnType(DeviceBenefitQueryParam.DeviceSnType.DEVICE_SN_TYPE_UDID.getSnType()).setNeedProductInfo(true).build());
        }
        arrayList.addAll(qhu.d("MemberDeviceBenefitsUtils", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL));
        payApi.getAllDeviceBenefits(arrayList, iBaseResponseCallback);
    }
}
