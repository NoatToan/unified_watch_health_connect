package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthkit.context.OutOfBandData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.HeartDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearkit.IRealTimeCallback;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lee {
    private static List<Integer> e;

    static {
        ArrayList arrayList = new ArrayList(10);
        e = arrayList;
        arrayList.add(10006);
        e.add(10002);
        e.add(10001);
        e.add(22101);
        e.add(22102);
        e.add(22103);
        e.add(22104);
        e.add(22105);
        e.add(2002);
    }

    public static int a(String str, int i) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            ReleaseLogUtil.e("HiH_CommonUtil", "invalid method name format");
            return 4;
        }
        try {
            Object objInvoke = Class.forName(str.substring(0, iLastIndexOf)).getMethod(str.substring(iLastIndexOf + 1), Integer.TYPE).invoke(null, Integer.valueOf(i));
            if (!(objInvoke instanceof Integer)) {
                ReleaseLogUtil.e("HiH_CommonUtil", "invalid return type");
                return 4;
            }
            return ((Integer) objInvoke).intValue();
        } catch (ClassNotFoundException e2) {
            e = e2;
            ReleaseLogUtil.a("HiH_CommonUtil", "class or method not found", LogAnonymous.b(e));
            return 4;
        } catch (IllegalAccessException e3) {
            e = e3;
            ReleaseLogUtil.a(CommonUtil.TAG, "invoke Exception", LogAnonymous.b(e));
            return 4;
        } catch (IllegalArgumentException e4) {
            e = e4;
            ReleaseLogUtil.a(CommonUtil.TAG, "invoke Exception", LogAnonymous.b(e));
            return 4;
        } catch (NoSuchMethodException e5) {
            e = e5;
            ReleaseLogUtil.a("HiH_CommonUtil", "class or method not found", LogAnonymous.b(e));
            return 4;
        } catch (InvocationTargetException e6) {
            e = e6;
            ReleaseLogUtil.a(CommonUtil.TAG, "invoke Exception", LogAnonymous.b(e));
            return 4;
        }
    }

    public static boolean c(List<HiHealthKitData> list, String str) {
        Iterator<HiHealthKitData> it = list.iterator();
        while (it.hasNext()) {
            if (e.contains(Integer.valueOf(it.next().getType())) && !str.startsWith("com.huawei.health.device") && !str.equals("com.huawei.ohos.health.device")) {
                return e(str);
            }
        }
        return false;
    }

    private static boolean e(String str) {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("privacy_data_source_third_party_app_flag_file", 0);
        if (sharedPreferences == null) {
            return false;
        }
        String string = sharedPreferences.getString("privacy_data_source_third_party_app_flag_context", "");
        LogUtil.a(CommonUtil.TAG, "packageNameMapJsonOld", string);
        Map<String, String> mapB = peh.b(string);
        mapB.put(str, str);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strC = peh.c(mapB);
        editorEdit.putString("privacy_data_source_third_party_app_flag_context", strC);
        LogUtil.a(CommonUtil.TAG, "packageNameMapJsonNew", strC);
        return editorEdit.commit();
    }

    public static void e(Context context, OutOfBandData outOfBandData, String str, String str2) {
        int appId;
        if (outOfBandData instanceof H5ProAppInfo) {
            H5ProAppInfo h5ProAppInfo = (H5ProAppInfo) outOfBandData;
            if ("com.huawei.health".equals(str2)) {
                return;
            }
            if (!"execQuery".equals(str) || "com.huawei.health.ecg.collection".equals(str2)) {
                HiAppInfo hiAppInfoD = kwi.b().d(str2);
                if (hiAppInfoD == null) {
                    LogUtil.a(CommonUtil.TAG, "construct new app info");
                    HiAppInfo hiAppInfo = new HiAppInfo();
                    hiAppInfo.setPackageName(str2);
                    hiAppInfo.setSignature(h5ProAppInfo.getCertPrint());
                    hiAppInfo.setAppName(h5ProAppInfo.getAppName());
                    kwi.b().d(hiAppInfo, 0);
                    appId = kwi.b().d(hiAppInfo.getPackageName()).getAppId();
                } else {
                    if (hiAppInfoD.getAppName() == null || !hiAppInfoD.getAppName().equals(h5ProAppInfo.getAppName())) {
                        LogUtil.a(CommonUtil.TAG, "update app info");
                        hiAppInfoD.setAppName(h5ProAppInfo.getAppName());
                        hiAppInfoD.setSignature(h5ProAppInfo.getCertPrint());
                        kwi.b().d(hiAppInfoD);
                    }
                    appId = hiAppInfoD.getAppId();
                }
                a(context, appId);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    public static void a(Context context, String str) throws Throwable {
        boolean zB;
        int appId;
        if (!"com.huawei.ohos.health.device".equals(str)) {
            return;
        }
        try {
            zB = !ljq.h(BaseApplication.getContext(), 0) ? ljq.b(BaseApplication.getContext(), 0) : false;
            try {
                try {
                    HiAppInfo hiAppInfoD = kwi.b().d(str);
                    if (hiAppInfoD == null) {
                        LogUtil.a(CommonUtil.TAG, "construct new app info");
                        HiAppInfo hiAppInfoA = ljp.a(context, str);
                        kwi.b().d(hiAppInfoA, 0);
                        appId = kwi.b().d(hiAppInfoA.getPackageName()).getAppId();
                    } else {
                        appId = hiAppInfoD.getAppId();
                    }
                    if (zB) {
                        ljq.g(BaseApplication.getContext(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    a(context, appId);
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.a(CommonUtil.TAG, "updateAppAndSyncInfo exception: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.getContext(), 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(BaseApplication.getContext(), 0);
            }
            throw th;
        }
    }

    private static void a(Context context, int i) {
        HiHealthNativeApi.a(context).updateHealthKitPermission(i, 101000, 1, true, new HiDataOperateListener() { // from class: lej
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                lee.d(i2, obj);
            }
        });
    }

    static /* synthetic */ void d(int i, Object obj) {
        if (i == 0) {
            ReleaseLogUtil.d("HiH_CommonUtil", "save sync flag success");
        } else {
            ReleaseLogUtil.d("HiH_CommonUtil", "save sync flag fail, errCode: ", Integer.valueOf(i));
        }
    }

    public static boolean a(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public static void b(Context context, String str, IRealTimeCallback iRealTimeCallback) throws RemoteException {
        ArrayList arrayList = new ArrayList(10);
        List list = (List) HiJsonUtil.d(str, new TypeToken<List<HeartDeviceInfo>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.CommonUtil$1
        }.getType());
        if (list != null && list.size() > 0) {
            arrayList.addAll(list);
            ReleaseLogUtil.d("HiH_CommonUtil", " get wear device list size: ", Integer.valueOf(list.size()));
        }
        List<HeartDeviceInfo> listC = ljm.c(context);
        if (listC.size() > 0) {
            arrayList.addAll(listC);
            ReleaseLogUtil.d("HiH_CommonUtil", " get health device list size: ", Integer.valueOf(listC.size()));
        }
        iRealTimeCallback.onChange(0, HiJsonUtil.d(arrayList));
    }
}
