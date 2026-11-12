package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.receiver.GprsAbstractPushProcess;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class gsv extends GprsAbstractPushProcess {
    @Override // com.huawei.health.receiver.GprsAbstractPushProcess
    public void process(Context context, gsq.e eVar, GprsAbstractPushProcess.ProcessResult processResult) {
        synchronized (eVar.f35992a) {
            Collections.sort(eVar.f35992a);
        }
        a(context, eVar, processResult);
    }

    private void a(final Context context, final gsq.e eVar, final GprsAbstractPushProcess.ProcessResult processResult) {
        if (njy.e(eVar.f35992a)) {
            processResult.onResult();
            return;
        }
        int[] iArr = {DicDataTypeUtil.DataType.VENTILATOR_RECORD_TYPE.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(eVar.f35992a.get(0).longValue());
        hiDataReadOption.setEndTime(eVar.f35992a.get(eVar.f35992a.size() - 1).longValue());
        hiDataReadOption.setType(iArr);
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: gsv.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("GprsVentilatorPushReceiver", "getVentilatorData errorCode:", Integer.valueOf(i));
                if (i != 0) {
                    LogUtil.j("GprsVentilatorPushReceiver", "getVentilatorData data is error");
                    processResult.onResult();
                } else {
                    if (obj == null) {
                        LogUtil.j("GprsVentilatorPushReceiver", "getVentilatorData data is null");
                        processResult.onResult();
                        return;
                    }
                    if (obj instanceof SparseArray) {
                        gsv.this.c(context, (SparseArray) obj, eVar);
                    } else {
                        LogUtil.j("GprsVentilatorPushReceiver", "getVentilatorData data not instanceof SparseArray");
                    }
                    processResult.onResult();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, SparseArray<?> sparseArray, gsq.e eVar) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("GprsVentilatorPushReceiver", "parseVentilatorData map is null");
            return;
        }
        LogUtil.a("GprsVentilatorPushReceiver", "parseVentilatorData map size:", Integer.valueOf(sparseArray.size()));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            Object objValueAt = sparseArray.valueAt(i);
            LogUtil.a("GprsVentilatorPushReceiver", "parseVentilatorData map key:", Integer.valueOf(sparseArray.keyAt(i)));
            if (objValueAt instanceof List) {
                List list = (List) objValueAt;
                if (njy.e(list)) {
                    LogUtil.j("GprsVentilatorPushReceiver", "parseVentilatorData healthDataList is null");
                } else {
                    arrayList.addAll(list);
                }
            }
        }
        arrayList.removeAll(Collections.singleton(null));
        if (njy.e(arrayList)) {
            return;
        }
        Collections.sort(arrayList, new Comparator<HiHealthData>() { // from class: gsv.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                return Long.compare(hiHealthData2.getEndTime(), hiHealthData.getEndTime());
            }
        });
        d(context, arrayList, eVar);
    }

    private void d(Context context, List<HiHealthData> list, gsq.e eVar) {
        Map<String, String> mapD = d();
        if (mapD.size() == 0) {
            LogUtil.a("GprsVentilatorPushReceiver", "findTargetVentilatorData current not bond device");
            return;
        }
        Long l = eVar.f35992a.get(eVar.f35992a.size() - 1);
        long jLongValue = l.longValue();
        String string = null;
        for (HiHealthData hiHealthData : list) {
            if (jLongValue == hiHealthData.getEndTime()) {
                LogUtil.a("GprsVentilatorPushReceiver", "lastEndTime: ", l);
                string = hiHealthData.getString("device_uniquecode");
                LogUtil.a("GprsVentilatorPushReceiver", "currentCode: ", CommonUtil.n(string));
            }
            String string2 = hiHealthData.getString("device_uniquecode");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && string2.equals(string)) {
                break;
            }
        }
        if (mapD.containsKey(string)) {
            String str = mapD.get(string);
            if (TextUtils.isEmpty(str)) {
                LogUtil.a("GprsVentilatorPushReceiver", "findTargetBloodSugarData productId is null");
                return;
            } else {
                d(context, str, string);
                return;
            }
        }
        LogUtil.a("GprsVentilatorPushReceiver", "The uniqueId does not match.");
    }

    private void d(Context context, String str, String str2) {
        LogUtil.a("GprsVentilatorPushReceiver", "sendGprsVentilatorNotification productId:", str);
        if (ResourceManager.c().d(str) == null) {
            return;
        }
        LogUtil.a("GprsVentilatorPushReceiver", "Go to H5  Page");
        d(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?from=thirdDevice&productId=" + str + "&sn=" + str2)));
    }

    private void d(Intent intent) {
        if (!CommonUtil.bg() && !NotificationManagerCompat.from(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).areNotificationsEnabled()) {
            LogUtil.j("GprsVentilatorPushReceiver", "sendGprsVentilatorNotification permission is not enabled.");
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(dxw.d(), 0, intent, 67108864);
        Resources resources = dxw.d().getResources();
        String string = resources.getString(R.string.IDS_device_recive_Ventilator_content_two);
        Notification notificationBuild = lsb.d().c().setSmallIcon(com.huawei.ui.commonui.R.drawable.healthlogo_ic_notification).setContentTitle(resources.getString(R.string.IDS_device_recive_Ventilator_title)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).setContentIntent(activity).setAutoCancel(true).build();
        notificationBuild.flags |= 16;
        lsb.d().c(20220830, notificationBuild);
    }

    private Map<String, String> d() {
        HashMap map = new HashMap(16);
        ArrayList<ContentValues> arrayListF = dmp.d().f();
        if (!njy.e(arrayListF)) {
            for (ContentValues contentValues : arrayListF) {
                if (contentValues != null) {
                    String asString = contentValues.getAsString("productId");
                    String asString2 = contentValues.getAsString("uniqueId");
                    if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                        LogUtil.j("GprsVentilatorPushReceiver", "getBondedDeviceUniqueIdMap productId or deviceIdentify is empty");
                    } else {
                        map.put(asString2, asString);
                    }
                }
            }
        }
        return map;
    }
}
