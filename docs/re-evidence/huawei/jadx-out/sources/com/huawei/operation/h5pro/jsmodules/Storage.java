package com.huawei.operation.h5pro.jsmodules;

import android.webkit.JavascriptInterface;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.R;
import defpackage.qpx;
import defpackage.qrt;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class Storage extends JsBaseModule {
    private static final int MAX_FILE_TRANSFORM_SIZE = 83886080;

    @JavascriptInterface
    public void getFileByGrantId(long j, String str) throws Throwable {
        LogUtil.a(this.TAG, "Enter getFileByGrantId, param: ", str);
        try {
            String string = new JSONObject(str).getString("grantId");
            if (string.endsWith(".kmz")) {
                string = qrt.a(string, NavigationFileParser.KML);
            }
            try {
                File file = new File(string);
                String name = file.getName();
                if (file.exists()) {
                    long jI = FileUtils.i(file);
                    if (jI >= 83886080) {
                        LogUtil.e(this.TAG, "file size : ", Double.valueOf(jI / 1048576.0d), " MB", " is too large");
                        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                        onSuccessCallback(j, false);
                        return;
                    }
                }
                String str2 = new String(Files.readAllBytes(Paths.get(string, new String[0])));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ContentResource.FILE_NAME, name);
                    jSONObject.put("data", str2);
                    onSuccessCallback(j, jSONObject);
                } catch (JSONException e) {
                    LogUtil.e(this.TAG, "getFileByGrantId JSONException: ", e.getMessage());
                    onSuccessCallback(j, false);
                }
            } catch (RuntimeException e2) {
                LogUtil.e(this.TAG, "RuntimeException | IOException | XmlPullParserException = ", e2.getMessage());
                qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                onSuccessCallback(j, false);
            }
        } catch (JSONException e3) {
            LogUtil.e(this.TAG, "getFileByGrantId fail with JSONException", ExceptionUtils.c(e3));
            onSuccessCallback(j, false);
        }
    }
}
