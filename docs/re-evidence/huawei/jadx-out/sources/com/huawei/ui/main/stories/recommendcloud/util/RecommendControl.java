package com.huawei.ui.main.stories.recommendcloud.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.config.CoreSleepTagConfig;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.ui.main.stories.recommendcloud.data.SleepRecommendData;
import com.huawei.ui.main.stories.recommendcloud.data.SleepServiceData;
import defpackage.njy;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class RecommendControl {
    private static final String CORE_SLEEP_TAG_CONFIG_NEW_PATH = "sleep/CoreSleepTagConfigNew_2020.txt";
    private static final String CORE_SLEEP_TAG_CONFIG_PATH = "CoreSleepTagConfig.txt";
    private static final Object LOCK_OBJECT = new Object();
    private static final String TAG = "RecommendControl";
    private static Context sContext;
    private static RecommendControl sRecommendControl;
    private CoreSleepTagConfig mCoreSleepTagConfig = null;
    private String mSmartCardCoreSleepTime;

    private RecommendControl() {
    }

    public static RecommendControl newInstance(Context context) {
        RecommendControl recommendControl;
        sContext = context.getApplicationContext();
        synchronized (LOCK_OBJECT) {
            if (sContext == null) {
                sContext = context;
            }
            if (sRecommendControl == null) {
                sRecommendControl = new RecommendControl();
            }
            recommendControl = sRecommendControl;
        }
        return recommendControl;
    }

    public SleepRecommendData getSleepRecommendData(String str) throws Throwable {
        CoreSleepTagConfig coreSleepTagConfigInitCoreSleepTagConfig = this.mCoreSleepTagConfig;
        if (coreSleepTagConfigInitCoreSleepTagConfig == null) {
            coreSleepTagConfigInitCoreSleepTagConfig = initCoreSleepTagConfig();
        }
        if (coreSleepTagConfigInitCoreSleepTagConfig == null || njy.e(coreSleepTagConfigInitCoreSleepTagConfig.getCoreSleepTagList())) {
            LogUtil.j(TAG, "coreSleepTagConfig or getCoreSleepTagList is null ");
            return null;
        }
        for (SleepRecommendData sleepRecommendData : coreSleepTagConfigInitCoreSleepTagConfig.getCoreSleepTagList()) {
            if (str.equals(sleepRecommendData.getSuggestion())) {
                LogUtil.a(TAG, "perfect ");
                return sleepRecommendData;
            }
        }
        SleepRecommendData sleepRecommendData2 = coreSleepTagConfigInitCoreSleepTagConfig.getCoreSleepTagList().get(0);
        LogUtil.a(TAG, "sleepData.suggestion :", sleepRecommendData2.getSuggestion());
        return sleepRecommendData2;
    }

    public List<SleepServiceData.SleepZoneConfigBean.InfoListBean> getInfoList() {
        SleepServiceData sleepServiceData = (SleepServiceData) HiJsonUtil.d(getAssetString(), SleepServiceData.class);
        ArrayList arrayList = new ArrayList(16);
        if (sleepServiceData != null) {
            SleepServiceData.SleepZoneConfigBean sleepZoneConfig = sleepServiceData.getSleepZoneConfig();
            if (sleepZoneConfig == null) {
                LogUtil.j(TAG, "getInfoList bean is null");
                return arrayList;
            }
            List<SleepServiceData.SleepZoneConfigBean.InfoListBean> infoList = sleepZoneConfig.getInfoList();
            if (infoList == null) {
                LogUtil.j(TAG, "getInfoList infoList is null");
                return arrayList;
            }
            for (int i = 0; i < 4 && i < infoList.size(); i++) {
                arrayList.add(infoList.get(i));
            }
        }
        return arrayList;
    }

    private String getAssetString() {
        String str = "";
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = BaseApplication.getContext().getAssets().open(CORE_SLEEP_TAG_CONFIG_NEW_PATH);
                byte[] bArr = new byte[inputStreamOpen.available()];
                str = inputStreamOpen.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
            } catch (IOException unused) {
                LogUtil.e(TAG, "getAssetString IOException");
            }
            return str;
        } finally {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                    LogUtil.e(TAG, "getAssetString IOException");
                }
            }
        }
    }

    public CoreSleepTagConfig initCoreSleepTagConfig() throws Throwable {
        CoreSleepTagConfig coreSleepTagConfig;
        JsonSyntaxException e;
        try {
            String str = sContext.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator + RecommendConstants.DOWNLOAD_DIR + File.separator + RecommendConstants.HEALTH_SLEEP_RECOMMEND + File.separator;
            LogUtil.a(TAG, "initCoreSleepTagConfig");
            String strQ = CommonUtil.q(str + File.separator + CORE_SLEEP_TAG_CONFIG_PATH);
            if (TextUtils.isEmpty(strQ)) {
                LogUtil.j(TAG, "initCoreSleepTagConfig str is null");
                return null;
            }
            try {
                coreSleepTagConfig = (CoreSleepTagConfig) HiJsonUtil.d(strQ, CoreSleepTagConfig.class);
                try {
                    this.mCoreSleepTagConfig = coreSleepTagConfig;
                } catch (JsonSyntaxException e2) {
                    e = e2;
                    LogUtil.e(TAG, "initCoreSleepTagConfig JsonSyntaxException ", e.getMessage());
                }
            } catch (JsonSyntaxException e3) {
                coreSleepTagConfig = null;
                e = e3;
            }
            if (coreSleepTagConfig != null) {
                this.mSmartCardCoreSleepTime = coreSleepTagConfig.getCoreSleepTime();
            }
            return coreSleepTagConfig;
        } catch (IOException unused) {
            LogUtil.e(TAG, "initCoreSleepTagConfig IOException");
            return null;
        }
    }

    public String getSmartCardCoreSleepTime() {
        return this.mSmartCardCoreSleepTime;
    }

    public void clearData() {
        this.mCoreSleepTagConfig = null;
    }
}
