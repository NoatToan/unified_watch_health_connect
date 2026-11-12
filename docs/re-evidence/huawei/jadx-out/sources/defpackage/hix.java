package defpackage;

import android.os.Message;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.ui.fitness.module.CoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler;
import com.huawei.health.suggestion.util.StaticHandler;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes31.dex */
public class hix extends StaticHandler<CoachView> {
    public hix(CoachView coachView) {
        super(coachView);
    }

    @Override // com.huawei.health.suggestion.util.StaticHandler
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void handleMessage(CoachView coachView, Message message) {
        if (message == null) {
            LogUtil.j("Suggestion_CoachHandler", "handleMessage msg == null");
            return;
        }
        if (message.what == 103 && coachView != null) {
            LogUtil.a("Suggestion_CoachHandler", "MediaWhat.AUDIO_FINISH");
            if (coachView.p() != null) {
                LogUtil.a("Suggestion_CoachHandler", "MediaWhat.AUDIO_FINISH onTrainOver(false)");
                coachView.p().onTrainOver(false);
            }
        }
        if (coachView == null || coachView.i().b() == -100 || coachView.s() == null) {
            return;
        }
        if (njy.e(coachView.s(), coachView.i().e())) {
            LogUtil.j("Suggestion_CoachHandler", "coachView.acquireCoachState().acquireCurrMotion() is out of Bounds");
        } else {
            e(coachView, message, coachView.s().get(coachView.i().e()));
        }
    }

    private void e(final CoachView coachView, Message message, Motion motion) {
        if (message.what == 101) {
            coachView.ai();
            coachView.d(-1, false);
            e(coachView, motion);
            return;
        }
        if (message.what == 153) {
            j(coachView, motion);
            coachView.c().setIsShowBottomProgress(true);
            return;
        }
        if (message.what == 102) {
            h(coachView, motion);
            coachView.c().setIsShowBottomProgress(false);
            return;
        }
        if (message.what == 3) {
            coachView.d(3, true);
            hjg.e(coachView, 3);
            return;
        }
        if (message.what == 2) {
            coachView.d(2, true);
            hjg.e(coachView, 2);
            return;
        }
        if (message.what == 1) {
            coachView.d(1, true);
            hjg.e(coachView, 1);
            return;
        }
        if (message.what == 0) {
            postDelayed(new Runnable() { // from class: hix.5
                @Override // java.lang.Runnable
                public void run() {
                    coachView.d(0, true);
                    LogUtil.a("Suggestion_CoachHandler", "postDelayed");
                }
            }, 493L);
            LogUtil.a("Suggestion_CoachHandler", "MediaWhat.COUNTDOWN_ZERO");
            hjg.e(coachView, motion);
            if (lrd.d()) {
                LogUtil.a("Suggestion_CoachHandler", "identifyMediaAndSetCoachView isTouchExplorationEnabled");
                return;
            } else {
                coachView.c().setVisibility(8);
                return;
            }
        }
        if (message.what == 104) {
            LogUtil.a("Suggestion_CoachHandler", "MediaWhat.FINISH");
            if (coachView.p() != null) {
                coachView.e(true);
                coachView.p().onTrainOver(true);
                coachView.p().onMotionOver(motion, coachView.i().e());
            }
            coachView.i().b(-100);
            return;
        }
        if (message.what == 154) {
            LogUtil.a("Suggestion_CoachHandler", "MediaWhat.MOTION_NAME");
            if (coachView.p() != null) {
                coachView.p().onMotionReady(motion, coachView.i().e());
                return;
            }
            return;
        }
        LogUtil.d("Suggestion_CoachHandler", "MediaWhat unexpected");
    }

    private void h(CoachView coachView, Motion motion) {
        if (motion == null) {
            LogUtil.j("Suggestion_CoachHandler", "stateTrainFinish currMotion == null");
            return;
        }
        LogUtil.a("Suggestion_CoachHandler", "a group of action or training completed:{}", motion.acquireName());
        if (coachView.i() == null) {
            LogUtil.j("Suggestion_CoachHandler", "stateTrainFinish coachView.acquireCoachState() == null");
            return;
        }
        coachView.i().b(190);
        coachView.d(190);
        if (coachView.i().a() + 1 == motion.acquireGroups()) {
            c(coachView, motion);
        } else {
            d(coachView, motion);
        }
    }

    private void c(CoachView coachView, Motion motion) {
        coachView.i().c(motion.acquireGroups() - 1);
        coachView.aa();
        coachView.i().d(coachView.i().e() + 1);
        if (coachView.i().e() < coachView.s().size()) {
            c(coachView);
            coachView.c(coachView.i().e());
        } else {
            e(coachView);
        }
    }

    private void c(CoachView coachView) {
        if (njy.e(coachView.s(), coachView.i().e() - 1)) {
            LogUtil.e("Suggestion_CoachHandler", "acquireMotions: isOutOfBounds");
            return;
        }
        LogUtil.a("Suggestion_CoachHandler", "resting time:", Integer.valueOf(coachView.s().get(coachView.i().e() - 1).acquireGap()));
        if (coachView.s().get(coachView.i().e() - 1).acquireGap() > 0) {
            if (coachView.p() != null) {
                coachView.p().onMotionReady(coachView.s().get(coachView.i().e()), coachView.i().e());
            }
            LogUtil.a("Suggestion_CoachHandler", "to resting");
            coachView.ax();
            coachView.o().voiceGuideRest();
        } else {
            if (coachView.i().e() == coachView.s().size() - 1) {
                coachView.o().lastMotion(coachView.s().get(coachView.i().e()));
            } else {
                coachView.o().nextMotion(coachView.s().get(coachView.i().e()));
            }
            CoachController.c().c(CoachController.StatusSource.APP, coachView.i().e());
        }
        coachView.ab();
        coachView.t().next();
    }

