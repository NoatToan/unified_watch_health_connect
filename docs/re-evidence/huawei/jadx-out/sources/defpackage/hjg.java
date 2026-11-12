package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.CoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes.dex */
public class hjg {
    public static boolean b(boolean z, int i, boolean z2) {
        return z && !z2 && (i != -100 && i != 192);
    }

    public static void a(CoachView coachView, Motion motion) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "changeProgress coachView == null || currMotion == null");
            return;
        }
        if ("timer".equals(motion.acquireMotionType())) {
            coachView.setTimeView(coachView.i().d(), -1, true);
        } else if (coachView.l()) {
            coachView.setTimeView(coachView.i().d() - 1, -1, false);
        } else {
            coachView.setTimeView(coachView.i().d(), -1, false);
        }
        float fG = "hotbody".equals(motion.acquireMotionType()) ? coachView.e().g() : motion.acquireDuration();
        if ("hotbody".equals(motion.acquireMotionType())) {
            coachView.r().setProgress(coachView.i().e(), 0, (coachView.d() * coachView.r().d(coachView.i().e())) / fG);
        } else {
            coachView.r().setProgress(coachView.i().e(), coachView.i().a(), coachView.d());
        }
        coachView.setTimeProgress((int) ((coachView.d() / fG) * coachView.getTimeProgressMax()));
        d(coachView);
    }

    public static void d(CoachView coachView) {
        if (CourseEquipmentConnectionTipsUtil.b()) {
            float fD = 0.0f;
            for (int i = 0; i < coachView.i().e(); i++) {
                fD += coachView.r().d(i);
            }
            final int iD = (int) (((fD + coachView.d()) / coachView.r().getTotalTime()) * 100.0f);
            lsy.a(new Runnable() { // from class: hje
                @Override // java.lang.Runnable
                public final void run() {
                    dmg.a().setFitnessRopeConfig(5, 1, new int[]{iD});
                }
            });
        }
    }

    public static void e(CoachView coachView, int i) {
        if (coachView == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "state321 coachView == null");
            return;
        }
        LogUtil.a("Suggestion_CoachViewUIHelper", "state:", Integer.valueOf(i));
        coachView.i().b(190);
        coachView.d(190);
        coachView.setTimeProgress(i);
    }

    public static void e(CoachView coachView, Motion motion) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "stateGo coachView == null || currMotion == null");
            return;
        }
        LogUtil.a("Suggestion_CoachViewUIHelper", "state go");
        coachView.a(0L);
        coachView.i().b(190);
        coachView.d(190);
        coachView.setTimeProgress(0);
        if ("timer".equals(motion.acquireMotionType())) {
            coachView.setTimeView(0, motion.acquireRepeat(), true);
        } else {
            coachView.setTimeView(0, motion.acquireRepeat(), false);
        }
        coachView.setTimeProgressMax((int) motion.acquireDuration());
    }

    public static void d(CoachView coachView, int i, int i2) {
        if (coachView == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "refreshButton coachView == null");
            return;
        }
        if (i == 0) {
            coachView.j().getPreAction().setVisibility(4);
            coachView.j().getNextAction().setVisibility(0);
        } else if (i == i2) {
            coachView.j().getPreAction().setVisibility(0);
            coachView.j().getNextAction().setVisibility(4);
        } else {
            coachView.j().getPreAction().setVisibility(0);
            coachView.j().getNextAction().setVisibility(0);
        }
    }

    public static String c(Motion motion, String str) {
        if (motion != null) {
            return (motion.acquireCommentaryGap() == null || motion.acquireCommentaryGap().size() <= 0) ? str : motion.acquireCommentaryGap().get(0).acquireContent();
        }
        LogUtil.j("Suggestion_CoachViewUIHelper", "getContent motion == null");
        return str;
    }

    public static void c(CoachView coachView, int i, Motion motion, int i2) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "restActionFinish coachView == null || motion == null");
        } else if (coachView.i().e() == i2) {
            coachView.o().d(false, motion);
        } else {
            coachView.o().d(true, motion);
        }
    }

    public static String e(String str) {
        String strE = buh.e(str);
        return TextUtils.isEmpty(strE) ? "1000" : strE;
    }

    private static UserInfomation c() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "getUserInformation api is null");
            return new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo != null) {
            return userInfo;
        }
        LogUtil.j("Suggestion_CoachViewUIHelper", "getUserInformation userInformation is null");
        return new UserInfomation(UnitUtil.f() ? 1 : 0);
    }

    public static int e() {
        return c().getGenderOrDefaultValue();
    }

    public static float a() {
        return c().getWeightOrDefaultValue();
    }

    public static void b(CoachView coachView, float f) {
        if (coachView == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "rateEffective coachView == null");
            return;
        }
        if (f <= 0.6d || !(coachView.w().getTag() instanceof Boolean)) {
            return;
        }
        if (((Boolean) coachView.w().getTag()).booleanValue()) {
            coachView.e(true);
        } else {
            coachView.w().setTag(true);
        }
    }

    public static boolean d(CoachView coachView, int i) {
        if (coachView != null) {
            return coachView.p() != null && i == R.id.sug_coach_set_iv_stop;
        }
        LogUtil.j("Suggestion_CoachViewUIHelper", "isFinish coachView == null");
        return false;
    }

    public static boolean a(int i) {
        return i == R.id.sug_coach_set_iv_continue || i == R.id.sug_coach_set_voice_ok;
    }

    public static void c(CoachView coachView, Motion motion) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "changeListener coachView == null || currMotion == null");
        } else if (coachView.p() != null) {
            coachView.p().onGroupFinish(motion, coachView.i().a(), motion.acquireGroups());
        }
    }

    public static void a(CoachView coachView, int i) {
        if (coachView == null) {
            LogUtil.j("Suggestion_CoachViewUIHelper", "preNextChange coachView == null");
            return;
        }
        if (coachView.i().e() == 0) {
            b(coachView.m(), 0.4f, 2);
            return;
        }
        if (coachView.i().e() == 1) {
            b(coachView.m(), 1.0f, 0);
            return;
        }
        if (coachView.i().e() == i - 1) {
            b(coachView.n(), 0.4f, 2);
        } else if (coachView.i().e() != i - 2) {
            LogUtil.d("Suggestion_CoachViewUIHelper", "CurrMotion unexpected");
        } else {
            b(coachView.n(), 1.0f, 0);
        }
    }

    public static void b(ImageView imageView, float f, int i) {
        if (imageView == null) {
            ReleaseLogUtil.d("Suggestion_CoachViewUIHelper", "setAlpha imageView is null");
        } else {
            imageView.setAlpha(f);
            lrd.c(imageView, i);
        }
    }

    public static int e(View view) {
        if (view != null) {
            return view.getVisibility() == 0 ? 8 : 0;
        }
        LogUtil.j("Suggestion_CoachViewUIHelper", "controlLockVisitable mLockLayout == null");
        return 8;
    }
}
