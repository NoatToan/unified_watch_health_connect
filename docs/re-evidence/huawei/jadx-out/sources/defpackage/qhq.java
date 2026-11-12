package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qhq {
    public static void d(String str, String str2, String str3, HiDataOperateListener hiDataOperateListener, long j) {
        if (hiDataOperateListener == null) {
            LogUtil.j("SampleConfigUtils", "setSampleConfig listener is null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hiDataOperateListener.onResult(-1, "setSampleConfig type " + str + " configId " + str2 + " configData " + str3);
            return;
        }
        HiSampleConfig.Builder builder = new HiSampleConfig.Builder();
        builder.e(j);
        builder.i(String.valueOf(0));
        builder.e(String.valueOf(-1));
        builder.f(String.valueOf(0));
        builder.h(str);
        builder.a(str2);
        builder.b(str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfig(builder));
        HiHealthManager.d(BaseApplication.b()).setSampleConfig(arrayList, hiDataOperateListener);
    }

    public static void b(final String str, final List<String> list, final HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.j("SampleConfigUtils", "getSampleConfig listener is null");
            return;
        }
        if (TextUtils.isEmpty(str) || njy.e(list)) {
            hiDataReadResultListener.onResult("getSampleConfig type " + str + " configId " + list, -1, -1);
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qhn
                @Override // java.lang.Runnable
                public final void run() {
                    qhq.b(str, list, hiDataReadResultListener);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new HiSampleConfigKey(e(str, it.next())));
        }
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOption, hiDataReadResultListener);
    }

    private static HiSampleConfigKey.Builder e(String str, String str2) {
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.e(str);
        builder.a(str2);
        return builder;
    }
}
