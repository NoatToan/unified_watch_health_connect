package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hihealth.HiDataUpdateOption;
import com.huawei.hihealth.HiThirdIdentity;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealthservice.updatemanager.command.UpdateCommand;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ljj implements UpdateCommand {
    @Override // com.huawei.hihealthservice.updatemanager.command.UpdateCommand
    public void execute(HiDataUpdateOption hiDataUpdateOption, IDataOperateListener iDataOperateListener, Context context) throws Throwable {
        if (hiDataUpdateOption == null || context == null) {
            return;
        }
        String string = hiDataUpdateOption.getString(BleConstants.KEY_PATH);
        if (StringUtils.g(string)) {
            LogUtil.e("HiH_ParseKitConfigData", "execute path is null");
            return;
        }
        String strE = e(string);
        LogUtil.a("HiH_ParseKitConfigData", "execute jsonString is =", strE);
        if (StringUtils.j(strE)) {
            try {
                JSONArray jSONArray = new JSONArray(strE);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string2 = jSONObject.getString("package_name");
                        String string3 = jSONObject.getString(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
                        int i2 = jSONObject.getInt("level");
                        HiThirdIdentity hiThirdIdentity = new HiThirdIdentity();
                        hiThirdIdentity.setPackageName(string2);
                        hiThirdIdentity.setFingerprint(string3);
                        hiThirdIdentity.setLevel(i2);
                        kxl.a().c(hiThirdIdentity);
                    }
                }
            } catch (JSONException unused) {
                ReleaseLogUtil.a("HiH_ParseKitConfigData", "ParseKitConfigData.execute: JSONException");
            }
        }
    }

    private String e(String str) throws Throwable {
        FileInputStream fileInputStream;
        String str2 = "";
        FileInputStream fileInputStream2 = null;
        try {
            try {
                String strE = CommonUtil.e(str);
                if (TextUtils.isEmpty(strE)) {
                    return "";
                }
                if (!FileUtils.c(new File(strE), strE)) {
                    LogUtil.j("HiH_ParseKitConfigData", "path_crossing getStringFromFile file is invalid, legalPath ", strE);
                    return "";
                }
                fileInputStream = new FileInputStream(strE);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    str2 = fileInputStream.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        ReleaseLogUtil.a("HiH_ParseKitConfigData", "getStringFromFile close IOException =", e.getMessage());
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    ReleaseLogUtil.a("HiH_ParseKitConfigData", "getStringFromFile IOException = ", e.getMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            ReleaseLogUtil.a("HiH_ParseKitConfigData", "getStringFromFile close IOException =", e3.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            ReleaseLogUtil.a("HiH_ParseKitConfigData", "getStringFromFile close IOException =", e4.getMessage());
                        }
                    }
                    throw th;
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
