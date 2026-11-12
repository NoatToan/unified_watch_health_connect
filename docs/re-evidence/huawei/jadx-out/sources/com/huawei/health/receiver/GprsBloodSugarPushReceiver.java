package com.huawei.health.receiver;

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
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.plugindevice.R;
import defpackage.dmp;
import defpackage.dxw;
import defpackage.elg;
import defpackage.elh;
import defpackage.gsq;
import defpackage.lsb;
import defpackage.njy;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class GprsBloodSugarPushReceiver extends GprsAbstractPushProcess {
    private static final int NOTIFICATION_NOTIFY_ID = 20210113;
    private static final String SERIAL_NUMBER_REGEX = "^[0-9A-Z]{11,}$";
    private static final String TAG = "GprsBloodSugarPushReceiver";

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.health.receiver.GprsAbstractPushProcess
    protected void process(Context context, gsq.e eVar, GprsAbstractPushProcess.ProcessResult processResult) {
        synchronized (eVar.f35992a) {
            Collections.sort(eVar.f35992a);
        }
        getBloodSugarData(context, eVar, processResult);
    }

    private void getBloodSugarData(final Context context, final gsq.e eVar, final GprsAbstractPushProcess.ProcessResult processResult) {
        if (njy.e(eVar.f35992a)) {
            processResult.onResult();
            return;
        }
        int[] iArrE = HiHealthDataType.e(10001);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        Long l = eVar.f35992a.get(0);
        long jLongValue = l.longValue();
        Long l2 = eVar.f35992a.get(eVar.f35992a.size() - 1);
        long jLongValue2 = l2.longValue();
        LogUtil.a(TAG, "getBloodSugarData startTime:", l, "; endTime:", l2);
        hiDataReadOption.setTimeInterval(jLongValue, jLongValue2);
        hiDataReadOption.setType(iArrE);
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.receiver.GprsBloodSugarPushReceiver.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a(GprsBloodSugarPushReceiver.TAG, "getBloodSugarData errorCode:", Integer.valueOf(i));
                if (obj == null) {
                    LogUtil.j(GprsBloodSugarPushReceiver.TAG, "getBloodSugarData data is null");
                    processResult.onResult();
                    return;
                }
                if (obj instanceof SparseArray) {
                    GprsBloodSugarPushReceiver.this.parseBloodSugarData(context, (SparseArray) obj, eVar);
                } else {
                    LogUtil.j(GprsBloodSugarPushReceiver.TAG, "getBloodSugarData data not instanceof SparseArray");
                }
                processResult.onResult();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseBloodSugarData(Context context, SparseArray<?> sparseArray, gsq.e eVar) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j(TAG, "parseBloodSugarData map is null");
            return;
        }
        LogUtil.a(TAG, "parseBloodSugarData map size:", Integer.valueOf(sparseArray.size()));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            Object objValueAt = sparseArray.valueAt(i);
            LogUtil.a(TAG, "parseBloodSugarData map key:", Integer.valueOf(sparseArray.keyAt(i)));
            if (objValueAt instanceof List) {
                List list = (List) objValueAt;
                if (njy.e(list)) {
                    LogUtil.j(TAG, "parseBloodSugarData healthDataList is null");
                } else {
                    arrayList.addAll(list);
                }
            }
        }
        arrayList.removeAll(Collections.singleton(null));
        if (njy.e(arrayList)) {
            return;
        }
        Collections.sort(arrayList, new Comparator<HiHealthData>() { // from class: com.huawei.health.receiver.GprsBloodSugarPushReceiver.2
            @Override // java.util.Comparator
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                return Long.compare(hiHealthData2.getEndTime(), hiHealthData.getEndTime());
            }
        });
        findTargetBloodSugarData(context, arrayList, eVar);
    }

    private void findTargetBloodSugarData(Context context, List<HiHealthData> list, gsq.e eVar) {
        Map<String, String> bondedDeviceUniqueIdMap = getBondedDeviceUniqueIdMap();
        if (bondedDeviceUniqueIdMap.size() == 0) {
            LogUtil.a(TAG, "findTargetBloodSugarData current not bond device");
            return;
        }
        boolean z = true;
        Long l = eVar.f35992a.get(eVar.f35992a.size() - 1);
        long jLongValue = l.longValue();
        String string = null;
        for (HiHealthData hiHealthData : list) {
            if (jLongValue == hiHealthData.getEndTime()) {
                LogUtil.a(TAG, "lastEndTime: ", l);
                string = hiHealthData.getString("device_uniquecode");
                LogUtil.a(TAG, "currentCode: ", CommonUtil.n(string));
            }
            String string2 = hiHealthData.getString("device_uniquecode");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && string2.equals(string) && !isConfirmed(hiHealthData)) {
                z = false;
                break;
            }
        }
        if (z) {
            LogUtil.a(TAG, "AllBloodSugarData confirmed");
            Intent intent = new Intent();
            intent.setData(Uri.parse("huaweischeme://healthapp/basicHealth?healthType=8"));
            sendGprsBloodSugarNotification(intent);
            return;
        }
        if (bondedDeviceUniqueIdMap.containsKey(string)) {
            String str = bondedDeviceUniqueIdMap.get(string);
            if (TextUtils.isEmpty(str)) {
                LogUtil.a(TAG, "findTargetBloodSugarData productId is null");
                return;
            } else {
                processingDataIntent(context, str, string);
                return;
            }
        }
        LogUtil.a(TAG, "The uniqueId does not match.");
    }

    private boolean isConfirmed(HiHealthData hiHealthData) {
        HiBloodSugarMetaData hiBloodSugarMetaData;
        if (hiHealthData == null || TextUtils.isEmpty(hiHealthData.getMetaData()) || (hiBloodSugarMetaData = (HiBloodSugarMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodSugarMetaData.class)) == null) {
            return false;
        }
        return hiBloodSugarMetaData.getConfirmed();
    }

    private void processingDataIntent(Context context, String str, String str2) {
        Intent intent;
        String str3;
        LogUtil.a(TAG, "sendGprsBloodSugarNotification productId:", str);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            return;
        }
        LogUtil.a(TAG, "sendGprsBloodSugarNotification H5_TYPE:", elhVarD.g());
        if ("1".equals(elhVarD.g())) {
            if (BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVarD.n().b())) {
                LogUtil.a(TAG, "Go to H5 Pending Confirmation Page");
                str3 = "huaweihealth://huaweihealth.app/openwith?from=thirdDevice&productId=" + str + "&sn=" + str2;
            } else {
                LogUtil.a(TAG, "The page for confirming the app is displayed.");
                str3 = "huaweihealth://huaweihealth.app/openwith?from=thirdDeviceToApp&productId=" + str + "&sn=" + str2;
            }
            intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3));
        } else {
            Intent intent2 = new Intent();
            intent2.setClassName(context.getPackageName(), "com.huawei.operation.activity.WebViewActivity");
            intent2.setFlags(268435456);
            intent2.putExtra("url", elg.e().e(str) + "#/type=3/sn=" + str2);
            intent2.putExtra("productId", str);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", str2);
            contentValues.put("productId", str);
            intent2.putExtra("commonDeviceInfo", contentValues);
            intent = intent2;
        }
        sendGprsBloodSugarNotification(intent);
    }

    private void sendGprsBloodSugarNotification(Intent intent) {
        if (!CommonUtil.bg() && !NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            LogUtil.j(TAG, "sendGprsBloodSugarNotification permission is not enabled.");
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(dxw.d(), 0, intent, 67108864);
        Resources resources = dxw.d().getResources();
        String string = resources.getString(R.string.IDS_device_recive_blood_sugar_content_two);
        Notification notificationBuild = lsb.d().c().setSmallIcon(com.huawei.ui.commonui.R.drawable.healthlogo_ic_notification).setContentTitle(resources.getString(R.string.IDS_device_recive_blood_sugar_title)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).setContentIntent(activity).setAutoCancel(true).build();
        notificationBuild.flags |= 16;
        lsb.d().c(NOTIFICATION_NOTIFY_ID, notificationBuild);
    }

    private Map<String, String> getBondedDeviceUniqueIdMap() {
        HashMap map = new HashMap(16);
        ArrayList<ContentValues> arrayListF = dmp.d().f();
        if (!njy.e(arrayListF)) {
            for (ContentValues contentValues : arrayListF) {
                if (contentValues != null) {
                    String asString = contentValues.getAsString("productId");
                    String asString2 = contentValues.getAsString("uniqueId");
                    if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                        LogUtil.j(TAG, "getBondedDeviceUniqueIdMap productId or deviceIdentify is empty");
                    } else {
                        map.put(asString2, asString);
                    }
                }
            }
        }
        return map;
    }
}
