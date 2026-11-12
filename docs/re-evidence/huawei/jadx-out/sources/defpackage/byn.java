package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonParseException;
import com.huawei.basichealthmodel.bean.ChallengeConfigBean;
import com.huawei.basichealthmodel.bean.ConfigBean;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class byn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f1319b = new AtomicBoolean(false);

    public ConfigBean a(boolean z, boolean z2) {
        String str = "healthModel/health_model_task_config_oversea.json";
        if (!z2) {
            LogUtil.a("HL_HealthTaskFileLoader", "loadTasks ifAllowLogin is false");
            return b(e("healthModel/health_model_task_config_oversea.json"));
        }
        String strE = ccl.d().e("health_model_task_config.json");
        AtomicBoolean atomicBoolean = f1319b;
        atomicBoolean.set(false);
        if (TextUtils.isEmpty(strE) || z) {
            if (!z) {
                str = "healthModel/health_model_task_config.json";
            }
            strE = e(str);
            atomicBoolean.set(true);
        }
        return b(strE);
    }

    public ConfigBean d(boolean z) {
        String str;
        if (!z) {
            str = "challenge/health_model_challenge_config.json";
        } else {
            str = "challenge/health_model_challenge_config_oversea.json";
        }
        ConfigBean configBeanB = b(e(str));
        if (configBeanB == null) {
            return null;
        }
        List<ChallengeConfigBean> challengeList = configBeanB.getChallengeList();
        if ((LoginInit.getInstance(BaseApplication.b()).isMinorAccount() || !CommonUtil.bg()) && njy.b(challengeList)) {
            for (ChallengeConfigBean challengeConfigBean : challengeList) {
                if (challengeConfigBean != null) {
                    List<String> challengeTaskId = challengeConfigBean.getChallengeTaskId();
                    if (njy.b(challengeTaskId)) {
                        LogUtil.a("HL_HealthTaskFileLoader", "loadChallenges remove mindfulness challengeIdList ", challengeTaskId);
                        challengeTaskId.remove(String.valueOf(9));
                    }
                }
            }
        }
        return configBeanB;
    }

    private ConfigBean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_HealthTaskFileLoader", "jsonToBean json is empty");
            return null;
        }
        try {
            return (ConfigBean) HiJsonUtil.d(str, ConfigBean.class);
        } catch (JsonParseException | IllegalStateException | NullPointerException e) {
            LogUtil.e("HL_HealthTaskFileLoader", "jsonToBean exception ", LogAnonymous.b(e));
            return null;
        }
    }

    public static AtomicBoolean c() {
        if (!CommonUtil.ab(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            return new AtomicBoolean(false);
        }
        return f1319b;
    }

    public static void a(boolean z) {
        f1319b.set(z);
    }

    public static SparseArray<TaskConfigBean> c(ConfigBean configBean) {
        if (configBean == null) {
            LogUtil.j("HL_HealthTaskFileLoader", "getTaskSparseArray configEntity is null");
            return new SparseArray<>();
        }
        List<TaskConfigBean> taskList = configBean.getTaskList();
        SparseArray<TaskConfigBean> sparseArray = new SparseArray<>();
        if (njy.e(taskList)) {
            LogUtil.j("HL_HealthTaskFileLoader", "getTaskSparseArray configList is empty");
            return sparseArray;
        }
        for (TaskConfigBean taskConfigBean : taskList) {
            if (taskConfigBean != null) {
                sparseArray.put(taskConfigBean.getId(), taskConfigBean);
            }
        }
        return sparseArray;
    }

    public static SparseArray<ChallengeConfigBean> b(ConfigBean configBean) {
        if (configBean == null) {
            LogUtil.j("HL_HealthTaskFileLoader", "getChallengeSparseArray configEntity is null");
            return new SparseArray<>();
        }
        List<ChallengeConfigBean> challengeList = configBean.getChallengeList();
        SparseArray<ChallengeConfigBean> sparseArray = new SparseArray<>();
        if (njy.e(challengeList)) {
            LogUtil.j("HL_HealthTaskFileLoader", "getChallengeSparseArray configList is empty");
            return sparseArray;
        }
        for (ChallengeConfigBean challengeConfigBean : challengeList) {
            if (challengeConfigBean != null) {
                sparseArray.put(challengeConfigBean.getChallengeId(), challengeConfigBean);
            }
        }
        return sparseArray;
    }

    private String e(String str) {
        LogUtil.a("HL_HealthTaskFileLoader", "getLocalFile enter");
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getAssets().open(str);
                byte[] bArr = new byte[inputStreamOpen.available()];
                if (inputStreamOpen.read(bArr) > 0) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IOException e) {
                LogUtil.e("HL_HealthTaskFileLoader", "getLocalFile ioException ", LogAnonymous.b(e));
            }
            return "";
        } finally {
            IoUtils.c(inputStreamOpen);
        }
    }
}
