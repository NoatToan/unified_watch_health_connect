package defpackage;

import android.content.Context;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.MultiLanguageRes;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ouh implements AchieveObserver, HttpResCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ouh f44794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44796c;
    private otl d;
    private String e;
    private String j;

    private ouh(Context context) {
        this.f44796c = context;
    }

    public static ouh b(Context context) {
        if (f44794a == null) {
            synchronized (ouh.class) {
                if (f44794a == null) {
                    f44794a = new ouh(context);
                }
            }
        }
        return f44794a;
    }

    public boolean e() {
        return this.d != null;
    }

    public void b(otl otlVar) {
        if (otlVar != null) {
            this.d = otlVar;
            this.j = String.format(Locale.ENGLISH, "/data/data/%s/language_res/", this.f44796c.getPackageName());
            this.d.c(this);
        }
    }

    public void c() {
        String language = this.f44796c.getResources().getConfiguration().locale.getLanguage();
        String country = this.f44796c.getResources().getConfiguration().locale.getCountry();
        StringBuffer stringBuffer = new StringBuffer(8);
        stringBuffer.append(language).append("_").append(country);
        this.e = stringBuffer.toString();
        String strE = osa.e(this.f44796c, "last_language");
        this.f44795b = strE;
        LogUtil.a("PLGACHIEVE_LanguageRes", "downLoadRes->mCurrentLanguage:", this.e, " mLastLanguage:", strE);
        HashMap map = new HashMap(1);
        String strC = "0";
        if (MLAsrConstants.LAN_ZH.equals(language)) {
            if (!this.f44795b.startsWith(MLAsrConstants.LAN_ZH)) {
                map.put("last_language", this.e);
                osa.b(this.f44796c, map);
                if (!this.f44795b.startsWith("en")) {
                    e("languagesRes_extra.xml");
                }
            }
            strC = osa.c(this.f44796c, "zh_version", "0");
        } else if ("en".equals(language)) {
            if (!this.f44795b.startsWith("en")) {
                map.put("last_language", this.e);
                osa.b(this.f44796c, map);
                if (!this.f44795b.startsWith(MLAsrConstants.LAN_ZH)) {
                    e("languagesRes_extra.xml");
                }
            }
            strC = osa.c(this.f44796c, "en_version", "0");
        } else if (!this.f44795b.startsWith(language)) {
            map.put("last_language", this.e);
            osa.b(this.f44796c, map);
        } else {
            strC = osa.c(this.f44796c, "extra_version", "0");
        }
        LogUtil.a("PLGACHIEVE_LanguageRes", "downLoadRes->version:", strC);
    }

    private void e(String str) {
        String str2 = this.j + str;
        LogUtil.a("PLGACHIEVE_LanguageRes", "deleteFile->filePath:", str2);
        File file = new File(str2);
        if (file.exists()) {
            LogUtil.a("PLGACHIEVE_LanguageRes", "deleteFile->isDelete:", Boolean.valueOf(file.delete()));
        }
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        String str;
        if (userAchieveWrapper == null) {
            str = Constants.NULL;
        } else {
            str = " ContentType:" + userAchieveWrapper.getContentType();
        }
        LogUtil.a("PLGACHIEVE_LanguageRes", "onDataChanged error:", Integer.valueOf(i), "  userAchieveWrapper:", str);
        if (i == 200 && userAchieveWrapper != null && userAchieveWrapper.getContentType() == 6) {
            String resultCode = userAchieveWrapper.getResultCode();
            LogUtil.a("PLGACHIEVE_LanguageRes", "onDataChanged resultCode:", resultCode);
            if ("0".equals(resultCode)) {
                e(userAchieveWrapper.getLanguageRes());
            }
        }
    }

    private void e(MultiLanguageRes multiLanguageRes) {
        if (multiLanguageRes != null) {
            HashMap map = new HashMap(2);
            String str = this.e;
            if (str != null && str.startsWith(MLAsrConstants.LAN_ZH)) {
                map.put("zh_version", multiLanguageRes.getVersion());
            } else {
                String str2 = this.e;
                if (str2 != null && str2.startsWith("en")) {
                    map.put("en_version", multiLanguageRes.getVersion());
                } else {
                    map.put("extra_version", multiLanguageRes.getVersion());
                }
            }
            map.put("last_language", multiLanguageRes.getVersion());
            osa.b(this.f44796c, map);
            d(multiLanguageRes.getUrl());
        }
    }

    private void d(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.j);
        String str2 = this.e;
        if (str2 != null && str2.startsWith(MLAsrConstants.LAN_ZH)) {
            stringBuffer.append("languagesRes_zh.xml");
        } else {
            String str3 = this.e;
            if (str3 != null && str3.startsWith("en")) {
                stringBuffer.append("languagesRes_en.xml");
            } else {
                stringBuffer.append("languagesRes_extra.xml");
            }
        }
        LogUtil.d("PLGACHIEVE_LanguageRes", "download->sbPath:", stringBuffer.toString());
        osk.c(str, stringBuffer.toString(), this);
    }

    @Override // com.huawei.pluginachievement.connectivity.https.HttpResCallBack
    public void onFinished(int i, String str) {
        LogUtil.a("PLGACHIEVE_LanguageRes", "onFinished->resCode:", Integer.valueOf(i));
    }
}
