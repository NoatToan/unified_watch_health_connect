package com.huawei.hihealth.dictionary.config;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.common.util.Utils;
import com.huawei.hihealth.dictionary.model.HiHealthDictionary;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public class CloudConfigLoader implements ConfigureLoader {
    @Override // com.huawei.hihealth.dictionary.config.ConfigureLoader
    public String getName() {
        return "cloud_json_config";
    }

    @Override // com.huawei.hihealth.dictionary.config.ConfigureLoader
    public HiHealthDictionary loadConfig(Context context) throws Throwable {
        if (context == null) {
            LogUtil.c("HiH_CloudConfigLoader", "cloud loadConfig context null");
            return null;
        }
        String strA = a(context.getFilesDir() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + "com.huawei.health_common_config" + File.separator + "dict_config.txt");
        if (TextUtils.isEmpty(strA)) {
            LogUtil.c("HiH_CloudConfigLoader", "read cloud json config failed.");
            return null;
        }
        try {
            return (HiHealthDictionary) new Gson().fromJson(JsonSanitizer.sanitize(strA), HiHealthDictionary.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.c("HiH_CloudConfigLoader", "parse json config failed for error format.");
            return null;
        } catch (Exception unused2) {
            LogUtil.c("HiH_CloudConfigLoader", "parse json config failed for unknown error.");
            return null;
        }
    }

    private String a(String str) throws Throwable {
        FileInputStream fileInputStream;
        String str2 = "";
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    str2 = fileInputStream.read(bArr) > 0 ? new String(bArr, StandardCharsets.UTF_8) : "";
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        LogUtil.d("HiH_CloudConfigLoader", "getStringFile e is ", e.getMessage());
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    LogUtil.d("HiH_CloudConfigLoader", "getStringFile e is ", e.getMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            LogUtil.d("HiH_CloudConfigLoader", "getStringFile e is ", e3.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            LogUtil.d("HiH_CloudConfigLoader", "getStringFile e is ", e4.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }
}
