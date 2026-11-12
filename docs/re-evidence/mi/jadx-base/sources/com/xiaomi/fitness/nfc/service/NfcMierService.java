package com.xiaomi.fitness.nfc.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.jg1;
import defpackage.vqg;
import defpackage.y0d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class NfcMierService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f12539b = {"1da20e2bdfa678ae888e81e5ca0ec4744ebbbbbd", "9536a27920275dccf379f5b572912b365cf1a912", "7ab61ac19d68a73a59a7ea951a5bc7717cdf693b", "803b62c8f28e35abf9fc7dcab1343f71e843bcb1"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f12540a = new a();

    public class a extends y0d.a {
        @Override // defpackage.y0d
        public String j() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            vqg.b("NfcMierService  getWearDid");
            if (!NfcMierService.this.d()) {
                return NfcMierService.this.c(-100, "no permission", jSONObject, jSONArray);
            }
            try {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                List<T> deviceModels = deviceManagerExtKt.getDeviceModels();
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getCurrentDeviceModel();
                if (wearableDeviceModel != null) {
                    boolean zIsSupportNfc = NfcUtils.isSupportNfc(wearableDeviceModel);
                    if (zIsSupportNfc) {
                        vqg.d("NfcMierService currentDeviceMode did:" + wearableDeviceModel.getDid() + " isSupportNFC:" + zIsSupportNfc);
                        jSONObject.put("did", wearableDeviceModel.getDid());
                    } else {
                        vqg.d("NfcMierService currentDeviceMode   did:" + wearableDeviceModel.getDid() + " isSupportNFC:" + zIsSupportNfc);
                    }
                } else {
                    vqg.d("NfcMierService currentDeviceMode is null");
                }
                vqg.d("NfcMierService size:" + deviceModels.size());
                for (T t : deviceModels) {
                    if (!DeviceModelExtKt.isLibai(t) && NfcUtils.isSupportNfc(t)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", t.getDid());
                        jSONObject2.put("model", t.getAlias());
                        jSONObject2.put("type", DeviceModelExtKt.isBandType(t) ? 1 : 2);
                        jSONObject2.put("name", DeviceModelExtKt.getName(t));
                        jSONArray.put(jSONObject2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                vqg.c("NfcMierService", e);
            }
            return NfcMierService.this.c(0, "success", jSONObject, jSONArray);
        }

        public a() {
        }
    }

    public final String c(int i, String str, JSONObject jSONObject, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("resultCode", i);
            jSONObject2.put("resultMsg", str);
            jSONObject2.put("data", jSONObject.toString());
            jSONObject2.put("list", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject2.toString();
        vqg.d("result = " + string);
        return string;
    }

    public final boolean d() {
        String strC = jg1.c(this, getPackageManager().getNameForUid(Binder.getCallingUid()), "SHA1");
        vqg.a("sign = " + strC);
        String[] strArr = f12539b;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equalsIgnoreCase(strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f12540a;
    }
}
