package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.main.stories.lightcloud.service.LightCloudCallBack;
import com.huawei.ui.main.stories.lightcloud.service.LightCloudHttpCallBack;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vse {
    private static volatile vse e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f51548c;

    private vse(Context context) {
        LogUtil.a("UIDV_LightCloud", "LightCloud");
        this.f51548c = context.getApplicationContext();
    }

    public static vse d(Context context) {
        LogUtil.a("UIDV_LightCloud", "getInstance");
        if (e == null) {
            synchronized (vse.class) {
                if (e == null) {
                    e = new vse(context);
                }
            }
        }
        return e;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    public void b(final LightCloudCallBack lightCloudCallBack, final List<String> list) {
        long j;
        Iterator<String> it;
        long jM;
        String strE;
        String strE2 = SharedPreferenceManager.e(this.f51548c, Integer.toString(10000), "lightcloudisoversea");
        final int iC = Utils.c();
        if (TextUtils.isEmpty(strE2)) {
            SharedPreferenceManager.e(this.f51548c, String.valueOf(10000), "lightcloudisoversea", String.valueOf(iC), new StorageParams());
        } else {
            j = strE2.equals(String.valueOf(iC)) ? 86400000L : 0L;
            it = list.iterator();
            while (it.hasNext()) {
                strE = SharedPreferenceManager.e(this.f51548c, Integer.toString(10000), it.next());
                if (!TextUtils.isEmpty(strE) || !"1".equals(strE)) {
                    j = 0;
                    break;
                }
            }
            jM = CommonUtil.m(this.f51548c, SharedPreferenceManager.e(this.f51548c, Integer.toString(10000), "lightcloudbatchtime"));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jM == 0 && jCurrentTimeMillis - jM < j) {
                LogUtil.a("UIDV_LightCloud", "doRefresh less than interval time");
                lightCloudCallBack.onResponce("", RecommendConstants.RESPONSE_CODE_NO_ENOUGH);
                return;
            } else {
                SharedPreferenceManager.e(this.f51548c, String.valueOf(10000), "lightcloudbatchtime", String.valueOf(System.currentTimeMillis()), new StorageParams());
                ThreadPoolManager.c().execute(new Runnable() { // from class: vsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51545c.b(list, lightCloudCallBack, iC);
                    }
                });
            }
        }
        it = list.iterator();
        while (it.hasNext()) {
            strE = SharedPreferenceManager.e(this.f51548c, Integer.toString(10000), it.next());
            if (!TextUtils.isEmpty(strE)) {
            }
            j = 0;
        }
        jM = CommonUtil.m(this.f51548c, SharedPreferenceManager.e(this.f51548c, Integer.toString(10000), "lightcloudbatchtime"));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jM == 0) {
        }
        SharedPreferenceManager.e(this.f51548c, String.valueOf(10000), "lightcloudbatchtime", String.valueOf(System.currentTimeMillis()), new StorageParams());
        ThreadPoolManager.c().execute(new Runnable() { // from class: vsc
            @Override // java.lang.Runnable
            public final void run() {
                this.f51545c.b(list, lightCloudCallBack, iC);
            }
        });
    }

    /* synthetic */ void b(final List list, final LightCloudCallBack lightCloudCallBack, final int i) {
        vsh.d(GRSManager.c(this.f51548c).getNoCheckUrl("getNewBatchPluginUrl", "") + "com.huawei.health_common_config", "", new LightCloudHttpCallBack() { // from class: vsf
            @Override // com.huawei.ui.main.stories.lightcloud.service.LightCloudHttpCallBack
            public final void onResponce(int i2, String str) {
                this.d.e(list, lightCloudCallBack, i, i2, str);
            }
        });
    }

    /* synthetic */ void e(List list, LightCloudCallBack lightCloudCallBack, int i, int i2, String str) {
        LogUtil.a("UIDV_LightCloud", "pullRefresh resCode = ", Integer.valueOf(i2));
        if (i2 == 200) {
            b(vsg.d(str, list), lightCloudCallBack);
            SharedPreferenceManager.e(this.f51548c, String.valueOf(10000), "lightcloudisoversea", String.valueOf(i), new StorageParams());
            return;
        }
        lightCloudCallBack.onResponce("", -1);
    }

    private void b(List<vsd> list, final LightCloudCallBack lightCloudCallBack) {
        LogUtil.a("UIDV_LightCloud", "downloadBatch");
        if (list != null) {
            LogUtil.a("UIDV_LightCloud", "pullRefresh list.size =", Integer.valueOf(list.size()));
            if (list.size() == 0) {
                lightCloudCallBack.onResponce("", 20000);
            }
            for (final vsd vsdVar : list) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                vsk.b(this.f51548c).b(vsdVar, new LightCloudHttpCallBack() { // from class: vse.1
                    @Override // com.huawei.ui.main.stories.lightcloud.service.LightCloudHttpCallBack
                    public void onResponce(int i, String str) {
                        LogUtil.a("UIDV_LightCloud", "doDownload:", "resCode = ", Integer.valueOf(i), " result = ", str);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (i == 0 && "success".equals(str)) {
                            vsk.b(vse.this.f51548c).a(vsdVar, lightCloudCallBack);
                        } else {
                            vsd vsdVar2 = vsdVar;
                            if (vsdVar2 != null) {
                                lightCloudCallBack.onResponce(vsdVar2.c(), -4);
                            } else {
                                lightCloudCallBack.onResponce("", -4);
                            }
                        }
                        vsd vsdVar3 = vsdVar;
                        if (vsdVar3 != null) {
                            vse.this.a(i, jCurrentTimeMillis, jCurrentTimeMillis2, vsdVar3.c());
                        }
                    }
                });
            }
            return;
        }
        LogUtil.j("UIDV_LightCloud", "download list is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, long j, long j2, String str) {
        int i2 = i == 0 ? 0 : 1;
        long j3 = j2 - j;
        if ("servicefw_v1".equals(str)) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("target", "2");
            linkedHashMap.put(OpAnalyticsConstants.TARGET_SOURCE_TYPE, "4");
            linkedHashMap.put(OpAnalyticsConstants.DELAY_MS, String.valueOf(j3));
            linkedHashMap.put("flag", String.valueOf(i2));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEPEND_85040001.value(), linkedHashMap);
            return;
        }
        if ("airule_v1".equals(str)) {
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.put("target", "2");
            linkedHashMap2.put(OpAnalyticsConstants.TARGET_SOURCE_TYPE, "3");
            linkedHashMap2.put(OpAnalyticsConstants.DELAY_MS, String.valueOf(j3));
            linkedHashMap2.put("flag", String.valueOf(i2));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEPEND_85040001.value(), linkedHashMap2);
            return;
        }
        LogUtil.j("UIDV_LightCloud", "no branch!");
    }
}
