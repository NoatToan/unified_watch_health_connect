package defpackage;

import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tpl {
    public static void b() {
        boolean zI = top.i();
        LogUtil.b("CalendarSettingUtil", "setCalendarSwitch supportHealthCalendarSync:", Boolean.valueOf(zI));
        if (zI) {
            d(new IBaseResponseCallback() { // from class: tpl.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    boolean zE = qqe.e(BaseApplication.getContext());
                    LogUtil.b("CalendarSettingUtil", "getCalendarSampleConfig hasCalendarPermission : ", Boolean.valueOf(zE), "errorCode:", Integer.valueOf(i), "objData:", obj);
                    if (zE && i == 0 && (obj instanceof String)) {
                        zE = "1".equals(obj);
                    }
                    tpl.d(zE, new IBaseResponseCallback() { // from class: tpl.4.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj2) {
                            LogUtil.b("CalendarSettingUtil", "setSyncCalendarSampleConfig errorCode:", Integer.valueOf(i2), "objData:", obj2);
                        }
                    });
                }
            });
        }
    }

    public static final void d(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900100019");
        qhq.b("9001", arrayList, new HiDataReadResultListener() { // from class: tpl.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.c("R_CalendarSettingUtil", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!njy.e(list) && njy.b(obj, HiSampleConfig.class)) {
                        HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                        int size = list.size();
                        LogUtil.b("CalendarSettingUtil", "calendar switch num : ", Integer.valueOf(size), ", config : ", hiSampleConfig.getConfigData(), ", modifyTime : ", Long.valueOf(hiSampleConfig.getModifiedTime()));
                        iBaseResponseCallback.a(0, ffv.a(hiSampleConfig.getConfigData(), "calendarToDeviceSwitch"));
                        return;
                    }
                }
                iBaseResponseCallback.a(-1, null);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                ReleaseLogUtil.c("R_CalendarSettingUtil", "onResultIntent errorCode: ", Integer.valueOf(i2), ", data: ", obj);
            }
        });
    }

    public static final void d(final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        qhq.d("9001", "900100019", ffv.e("calendarToDeviceSwitch", z ? "1" : "0"), new HiDataOperateListener() { // from class: tpl.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.c("R_CalendarSettingUtil", "saveSampleConfig errorCode: ", Integer.valueOf(i), ", object: ", obj);
                if (1 != i) {
                    if (z) {
                        LogUtil.b("CalendarSettingUtil", "isSupportCalendarPermission true.");
                        qec.b().syncCalendarSwitch(1);
                    } else {
                        LogUtil.b("CalendarSettingUtil", "isSupportCalendarPermission false.");
                        qec.b().syncCalendarSwitch(7);
                    }
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(0, null);
                        return;
                    }
                    return;
                }
                IBaseResponseCallback iBaseResponseCallback3 = iBaseResponseCallback;
                if (iBaseResponseCallback3 != null) {
                    iBaseResponseCallback3.a(-1, null);
                }
            }
        }, System.currentTimeMillis());
    }
}
