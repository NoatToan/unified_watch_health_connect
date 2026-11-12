package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.suggestion.ui.fitness.helper.FitnessRunAudioScenarioId;
import com.huawei.health.suggestion.ui.fitness.helper.GuideHelper;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hki extends GuideHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Motion f36842c;
    private List<String> h;
    private int j;

    public hki(Context context, Handler handler) {
        super(context, handler);
        this.h = new ArrayList(16);
        this.f36841b = -1;
        this.j = 0;
        pqj.b().init(pqp.c(pqj.e(), pqj.b().d(pqj.e()), SingleDailyMomentContent.COURSE_TYPE, BaseApplication.getContext().getResources().getConfiguration().locale));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface firstMotion(Motion motion) {
        return e(9, motion, 1);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface nextMotion(Motion motion) {
        e(false);
        return e(9, motion, 2);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface preMotion(Motion motion) {
        e(false);
        return e(9, motion, 3);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface lastMotion(Motion motion) {
        return e(9, motion, 4);
    }

    private VoiceGuideInterface e(int i, Motion motion, int i2) {
        Motion motion2 = this.f36842c;
        if (motion2 != null && TextUtils.equals(motion2.acquireId(), motion.acquireId())) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "changeAction() motion is same");
            return this;
        }
        if (motion == null || this.e == null) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "changeAction() motion or mPlayer is null");
            return this;
        }
        this.f36841b = i;
        b(motion);
        e(j(i2), motion);
        return this;
    }

    private FitnessRunAudioScenarioId j(int i) {
        if (!"timer".equals(a().acquireMotionType())) {
            return g(i);
        }
        return a(i);
    }

    private FitnessRunAudioScenarioId g(int i) {
        if (i == 1) {
            return FitnessRunAudioScenarioId.FIRST_ACTION_TIME;
        }
        if (i == 2) {
            return FitnessRunAudioScenarioId.NEXT_ACTION_TIME;
        }
        if (i == 3) {
            return FitnessRunAudioScenarioId.PRE_ACTION_TIME;
        }
        if (i == 4) {
            return FitnessRunAudioScenarioId.LAST_ACTION_TIME;
        }
        LogUtil.j("Suggestion_MultilingualGuideHelper", "getActionTimeScenarioId() changeType:", Integer.valueOf(i));
        return null;
    }

    private FitnessRunAudioScenarioId a(int i) {
        if (i == 1) {
            return FitnessRunAudioScenarioId.FIRST_ACTION_SEC;
        }
        if (i == 2) {
            return FitnessRunAudioScenarioId.NEXT_ACTION_SEC;
        }
        if (i == 3) {
            return FitnessRunAudioScenarioId.PRE_ACTION_SEC;
        }
        if (i == 4) {
            return FitnessRunAudioScenarioId.LAST_ACTION_SEC;
        }
        LogUtil.j("Suggestion_MultilingualGuideHelper", "getActionSecScenarioId() changeType:", Integer.valueOf(i));
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface voiceGuideRest() {
        if (this.e != null) {
            this.f36841b = 6;
            b(FitnessRunAudioScenarioId.TAKE_A_BREAK);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface restEnd(int i) {
        if (this.e != null) {
            this.f36841b = 17;
            b(FitnessRunAudioScenarioId.BREAK_OVER);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper
    public VoiceGuideInterface d(boolean z, Motion motion) {
        if (motion == null) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "restEnd() motion is null");
            return this;
        }
        if (z) {
            this.f36841b = 17;
        } else {
            this.f36841b = 27;
        }
        b(motion);
        if (this.e != null) {
            b(FitnessRunAudioScenarioId.BREAK_OVER);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface wellDone() {
        this.f36841b = -1;
        if (this.e != null) {
            e(1);
            c().sendEmptyMessage(104);
            b(FitnessRunAudioScenarioId.CONGRATULATE_COMPLETE_TRAIN);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.GuideHelper
    public void d() {
        LogUtil.d("Suggestion_MultilingualGuideHelper", "doComplete()", a().acquireName());
        this.j++;
        int i = this.f36841b;
        if (i == 0 || i == 9) {
            t();
        }
        if (this.j == this.h.size()) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "doComplete() action node");
            b();
        } else if (!njy.c(this.h, this.j)) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "doComplete() mVoiceList out bounds");
        } else {
            setSdSources(this.h.get(this.j));
            start();
        }
    }

    private void t() {
        LogUtil.a("Suggestion_MultilingualGuideHelper", "countDownHandler:", Integer.valueOf(this.j));
        if (this.j == f(4) - 1) {
            c().sendEmptyMessage(3);
            return;
        }
        if (this.j == f(3) - 1) {
            c().sendEmptyMessage(2);
            return;
        }
        if (this.j == f(2) - 1) {
            c().sendEmptyMessage(1);
        } else if (this.j == f(1) - 1) {
            c().sendEmptyMessage(0);
        } else {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "countDownHandler() default", Integer.valueOf(this.j));
        }
    }

    private int f(int i) {
        List<String> list = this.h;
        int i2 = 0;
        if (list == null || list.size() < i) {
            return 0;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            if (this.h.get(size) != null && !this.h.get(size).endsWith("empty.mp3")) {
                i2++;
            }
            if (i2 == i) {
                LogUtil.a("Suggestion_MultilingualGuideHelper", "getNonEmptyIndex:", Integer.valueOf(size), " num:", Integer.valueOf(i));
                return size;
            }
        }
        return this.h.size() - 1;
    }

    private void b() {
        int i = this.f36841b;
        if (i == 0 || i == 9) {
            this.f36841b = -1;
            this.j = 0;
            this.h.clear();
            c().sendEmptyMessage(101);
            return;
        }
        if (i == 17) {
            nextMotion(a());
        } else if (i == 27) {
            lastMotion(a());
        } else {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "actionNode() mCurrentMultilingualProgress:", Integer.valueOf(i));
        }
    }

    private void b(FitnessRunAudioScenarioId fitnessRunAudioScenarioId) {
        if (fitnessRunAudioScenarioId == null) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "playVoicesPath() scenarioId is null");
            return;
        }
        pqk pqkVar = new pqk();
        this.j = 0;
        this.h.clear();
        this.h.addAll(pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar));
        if (njy.e(this.h)) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "playSingleVoicePath() mVoiceList is null");
        } else {
            setSdSources(this.h.get(0));
            start();
        }
    }

    private void e(FitnessRunAudioScenarioId fitnessRunAudioScenarioId, Motion motion) {
        if (fitnessRunAudioScenarioId == null || motion == null) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "playVoicesPath() scenarioId or motion is null");
            return;
        }
        pqk pqkVar = new pqk();
        pqkVar.a(motion.acquireNamePath());
        pqkVar.e(Integer.valueOf(motion.acquireGroups()));
        pqkVar.e(Integer.valueOf(motion.acquireRepeat()));
        this.h.clear();
        this.j = 0;
        this.h.addAll(pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar));
        if (njy.e(this.h) || !njy.c(this.h, this.j)) {
            LogUtil.j("Suggestion_MultilingualGuideHelper", "playVoicesPath() mVoiceList is null or out bounds");
            return;
        }
        LogUtil.a("Suggestion_MultilingualGuideHelper", "playVoicesPath:", fitnessRunAudioScenarioId.getId(), " ", peh.c(this.h));
        setSdSources(this.h.get(this.j));
        start();
    }
}
