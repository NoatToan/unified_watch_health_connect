package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class ibl {
    public static float a(float f, int i) {
        float f2 = (f * 100.0f) / i;
        if (f2 > 100.0f) {
            return 100.0f;
        }
        return f2;
    }

    public static int a(int i) {
        return i;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i;
    }

    public static int c(int i, int i2) {
        return i == 1 ? i2 : i2 + 3;
    }

    public static int d(float f) {
        if (f > 90.0f) {
            return 5;
        }
        if (f > 80.0f) {
            return 4;
        }
        if (f > 60.0f) {
            return 3;
        }
        if (f > 30.0f) {
            return 2;
        }
        return f > 0.0f ? 1 : 0;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.contains("_") ? 3 : 0;
    }

    public static float b(float f) {
        if (f <= 100.0f) {
            return f;
        }
        LogUtil.e("Suggestion_PlanUtil", "truncateOverOneHundred target = ", Float.valueOf(f));
        return 100.0f;
    }

    public static List<String> d(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pei.c(context, R.string.sug_defalut_5km_plan_name, new Object[0]).replace("5", UnitUtil.e(5.0d, 1, 0)));
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_10km_plan_name, new Object[0]).replace("10", UnitUtil.e(10.0d, 1, 0)));
        arrayList.add(pei.c(context, R.string.sug_defalut_half_marathon_plan_name, new Object[0]));
        arrayList.add(pei.c(context, R.string.sug_defalut_marathon_plan_name, new Object[0]));
        return arrayList;
    }

    public static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_low_level_loss_plan_name, new Object[0]));
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_mid_level_loss_plan_name, new Object[0]));
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_high_level_loss_plan_name, new Object[0]));
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_low_level_shape_plan_name, new Object[0]));
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_mid_level_shape_plan_name, new Object[0]));
        arrayList.add(pei.c(context, com.huawei.health.suggestion.R.string.sug_defalut_high_level_shape_plan_name, new Object[0]));
        return arrayList;
    }

    public static Plan e() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_PlanUtil", "getCurrentPlan : planApi is null.");
            return null;
        }
        final Plan[] planArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        planApi.getCurrentIntPlan(new UiPagingCallback<IntPlan>() { // from class: ibl.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(IntPlan intPlan) {
                if (intPlan != null) {
                    planArr[0] = intPlan.getCompatiblePlan();
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str) {
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanUtil", "getIntelligentRunPlan wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanUtil", "interrupted while waiting for getDietRecordList");
        }
        return planArr[0];
    }

    public static int b(Plan plan, long j) {
        pdt pdtVarB;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int iB = ift.b(calendar.get(7));
        int iA = btw.a(plan, j);
        LogUtil.a("Suggestion_PlanUtil", "getAiCoachType weekNumber:", Integer.valueOf(iA), " planDayIndex:", Integer.valueOf(iB));
        pdt pdtVarB2 = btw.b(plan, iB, iA);
        if (njy.e(pdtVarB2.a())) {
            return 1;
        }
        if (pdtVarB2.c()) {
            return 6;
        }
        if (iB == 1) {
            pdtVarB = btw.b(plan, 7, iA - 1);
        } else {
            pdtVarB = btw.b(plan, iB - 1, iA);
        }
        if (njy.b(pdtVarB.a())) {
            return pdtVarB.c() ? 0 : 2;
        }
        int iA2 = a(plan, iA);
        if (iA2 == 1) {
            return 3;
        }
        if (iA2 != 2) {
            return iA2 != 3 ? 0 : 5;
        }
        return 4;
    }

    private static int a(Plan plan, int i) {
        int i2 = 0;
        while (i > 1) {
            i--;
            if (!btw.a(plan, i)) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public static void a(Context context, int i, final HealthProgressBar healthProgressBar, ImageView imageView) {
        String string;
        Resources resources = context.getResources();
        if (qqs.e(context)) {
            string = resources.getString(com.huawei.health.suggestion.R.string.run_plan_progress_dark_url);
        } else {
            string = resources.getString(com.huawei.health.suggestion.R.string.run_plan_progress_url);
        }
        qqf.b(string, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE), imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (LanguageUtil.ba(context)) {
            imageView.setScaleX(-1.0f);
        }
        healthProgressBar.setVisibility(0);
        ValueAnimator duration = ValueAnimator.ofInt(0, i).setDuration(100L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ibl.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                healthProgressBar.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        duration.start();
    }
}
