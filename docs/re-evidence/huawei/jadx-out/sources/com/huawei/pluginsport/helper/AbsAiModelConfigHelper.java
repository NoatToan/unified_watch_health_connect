package com.huawei.pluginsport.helper;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.PhoneInfoUtils;
import defpackage.fda;
import defpackage.fdy;
import defpackage.njy;
import defpackage.peh;
import defpackage.ppo;
import defpackage.ppw;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AbsAiModelConfigHelper {
    private static final String ALLOW_LIST_BRAND_MODE = "ALLOW_LIST";
    private static final String ALL_BRAND_MODE = "ALL";
    public static final int CPU_PLATFORM_UNSUPPORTED = -1;
    private static final String SHIELD_ALL_BRAND_SWITCH = "OPEN";
    public static final int SUPPORTED_MODEL_TYPE = 1;
    private static final String TAG = "AiModelConfigHelper";
    private static final int TIME_OUT_SECOND = 2;
    private static final int TWO_HUNDRED = 200;
    public static final int VALID_ARRAY_LENGTH = 2;
    private static Map<String, d> modelTypeMap = new HashMap();
    private final String mAiModelConfigName;

    protected int getKirModelType(int i) {
        return i >= 200 ? 1 : -1;
    }

    protected int getQuaModelType() {
        return 1;
    }

    protected abstract void initDefaultConfig();

    public AbsAiModelConfigHelper(String str) {
        this.mAiModelConfigName = str;
        initModelAndPlugin();
    }

    public static void preDownloadConfig() {
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.a(TAG, "preDownloadConfig getAuthorizationStatus: false");
        } else {
            fdy.d(new fda("com.huawei.health_common_config", new HashMap()), "SportField", 1, (DownloadCallback<File>) new DownloadCallback() { // from class: com.huawei.pluginsport.helper.AbsAiModelConfigHelper.1
                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFinish(Object obj) {
                    LogUtil.a(AbsAiModelConfigHelper.TAG, "preDownloadConfig success, result: ", obj.toString());
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onProgress(long j, long j2, boolean z, String str) {
                    LogUtil.a(AbsAiModelConfigHelper.TAG, "preDownloadConfig onProgress, already: ", Long.valueOf(j), ", total: " + j2, ", fileId: ", str);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFail(int i, Throwable th) {
                    LogUtil.e(AbsAiModelConfigHelper.TAG, "preDownloadConfig failed, e: ", th.getMessage());
                }
            });
        }
    }

    private void initModelAndPlugin() {
        initCloudConfigSetting();
        if (!isSupportMtkOrQua()) {
            String strB = SystemInfo.b();
            ReleaseLogUtil.d(TAG, "hiaiversion = ", strB);
            if (!TextUtils.isEmpty(strB)) {
                String[] strArrSplit = strB.split("\\.");
                ReleaseLogUtil.d(TAG, "versionSplit = ", Arrays.toString(strArrSplit));
                if (strArrSplit.length >= 2) {
                    try {
                        int i = Integer.parseInt(strArrSplit[1]);
                        ReleaseLogUtil.d(TAG, "version = ", Integer.valueOf(i));
                        getAiModel().e = getKirModelType(i);
                        return;
                    } catch (NumberFormatException unused) {
                        ReleaseLogUtil.e(TAG, "NumberFormatException");
                        getAiModel().e = -1;
                        return;
                    }
                }
                getAiModel().e = -1;
                return;
            }
            getAiModel().e = -1;
            return;
        }
        getAiModel().e = getQuaModelType();
    }

    private boolean isSupportMtkOrQua() {
        d aiModel = getAiModel();
        if (aiModel == null) {
            ReleaseLogUtil.e(TAG, "isSupportMtkOrQua aiModel is null");
            return false;
        }
        String str = Build.BRAND;
        String strF = CommonUtil.f();
        LogUtil.a(TAG, "isSupportMtkOrQua brand ", str, " cpuPlatform ", strF, " getDeviceModel ", PhoneInfoUtils.getDeviceModel());
        boolean z = aiModel.f22721c;
        boolean zContains = aiModel.f22720b.contains(str);
        boolean zContains2 = aiModel.i.contains(strF);
        ReleaseLogUtil.d(TAG, "isSupportMtkOrQua isSupportAllBrand ", Boolean.valueOf(z), " isSupportMtkBrand ", Boolean.valueOf(zContains), " isSupportMtkCpu ", Boolean.valueOf(zContains2));
        if ((z || zContains) && zContains2) {
            return true;
        }
        boolean zContains3 = aiModel.j.contains(str);
        boolean zContains4 = aiModel.h.contains(strF);
        ReleaseLogUtil.d(TAG, "isSupportMtkOrQua isSupportQuaBrand ", Boolean.valueOf(zContains3), " isSupportQuaCpu ", Boolean.valueOf(zContains4));
        return (z || zContains3) && zContains4;
    }

    private void initCloudConfigSetting() {
        String string;
        String strD = fdy.d("com.huawei.health_common_config", "SportField", "json");
        LogUtil.d(TAG, "the sportCommon filePath is: ", strD);
        try {
            string = new JSONObject(CommonUtil.q(strD)).getString(this.mAiModelConfigName);
        } catch (JSONException e) {
            LogUtil.e(TAG, "the exception msg is: ", e.getMessage());
            string = null;
        }
        for (ppo ppoVar : peh.c(string, ppo[].class)) {
            Integer numB = ppoVar.b();
            int iD = ppoVar.d();
            if (numB != null) {
                if (iD == null) {
                    iD = Integer.MAX_VALUE;
                }
                Integer num = iD;
                int iE = CommonUtil.e(BaseApplication.getContext());
                LogUtil.a(TAG, "currentVer: ", Integer.valueOf(iE), " minVer: ", numB, " maxVer: ", num);
                if (iE >= numB.intValue() && iE < num.intValue() && dealCondition(ppoVar.e())) {
                    Set set = getAiModel().h;
                    boolean z = getAiModel().f22721c;
                    Set set2 = getAiModel().j;
                    Set set3 = getAiModel().i;
                    Set set4 = getAiModel().f22720b;
                    boolean z2 = getAiModel().f22719a;
                    LogUtil.a(TAG, " the QUA_CPU: ", set, " isAllBrand: ", Boolean.valueOf(z), " QUA_BRAND: ", set2, " MTK_CPU: ", set3, " MTK_BRAND: ", set4, " isAllShield: ", Boolean.valueOf(z2), "DeviceModel: ", getAiModel().d);
                }
            }
        }
        initDefaultConfig();
        Set set5 = getAiModel().h;
        boolean z3 = getAiModel().f22721c;
        Set set6 = getAiModel().j;
        Set set7 = getAiModel().i;
        Set set8 = getAiModel().f22720b;
        boolean z4 = getAiModel().f22719a;
        LogUtil.a(TAG, " the QUA_CPU: ", set5, " isAllBrand: ", Boolean.valueOf(z3), " QUA_BRAND: ", set6, " MTK_CPU: ", set7, " MTK_BRAND: ", set8, " isAllShield: ", Boolean.valueOf(z4), "DeviceModel: ", getAiModel().d);
    }

    private boolean dealCondition(ppw ppwVar) {
        d dVar = new d();
        if (ppwVar == null || (njy.e(ppwVar.a()) && njy.e(ppwVar.e()))) {
            modelTypeMap.put(this.mAiModelConfigName, dVar);
            return false;
        }
        if (njy.b(ppwVar.e())) {
            dVar.i.addAll(ppwVar.e());
        }
        if (njy.b(ppwVar.a())) {
            dVar.h.addAll(ppwVar.a());
        }
        if ("ALL".equals(ppwVar.b())) {
            dVar.f22721c = true;
        } else {
            dVar.f22721c = false;
            if (njy.b(ppwVar.c())) {
                dVar.j.addAll(ppwVar.c());
            }
            if (njy.b(ppwVar.d())) {
                dVar.f22720b.addAll(ppwVar.d());
            }
        }
        dVar.f22719a = SHIELD_ALL_BRAND_SWITCH.equals(ppwVar.h());
        if (njy.b(ppwVar.g())) {
            dVar.d.addAll(ppwVar.g());
        }
        modelTypeMap.put(this.mAiModelConfigName, dVar);
        return true;
    }

    protected d getAiModel() {
        if (!modelTypeMap.containsKey(this.mAiModelConfigName)) {
            modelTypeMap.put(this.mAiModelConfigName, new d());
        }
        return modelTypeMap.get(this.mAiModelConfigName);
    }

    public int getModelType() {
        if (!modelTypeMap.containsKey(this.mAiModelConfigName)) {
            LogUtil.j(TAG, this.mAiModelConfigName, " not exist, return not support");
            return -1;
        }
        int i = getAiModel().e;
        LogUtil.a(TAG, "the sModelType: ", Integer.valueOf(i));
        return i;
    }

    protected void setQuaSupportBrand(Set<String> set) {
        if (set != null) {
            getAiModel().j.addAll(set);
        }
    }

    protected void setQuaSupportCpuPlatform(Set<String> set) {
        if (set != null) {
            getAiModel().h.addAll(set);
        }
    }

    protected void setDefaultDeviceModel(Set<String> set) {
        if (set != null) {
            getAiModel().d = set;
        }
    }

    protected Set<String> getDeviceModel() {
        return getAiModel().d;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<String> f22720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22721c;
        private Set<String> d;
        private int e;
        private Set<String> h;
        private Set<String> i;
        private Set<String> j;

        private d() {
            this.e = -1;
            this.f22721c = false;
            this.f22719a = false;
            this.j = new HashSet();
            this.f22720b = new HashSet();
            this.h = new HashSet();
            this.i = new HashSet();
            this.d = new HashSet();
        }

        public boolean d() {
            return this.f22719a;
        }
    }
}
