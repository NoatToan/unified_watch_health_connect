package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.suggestion.FitnessNavigationApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes31.dex */
@ApiDefine(uri = FitnessNavigationApi.class)
@Singleton
public class hci implements FitnessNavigationApi {
    private final PluginSuggestion e = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);

    @Override // com.huawei.health.suggestion.FitnessNavigationApi
    public void startMoreFitness(Context context) {
        PluginSuggestion pluginSuggestion = this.e;
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(context);
    }

    @Override // com.huawei.health.suggestion.FitnessNavigationApi
    public void gotoFitnessPage(String str, String str2, final Context context) {
        if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
            Uri uri = Uri.parse(str.replace(str2, ""));
            final String queryParameter = uri.getQueryParameter("id");
            final String queryParameter2 = uri.getQueryParameter("version");
            LogUtil.a("SocialMessageAdapter", "gotoFitnessPage workout is ", queryParameter, " version is ", queryParameter2);
            if (!TextUtils.isEmpty(queryParameter)) {
                Services.b("PluginFitnessAdvice", PluginSuggestion.class, context, new Consumer() { // from class: hce
                    @Override // com.huawei.framework.servicemgr.Consumer
                    public final void accept(Object obj) {
                        this.f36392a.e(queryParameter, queryParameter2, context, (PluginSuggestion) obj);
                    }
                });
                return;
            }
        }
        startMoreFitness(context);
    }

    /* synthetic */ void e(String str, String str2, final Context context, PluginSuggestion pluginSuggestion) {
        pluginSuggestion.getFitWorkout(str, str2, new UiCallback<FitWorkout>() { // from class: hci.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str3) {
                LogUtil.j("SocialMessageAdapter", "goFitnessPage onFailure " + i);
                hci.this.startMoreFitness(context);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(FitWorkout fitWorkout) {
                if (fitWorkout != null) {
                    hci.this.d(fitWorkout, context);
                } else {
                    LogUtil.j("SocialMessageAdapter", "goFitnessPage onSuccess data is null ");
                    hci.this.startMoreFitness(context);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitWorkout fitWorkout, Context context) {
        PluginSuggestion pluginSuggestion = this.e;
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        if (fitWorkout == null) {
            LogUtil.j("SocialMessageAdapter", "start fitness failed with the null fitWorkout");
        } else {
            idy.a((String) null);
            pea.a(context, fitWorkout);
        }
    }
}
