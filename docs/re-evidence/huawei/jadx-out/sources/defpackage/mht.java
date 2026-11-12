package defpackage;

import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.calendarsync.CalendarSyncApi;
import health.compact.a.EnvironmentUtils;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = CalendarSyncApi.class)
@Singleton
public class mht implements CalendarSyncApi {
    @Override // com.huawei.syncmgr.calendarsync.CalendarSyncApi
    public void syncCalendarSwitch(int i) {
        LogUtil.a("CalendarSwitchApiImpl", "syncCalendarSwitch isPhoneServiceProcess is ", Boolean.valueOf(EnvironmentUtils.e()));
        if (EnvironmentUtils.e()) {
            mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, i);
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                iWearPhoneServiceAIDLC.notifyPhoneService("syncCalendarSwitch", new DeviceInfo(), i, null);
                return;
            } catch (RemoteException e) {
                lug.e(BaseApplication.getContext());
                LogUtil.e("CalendarSwitchApiImpl", "syncCalendarSwitch exception:", ExceptionUtils.c(e));
                return;
            }
        }
        LogUtil.j("CalendarSwitchApiImpl", "syncCalendarSwitch() iPhoneServiceAIDL is null");
        lug.e(BaseApplication.getContext());
    }
}
