package defpackage;

import android.os.Message;
import com.huawei.health.suggestion.ui.fitness.module.LongCoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.util.StaticHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.VideoSegment;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes31.dex */
public class hka extends StaticHandler<LongCoachView> {
    private int d;

    public hka(LongCoachView longCoachView) {
        super(longCoachView);
        this.d = 0;
    }

    @Override // com.huawei.health.suggestion.util.StaticHandler
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void handleMessage(LongCoachView longCoachView, Message message) {
        if (message == null) {
            LogUtil.j("Suggestion_LongCoachHandler", "handleMessage msg == null");
            return;
        }
        if (longCoachView == null || longCoachView.a() == null || longCoachView.a().a() == -100) {
            LogUtil.j("Suggestion_LongCoachHandler", "handleMessage coachView is null");
            return;
        }
        if (message.what == 259 && longCoachView.f() != null) {
            int iJ = longCoachView.f().j();
            int calorieStartTime = longCoachView.getCalorieStartTime();
            longCoachView.az();
            int iG = longCoachView.f().g();
            int iAbs = Math.abs(iJ - this.d);
            longCoachView.b(iJ);
            if (longCoachView.al()) {
                longCoachView.setSeekVideoFinish();
                iAbs = 1000;
            }
            longCoachView.h(iAbs);
            longCoachView.c(iAbs);
            if (iJ >= calorieStartTime * 1000) {
                longCoachView.b(iAbs, iG);
            }
            this.d = iJ;
            if (iJ > 0) {
                longCoachView.getLongMediaProgress().setProgress(iJ);
                longCoachView.r().setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(iJ)));
            }
            sendEmptyMessageDelayed(259, 1000L);
            if (iG != 0 && longCoachView.getLongExplanationVideoWatchTime() / (iG * 1.0f) > 0.3f) {
                longCoachView.c(true);
            }
        }
        if (message.what == 10001) {
            longCoachView.aa();
            LogUtil.a("Suggestion_LongCoachHandler", "handleMessage closeImgAction");
        } else {
            a(longCoachView, message);
        }
    }

    private void a(LongCoachView longCoachView, Message message) {
        if (message == null) {
            LogUtil.j("Suggestion_LongCoachHandler", "checkCoachMotion msg == null");
            return;
        }
        if (longCoachView == null || longCoachView.a() == null) {
            LogUtil.j("Suggestion_LongCoachHandler", "checkCoachMotion coachView is null");
            return;
        }
        if (longCoachView.l() != null) {
            int iC = longCoachView.a().c();
            if (njy.e(longCoachView.l(), iC)) {
                LogUtil.j("Suggestion_LongCoachHandler", "coachView.acquireCoachState().acquireCurrMotion() is out of Bounds");
                return;
            }
            Motion motion = longCoachView.l().get(iC);
            if (motion != null) {
                d(longCoachView, message, motion);
            }
        }
    }

    private void d(LongCoachView longCoachView, Message message, Motion motion) {
        int i = message.what;
        if (i != 251) {
            if (i == 257) {
                longCoachView.p();
                if (longCoachView.h() != null) {
                    longCoachView.h().onMotionOver(motion, longCoachView.a().c());
                }
                hke.d(longCoachView, motion);
                longCoachView.c().setVisibility(8);
                return;
            }
            if (i != 259) {
                LogUtil.j("Suggestion_LongCoachHandler", "MediaWhat unexpected");
                return;
            }
        }
        if (longCoachView.f() != null) {
            int iJ = longCoachView.f().j();
            d(longCoachView, motion, iJ);
            longCoachView.getLongMediaProgress().setProgress(iJ);
            longCoachView.c().setIsShowBottomProgress(true);
        }
    }

    private void d(LongCoachView longCoachView, Motion motion, int i) {
        if (longCoachView == null || motion == null) {
            LogUtil.j("Suggestion_LongCoachHandler", "coachView or currMotion is null");
            return;
        }
        if (njy.e(longCoachView.getVideoSegments(), 0)) {
            LogUtil.j("Suggestion_LongCoachHandler", "getVideoSegments is empty");
            return;
        }
        if (longCoachView.getVideoSegments().get(0) == null) {
            LogUtil.j("Suggestion_LongCoachHandler", "VideoSegment is null");
        } else if (i >= ((int) longCoachView.getVideoSegments().get(0).getStartTime())) {
            a(longCoachView, motion, i);
        } else {
            sendEmptyMessage(251);
        }
    }

    private void a(LongCoachView longCoachView, Motion motion, int i) {
        if (motion == null) {
            LogUtil.j("Suggestion_LongCoachHandler", "handleTrainingState currMotion == null");
            return;
        }
        longCoachView.a().a(251);
        longCoachView.i(251);
        int iC = longCoachView.a().c();
        if (njy.e(longCoachView.getVideoSegments(), iC)) {
            LogUtil.j("Suggestion_LongCoachHandler", "getVideoSegments is OutOfBounds");
            return;
        }
        VideoSegment videoSegment = longCoachView.getVideoSegments().get(iC);
        if (videoSegment == null) {
            return;
        }
        long endTime = videoSegment.getEndTime();
        hkb.d(longCoachView, motion);
        if (i >= endTime) {
            removeMessages(251);
            longCoachView.u();
        } else {
            sendEmptyMessage(251);
        }
    }
}
