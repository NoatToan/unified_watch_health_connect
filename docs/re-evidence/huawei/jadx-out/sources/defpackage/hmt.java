package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.fitness.helper.ActionDetailAdapter;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener;
import com.huawei.health.suggestion.ui.fitness.module.TrainActionIntro;
import com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LongVideoInfo;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hmt implements View.OnClickListener, ActionDetailAdapter.ActionDetailViewClickEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CourseDetailProvider f36922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f36923c;
    private Context d;
    private ActionDetailAdapter e;
    private TrainActionIntro f;
    private TranslateAnimation g;
    private d i;
    private TranslateAnimation m;
    private List h = new ArrayList();
    private List<Motion> j = new ArrayList();

    @Override // com.huawei.health.suggestion.ui.fitness.helper.ActionDetailAdapter.ActionDetailViewClickEvent
    public void onCloseImageClick() {
    }

    public hmt(Context context, TrainActionIntro trainActionIntro, View view, CourseDetailProvider courseDetailProvider) {
        this.d = context;
        this.f = trainActionIntro;
        BaseActivity.setViewSafeRegion(false, trainActionIntro);
        this.f36923c = view;
        this.f36922b = courseDetailProvider;
        q();
        j();
    }

    public void b(int i, List<Motion> list) {
        this.f36921a = i;
        if (list != null) {
            this.j = list;
        }
        if (this.f36922b.isLongVideoCourse()) {
            this.e.c(true);
            this.f36922b.getLongVideo(i, new b(this, i));
        }
        a(i, (String) null);
        b(true);
    }

    public void b() {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            actionDetailAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        int i2 = this.f36921a;
        if (i != i2) {
            ReleaseLogUtil.e("Suggestion_CourseActionIntroViewHolder", "refreshUi failed with error postion ", Integer.valueOf(i), " mCurrPosition ", Integer.valueOf(i2));
            return;
        }
        this.f.e(i2 + 1, this.j.size());
        if (!TextUtils.isEmpty(str)) {
            this.e.e(str);
        }
        b(this.f);
        m();
        c(this.f36921a);
        e(this.f36921a);
    }

    private void q() {
        ReleaseLogUtil.d("Suggestion_CourseActionIntroViewHolder", "setTrainViewClick enter");
        if (this.f == null) {
            return;
        }
        n();
        this.f.getPreAction().setOnClickListener(this);
        this.f.getNextAction().setOnClickListener(this);
        this.f.setOnSlidingListener(new OnSlidingListener() { // from class: hmt.4
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSliding(float f) {
                hmt.this.f36923c.setVisibility(0);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSlidingFinish(boolean z) {
                if (z) {
                    hmt.this.f.setVisibility(4);
                    hmt.this.f36923c.setVisibility(0);
                    if (hmt.this.e != null) {
                        hmt.this.e.d();
                        return;
                    }
                    return;
                }
                hmt.this.f.setVisibility(0);
                hmt.this.f36923c.setVisibility(8);
            }
        });
    }

    private void j() {
        ActionDetailAdapter actionDetailAdapter = new ActionDetailAdapter(this.h);
        this.e = actionDetailAdapter;
        actionDetailAdapter.e(this);
        this.e.b(false);
        this.f.setAdapter(this.e);
    }

    private void n() {
        if (this.f.getTitleBar() == null) {
            return;
        }
        this.f.getTitleBar().setVisibility(0);
        this.f.getTitleBar().setLeftButtonOnClickListener(new View.OnClickListener() { // from class: hmt.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hmt hmtVar = hmt.this;
                hmtVar.a(hmtVar.f);
            }
        });
    }

    private void b(boolean z) {
        Context context = this.d;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.getWindow() == null) {
                LogUtil.j("Suggestion_CourseActionIntroViewHolder", "keepScreenOnControl() activity is isFinishing or getWindow() is null");
            } else if (z) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        }
    }

    public void a(final View view) {
        b(false);
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            actionDetailAdapter.d();
        }
        TranslateAnimation translateAnimation = this.g;
        if (translateAnimation == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            this.g = translateAnimation2;
            translateAnimation2.setDuration(400L);
            this.g.setInterpolator(new DecelerateInterpolator());
            this.g.setAnimationListener(new Animation.AnimationListener() { // from class: hmt.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    hmt.this.f36923c.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(4);
                }
            });
        } else if (!translateAnimation.hasEnded()) {
            return;
        }
        view.startAnimation(this.g);
    }

    private int h() {
        return this.j.size();
    }

    public void b(final View view) {
        if (this.m == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.m = translateAnimation;
            translateAnimation.setDuration(400L);
            this.m.setInterpolator(new DecelerateInterpolator());
            this.m.setAnimationListener(new Animation.AnimationListener() { // from class: hmt.5
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    view.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    LogUtil.a("Suggestion_CourseActionIntroViewHolder", "onAnimationEnd");
                    hmt.this.f36923c.setVisibility(8);
                }
            });
        }
        view.startAnimation(this.m);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.sug_coach_iv_action_pre) {
            if (this.f36922b.isLongVideoCourse()) {
                i();
                return;
            } else {
                o();
                return;
            }
        }
        if (id == R.id.sug_coach_iv_action_nex) {
            if (this.f36922b.isLongVideoCourse()) {
                l();
            } else {
                k();
            }
        }
    }

    private void o() {
        this.f36921a--;
        d dVar = this.i;
        if (dVar != null) {
            dVar.d(true);
        }
        if (this.f36921a >= 0) {
            m();
            this.f.setCurrentIndex(this.f36921a + 1);
            c(this.f36921a);
            e(this.f36921a);
            return;
        }
        this.f36921a = 0;
    }

    private void k() {
        this.f36921a++;
        d dVar = this.i;
        if (dVar != null) {
            dVar.d(true);
        }
        if (this.f36921a < h()) {
            m();
            this.f.setCurrentIndex(this.f36921a + 1);
            c(this.f36921a);
            e(this.f36921a);
            return;
        }
        this.f36921a = h() - 1;
    }

    private void m() {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter == null || actionDetailAdapter.e() == null) {
            return;
        }
        this.e.e().refreshHeaderView(4);
    }

    private void c(int i) {
        List<Motion> list = this.j;
        if (list == null || i < 0 || i >= list.size()) {
            LogUtil.j("Suggestion_CourseActionIntroViewHolder", "refreshMotionIntro, position index out of bound");
            return;
        }
        Motion motion = this.j.get(i);
        this.h.clear();
        this.h.add(motion);
        if (motion.acquireCovers() != null) {
            this.h.add(motion.acquireCovers());
        }
        if (g()) {
            return;
        }
        b(i);
    }

    private void e(int i) {
        if (i == 0) {
            this.f.getPreAction().setVisibility(4);
            this.f.getNextAction().setVisibility(0);
        } else if (i == this.j.size() - 1) {
            this.f.getPreAction().setVisibility(0);
            this.f.getNextAction().setVisibility(4);
        } else {
            this.f.getPreAction().setVisibility(0);
            this.f.getNextAction().setVisibility(0);
        }
    }

    private boolean g() {
        ActionDetailAdapter actionDetailAdapter;
        boolean zIsCurActionResourceDownload = this.f36922b.isCurActionResourceDownload(this.f36921a);
        LogUtil.a("Suggestion_CourseActionIntroViewHolder", "isHasDownLoaded:", Boolean.valueOf(zIsCurActionResourceDownload));
        if (zIsCurActionResourceDownload && (actionDetailAdapter = this.e) != null) {
            actionDetailAdapter.b(true);
            this.e.notifyDataSetChanged();
            this.e.e().refreshHeaderView(3);
        }
        return zIsCurActionResourceDownload;
    }

    private void b(int i) {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter == null) {
            return;
        }
        actionDetailAdapter.b(false);
        this.e.notifyDataSetChanged();
        if (CommonUtil.ah(BaseApplication.getContext())) {
            LogUtil.a("Suggestion_CourseActionIntroViewHolder", "NETWORK_TYPE_INVALID");
            if (this.e.e() != null) {
                this.e.e().refreshHeaderView(1);
            }
            this.e.d(gzx.c(BaseApplication.getContext(), com.huawei.ui.commonui.R.string.IDS_device_upgrade_file_size_mb, UnitUtil.e((this.f36922b.getCourseActionMediaSize(i) * 1.0f) / 1048576.0f, 1, 1)));
        } else {
            LogUtil.a("Suggestion_CourseActionIntroViewHolder", "wifi");
            if (this.e.e() != null) {
                this.e.e().refreshHeaderView(0);
            }
            d(i);
        }
        this.e.b(i);
    }

    private void d(int i) {
        LogUtil.a("Suggestion_CourseActionIntroViewHolder", "position:", Integer.valueOf(i));
        d dVar = this.i;
        if (dVar == null || i != dVar.c() || this.i.isCanceled()) {
            ActionDetailAdapter actionDetailAdapter = this.e;
            if (actionDetailAdapter != null && actionDetailAdapter.e() != null) {
                this.e.e().refreshHeaderView(0);
            }
            this.i = new d(this);
            ActionDetailAdapter actionDetailAdapter2 = this.e;
            if (actionDetailAdapter2 == null || this.f36922b == null) {
                ReleaseLogUtil.e("Suggestion_CourseActionIntroViewHolder", "toDownLoadWorkoutMediaFile: mActionDetailAdapter mMediaFileUiCallBack or mCourseApi is null");
                return;
            }
            actionDetailAdapter2.b(UnitUtil.e(0.0d, 2, 0));
            this.i.b(i);
            this.f36922b.downloadCurActionResource(i, this.i);
        }
    }

    public void c(Configuration configuration) {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter == null || actionDetailAdapter.e() == null) {
            return;
        }
        this.e.e().a();
    }

    public void d() {
        TrainActionIntro trainActionIntro = this.f;
        if (trainActionIntro == null || trainActionIntro.getVisibility() != 0) {
            return;
        }
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            actionDetailAdapter.c();
        }
        m();
        if (g()) {
            return;
        }
        b(this.f36921a);
    }

    private void t() {
        this.e.notifyDataSetChanged();
        this.e.b(-1);
    }

    private void a(int i) {
        if (i < 0 || i >= h()) {
            LogUtil.j("Suggestion_CourseActionIntroViewHolder", "refreshMotionIntro, position index out of bound");
            return;
        }
        Motion motion = this.j.get(i);
        this.h.clear();
        this.h.add(motion);
        if (motion.acquireCovers() != null) {
            this.h.add(motion.acquireCovers());
        }
        t();
    }

    private void l() {
        int i = this.f36921a + 1;
        this.f36921a = i;
        if (i < this.j.size()) {
            this.f.setCurrentIndex(this.f36921a + 1);
            a(this.f36921a);
            e(this.f36921a);
            return;
        }
        this.f36921a = this.j.size() - 1;
    }

    private void i() {
        int i = this.f36921a;
        int i2 = i - 1;
        this.f36921a = i2;
        if (i2 >= 0) {
            this.f.setCurrentIndex(i);
            a(this.f36921a);
            e(this.f36921a);
            return;
        }
        this.f36921a = 0;
    }

    public boolean c() {
        TrainActionIntro trainActionIntro = this.f;
        if (trainActionIntro == null || trainActionIntro.getVisibility() != 0) {
            return false;
        }
        LogUtil.a("Suggestion_CourseActionIntroViewHolder", " onBackPressed success.");
        a(this.f);
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.ActionDetailAdapter.ActionDetailViewClickEvent
    public void onDownLoadClick(int i) {
        if (this.f36922b.isLongVideoCourse()) {
            this.e.e().getVideoPlayerStrategy().initMediaPlayer();
        } else {
            d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            c(actionDetailAdapter);
        }
        this.i.d(true);
        qpx.e(BaseApplication.getContext(), R.string.IDS_FitnessAdvice_video_load_fail);
    }

    private void c(ActionDetailAdapter actionDetailAdapter) {
        if (actionDetailAdapter == null || actionDetailAdapter.e() == null) {
            LogUtil.j("Suggestion_CourseActionIntroViewHolder", "refreshNetWorkStatus, actionDetailAdapter or actionDetailAdapter.getActionDetailView is null");
        } else if (CommonUtil.ah(BaseApplication.getContext())) {
            actionDetailAdapter.e().refreshHeaderView(1);
        } else {
            actionDetailAdapter.e().refreshHeaderView(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            actionDetailAdapter.b(true);
            this.e.notifyDataSetChanged();
        }
        LogUtil.a("Suggestion_CourseActionIntroViewHolder", "MediaFileItemDownLoadCallBack_success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2) {
        if (j <= j2) {
            this.e.b(UnitUtil.e(((j * 1.0f) / j2) * 100.0f, 2, 0));
        }
    }

    public void a() {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            actionDetailAdapter.b();
        }
    }

    public void c(String str) {
        ActionDetailAdapter actionDetailAdapter = this.e;
        if (actionDetailAdapter != null) {
            actionDetailAdapter.c(FitWorkout.acquireComeFrom(str));
        }
    }

    static class d extends UiCallback<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<hmt> f36928c;
        private boolean d = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36927a = 0;

        d(hmt hmtVar) {
            if (this.f36928c == null) {
                this.f36928c = new WeakReference<>(hmtVar);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_CourseActionIntroViewHolder", "errorCode:", Integer.valueOf(i), "errorInfo:", str);
            hmt hmtVar = this.f36928c.get();
            if (d(hmtVar, "courseActionIntroViewHolder", "onFailure")) {
                hmtVar.e();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            hmt hmtVar = this.f36928c.get();
            if (d(hmtVar, "courseActionIntroViewHolder", "onSuccess")) {
                hmtVar.f();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onProgress(long j, long j2) {
            super.onProgress(j, j2);
            ReleaseLogUtil.d("Suggestion_CourseActionIntroViewHolder", "handleBytes:", Long.valueOf(j), "-contentLength:", Long.valueOf(j2));
            hmt hmtVar = this.f36928c.get();
            if (d(hmtVar, "courseActionIntroViewHolder", "onProgress")) {
                hmtVar.a(j, j2);
            }
        }

        private boolean d(Object obj, String str, String str2) {
            if (obj != null) {
                return true;
            }
            ReleaseLogUtil.e("Suggestion_CourseActionIntroViewHolder", "check ", str, " failed int method ", str2);
            return false;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public boolean isCanceled() {
            return this.d;
        }

        public void d(boolean z) {
            this.d = z;
        }

        public int c() {
            return this.f36927a;
        }

        public void b(int i) {
            this.f36927a = i;
        }
    }

    static class b extends UiCallback<LongVideoInfo> {
        private WeakReference<hmt> d;
        private int e;

        b(hmt hmtVar, int i) {
            this.d = new WeakReference<>(hmtVar);
            this.e = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_CourseActionIntroViewHolder", "getCourseLongVideoInfo:", Integer.valueOf(i), str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(LongVideoInfo longVideoInfo) {
            if (longVideoInfo == null) {
                ReleaseLogUtil.e("Suggestion_CourseActionIntroViewHolder", "getLongVideo startLongCoachActivity data.getUrl:url is null");
                return;
            }
            hmt hmtVar = this.d.get();
            if (hmtVar != null) {
                hmtVar.a(this.e, longVideoInfo.getUrl());
            }
        }
    }
}