    private void e(CoachView coachView) {
        LogUtil.a("Suggestion_CoachHandler", "training completed");
        coachView.o().wellDone();
        coachView.t().pause();
        coachView.b().pause();
        coachView.i().d(coachView.s().size() - 1);
    }

    private void d(CoachView coachView, Motion motion) {
        if (njy.e(coachView.s(), coachView.i().e())) {
            LogUtil.e("Suggestion_CoachHandler", "finishOneGroup acquireMotions: isOutOfBounds");
            return;
        }
        if (coachView.p() != null) {
            coachView.p().onMotionReady(coachView.s().get(coachView.i().e()), coachView.i().e());
        }
        coachView.ax();
        coachView.o().voiceGuideRest();
        coachView.b(motion);
        coachView.i().c(coachView.i().a() + 1);
        coachView.e().saveCurrent(-1);
    }

    private void j(CoachView coachView, Motion motion) {
        if (motion == null) {
            LogUtil.j("Suggestion_CoachHandler", "trainingState currMotion == null");
            return;
        }
        coachView.i().b(191);
        coachView.d(191);
        coachView.a((int) ((coachView.h() + System.currentTimeMillis()) - coachView.u()));
        coachView.v().setText(new SimpleDateFormat("mm:ss").format(Long.valueOf(coachView.y() + ((long) coachView.d()))));
        hiz.d(coachView, motion, hiz.a(coachView, motion));
        int iA = (coachView.i().a() * motion.acquireRepeat()) + coachView.i().d();
        int iAcquireProgress = motion.acquireProgress();
        int i = iA - iAcquireProgress;
        float fB = hit.b(motion, i, coachView.getWeight());
        float fD = hit.d(motion, i, coachView.getWeight());
        if ((!CommonUtil.b(fB) && iAcquireProgress == 0) || fB < 0.0f) {
            LogUtil.a("Suggestion_CoachHandler", "trainingState newProgress:", Integer.valueOf(iA), "progress:", Integer.valueOf(iAcquireProgress), " calCalories:", Float.valueOf(fB), " actionName:", motion.acquireName(), " currentCalories:", Float.valueOf(coachView.getCaloriesConsumeHandler().e()));
        }
        motion.saveProgress(iA);
        coachView.getCaloriesConsumeHandler().a(coachView.getCaloriesConsumeHandler().e() + fB, coachView.getCaloriesConsumeHandler().d() + (fB - fD), CaloriesConsumeHandler.CaloriesSource.COURSE_PRESET);
        b(coachView, motion);
    }

    private void b(CoachView coachView, Motion motion) {
        if (hiz.c(coachView, motion)) {
            sendEmptyMessageDelayed(153, coachView.q());
        } else {
            a(coachView, motion);
        }
    }

    private void a(CoachView coachView, Motion motion) {
        LogUtil.d("Suggestion_CoachHandler", "mActionTrainTime:", Integer.valueOf(coachView.d()), " acquireDuration:", Float.valueOf(motion.acquireDuration()));
        if (coachView.d() <= motion.acquireDuration()) {
            if (!coachView.l()) {
                sendEmptyMessageDelayed(153, coachView.q());
                return;
            } else if (coachView.d() < motion.acquireInterval() * motion.acquireRepeat()) {
                LogUtil.d("Suggestion_CoachHandler", "Paused during action");
                return;
            } else {
                sendEmptyMessage(102);
                return;
            }
        }
        sendEmptyMessage(102);
    }

    private void e(CoachView coachView, Motion motion) {
        if (motion == null) {
            LogUtil.j("Suggestion_CoachHandler", "guideActionFinish currMotion == null");
            return;
        }
        coachView.ay();
        coachView.setCaloreHeartViewsVisibility(0);
        coachView.a(0L);
        LogUtil.a("Suggestion_CoachHandler", "321go completed, start training action, replay video. Action name:", motion.acquireName(), "Action video duration: ", Integer.valueOf(coachView.t().g()), "----motion beat interval time :", Integer.valueOf(motion.acquireInterval()));
        coachView.i().b(191);
        coachView.d(191);
        if (!coachView.k()) {
            hiz.c(coachView, motion, 1);
            coachView.i().a(coachView.i().d() + 1);
        }
        coachView.e(coachView.i().e());
        if (!coachView.l()) {
            coachView.c(System.currentTimeMillis());
            sendEmptyMessage(153);
        } else if (coachView.k()) {
            LogUtil.d("Suggestion_CoachHandler", "Didn't get connection");
        } else {
            coachView.ag();
            coachView.c(System.currentTimeMillis() + 4000);
            sendEmptyMessageDelayed(153, 4000L);
        }
        if (coachView.p() != null) {
            coachView.p().onMotionStart(motion, coachView.i().e());
        }
    }
}
