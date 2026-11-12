package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.xkf;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GuideHelper extends MediaHelper implements VoiceGuideInterface, MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f9311c;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private boolean j;
    private Handler k;
    private int l;
    private OnFitnessStatusChangeCallback m;
    private int n;
    private Motion o;

    /* JADX INFO: loaded from: classes31.dex */
    public interface GuideProgress {
        public static final int COUNTDOWN_0 = 35;
        public static final int COUNTDOWN_1 = 25;
        public static final int COUNTDOWN_2 = 15;
        public static final int COUNTDOWN_3 = 5;
        public static final int EACH_GROUP = 42;
        public static final int FIRST_GROUP = 14;
        public static final int FIRST_MOTION = 0;
        public static final int GROUP = 12;
        public static final int GROUP_NUM = 2;
        public static final int MOTION_NAME = 1;
        public static final int MOTION_POINT = 4;
        public static final int NEXT_GROUP = 8;
        public static final int NEXT_MOTION = 9;
        public static final int REST_END_LAST_MOTION = 27;
        public static final int REST_END_NEXT_GROUP = 7;
        public static final int REST_END_NEXT_MOTION = 17;
        public static final int START_REST = 6;
        public static final int TIMES = 3;
        public static final int TIMES_NUM = 22;

        void guideProgress();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface nextGroup() {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface voiceGuideStop() {
        return this;
    }

    public void e(int i) {
        this.f = i;
    }

    public void e(boolean z) {
        this.h = z;
    }

    public Handler c() {
        return this.k;
    }

    public Motion a() {
        return this.o;
    }

    public void b(Motion motion) {
        this.o = motion;
    }

    private GuideHelper(Context context) {
        super(context);
        this.f = 0;
        this.i = -1;
        this.f9311c = new ArrayList<>(10);
        this.f9310b = new ArrayList(4);
        this.j = true;
        b(false);
        this.e.setLooping(false);
        this.e.setAudioStreamType(3);
        w();
    }

    public GuideHelper(Context context, Handler handler) {
        this(context);
        this.k = handler;
        this.e.setOnCompletionListener(this);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface setSdSources(String... strArr) {
        super.setSdSources(strArr);
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface voiceGuidePause() {
        this.h = true;
        LogUtil.d("Suggestion_GuiderHelper", "VoiceGuideInterface deviceGuidePause");
        try {
            if (this.e != null && this.e.isPlaying()) {
                this.e.pause();
                this.j = true;
                return this;
            }
            LogUtil.j("Suggestion_GuiderHelper", "Pause fail，is not playing");
            this.j = false;
            return this;
        } catch (IllegalStateException e) {
            this.j = false;
            ReleaseLogUtil.e("Suggestion_GuiderHelper", "voiceGuidePause exception: ", ExceptionUtils.c(e));
            return this;
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface voiceGuideContinue() {
        if (this.h) {
            this.h = false;
            LogUtil.d("Suggestion_GuiderHelper", "VoiceGuideInterface continue");
            if (this.e != null && this.j) {
                this.e.start();
                return this;
            }
            LogUtil.d("Suggestion_GuiderHelper", "Continue to the next guide voice manually");
            onCompletion(this.e);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface firstMotion(Motion motion) {
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "firstMotion motion == null");
            return this;
        }
        LogUtil.d("Suggestion_GuiderHelper", "play first motion");
        this.i = 0;
        this.o = motion;
        setSdSources(xkf.b("E002", this.f9338a, this.d, AudioConstant.AUDIO));
        start();
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface motionName(String str) {
        LogUtil.a("Suggestion_GuiderHelper", "play motion name", Boolean.valueOf(TextUtils.isEmpty(str)));
        String strC = StringUtils.c((Object) str);
        this.i = 1;
        if (this.e != null) {
            if (c(strC)) {
                setSdSources(strC);
            } else {
                setSdSources(strC + this.f9338a + AudioConstant.AUDIO);
            }
            start();
        }
        return this;
    }

    private boolean c(String str) {
        return str.endsWith("m4a") || str.endsWith("aac") || str.endsWith("mp3");
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface groupRepeats(int i, int i2) {
        this.i = 2;
        LogUtil.a("Suggestion_GuiderHelper", "play groupNumber and times");
        if (this.e != null) {
            e(i, i2);
        }
        return this;
    }

    private void e(int i, int i2) {
        ArrayList arrayList = new ArrayList(5);
        b(i, arrayList);
        if (i > 1) {
            arrayList.add(xkf.b("E021", this.f9338a, this.d, AudioConstant.AUDIO));
        }
        e(i2, arrayList);
        this.g = arrayList.size();
        if (i > 1) {
            arrayList.add(xkf.b("B145", this.f9338a, this.d, AudioConstant.AUDIO));
        }
        c(arrayList);
        LogUtil.a("Suggestion_GuiderHelper", "playerNotNull", arrayList);
        start();
    }

    private void e(int i, List<String> list) {
        list.addAll(d(i));
        a(list);
    }

    private void a(List<String> list) {
        Motion motion = this.o;
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "addUnitPath mMotion == null");
        } else if (!"timer".equals(motion.acquireMotionType())) {
            list.add(xkf.b("C030", this.f9338a, this.d, AudioConstant.AUDIO));
        } else {
            list.add(xkf.b("C003", this.f9338a, this.d, AudioConstant.AUDIO));
        }
    }

    private void b(int i, List<String> list) {
        if (Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8").contains(String.valueOf(i))) {
            list.add(xkf.b("B" + (i + 152), this.f9338a, this.d, AudioConstant.AUDIO));
        } else {
            list.addAll(d(i));
            list.add(xkf.b("C001", this.f9338a, this.d, AudioConstant.AUDIO));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface motionPoint(String str) {
        LogUtil.a("Suggestion_GuiderHelper", "play motionPoint");
        if (this.e != null) {
            setSdSources(str);
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface countdownGo() {
        this.i = 5;
        LogUtil.d("Suggestion_GuiderHelper", "play 321GO");
        if (this.e != null) {
            c(this.f9310b);
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface voiceGuideRest() {
        LogUtil.a("Suggestion_GuiderHelper", "play take a rest");
        this.i = 6;
        if (this.e != null) {
            setSdSources(xkf.b("E008", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface restEnd(int i) {
        LogUtil.a("Suggestion_GuiderHelper", "play rest end, next motion");
        this.l = 0;
        this.n = 1;
        this.i = 7;
        if (this.e != null) {
            if (i < this.f9311c.size()) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(xkf.b("E009", this.f9338a, this.d, AudioConstant.AUDIO));
                arrayList.add(this.f9311c.get(i));
                this.l = arrayList.size();
                c(arrayList);
                start();
                return this;
            }
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(xkf.b("E009", this.f9338a, this.d, AudioConstant.AUDIO));
            arrayList2.add(xkf.b("E022", this.f9338a, this.d, AudioConstant.AUDIO));
            arrayList2.addAll(d(i));
            arrayList2.add(xkf.b("C001", this.f9338a, this.d, AudioConstant.AUDIO));
            this.l = arrayList2.size();
            c(arrayList2);
            start();
        }
        return this;
    }

    public VoiceGuideInterface d(boolean z, Motion motion) {
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "restEnd motion == null");
            return this;
        }
        LogUtil.a("Suggestion_GuiderHelper", "play rest end, next motion");
        if (z) {
            this.i = 17;
        } else {
            this.i = 27;
        }
        this.o = motion;
        if (this.e != null) {
            setSdSources(xkf.b("E009", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface nextMotion(Motion motion) {
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "nextMotion motion == null");
            return this;
        }
        this.h = false;
        LogUtil.d("Suggestion_GuiderHelper", "play next motion");
        this.i = 9;
        if (this.e != null) {
            this.o = motion;
            setSdSources(xkf.b("E019", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface preMotion(Motion motion) {
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "preMotion motion == null");
            return this;
        }
        this.h = false;
        LogUtil.d("Suggestion_GuiderHelper", "play pre motion");
        this.i = 9;
        if (this.e != null) {
            this.o = motion;
            setSdSources(xkf.b("E205", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface lastMotion(Motion motion) {
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "lastMotion motion == null");
            return this;
        }
        LogUtil.a("Suggestion_GuiderHelper", "play last motion");
        this.i = 9;
        if (this.e != null) {
            this.o = motion;
            setSdSources(xkf.b("E065", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface wellDone() {
        LogUtil.d("Suggestion_GuiderHelper", "play VoiceGuideInterface wellDone");
        this.i = -1;
        if (this.e != null) {
            this.f = 1;
            this.k.sendEmptyMessage(104);
            setSdSources(xkf.b("E068", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface lastGroup() {
        LogUtil.d("Suggestion_GuiderHelper", "play lastGroup");
        this.i = 8;
        if (this.e != null) {
            setSdSources(xkf.b("E070", this.f9338a, this.d, AudioConstant.AUDIO));
            start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.VoiceGuideInterface
    public VoiceGuideInterface customGuide(String str) {
        LogUtil.d("Suggestion_GuiderHelper", "play guide");
        this.i = -1;
        if (this.e != null) {
            setSdSources(str);
            start();
        }
        return this;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        LogUtil.a("Suggestion_GuiderHelper", "-------onCompletion---------");
        if (!this.h) {
            d();
        } else {
            this.j = false;
        }
        if (this.f == 1) {
            LogUtil.a("Suggestion_GuiderHelper", "send msg: Congratulations! Train completed");
            this.k.sendEmptyMessage(103);
            this.f = 0;
            OnFitnessStatusChangeCallback onFitnessStatusChangeCallback = this.m;
            if (onFitnessStatusChangeCallback != null) {
                onFitnessStatusChangeCallback.onUpdate();
                this.m = null;
            }
        }
    }

    public void d() {
        Motion motion = this.o;
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "doComplete mMotion == null");
            return;
        }
        int i = this.i;
        if (i == 0) {
            motionName(motion.acquireNamePath());
            this.k.sendEmptyMessage(154);
        } else if (i == 1) {
            groupRepeats(motion.acquireGroups(), this.o.acquireRepeat());
        } else {
            v();
        }
    }

    private void v() {
        this.g--;
        if (this.i == 2) {
            ad();
        } else {
            ab();
        }
    }

    private void ab() {
        int i = this.i;
        if (i == 12) {
            this.i = 42;
            next();
        } else if (i == 42) {
            ac();
        } else {
            z();
        }
    }

    private void z() {
        int i = this.i;
        if (i == 22) {
            if (this.g <= 1) {
                this.i = 3;
            }
            next();
        } else if (i == 3) {
            aa();
        } else {
            x();
        }
    }

    private void x() {
        int i = this.i;
        if (i == 4) {
            LogUtil.d("Suggestion_GuiderHelper", "motion point finish");
            this.k.sendEmptyMessage(3);
            countdownGo();
            LogUtil.d("Suggestion_GuiderHelper", "321 go start");
            return;
        }
        if (i == 14) {
            this.k.sendEmptyMessage(3);
            countdownGo();
            LogUtil.d("Suggestion_GuiderHelper", "321 go start");
            return;
        }
        b();
    }

    private void b() {
        int i = this.i;
        if (i == 5) {
            this.k.sendEmptyMessage(2);
            this.i = 15;
            next();
        } else if (i == 15) {
            this.k.sendEmptyMessage(1);
            this.i = 25;
            next();
        } else {
            if (i == 25) {
                this.k.sendEmptyMessage(0);
                this.i = 35;
                next();
                return;
            }
            t();
        }
    }

    private void t() {
        int i = this.i;
        if (i == 35) {
            this.k.sendEmptyMessage(101);
            LogUtil.d("Suggestion_GuiderHelper", "countdown finish");
            this.i = -1;
        } else if (i == 7) {
            ae();
        } else {
            ag();
        }
    }

    private void aa() {
        Motion motion = this.o;
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "progressTimes mMotion == null");
        } else if (!motion.acquireMotionType().equals("hotbody")) {
            y();
        } else {
            this.i = 4;
            motionPoint(this.o.acquireTrainPointPath());
        }
    }

    private void y() {
        Motion motion = this.o;
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "doTypeWhole mMotion == null");
            return;
        }
        if (motion.acquireGroups() > 1) {
            this.i = 14;
            next();
        } else {
            this.k.sendEmptyMessage(3);
            LogUtil.d("Suggestion_GuiderHelper", "doTypeWhole 321 go start");
            countdownGo();
        }
    }

    private void ac() {
        u();
        next();
    }

    private void ad() {
        Motion motion = this.o;
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "progressGroup mMotion == null");
            return;
        }
        if (motion.acquireGroups() > 8) {
            this.i = 12;
        } else if (this.o.acquireGroups() == 1) {
            u();
        } else {
            this.i = 42;
        }
        next();
    }

    private void u() {
        this.i = 22;
    }

    private void ae() {
        int i = this.n;
        this.n = i + 1;
        if (i < this.l) {
            next();
        } else {
            this.n = 1;
            countdownGo();
        }
    }

    private void ag() {
        Motion motion = this.o;
        if (motion == null) {
            LogUtil.e("Suggestion_GuiderHelper", "restEndMsg mMotion == null");
            return;
        }
        int i = this.i;
        if (i == 17) {
            nextMotion(motion);
            return;
        }
        if (i == 27) {
            lastMotion(motion);
        } else if (i == 9) {
            motionName(motion.acquireNamePath());
            this.k.sendEmptyMessage(154);
        }
    }

    private void w() {
        this.f9310b.clear();
        this.f9310b.add(xkf.b("B180", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9310b.add(xkf.b("B181", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9310b.add(xkf.b("B182", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9310b.add(xkf.b("D001", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.clear();
        this.f9311c.add(xkf.b("B145", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B146", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B147", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B148", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B149", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B150", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B151", this.f9338a, this.d, AudioConstant.AUDIO));
        this.f9311c.add(xkf.b("B152", this.f9338a, this.d, AudioConstant.AUDIO));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.MediaHelper
    public void c(int i) {
        super.c(i);
        w();
    }

    public void a(OnFitnessStatusChangeCallback onFitnessStatusChangeCallback) {
        this.m = onFitnessStatusChangeCallback;
    }

    public int e() {
        return this.f;
    }
}
