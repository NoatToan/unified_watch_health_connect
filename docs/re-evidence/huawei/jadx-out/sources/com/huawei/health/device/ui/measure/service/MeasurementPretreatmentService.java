package com.huawei.health.device.ui.measure.service;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.service.MeasurementPretreatmentService;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iov;
import defpackage.iun;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MeasurementPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        if (CollectionUtils.a(c())) {
            iun.d(BaseApplication.b(), (ResponseCallback<Integer>) new ResponseCallback() { // from class: dwi
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ReleaseLogUtil.c("R_measurementPretreatmentService", "showBindDeviceDialog resultCode ", Integer.valueOf(i), " state ", (Integer) obj);
                }
            });
            return false;
        }
        iun.b(BaseApplication.b(), (ResponseCallback<Integer>) new ResponseCallback() { // from class: dwh
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                MeasurementPretreatmentService.b(i, (Integer) obj);
            }
        });
        return false;
    }

    public static /* synthetic */ void b(int i, Integer num) {
        if (num.intValue() == 2) {
            return;
        }
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) DeviceMainActivity.class);
        intent.putExtra("view", "MeasureDevice");
        intent.putExtra("kind", "HDK_WEIGHT");
        intent.putExtra("from", 1);
        iov.d(BaseApplication.b(), intent);
    }

    private List<Map<String, Object>> c() {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.d("PluginDevice", HealthDeviceEntryApi.class);
        String string = HealthDevice.HealthDeviceKind.HDK_WEIGHT.toString();
        ArrayList arrayList = new ArrayList();
        if (healthDeviceEntryApi == null || TextUtils.isEmpty(string)) {
            ReleaseLogUtil.d("R_measurementPretreatmentService", "getBondedDeviceList api is null kindName ", string);
            return arrayList;
        }
        HealthDevice.HealthDeviceKind healthDeviceKind = null;
        for (HealthDevice.HealthDeviceKind healthDeviceKind2 : HealthDevice.HealthDeviceKind.values()) {
            if (healthDeviceKind2 != null && string.equals(healthDeviceKind2.name())) {
                healthDeviceKind = healthDeviceKind2;
            }
        }
        ArrayList<ContentValues> bondedDeviceByDeviceKind = healthDeviceEntryApi.getBondedDeviceByDeviceKind(healthDeviceKind);
        LogUtil.a("MeasurementPretreatmentService", "getBondedDeviceList deviceList ", bondedDeviceByDeviceKind, " kindName ", string);
        if (CollectionUtils.a(bondedDeviceByDeviceKind)) {
            return arrayList;
        }
        for (ContentValues contentValues : bondedDeviceByDeviceKind) {
            if (contentValues != null) {
                HashMap map = new HashMap(6);
                map.put("displayName", contentValues.getAsString("displayName"));
                map.put("name", contentValues.getAsString("name"));
                map.put(Wpt.MODE, contentValues.getAsString(Wpt.MODE));
                map.put("kind", contentValues.getAsString("kind"));
                map.put("productId", contentValues.getAsString("productId"));
                map.put(TtmlNode.TEXT_EMPHASIS_AUTO, contentValues.getAsString(TtmlNode.TEXT_EMPHASIS_AUTO));
                arrayList.add(map);
            }
        }
        LogUtil.a("MeasurementPretreatmentService", "getBondedDeviceList list ", arrayList);
        return arrayList;
    }
}
