package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.aicoach.AICoachFactory;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.utils.RiskBiAnalytics;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class gfk {
    private static gfk e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AICoachFactory f35025a = new AICoachFactory(BaseApplication.b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f35023b = Pattern.compile("\\d+");
    private static final Pattern d = Pattern.compile("^data:\\s*(.*)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f35024c = new Object();

    public static gfk e() {
        if (e == null) {
            synchronized (f35024c) {
                gfk gfkVar = new gfk();
                e = gfkVar;
                LogUtil.a("AICoachManager", "AICoachManager instance hashcode: ", Integer.valueOf(gfkVar.hashCode()));
            }
        }
        return e;
    }

    public void b(final gfm gfmVar, final ResultCallback<LinkedHashMap<Integer, gfl>> resultCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gfi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35020c.a(gfmVar, resultCallback);
                }
            });
            return;
        }
        String url = gfmVar.getUrl();
        LogUtil.a("AICoachManager", "getAICoachInfo url:", url);
        oet.d().c(url, this.f35025a.getHeaders(), ofe.c(this.f35025a.getBody(gfmVar)), String.class, new ResultCallback<String>() { // from class: gfk.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("AICoachManager", "getAICoachInfo data:", str);
                resultCallback.onSuccess(gfk.a(str));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("R_AICoachManager", "getAICoachInfo onFailure:", ExceptionUtils.c(th));
                RiskBiAnalytics.a(SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_QUERY_AI_COACH, "", th);
                resultCallback.onFailure(th);
            }
        });
    }

    /* synthetic */ void a(gfm gfmVar, ResultCallback resultCallback) {
        b(gfmVar, (ResultCallback<LinkedHashMap<Integer, gfl>>) resultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<Integer, gfl> a(String str) {
        LinkedHashMap<Integer, gfl> linkedHashMap = new LinkedHashMap<>();
        String[] strArrSplit = str.split("\n");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            if (str2.trim().startsWith("id:")) {
                int iB = b(str2, -1);
                if (iB == -1) {
                    ReleaseLogUtil.a("R_AICoachManager", "handleCoachInfo id error ", str2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= strArrSplit.length) {
                        ReleaseLogUtil.a("R_AICoachManager", "handleCoachInfo content error ", str2);
                    } else {
                        linkedHashMap.put(Integer.valueOf(iB), (gfl) HiJsonUtil.d(c(strArrSplit[i2]), gfl.class));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static int b(String str, int i) {
        Matcher matcher = f35023b.matcher(str);
        return matcher.find() ? CommonUtils.e(matcher.group(), i) : i;
    }

    private static String c(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
}
