package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.PluginDeviceAdapter;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginbase.PluginBaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = PluginDeviceApi.class)
public class fne implements PluginDeviceApi {
    @Override // com.huawei.health.device.api.PluginDeviceApi
    public void init(Context context) {
        dmd.b().init(context);
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        dmd.b().setAdapter(pluginBaseAdapter);
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public PluginBaseAdapter getAdapter() {
        return dmd.b().getAdapter();
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public void checkAutoTrackStatus() {
        PluginDeviceAdapter pluginDeviceAdapterE = dmd.b().e();
        if (pluginDeviceAdapterE != null) {
            pluginDeviceAdapterE.checkAutoTrackStatus();
        }
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public List<dru> getThirdDeviceList() {
        ArrayList<ContentValues> arrayListF = dmp.d().f();
        ArrayList arrayList = new ArrayList(16);
        for (ContentValues contentValues : arrayListF) {
            if (contentValues == null) {
                LogUtil.j("PluginDeviceImpl", "getThirdDeviceList contentValue is null ");
            } else {
                String asString = contentValues.getAsString("productId");
                String asString2 = contentValues.getAsString("uniqueId");
                if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                    LogUtil.j("PluginDeviceImpl", "getThirdDeviceList : productId or deviceIdentify is empty");
                } else {
                    elh elhVarD = ResourceManager.c().d(asString);
                    if (elhVarD == null || elhVarD.l() == null || elhVarD.l().b() == null) {
                        LogUtil.j("PluginDeviceImpl", "getThirdDeviceList productInfo is null or manifest is null");
                    } else if (!elhVarD.l().b().trim().isEmpty()) {
                        dru druVarB = ekd.b(elhVarD);
                        druVarB.a(contentValues);
                        druVarB.d(new dsa("deviceUsedTime").b(dxw.d(), contentValues.getAsString("uniqueId")));
                        arrayList.add(druVarB);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public ArrayList<ContentValues> getBondedDevice() {
        return dmp.d().f();
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public ContentValues getDeviceInfoByUniqueId(String str) {
        return dmp.d().j(str);
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public ContentValues getDeviceInfoByDeviceName(String str) {
        return dmp.d().e(str);
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public void connectScaleDevice(String str) {
        dti.d(str);
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public void checkCancelConnectScale(String str) {
        if (qst.d()) {
            dti.a(str);
        }
    }

    @Override // com.huawei.health.device.api.PluginDeviceApi
    public void sendWspData(String str, String str2, String str3, BaseResponseCallback<byte[]> baseResponseCallback) {
        dti.b(str, str2, str3, baseResponseCallback);
    }
}
