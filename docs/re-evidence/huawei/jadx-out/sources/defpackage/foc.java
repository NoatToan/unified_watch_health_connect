package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.knit.model.KnitPageGroupConfig;
import com.huawei.health.knit.model.mainpage.MainPageConfig;
import com.huawei.health.knit.model.mainpage.MainPageGroupConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class foc {
    public static KnitPageGroupConfig c(Context context, String str) {
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        AssetManager assets = context != null ? context.getAssets() : null;
        if (assets != null) {
            try {
                inputStreamOpen = assets.open(str);
                try {
                    try {
                        KnitPageGroupConfig knitPageGroupConfig = (KnitPageGroupConfig) lls.e(inputStreamOpen, new TypeToken<KnitPageGroupConfig>() { // from class: com.huawei.health.knit.KnitHelper$1
                        });
                        IoUtils.c(inputStreamOpen);
                        return knitPageGroupConfig;
                    } catch (IOException e) {
                        e = e;
                        LogUtil.e("KnitHelper", "sport template assets load failed: ", LogAnonymous.b(e));
                        IoUtils.c(inputStreamOpen);
                        return null;
                    }
                } catch (Throwable th) {
                    inputStream = inputStreamOpen;
                    th = th;
                    IoUtils.c(inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                inputStreamOpen = null;
            } catch (Throwable th2) {
                th = th2;
                IoUtils.c(inputStream);
                throw th;
            }
        }
        return null;
    }

    public static MainPageGroupConfig d(Context context, String str) {
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        AssetManager assets = context != null ? context.getAssets() : null;
        if (assets != null) {
            try {
                inputStreamOpen = assets.open(str);
                try {
                    try {
                        MainPageGroupConfig mainPageGroupConfig = (MainPageGroupConfig) lls.e(inputStreamOpen, new TypeToken<MainPageGroupConfig>() { // from class: com.huawei.health.knit.KnitHelper$2
                        });
                        IoUtils.c(inputStreamOpen);
                        return mainPageGroupConfig;
                    } catch (IOException e) {
                        e = e;
                        LogUtil.e("KnitHelper", "sport template assets load failed: ", LogAnonymous.b(e));
                        IoUtils.c(inputStreamOpen);
                        return null;
                    }
                } catch (Throwable th) {
                    inputStream = inputStreamOpen;
                    th = th;
                    IoUtils.c(inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                inputStreamOpen = null;
            } catch (Throwable th2) {
                th = th2;
                IoUtils.c(inputStream);
                throw th;
            }
        }
        return null;
    }

    public static KnitFragment b(Context context, int i, Bundle bundle) {
        MainPageGroupConfig mainPageGroupConfigD = d(context, "MainPageSectionsConfig.json");
        ArrayList<MainPageConfig> pagesConfig = mainPageGroupConfigD != null ? mainPageGroupConfigD.getPagesConfig() : null;
        if (pagesConfig != null) {
            for (int i2 = 0; i2 < pagesConfig.size(); i2++) {
                MainPageConfig mainPageConfig = pagesConfig.get(i2);
                if (mainPageConfig != null) {
                    int pageType = mainPageConfig.getPageType();
                    int resPosId = mainPageConfig.getResPosId();
                    String strB = qqt.b(mainPageConfig);
                    if (pageType == i) {
                        return KnitFragment.newInstance(strB, new BasePageResTrigger(context, resPosId, null).setExtra(bundle));
                    }
                }
            }
        }
        return null;
    }
}
