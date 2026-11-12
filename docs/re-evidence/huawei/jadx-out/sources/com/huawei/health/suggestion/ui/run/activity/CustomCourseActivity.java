package com.huawei.health.suggestion.ui.run.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.CustomCourseActionAdapter;
import com.huawei.health.suggestion.customizecourse.manager.adapter.CustomCourseTouchHelperCallBack;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.ItemEventListener;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.OnStartDragListener;
import com.huawei.health.suggestion.customizecourse.manager.model.CourseConfig;
import com.huawei.health.suggestion.model.customcourse.TypeConfig;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.buh;
import defpackage.gzf;
import defpackage.gzl;
import defpackage.hcc;
import defpackage.hdj;
import defpackage.hdr;
import defpackage.hkt;
import defpackage.idy;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CustomCourseActivity extends BaseStateActivity implements OnStartDragListener, ItemEventListener, EditDialogBuilder.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f9835a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f9836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomCourseActionAdapter f9837c;
    private CourseApi d;
    private HealthButton e;
    private HealthRecycleView f;
    private CourseConfig g;
    private EditDialogBuilder h;
    private String i;
    private String k;
    private FitWorkout l;
    private HeartRateConfigHelper n;
    private ItemTouchHelper p;
    private CustomViewDialog q;
    private gzf r;
    private CustomTitleBar s;
    private Map<String, ChoreographedSingleAction> t;
    private int j = 0;
    private boolean o = true;
    private Handler m = new c(Looper.getMainLooper(), this);

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        clearBackgroundDrawable();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_custom_course);
        this.s = (CustomTitleBar) findViewById(R.id.sug_title_bar);
        this.f9836b = (HealthButton) findViewById(R.id.btn_new_combine);
        this.e = (HealthButton) findViewById(R.id.btn_add_action);
        this.mLoadingView = findViewById(R.id.sug_loading_layout);
        this.h = new EditDialogBuilder(this, this);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        q();
        final HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("type", 1);
        map.put("result", 0);
        this.f9836b.setOnClickListener(new View.OnClickListener() { // from class: hzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37391c.d(map, view);
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(map, view);
            }
        });
        this.f = (HealthRecycleView) findViewById(R.id.sug_custom_course_recycle_view);
        this.f.setLayoutManager(new CustomCourseLinearLayoutManager(this));
        CustomCourseActionAdapter customCourseActionAdapter = new CustomCourseActionAdapter(this, this, this);
        this.f9837c = customCourseActionAdapter;
        this.f.setAdapter(customCourseActionAdapter);
        this.f.b(false);
        this.f.e(false);
        if (this.f.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.f.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new CustomCourseTouchHelperCallBack(this.f9837c));
        this.p = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.f);
    }

    public /* synthetic */ void d(Map map, View view) {
        if (view == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "mBtnNewCombine view is null");
            return;
        }
        j();
        map.put("event", 1);
        idy.b("1130056", map);
    }

    public /* synthetic */ void e(Map map, View view) {
        if (view == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "mBtnAddAction view is null");
            return;
        }
        a();
        map.put("event", 2);
        idy.b("1130056", map);
    }

    private void a() {
        if (this.l == null || this.f9837c == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "addAction, mFitWorkout is null or mAdapter is null");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActivity", "addAction, mBtnAddAction is enter...");
        if (d(false) != 0) {
            LogUtil.j("Suggestion_CustomCourseActivity", "addAction, action num is max");
            qpx.e(BaseApplication.getContext(), getResources().getString(R.string.IDS_sug_action_num_max_tip));
            return;
        }
        ChoreographedSingleAction choreographedSingleActionT = t();
        if (choreographedSingleActionT == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "add action failed.");
            return;
        }
        ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(choreographedSingleActionT);
        choreographedMultiActions.setActionList(arrayList);
        choreographedMultiActions.setRepeatTimes(1);
        this.f9837c.c(choreographedMultiActions);
        this.f9837c.notifyDataSetChanged();
        y();
    }

    private void j() {
        if (this.g == null || this.l == null || this.f9837c == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "addMulti, mCourseConfig is null or mFitWorkout is null or mAdapter is null");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActivity", "addMulti, mBtnNewCombine is enter");
        if (d(true) != 0) {
            LogUtil.j("Suggestion_CustomCourseActivity", "addMulti, action num is max");
            qpx.e(BaseApplication.getContext(), getResources().getString(R.string.IDS_sug_action_num_max_tip));
            return;
        }
        List<Attribute> defaultCombinationActions = this.g.getDefaultCombinationActions();
        ArrayList arrayList = new ArrayList();
        if (njy.b(defaultCombinationActions)) {
            Iterator<Attribute> it = defaultCombinationActions.iterator();
            while (it.hasNext()) {
                ChoreographedSingleAction choreographedSingleActionC = c(it.next().getId());
                if (choreographedSingleActionC != null) {
                    arrayList.add(choreographedSingleActionC);
                }
            }
        }
        ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
        choreographedMultiActions.setActionList(arrayList);
        choreographedMultiActions.setRepeatTimes(defaultCombinationActions.size());
        if (njy.e(choreographedMultiActions.getActionList())) {
            LogUtil.j("Suggestion_CustomCourseActivity", "addMulti, actions.getActionList() is empty");
            return;
        }
        this.f9837c.a(choreographedMultiActions);
        this.f9837c.notifyDataSetChanged();
        y();
    }

    private void y() {
        this.m.post(new Runnable() { // from class: hzl
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        });
    }

    public /* synthetic */ void b() {
        CustomCourseActionAdapter customCourseActionAdapter;
        HealthRecycleView healthRecycleView = this.f;
        if (healthRecycleView == null || (customCourseActionAdapter = this.f9837c) == null) {
            return;
        }
        healthRecycleView.scrollToPosition(customCourseActionAdapter.getItemCount() - 1);
    }

    private int d(boolean z) {
        int i;
        int i2;
        if (njy.e(this.f9837c.c()) || this.g == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "mAdapter.getActions() is empty or mCourseConfig is or");
            return 0;
        }
        long jF = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (hdr hdrVar : this.f9837c.c()) {
            if (hdrVar != null && hdrVar.h() != 5) {
                if (hdrVar.h() == 3) {
                    i5++;
                    jF = hdrVar.f();
                    i6 = hdrVar.i();
                } else if (hdrVar.h() != 4) {
                    i3++;
                    i4 = hdrVar.f() == jF ? i4 + i6 : i4 + 1;
                }
            }
        }
        if (z) {
            i = i3 + 2;
            i2 = i4 + 4;
            i5++;
        } else {
            i = i3 + 1;
            i2 = i4 + 1;
        }
        return (i > this.g.getMaxListActionNum() || i2 > this.g.getMaxActionNum() || i5 > 25) ? 1 : 0;
    }

    private void q() {
        this.s.setRightButtonVisibility(0);
        this.s.setRightButtonOnClickListener(new View.OnClickListener() { // from class: hzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37387a.e(view);
            }
        });
        this.s.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: hzm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37385a.a(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "mTitleBar ok view is null.");
        } else {
            u();
            r();
        }
    }

    public /* synthetic */ void a(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "mTitleBar cancel view is null.");
        } else if (!f()) {
            this.o = false;
            finish();
        } else {
            x();
        }
    }

    private boolean f() {
        if (this.l == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "checkCourseEditData, mFitWorkout is null");
            return false;
        }
        CustomCourseActionAdapter customCourseActionAdapter = this.f9837c;
        if (customCourseActionAdapter == null || njy.e(customCourseActionAdapter.c())) {
            this.o = false;
            return false;
        }
        FitWorkout fitWorkout = new FitWorkout();
        this.f9837c.b(fitWorkout);
        if (!TextUtils.isEmpty(fitWorkout.acquireName()) && !fitWorkout.acquireName().equals(this.l.acquireName())) {
            return true;
        }
        if (!TextUtils.isEmpty(fitWorkout.acquireDescription()) && !fitWorkout.acquireDescription().equals(this.l.acquireDescription())) {
            return true;
        }
        List<ChoreographedMultiActions> listE = this.f9837c.e();
        if (njy.e(this.l.getCourseActions()) || listE.size() != this.l.getCourseActions().size()) {
            return true;
        }
        int i = 0;
        for (ChoreographedMultiActions choreographedMultiActions : listE) {
            ChoreographedMultiActions choreographedMultiActions2 = this.l.getCourseActions().get(i);
            if (choreographedMultiActions.getRepeatTimes() != choreographedMultiActions2.getRepeatTimes()) {
                return true;
            }
            if (!njy.e(choreographedMultiActions.getActionList())) {
                if (njy.e(choreographedMultiActions2.getActionList()) || choreographedMultiActions.getActionList().size() != choreographedMultiActions2.getActionList().size() || a(choreographedMultiActions.getActionList(), choreographedMultiActions2.getActionList())) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean a(List<ChoreographedSingleAction> list, List<ChoreographedSingleAction> list2) {
        int i = 0;
        for (ChoreographedSingleAction choreographedSingleAction : list) {
            ChoreographedSingleAction choreographedSingleAction2 = list2.get(i);
            if (choreographedSingleAction != null) {
                if (choreographedSingleAction2 == null) {
                    return true;
                }
                AtomicAction action = choreographedSingleAction.getAction();
                if (action != null) {
                    if (choreographedSingleAction2.getAction() != null && (TextUtils.isEmpty(action.getId()) || action.getId().equals(choreographedSingleAction2.getAction().getId()))) {
                        TargetConfig targetConfig = choreographedSingleAction.getTargetConfig();
                        if (targetConfig == null) {
                            continue;
                        } else if (choreographedSingleAction2.getTargetConfig() != null && ((TextUtils.isEmpty(targetConfig.getId()) || targetConfig.getId().equals(choreographedSingleAction2.getTargetConfig().getId())) && targetConfig.getValueH() == choreographedSingleAction2.getTargetConfig().getValueH() && targetConfig.getValueL() == choreographedSingleAction2.getTargetConfig().getValueL())) {
                            TargetConfig intensityConfig = choreographedSingleAction.getIntensityConfig();
                            if (intensityConfig == null) {
                                continue;
                            } else if (choreographedSingleAction2.getIntensityConfig() != null && ((TextUtils.isEmpty(intensityConfig.getId()) || intensityConfig.getId().equals(choreographedSingleAction2.getIntensityConfig().getId())) && intensityConfig.getValueH() == choreographedSingleAction2.getIntensityConfig().getValueH() && intensityConfig.getValueL() == choreographedSingleAction2.getIntensityConfig().getValueL())) {
                                i++;
                            }
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    private void x() {
        View viewInflate = View.inflate(this, R.layout.delete_course_dialog, null);
        ((HealthTextView) viewInflate.findViewById(R.id.pop_tip)).setText(getString(R.string.IDS_sug_custom_course_save_tip));
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: hzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37386b.d(view);
            }
        }).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: hzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37388a.b(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.q = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void d(View view) {
        this.o = false;
        a(this.q);
        finish();
    }

    public /* synthetic */ void b(View view) {
        a(this.q);
        u();
        r();
    }

    private void a(CustomViewDialog customViewDialog) {
        if (customViewDialog != null) {
            customViewDialog.dismiss();
            LogUtil.a("Suggestion_CustomCourseActivity", "dismissDialog");
        }
    }

    private void v() {
        if (this.l == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "saveDraft, mFitWorkout is null");
            return;
        }
        if (!TextUtils.isEmpty(this.i) && this.i.equals(this.l.acquireName())) {
            this.l.saveName("");
            LogUtil.a("Suggestion_CustomCourseActivity", "saveDraft, course name clear");
        }
        this.l.saveModified(System.currentTimeMillis());
        Gson gsonCreate = new GsonBuilder().serializeSpecialFloatingPointValues().create();
        synchronized (f9835a) {
            LogUtil.a("Suggestion_CustomCourseActivity", "saveDraft, draft json result:", Integer.valueOf(buh.d("coachRunCustomCourse", gsonCreate.toJson(this.l).replaceAll("NaN", "0"))));
        }
    }

    private void r() {
        FitWorkout fitWorkout = this.l;
        if (fitWorkout == null || njy.e(fitWorkout.getCourseActions())) {
            qpx.e(BaseApplication.getContext(), getResources().getString(R.string.IDS_sug_action_none_tip));
            return;
        }
        if (TextUtils.isEmpty(this.l.acquireName().trim())) {
            qpx.e(BaseApplication.getContext(), getResources().getString(R.string.IDS_sug_custom_name_violations));
            return;
        }
        if (this.d == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "checkSaveState courseApi == null");
            return;
        }
        showLoading();
        if (this.j == 1) {
            this.d.modifyUserDefinedWorkout(this.l, new a(this));
        } else {
            this.d.addUserDefinedWorkout(this.l, new a(this));
        }
    }

    private void b(FitWorkout fitWorkout) {
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a("AllTraining");
        pcdVar.i(1);
        pea.a(this, fitWorkout, pcdVar);
        finish();
    }

    private void u() {
        CustomCourseActionAdapter customCourseActionAdapter;
        FitWorkout fitWorkout = this.l;
        if (fitWorkout == null || (customCourseActionAdapter = this.f9837c) == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "stuffFitWorkout, mFitWorkout is null or mAdapter is null");
            return;
        }
        customCourseActionAdapter.b(fitWorkout);
        if (TextUtils.isEmpty(this.l.acquireName())) {
            this.l.saveName(h());
        }
        LogUtil.a("Suggestion_CustomCourseActivity", "courseName = ", this.l.acquireName(), ", courseDescription = ", this.l.acquireDescription());
        this.l.setCourseDefineType(1);
        this.l.setCourseActions(this.f9837c.e());
    }

    private String h() {
        String str;
        try {
            str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMdd")).format(new Date());
        } catch (IllegalArgumentException unused) {
            LogUtil.e("Suggestion_CustomCourseActivity", "getDefaultCourseName error");
            str = "";
        }
        return getResources().getString(R.string.IDS_sug_courses_name_default, getResources().getString(R.string.IDS_start_track_sport_type_run), str);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.j = intent.getIntExtra("CustomCourseState", 0);
            this.k = intent.getStringExtra("CustomCourseFitWorkoutId");
        }
        int i = this.j;
        this.o = i == 0;
        if (i == 1) {
            this.m.sendEmptyMessage(5);
        }
        this.g = hdj.c(this).c(0);
        this.d = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        l();
        HashMap map = new HashMap(10);
        map.put("click", 1);
        idy.b("1130054", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        CourseConfig courseConfig = this.g;
        if (courseConfig == null || this.t == null) {
            LogUtil.e("Suggestion_CustomCourseActivity", "courseConfig or support action is null");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActivity", "course config:", courseConfig.toString());
        if (TextUtils.isEmpty(this.k)) {
            k();
            o();
            finishLoading();
        } else {
            CourseApi courseApi = this.d;
            if (courseApi == null) {
                LogUtil.j("Suggestion_CustomCourseActivity", "initFitWorkout mCourseApi == null");
                finishLoading();
            } else {
                courseApi.getCourseById(new gzl.a(this.k).d("2.0").d(1).c(), new e(this));
            }
        }
    }

    public static class a extends UiCallback<FitWorkout> {
        private final WeakReference<CustomCourseActivity> e;

        a(CustomCourseActivity customCourseActivity) {
            this.e = new WeakReference<>(customCourseActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_CustomCourseActivity", "get custom course fail:", Integer.valueOf(i), str);
            CustomCourseActivity customCourseActivity = this.e.get();
            if (customCourseActivity != null) {
                if (i == 2200030) {
                    str = customCourseActivity.getString(R.string.IDS_course_already_in_use);
                }
                if (i == 2200027) {
                    str = customCourseActivity.getString(R.string.IDS_sug_action_num_max_tip);
                }
                if (i == 15030019) {
                    str = customCourseActivity.getString(R.string.IDS_sug_custom_name_violations);
                }
                customCourseActivity.m.sendMessage(Message.obtain(customCourseActivity.m, 0, str));
                customCourseActivity.finishLoading();
                HashMap map = new HashMap(10);
                map.put("click", 1);
                map.put("event", Integer.valueOf(customCourseActivity.j));
                map.put("result", 1);
                idy.b("1130057", map);
                return;
            }
            ReleaseLogUtil.e("Suggestion_CustomCourseActivity", "CustomCourseUiCallback onFailure mTrainDetail is null");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(FitWorkout fitWorkout) {
            int size;
            int i;
            CustomCourseActivity customCourseActivity = this.e.get();
            if (customCourseActivity == null) {
                ReleaseLogUtil.e("Suggestion_CustomCourseActivity", "CustomCourseUiCallback onSuccess mTrainDetail is null");
                return;
            }
            customCourseActivity.finishLoading();
            if (fitWorkout == null) {
                LogUtil.j("Suggestion_CustomCourseActivity", "get custom course success workout is null");
                return;
            }
            buh.c("coachRunCustomCourse");
            customCourseActivity.o = false;
            LogUtil.a("Suggestion_CustomCourseActivity", "get custom course success:", fitWorkout.acquireId());
            customCourseActivity.m.sendMessage(Message.obtain(customCourseActivity.m, 1, fitWorkout));
            HashMap map = new HashMap(10);
            map.put("click", 1);
            map.put("type", 1);
            map.put("workout_name", hkt.a(customCourseActivity));
            if (njy.b(fitWorkout.getCourseActions())) {
                size = 0;
                i = 0;
                for (ChoreographedMultiActions choreographedMultiActions : fitWorkout.getCourseActions()) {
                    if (njy.b(choreographedMultiActions.getActionList())) {
                        size += choreographedMultiActions.getActionList().size();
                        if (choreographedMultiActions.getActionList().size() > 1) {
                            i++;
                        }
                    }
                }
            } else {
                size = 0;
                i = 0;
            }
            map.put("actionNumber", Integer.valueOf(size));
            map.put("groupNumber", Integer.valueOf(i));
            idy.b("1130055", map);
            HashMap map2 = new HashMap(10);
            map2.put("click", 1);
            map2.put("event", Integer.valueOf(customCourseActivity.j));
            map2.put("result", 0);
            idy.b("1130057", map2);
        }
    }

    static class e extends UiCallback<Workout> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<CustomCourseActivity> f9839a;

        e(CustomCourseActivity customCourseActivity) {
            this.f9839a = new WeakReference<>(customCourseActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_CustomCourseActivity", "get custom course fail:", Integer.valueOf(i), str);
            CustomCourseActivity customCourseActivity = this.f9839a.get();
            if (customCourseActivity != null) {
                customCourseActivity.o();
                customCourseActivity.finishLoading();
            } else {
                ReleaseLogUtil.e("Suggestion_CustomCourseActivity", "CustomCourseUiCallback onFailure mTrainDetail is null");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            CustomCourseActivity customCourseActivity = this.f9839a.get();
            if (customCourseActivity == null) {
                ReleaseLogUtil.e("Suggestion_CustomCourseActivity", "CustomCourseUiCallback onSuccess mTrainDetail is null");
                return;
            }
            customCourseActivity.finishLoading();
            if (workout == null) {
                LogUtil.j("Suggestion_CustomCourseActivity", "CustomCourseDetailCallback onSuccess, workout is null");
                return;
            }
            LogUtil.a("Suggestion_CustomCourseActivity", "get custom course success:", workout.acquireId());
            customCourseActivity.l = pea.d(workout);
            customCourseActivity.m.sendEmptyMessage(3);
        }
    }

    private void k() {
        String strE = buh.e("coachRunCustomCourse");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("Suggestion_CustomCourseActivity", "the course draft.");
            FitWorkout fitWorkout = (FitWorkout) new GsonBuilder().serializeSpecialFloatingPointValues().create().fromJson(CommonUtil.ac(strE.replaceAll("NaN", "0")), FitWorkout.class);
            if (fitWorkout != null && lsl.a(fitWorkout.getModified(), System.currentTimeMillis()) < 2) {
                this.l = fitWorkout;
                LogUtil.a("Suggestion_CustomCourseActivity", "draft mFitWorkout.acquireId = ", fitWorkout.acquireId(), ", mFitWorkout.acquireName = ", this.l.acquireName());
                if (TextUtils.isEmpty(this.l.acquireName())) {
                    String strH = h();
                    this.i = strH;
                    this.l.saveName(strH);
                    return;
                }
                return;
            }
            buh.c("coachRunCustomCourse");
        }
        LogUtil.a("Suggestion_CustomCourseActivity", "initFitWorkoutDefault");
        FitWorkout fitWorkout2 = new FitWorkout();
        this.l = fitWorkout2;
        fitWorkout2.setWorkoutType(2);
        this.l.saveVersion("2.0");
        this.l.saveId(this.g.getId());
        this.l.setType(4);
        this.l.setCourseDefineType(1);
        String strH2 = h();
        this.i = strH2;
        this.l.saveName(strH2);
        this.l.setCourseActions(g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        lsy.a(new Runnable() { // from class: hzu
            @Override // java.lang.Runnable
            public final void run() {
                this.f37392c.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.r = hcc.c();
        s();
    }

    private void s() {
        this.n = new HeartRateConfigHelper(258, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: hzq
            @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
            public final void onInitComplete() {
                this.d.d();
            }
        });
    }

    public /* synthetic */ void d() {
        CustomCourseActionAdapter customCourseActionAdapter = this.f9837c;
        if (customCourseActionAdapter == null) {
            return;
        }
        customCourseActionAdapter.b(this.n, this.r);
        CourseConfig courseConfig = this.g;
        if (courseConfig != null) {
            this.f9837c.d(courseConfig.getMaxActionNum());
        }
        this.m.sendEmptyMessage(2);
    }

    private List<ChoreographedMultiActions> g() {
        ArrayList arrayList = new ArrayList();
        for (Attribute attribute : this.g.getDefaultCourseActions()) {
            ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
            choreographedMultiActions.setRepeatTimes(1);
            ChoreographedSingleAction choreographedSingleAction = this.t.get(attribute.getId());
            if (choreographedSingleAction != null) {
                ChoreographedSingleAction choreographedSingleActionA = a(choreographedSingleAction);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(choreographedSingleActionA);
                choreographedMultiActions.setActionList(arrayList2);
                arrayList.add(choreographedMultiActions);
            }
        }
        return arrayList;
    }

    private ChoreographedSingleAction a(ChoreographedSingleAction choreographedSingleAction) {
        Gson gsonCreate = new GsonBuilder().create();
        return (ChoreographedSingleAction) gsonCreate.fromJson(gsonCreate.toJson(choreographedSingleAction), ChoreographedSingleAction.class);
    }

    private void c(ChoreographedSingleAction choreographedSingleAction) {
        EditDialogBuilder editDialogBuilder;
        Map<String, ChoreographedSingleAction> map;
        if (choreographedSingleAction == null || (editDialogBuilder = this.h) == null || (map = this.t) == null) {
            LogUtil.e("Suggestion_CustomCourseActivity", "edit dialog singleAction is null or builder is null or mSupportActionMap is null.");
        } else {
            editDialogBuilder.d(choreographedSingleAction, map);
        }
    }

    private void d(ChoreographedMultiActions choreographedMultiActions) {
        if (choreographedMultiActions == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "newRepeatTime, multiActions == null");
        } else {
            this.h.c(choreographedMultiActions, this.g.getMaxCombinationRepeats());
        }
    }

    private void e(TargetConfig targetConfig) {
        if (targetConfig == null || this.h == null) {
            LogUtil.e("Suggestion_CustomCourseActivity", "edit dialog builder is null or targetConfig is null");
            return;
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), targetConfig.getId());
        if (iN == 0) {
            this.h.a(targetConfig);
            return;
        }
        if (iN == 1) {
            this.h.d(targetConfig);
            return;
        }
        if (iN == 3) {
            this.h.e(targetConfig);
            return;
        }
        if (iN == 4 || iN == 5) {
            this.h.d(targetConfig, this.f9837c.b());
        } else if (iN != 255) {
            LogUtil.j("Suggestion_CustomCourseActivity", "editActionTargetValues, sportTargetType = ", Integer.valueOf(iN));
        }
    }

    private void a(TargetConfig targetConfig) {
        if (targetConfig == null || this.h == null) {
            LogUtil.e("Suggestion_CustomCourseActivity", "edit dialog builder is null or intensityConfig is null");
            return;
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), targetConfig.getId());
        if (iN == 1) {
            this.h.c(targetConfig, this.f9837c.b());
            return;
        }
        if (iN != 4 && iN != 8) {
            if (iN == 13) {
                this.h.e(targetConfig, this.r);
                return;
            }
            if (iN != 255) {
                switch (iN) {
                    case 15:
                        this.h.b(targetConfig);
                        break;
                    case 16:
                        this.h.c(targetConfig);
                        break;
                    case 17:
                        break;
                    default:
                        LogUtil.j("Suggestion_CustomCourseActivity", "editActionIntensityValues, intensityType = ", Integer.valueOf(iN));
                        break;
                }
                return;
            }
            return;
        }
        this.h.a(targetConfig, this.f9837c.b(), this.f9837c.a(), this.f9837c.d());
    }

    private ChoreographedSingleAction t() {
        Map<String, ChoreographedSingleAction> map = this.t;
        if (map == null || map.size() == 0) {
            LogUtil.j("Suggestion_CustomCourseActivity", "mSupportActionMap is empty.");
            return null;
        }
        CourseConfig courseConfig = this.g;
        if (courseConfig != null) {
            ChoreographedSingleAction choreographedSingleAction = this.t.get(courseConfig.getDefaultNewAction().getId());
            if (choreographedSingleAction != null) {
                return a(choreographedSingleAction);
            }
        }
        return null;
    }

    private ChoreographedSingleAction c(String str) {
        ChoreographedSingleAction choreographedSingleAction;
        Map<String, ChoreographedSingleAction> map = this.t;
        if (map == null || map.size() == 0) {
            LogUtil.e("Suggestion_CustomCourseActivity", "mSupportActionMap is empty.");
            return null;
        }
        if (this.g == null || (choreographedSingleAction = this.t.get(str)) == null) {
            return null;
        }
        return a(choreographedSingleAction);
    }

    private void l() {
        CourseApi courseApi = this.d;
        if (courseApi == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "addUserDefineCourse courseApi == null");
        } else {
            courseApi.getCourseActionList(0, 50, 1, 1, new UiCallback<List<AtomicAction>>() { // from class: com.huawei.health.suggestion.ui.run.activity.CustomCourseActivity.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_CustomCourseActivity", "getSupportActionListFromCloud, get data failure");
                    CustomCourseActivity.this.m();
                    CustomCourseActivity.this.n();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<AtomicAction> list) {
                    LogUtil.a("Suggestion_CustomCourseActivity", "getSupportActionListFromCloud, get data success");
                    if (njy.e(list)) {
                        CustomCourseActivity.this.m();
                    } else {
                        CustomCourseActivity.this.d(list);
                    }
                    CustomCourseActivity.this.n();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<AtomicAction> list) {
        this.t = new HashMap();
        for (AtomicAction atomicAction : list) {
            if (atomicAction != null) {
                ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
                choreographedSingleAction.setAction(atomicAction);
                e(choreographedSingleAction);
                this.t.put(atomicAction.getId(), choreographedSingleAction);
            }
        }
        if (this.t.size() == 0) {
            m();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    private void e(ChoreographedSingleAction choreographedSingleAction) {
        byte b2;
        if (choreographedSingleAction.getAction() == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "setDefaultTargetAndIntensity, singleAction.getAction() is null");
            return;
        }
        String id = choreographedSingleAction.getAction().getId();
        TargetConfig targetConfig = new TargetConfig();
        TargetConfig targetConfig2 = new TargetConfig();
        id.hashCode();
        switch (id.hashCode()) {
            case 77802175:
                if (!id.equals("RD001")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 77802176:
                if (!id.equals("RD002")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 77802177:
            default:
                b2 = -1;
                break;
            case 77802178:
                if (!id.equals("RD004")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 77802179:
                if (!id.equals("RD005")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
        }
        if (b2 == 0) {
            targetConfig.setId(Integer.toString(1));
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            targetConfig.setValueL(300.0d);
            targetConfig2.setId(Integer.toString(255));
        } else if (b2 == 1) {
            targetConfig.setId(Integer.toString(0));
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            if (UnitUtil.f()) {
                targetConfig.setValueL(UnitUtil.c(1.0d, 3) * 1000.0d);
            } else {
                targetConfig.setValueL(1000.0d);
            }
            targetConfig2.setId(Integer.toString(255));
        } else if (b2 == 2) {
            targetConfig.setId(Integer.toString(1));
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            targetConfig.setValueL(60.0d);
            targetConfig2.setId(Integer.toString(255));
        } else if (b2 == 3) {
            targetConfig.setId(Integer.toString(1));
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            targetConfig.setValueL(300.0d);
            targetConfig2.setId(Integer.toString(255));
        } else {
            targetConfig.setId(Integer.toString(255));
            targetConfig2.setId(Integer.toString(255));
        }
        choreographedSingleAction.setTargetConfig(targetConfig);
        choreographedSingleAction.setIntensityConfig(targetConfig2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.t = new HashMap();
        ChoreographedSingleAction choreographedSingleActionB = b("RD002", getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id5), Integer.toString(0), Integer.toString(255));
        ChoreographedSingleAction choreographedSingleActionB2 = b("RD003", getResources().getString(R.string.IDS_sug_ai_run_plan_walk), Integer.toString(0), Integer.toString(255));
        ChoreographedSingleAction choreographedSingleActionB3 = b("RD004", getResources().getString(R.string.IDS_sug_ai_run_plan_rest), Integer.toString(1), Integer.toString(255));
        ChoreographedSingleAction choreographedSingleActionB4 = b("RD005", getResources().getString(R.string.IDS_sug_ai_run_plan_relax), Integer.toString(5), Integer.toString(255));
        ChoreographedSingleAction choreographedSingleActionB5 = b("RD001", getResources().getString(R.string.IDS_rate_zone_warmup_threshold), Integer.toString(1), Integer.toString(255));
        this.t.put(choreographedSingleActionB.getAction().getId(), choreographedSingleActionB);
        this.t.put(choreographedSingleActionB3.getAction().getId(), choreographedSingleActionB3);
        this.t.put(choreographedSingleActionB4.getAction().getId(), choreographedSingleActionB4);
        this.t.put(choreographedSingleActionB5.getAction().getId(), choreographedSingleActionB5);
        this.t.put(choreographedSingleActionB2.getAction().getId(), choreographedSingleActionB2);
    }

    private ChoreographedSingleAction b(String str, String str2, String str3, String str4) {
        List<TargetConfig> defaultTargetConfigs = this.g.getDefaultTargetConfigs();
        ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
        choreographedSingleAction.setAction(b(str, str2));
        TargetConfig targetConfig = new TargetConfig();
        targetConfig.setId(str3);
        for (TargetConfig targetConfig2 : defaultTargetConfigs) {
            if (targetConfig2.getId().equals(targetConfig.getId())) {
                targetConfig.setValueType(targetConfig2.getValueType());
                targetConfig.setValueL(targetConfig2.getValueL());
                targetConfig.setValueH(targetConfig2.getValueH());
                break;
            }
        }
        TypeConfig.setDefaultImperialData(targetConfig);
        choreographedSingleAction.setTargetConfig(targetConfig);
        List<TargetConfig> defaultIntensityConfigs = this.g.getDefaultIntensityConfigs();
        TargetConfig targetConfig3 = new TargetConfig();
        targetConfig3.setId(str4);
        for (TargetConfig targetConfig4 : defaultIntensityConfigs) {
            if (targetConfig4.getId().equals(targetConfig3.getId())) {
                targetConfig3.setValueType(targetConfig4.getValueType());
                targetConfig3.setValueL(targetConfig4.getValueL());
                targetConfig3.setValueH(targetConfig4.getValueH());
                break;
            }
        }
        TypeConfig.setDefaultImperialData(targetConfig3);
        choreographedSingleAction.setIntensityConfig(targetConfig3);
        return choreographedSingleAction;
    }

    private AtomicAction b(String str, String str2) {
        AtomicAction atomicAction = new AtomicAction();
        atomicAction.setOrchestrationType(1);
        atomicAction.setId(str);
        atomicAction.setName(str2);
        return atomicAction;
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.OnStartDragListener
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        this.p.startDrag(viewHolder);
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.ItemEventListener
    public void onComItemClick(int i, int i2) {
        CustomCourseActionAdapter customCourseActionAdapter = this.f9837c;
        if (customCourseActionAdapter == null || njy.e(customCourseActionAdapter.c())) {
            LogUtil.j("Suggestion_CustomCourseActivity", "onComItemClick, mAdapter is null or mAdapter.getActions() is empty");
            return;
        }
        switch (i2) {
            case 0:
                e(i);
                break;
            case 1:
                a(i);
                break;
            case 2:
                c(i);
                break;
            case 3:
                d(this.f9837c.a(i, i2));
                break;
            case 4:
                c(this.f9837c.b(i, i2));
                break;
            case 5:
                c(this.f9837c.e(i, i2));
                break;
            case 6:
                e(this.f9837c.e(i, i2));
                break;
            case 7:
                d(this.f9837c.e(i, i2));
                break;
            case 8:
                a(this.f9837c.e(i, i2));
                break;
            case 9:
                p();
                break;
            case 10:
                this.f9837c.e(i);
                break;
            default:
                LogUtil.j("Suggestion_CustomCourseActivity", "onComItemClick, position = ", Integer.valueOf(i), " type = ", Integer.valueOf(i2));
                break;
        }
    }

    private void p() {
        Handler handler = this.m;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: hzr
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    public /* synthetic */ void e() {
        CustomCourseActionAdapter customCourseActionAdapter = this.f9837c;
        if (customCourseActionAdapter == null) {
            return;
        }
        customCourseActionAdapter.notifyDataSetChanged();
    }

    private void e(int i) {
        int i2 = 0;
        for (hdr hdrVar : this.f9837c.c()) {
            if (hdrVar != null) {
                if (i2 == i) {
                    hdrVar.d(!hdrVar.o());
                } else if (hdrVar.o()) {
                    hdrVar.d(false);
                }
            }
            i2++;
        }
        this.f9837c.notifyDataSetChanged();
    }

    private void d(TargetConfig targetConfig) {
        if (targetConfig == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "editActionIntensityType, targetConfig is null");
        } else {
            this.h.c(targetConfig, this.g);
        }
    }

    private void c(TargetConfig targetConfig) {
        if (targetConfig == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "editActionTargetType, targetConfig is null");
        } else {
            this.h.e(targetConfig, this.g);
        }
    }

    private void c(int i) {
        if (njy.e(this.f9837c.c(), i)) {
            LogUtil.j("Suggestion_CustomCourseActivity", "delMulti, mAdapter.getActions() is out of bound!");
            return;
        }
        long jF = this.f9837c.c().get(i).f();
        Iterator<hdr> it = this.f9837c.c().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (jF == it.next().f()) {
                it.remove();
                i2++;
            }
        }
        this.f9837c.notifyItemRangeRemoved(i, i2);
    }

    private void a(int i) {
        int i2;
        if (njy.e(this.f9837c.c())) {
            LogUtil.j("Suggestion_CustomCourseActivity", "delActions, mAdapter.getActions() is empty");
            return;
        }
        hdr hdrVar = this.f9837c.c().get(i);
        if (hdrVar.h() == 0) {
            this.f9837c.c().remove(i);
            this.f9837c.notifyDataSetChanged();
            return;
        }
        this.f9837c.c().remove(i);
        long jF = hdrVar.f();
        int i3 = 0;
        while (true) {
            if (i3 < this.f9837c.c().size()) {
                hdr hdrVar2 = this.f9837c.c().get(i3);
                if (hdrVar2.f() == jF && hdrVar2.h() == 4) {
                    i2 = i3 - 1;
                    hdr hdrVar3 = this.f9837c.c().get(i2);
                    if (hdrVar3.h() == 3) {
                        break;
                    }
                    if (hdrVar3.h() == 1) {
                        hdrVar3.a(2);
                    } else if (hdrVar3.h() == 0) {
                        i2 = -1;
                        break;
                    }
                }
                i3++;
            }
            i3 = -1;
            i2 = -1;
            break;
        }
        if (i2 != -1) {
            this.f9837c.c().remove(i2);
        }
        if (i3 != -1) {
            this.f9837c.c().remove(i3 - 1);
        }
        this.f9837c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message.obj instanceof FitWorkout) {
            FitWorkout fitWorkout = (FitWorkout) message.obj;
            if (!TextUtils.isEmpty(fitWorkout.acquireId())) {
                LogUtil.a("Suggestion_CustomCourseActivity", "addUserDefineCourse success.", fitWorkout.acquireId());
                b(pea.d(fitWorkout));
            } else {
                LogUtil.j("Suggestion_CustomCourseActivity", "addUserDefineCourse failed");
                qpx.e(BaseApplication.getContext(), getResources().getString(R.string.sug_system_error));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        FitWorkout fitWorkout = this.l;
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_CustomCourseActivity", "courseDetailHandler, mFitWorkout is null");
            return;
        }
        if (this.j == 2 && !TextUtils.isEmpty(fitWorkout.acquireName())) {
            this.l.saveName(getResources().getString(R.string.IDS_sug_course_name_copy, this.l.acquireName()));
        }
        o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!f()) {
            this.o = false;
            super.onBackPressed();
        } else {
            x();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.o) {
            u();
            v();
        }
        CustomCourseActionAdapter customCourseActionAdapter = this.f9837c;
        if (customCourseActionAdapter != null) {
            customCourseActionAdapter.releaseVibrator();
        }
        super.onDestroy();
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.OnDismissListener
    public void onDismiss() {
        CustomCourseActionAdapter customCourseActionAdapter = this.f9837c;
        if (customCourseActionAdapter != null) {
            customCourseActionAdapter.i();
        }
    }

    static class c extends BaseHandler<CustomCourseActivity> {
        c(Looper looper, CustomCourseActivity customCourseActivity) {
            super(looper, customCourseActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(CustomCourseActivity customCourseActivity, Message message) {
            LogUtil.a("Suggestion_CustomCourseActivity", "handleMessageWhenReferenceNotNull, message.what = ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                if (message.obj instanceof String) {
                    qpx.e(BaseApplication.getContext(), (String) message.obj);
                    return;
                }
                return;
            }
            if (i == 1) {
                customCourseActivity.d(message);
                return;
            }
            if (i == 2) {
                if (customCourseActivity.l == null || !njy.b(customCourseActivity.l.getCourseActions())) {
                    return;
                }
                customCourseActivity.f9837c.d(customCourseActivity.l);
                return;
            }
            if (i == 3) {
                customCourseActivity.i();
            } else if (i == 5) {
                customCourseActivity.s.setTitleText(customCourseActivity.getResources().getString(R.string.IDS_sug_edit_run_course_title));
            } else {
                LogUtil.j("Suggestion_CustomCourseActivity", "handleMessageWhenReferenceNotNull, message.what = ", Integer.valueOf(message.what));
            }
        }
    }

    static class CustomCourseLinearLayoutManager extends HealthLinearLayoutManager {
        public CustomCourseLinearLayoutManager(Context context) {
            super(context);
        }

        @Override // com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                LogUtil.e("Sug_CustomCourseLinearLayoutManager", LogAnonymous.b(e));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
