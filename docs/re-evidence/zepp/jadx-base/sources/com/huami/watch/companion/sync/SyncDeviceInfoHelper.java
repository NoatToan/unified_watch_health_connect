package com.huami.watch.companion.sync;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SyncDeviceInfoHelper extends BaseSyncHelper {
    private static final String f = "SyncHelper-DeviceInfo";
    private String e;

    public static SyncDeviceInfoHelper getHelper(Context context) {
        SyncDeviceInfoHelper syncDeviceInfoHelper = (SyncDeviceInfoHelper) BaseSyncHelper.getHelper(context, Transporter.get(context, "com.huami.watch.companion"), SyncDeviceInfoHelper.class);
        syncDeviceInfoHelper.e = null;
        return syncDeviceInfoHelper;
    }

    public SyncDeviceInfoHelper address(String str) {
        this.e = str;
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onDataReceived(String str, DataBundle dataBundle) {
        SyncDeviceInfoHelper syncDeviceInfoHelper;
        if (CompanionModule.ACTION_SYNC_DEVICE_INFO.equals(str)) {
            if (dataBundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(dataBundle.getString(CompanionModule.KEY_DEVICE_INFO));
                    String string = jSONObject.getString("AndroidDID");
                    String strOptString = jSONObject.optString("CPUID", null);
                    String strOptString2 = jSONObject.optString("LANGUAGE");
                    String strOptString3 = jSONObject.optString("REGION");
                    String strOptString4 = jSONObject.optString("BUILDTYPE");
                    String strOptString5 = jSONObject.optString("SN", "");
                    String strOptString6 = jSONObject.optString("CPLC", "");
                    int iOptInt = jSONObject.optInt("BindingState, 0");
                    boolean zOptBoolean = jSONObject.optBoolean("IS_BOUND", true);
                    boolean zOptBoolean2 = jSONObject.optBoolean("IS_OVERSEA_EDITION", Config.isLocaleOversea(this.mContext));
                    String strOptString7 = jSONObject.optString(ExifInterface.TAG_MODEL);
                    int iOptInt2 = jSONObject.optInt("BuildNum", 0);
                    try {
                        boolean zOptBoolean3 = jSONObject.optBoolean("IsExperienceMode", false);
                        Log.d(f, "AndroidDID : " + string + ", CPUID : " + strOptString + ", Language : " + strOptString2 + ", Region : " + strOptString3 + ", BuildType : " + strOptString4 + ", SN : " + strOptString5 + ", BindingState : " + iOptInt + ", IsBound : " + zOptBoolean + ", IsOverseaEdition : " + zOptBoolean2 + ", HuamiModel : " + strOptString7 + ", HuamiBuildNum : " + iOptInt2 + ", IsExperienceMode : " + zOptBoolean3 + ", CPLC : " + strOptString6, new Object[0]);
                        syncDeviceInfoHelper = this;
                        try {
                            DeviceManager manager = DeviceManager.getManager(syncDeviceInfoHelper.mContext);
                            String str2 = syncDeviceInfoHelper.e;
                            Device currentDevice = str2 == null ? manager.getCurrentDevice() : manager.find(str2);
                            if (currentDevice == null) {
                                Log.w(f, "Device is null : " + syncDeviceInfoHelper.e, new Object[0]);
                                return;
                            }
                            currentDevice.setCpuId(strOptString);
                            currentDevice.setSN(strOptString5);
                            currentDevice.setBindingState(iOptInt);
                            currentDevice.setBound(zOptBoolean);
                            currentDevice.setOverseaEdition(zOptBoolean2);
                            currentDevice.setCplc(strOptString6);
                            currentDevice.info().setHuamiModel(strOptString7);
                            currentDevice.info().setHuamiBuildNum(iOptInt2);
                            currentDevice.info().setExperienceMode(zOptBoolean3);
                            currentDevice.info().setAndroidDId(string);
                            currentDevice.info().setLocalLanguage(strOptString2);
                            currentDevice.info().setLocalRegion(strOptString3);
                            currentDevice.info().setBuildType(strOptString4);
                            manager.save(currentDevice);
                            syncDeviceInfoHelper.b = true;
                        } catch (JSONException e) {
                            e = e;
                            e.printStackTrace();
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        syncDeviceInfoHelper = this;
                    }
                } catch (JSONException e3) {
                    e = e3;
                    syncDeviceInfoHelper = this;
                }
            } else {
                syncDeviceInfoHelper = this;
            }
            syncDeviceInfoHelper.a = false;
        }
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        DeviceManager manager = DeviceManager.getManager(this.mContext);
        String str = this.e;
        Device currentDevice = str == null ? manager.getCurrentDevice() : manager.find(str);
        if (currentDevice == null) {
            Log.w(f, "Device is Null : " + this.e + ", Abort!!", new Object[0]);
            return false;
        }
        Log.d(f, "SyncDeviceInfo : " + currentDevice, new Object[0]);
        SyncUtil.waitDeviceChannelAvailable(this.mContext, currentDevice);
        if (currentDevice.isConnected()) {
            this.mTransporter.send(CompanionModule.ACTION_REQUEST_DEVICE_INFO);
            return doSync(100, 5);
        }
        Log.i(f, "There is NO connected device!!", new Object[0]);
        return false;
    }
}
