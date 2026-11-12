package defpackage;

import android.media.MediaPlayer;
import android.os.Handler;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.health.suggestion.ui.fitness.module.CoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hiz {
    private static void e(CoachView coachView, MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            LogUtil.e("Suggestion_CoachViewHelper", "player == null");
            return;
        }
        if (mediaPlayer.isPlaying()) {
            coachView.e().b(coachView.ac() * 0.0f);
            coachView.setTag(true);
            LogUtil.a("Suggestion_CoachViewHelper", "Playing guide voice, playing beat, reduce beat voice volume");
        } else if ((coachView.getTag() instanceof Boolean) && ((Boolean) coachView.getTag()).booleanValue()) {
            coachView.e().b(coachView.ac());
            LogUtil.a("Suggestion_CoachViewHelper", "restore beat voice volume");
            coachView.setTag(false);
        }
    }

    public static void d(CoachView coachView, Motion motion, int i) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "tempBeatAction coachView == null || currMotion == null");
            return;
        }
        if (i <= motion.acquireRepeat()) {
            if (!"hotbody".equals(motion.acquireMotionType())) {
                a(coachView, coachView.d() / 1000);
                c(coachView, motion, i);
            }
            coachView.i().a(i);
            hjg.a(coachView, motion);
            return;
        }
        if (i != motion.acquireRepeat() + 1 || !coachView.l()) {
            LogUtil.d("Suggestion_CoachViewHelper", "tempBeat unexpected");
        } else {
            coachView.i().a(i);
        }
    }

    public static int a(CoachView coachView, Motion motion) {
        if (coachView == null || motion == null || motion.acquireInterval() == 0) {
            return 0;
        }
        if ("timer".equals(motion.acquireMotionType())) {
            return coachView.d() / motion.acquireInterval();
        }
        return (coachView.d() / motion.acquireInterval()) + 1;
    }

    private static void a(CoachView coachView, Motion motion, int i) {
        if ("timer".equals(motion.acquireMotionType())) {
            b(coachView, motion, i);
        } else {
            e(coachView, coachView.o().s());
            b(coachView);
        }
    }

    private static void b(CoachView coachView) {
        coachView.e().nextBeat();
    }

    private static void b(CoachView coachView, Motion motion, int i) {
        if (i == motion.acquireRepeat() - 7) {
            LogUtil.a("Suggestion_CoachViewHelper", "Playing hold on for 5 seconds more");
            coachView.e().a();
            return;
        }
        if (i < motion.acquireRepeat() - 6) {
            coachView.e().timer();
            return;
        }
        if (i == motion.acquireRepeat() - 5) {
            LogUtil.a("Suggestion_CoachViewHelper", "Playing last 5 seconds");
            coachView.e().c();
        } else if (i > motion.acquireRepeat() - 5) {
            coachView.e().next();
        } else {
            LogUtil.d("Suggestion_CoachViewHelper", "tempBeat unexpected");
        }
    }

    public static void c(CoachView coachView, Motion motion, int i) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "toBroadcast coachView == null || currMotion == null");
            return;
        }
        if (coachView.i().d() < i) {
            LogUtil.d("Suggestion_CoachViewHelper", "Telling beat number: ", Long.valueOf(System.currentTimeMillis()));
            LogUtil.d("Suggestion_CoachViewHelper", "ActionTrainTime:", Integer.valueOf(coachView.d()), "-----currbeat:", Integer.valueOf(coachView.i().d()), "---motionInverval:", Integer.valueOf(motion.acquireInterval()), "----clipTime", Long.valueOf(coachView.h()), " sec:", Integer.valueOf(coachView.d() / 1000));
            a(coachView, motion, i);
        }
    }

    public static boolean c(CoachView coachView, Motion motion) {
        if (coachView != null && motion != null) {
            return "hotbody".equals(motion.acquireMotionType()) && coachView.e().o();
        }
        LogUtil.j("Suggestion_CoachViewHelper", "checkIsplaying coachView == null || currMotion == null");
        return false;
    }

    private static void a(CoachView coachView, int i) {
        if (i != coachView.a()) {
            coachView.b(i);
            if (e(coachView)) {
                LogUtil.a("Suggestion_CoachViewHelper", "Playing guide voice base on the current seconds-time: ", Integer.valueOf(i));
                e(coachView, coachView.o().s());
                coachView.o().next();
            }
        }
    }

    private static boolean e(CoachView coachView) {
        return gzx.e(coachView, coachView.o(), coachView.o().s()) && coachView.g().contains(Integer.valueOf(coachView.a())) && !coachView.o().o();
    }

    public static void a(CoachView coachView, int i, int i2) {
        if (coachView == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "needChangeProgress coachView == null");
            return;
        }
        if (i2 == R.id.sug_coach_set_pb_count) {
            float f = (i * 1.0f) / 1000.0f;
            coachView.e().b(f);
            coachView.b(f);
            coachView.ad().b(f);
            coachView.ad().playBeatNum(1);
            return;
        }
        if (i2 == R.id.sug_coach_set_pb_guide) {
            float f2 = (i * 1.0f) / 1000.0f;
            coachView.o().b(f2);
            coachView.ad().b(f2);
            coachView.ad().c(AudioConstant.GUIDE_VOLUME_CHANGE_HINT_CODE);
            return;
        }
        coachView.b().b((i * 0.5f) / 1000.0f);
    }

    public static void c(MediaHelper mediaHelper, boolean z, float f) {
        if (mediaHelper == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "setVoice mediaHelper == null");
        } else if (z) {
            mediaHelper.b(f);
        } else {
            mediaHelper.b(0.0f);
        }
    }

    public static boolean d(CoachView coachView) {
        return (coachView == null || coachView.o() == null || coachView.t() == null) ? false : true;
    }

    public static void e(CoachView coachView, Handler handler) {
        if (coachView == null || handler == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "doContinue coachView == null || handler == null");
            return;
        }
        coachView.t().videoContinue();
        if (coachView.i().b() == 193) {
            coachView.f().b().b();
            coachView.b().videoContinue();
            return;
        }
        if (coachView.i().b() == 191) {
            if (coachView.l() && !coachView.k()) {
                coachView.ag();
                coachView.c(System.currentTimeMillis() + 4000);
                handler.sendEmptyMessageDelayed(153, 4000L);
            } else if (coachView.l()) {
                LogUtil.d("Suggestion_CoachViewHelper", "Unexpected continue situation");
            } else {
                coachView.c(System.currentTimeMillis());
                handler.sendEmptyMessage(153);
            }
            coachView.e().d();
            coachView.o().voiceGuideContinue();
            coachView.b().videoContinue();
            return;
        }
        if (coachView.i().b() == 190) {
            coachView.o().voiceGuideContinue();
            coachView.b().videoContinue();
        } else {
            coachView.b().videoContinue();
        }
    }

    public static void d(CoachView coachView, Handler handler) {
        if (coachView == null || handler == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "isBeating coachView == null || handler == null");
            return;
        }
        if (gzx.e(coachView.e().s(), coachView.o().s())) {
            if (coachView.i().b() == 191) {
                coachView.e().n();
                handler.removeMessages(153);
            } else if (coachView.i().b() != 190) {
                LogUtil.d("Suggestion_CoachViewHelper", "Coach station is not BEATING or GUIDING");
            } else {
                coachView.o().n();
            }
        }
    }

    public static void d(CoachView coachView, Motion motion) {
        if (coachView == null || motion == null) {
            LogUtil.j("Suggestion_CoachViewHelper", "onChangeListener coachView == null || finishMotion == null");
        } else if (coachView.p() != null) {
            coachView.p().onMotionChanged(motion, coachView.i().e());
        }
    }

    public static float d(Motion motion, int i) {
        if (CommonUtil.b(motion.getTotalBeats())) {
            return 0.0f;
        }
        float totalBeats = (i * 1.0f) / motion.getTotalBeats();
        if (totalBeats > 1.0f) {
            return 1.0f;
        }
        return totalBeats;
    }
}
