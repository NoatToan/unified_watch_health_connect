package com.huawei.health.suggestion.ui.run.adapter;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.btt;
import defpackage.gzm;
import defpackage.gzx;
import defpackage.hcg;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.ibf;
import defpackage.ibl;
import defpackage.ibn;
import defpackage.idy;
import defpackage.iem;
import defpackage.ift;
import defpackage.ltc;
import defpackage.njy;
import defpackage.pea;
import defpackage.pqm;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.vfv;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MyPlanInfoAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Plan f9942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f9944c;
    private List<Plan> d;
    private final List<IntPlan> e;
    private PlanWorkout i;
    private boolean j;

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f9959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthCardView f9960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f9961c;
        LinearLayout d;
        ImageView e;
        HealthButton f;
        HealthTextView g;
        HealthTextView h;
        HealthTextView i;
        HealthTextView j;
        View k;
        HealthTextView l;
        HealthTextView m;
        HealthProgressBar n;
        HealthTextView o;

        b(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.sug_mylans_item_bg);
            this.j = (HealthTextView) view.findViewById(R.id.sug_mylans_item_name_tv);
            this.i = (HealthTextView) view.findViewById(R.id.sug_mylans_item_complete_tv);
            this.h = (HealthTextView) view.findViewById(R.id.sug_mylans_item_finishrate_tv);
            this.f = (HealthButton) view.findViewById(R.id.sug_mylans_item_button);
            this.l = (HealthTextView) view.findViewById(R.id.sug_mylans_item_describe_tv);
            this.f9960b = (HealthCardView) view.findViewById(R.id.sug_mylans_item_ryt);
            this.n = (HealthProgressBar) view.findViewById(R.id.sug_mylans_item_horizontal);
            this.k = view.findViewById(R.id.sug_my_plans_view);
            this.f9959a = (ImageView) view.findViewById(R.id.corner_img);
            this.m = (HealthTextView) view.findViewById(R.id.sug_mylans_item_summary_tv);
            this.o = (HealthTextView) view.findViewById(R.id.fit_plan_name);
            this.g = (HealthTextView) view.findViewById(R.id.fit_plan_description);
            this.d = (LinearLayout) view.findViewById(R.id.on_going_view);
            this.f9961c = (LinearLayout) view.findViewById(R.id.helper_view);
        }
    }

    public MyPlanInfoAdapter(List<Plan> list, Context context) {
        this(list, new ArrayList(), context);
    }

    public MyPlanInfoAdapter(List<Plan> list, List<IntPlan> list2, Context context) {
        this.j = false;
        this.f9944c = new Handler() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.j("Suggestion_MyPlanInfoAdapter", "msg is null");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 1) {
                    MyPlanInfoAdapter.this.e();
                } else {
                    if (i != 2) {
                        return;
                    }
                    MyPlanInfoAdapter.this.b();
                }
            }
        };
        this.f9943b = context;
        this.d = list;
        this.e = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(BaseApplication.b()).inflate(R.layout.sug_my_plans_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        if (njy.e(this.e, i)) {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "mCurrentIntPlanList is null");
            return;
        }
        IntPlan intPlan = this.e.get(i);
        if (intPlan != null) {
            if (intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                e(bVar, intPlan);
            } else if (intPlan.getCompatiblePlan().acquireType() == 0) {
                a(bVar, intPlan);
            }
        }
    }

    private void e(b bVar, IntPlan intPlan) {
        int i;
        boolean z;
        LogUtil.a("Suggestion_MyPlanInfoAdapter", "setDoingFitnessIntPlansData");
        bVar.f9960b.setOnClickListener(new View.OnClickListener() { // from class: iaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37411a.e(view);
            }
        });
        qqf.b(bVar.e, intPlan.getMetaInfo().getPicture(), qqf.d, 0, 0);
        bVar.j.setText(intPlan.getMetaInfo().getName());
        List<IntAction> listA = hvv.a(intPlan);
        IntAction intAction = null;
        if (listA.size() > 0) {
            Iterator<IntAction> it = listA.iterator();
            i = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                IntAction next = it.next();
                i++;
                if (next.getPunchFlag() == 0) {
                    intAction = next;
                    break;
                }
            }
        } else {
            i = 0;
            z = false;
        }
        c(bVar, intPlan);
        if (hvu.n(intPlan)) {
            bVar.m.setVisibility(8);
            if (z) {
                if (intAction == null) {
                    String string = this.f9943b.getString(R.string.IDS_fitness_plan_today_finish);
                    bVar.l.setText(string);
                    bVar.f.setText(string);
                    bVar.f.setVisibility(8);
                    bVar.k.setVisibility(0);
                    bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
                    return;
                }
                c(bVar, intAction.getActionId(), i, intPlan);
                return;
            }
            String string2 = this.f9943b.getString(R.string.sug_home_restday);
            bVar.l.setText(string2);
            bVar.f.setText(string2);
            bVar.f.setVisibility(8);
            bVar.k.setVisibility(0);
            bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
            if (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                e(bVar);
            }
        }
    }

    public /* synthetic */ void e(View view) {
        JumpUtil.a(this.f9943b);
    }

    private void e(b bVar) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(ift.a(System.currentTimeMillis()), System.currentTimeMillis());
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        WeakReference weakReference = new WeakReference(bVar);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            weightApi.getWeightData(hiAggregateOption, new AnonymousClass8(weakReference));
        } else {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "weightApi is null.");
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter$8, reason: invalid class name */
    public class AnonymousClass8 implements WeightCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f9955c;
        private Handler e = new Handler(Looper.getMainLooper());

        AnonymousClass8(WeakReference weakReference) {
            this.f9955c = weakReference;
        }

        public /* synthetic */ void c(ArrayList arrayList, WeakReference weakReference) {
            MyPlanInfoAdapter.this.c((ArrayList<vfv>) arrayList, (b) weakReference.get());
        }

        @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
        public void getWeight(final ArrayList<vfv> arrayList) {
            Handler handler = this.e;
            final WeakReference weakReference = this.f9955c;
            handler.post(new Runnable() { // from class: iar
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(arrayList, weakReference);
                }
            });
        }
    }

    private void c(b bVar, IntPlan intPlan) {
        float fFloatValue = ((Float) intPlan.getStat("progress").getValue()).floatValue();
        bVar.h.setText(gzx.c(this.f9943b, R.string.sug_home_finishpercent, ltc.c(fFloatValue, 2, 1)));
        bVar.n.setProgress(Math.round(fFloatValue));
        int iC = hvu.c(intPlan);
        if (iC > intPlan.getMetaInfo().getDayCount()) {
            bVar.d.setVisibility(8);
            bVar.f9961c.setVisibility(0);
            bVar.o.setText(R.string.sug_home_overdueplan);
            bVar.g.setText(intPlan.getMetaInfo().getName());
            return;
        }
        if (iC <= 0) {
            String string = this.f9943b.getResources().getString(R.string.IDS_fitness_plan_start_date, DateUtils.formatDateTime(this.f9943b, intPlan.getPlanTimeInfo().getBeginDate() * 1000, 24));
            bVar.d.setVisibility(8);
            bVar.f9961c.setVisibility(0);
            bVar.o.setText(string);
            bVar.g.setText(intPlan.getMetaInfo().getName());
            return;
        }
        bVar.d.setVisibility(0);
        bVar.f9961c.setVisibility(8);
        bVar.i.setText(gzx.b(this.f9943b, iC, intPlan.getMetaInfo().getDayCount(), 0));
    }

    private void c(b bVar, String str, int i, IntPlan intPlan) {
        bVar.f.setVisibility(0);
        bVar.k.setVisibility(8);
        bVar.f.setText(R.string.sug_start_train);
        bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.getCourseById(str, null, null, new AnonymousClass9(bVar, intPlan, i));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter$9, reason: invalid class name */
    public class AnonymousClass9 extends UiCallback<Workout> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IntPlan f9957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9958c;
        final /* synthetic */ b e;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        AnonymousClass9(b bVar, IntPlan intPlan, int i) {
            this.e = bVar;
            this.f9957b = intPlan;
            this.f9958c = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            final FitWorkout fitWorkoutD = pea.d(workout);
            if (fitWorkoutD == null) {
                return;
            }
            this.e.l.setText(fitWorkoutD.acquireName());
            HealthButton healthButton = this.e.f;
            final IntPlan intPlan = this.f9957b;
            final int i = this.f9958c;
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: iau
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37417a.b(fitWorkoutD, intPlan, i, view);
                }
            });
        }

        public /* synthetic */ void b(FitWorkout fitWorkout, IntPlan intPlan, int i, View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (fitWorkout.isRunModelCourse()) {
                ibn.d(MyPlanInfoAdapter.this.f9943b, fitWorkout, intPlan, jCurrentTimeMillis, i);
            } else {
                ibn.a(MyPlanInfoAdapter.this.f9943b, fitWorkout, intPlan, i, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (iem.e(this.f9943b, BluetoothAdapter.getDefaultAdapter() != null ? BluetoothAdapter.getDefaultAdapter().isEnabled() : false) && iem.e(this.f9943b)) {
            pqm.a().e(new e(this));
        } else {
            e();
        }
    }

    private void a(b bVar, IntPlan intPlan) {
        this.f9942a = intPlan.getCompatiblePlan();
        bVar.m.setVisibility(8);
        bVar.f9960b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == null) {
                    LogUtil.j("Suggestion_MyPlanInfoAdapter", "view == null");
                    return;
                }
                if (view.hasWindowFocus()) {
                    JumpUtil.a(MyPlanInfoAdapter.this.f9943b);
                    HashMap map = new HashMap(2);
                    map.put("click", "1");
                    map.put("type", 1);
                    map.put("planType", 0);
                    map.put("planName", MyPlanInfoAdapter.this.f9942a.acquireName());
                    map.put("enter", "2");
                    idy.b(AnalyticsValue.HEALTH_HOME_TRAINING_PROGRAM_PIC_2010036.value(), map);
                    return;
                }
                LogUtil.j("Suggestion_MyPlanInfoAdapter", "on click return because window not has focus");
            }
        });
        a(bVar);
        bVar.f.setVisibility(0);
        bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
        bVar.n.setVisibility(0);
        bVar.i.setVisibility(0);
        bVar.j.setText(this.f9942a.acquireName());
        b(bVar);
        b(bVar, intPlan);
        qqf.c(pea.e(this.f9942a.getPriceTagBeanList()), bVar.f9959a, qqf.d);
    }

    private void b(b bVar, IntPlan intPlan) {
        if (intPlan.getStat("progress") != null) {
            float fFloatValue = ((Float) intPlan.getStat("progress").getValue()).floatValue();
            bVar.n.setProgress(Math.round(fFloatValue));
            bVar.h.setText(gzx.c(this.f9943b, R.string.sug_home_finishpercent, ltc.c(fFloatValue, 2, 1)));
        }
    }

    private void b(b bVar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(new Date());
        List<PlanWorkout> listD = d(this.f9942a, str);
        if (njy.c(listD, 0)) {
            this.i = listD.get(0);
        } else {
            this.i = null;
        }
        if (this.i == null) {
            String string = this.f9943b.getString(R.string.sug_home_restday);
            bVar.l.setText(string);
            bVar.k.setVisibility(0);
            bVar.f.setVisibility(8);
            bVar.f.setText(string);
            bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
            bVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        } else {
            bVar.k.setVisibility(8);
            bVar.f.setVisibility(0);
            d(bVar);
            bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
            String strPopName = this.i.popName();
            if (!TextUtils.isEmpty(strPopName)) {
                bVar.l.setText(strPopName);
                bVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        MyPlanInfoAdapter.this.c();
                    }
                });
            }
        }
        d(bVar, simpleDateFormat, str);
    }

    private void d(final b bVar) {
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.12
            @Override // java.lang.Runnable
            public void run() {
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi == null) {
                    LogUtil.j("Suggestion_MyPlanInfoAdapter", "setRunWorkout, run: courseApi is null.");
                } else {
                    final int i = courseApi.hasDoneTodayRunTask(MyPlanInfoAdapter.this.f9942a) ? R.string.sug_home_repeat_workout : R.string.sug_start_train;
                    MyPlanInfoAdapter.this.f9944c.post(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.12.3
                        @Override // java.lang.Runnable
                        public void run() {
                            bVar.f.setText(i);
                        }
                    });
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    private void d(b bVar, SimpleDateFormat simpleDateFormat, String str) {
        boolean z;
        int time;
        int i;
        String strAcquireStartDate = this.f9942a.acquireStartDate();
        if (str == null) {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "todayDate == null");
            z = false;
        } else {
            z = true;
        }
        if (strAcquireStartDate == null) {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "startDate == null");
        } else {
            if (z) {
                try {
                    time = (int) ((simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse(strAcquireStartDate).getTime()) / 86400000);
                } catch (ParseException e2) {
                    LogUtil.e("Suggestion_MyPlanInfoAdapter", "exception = ", LogAnonymous.b(e2));
                    time = 0;
                }
            }
            i = time + 1;
            if (i > this.f9942a.getDays()) {
                bVar.f.setText(R.string.sug_finish_plan);
                bVar.l.setText(R.string.sug_home_overdueplan);
                bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
                bVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.14
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        MyPlanInfoAdapter myPlanInfoAdapter = MyPlanInfoAdapter.this;
                        myPlanInfoAdapter.a(myPlanInfoAdapter.f9942a);
                    }
                });
                time = this.f9942a.getDays() - 1;
            } else if (i < 0) {
                time = -1;
            }
            bVar.i.setText(gzx.b(this.f9943b, time + 1, this.f9942a.getDays(), 0));
        }
        time = 0;
        i = time + 1;
        if (i > this.f9942a.getDays()) {
            bVar.f.setText(R.string.sug_finish_plan);
            bVar.l.setText(R.string.sug_home_overdueplan);
            bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
            bVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.14
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MyPlanInfoAdapter myPlanInfoAdapter = MyPlanInfoAdapter.this;
                    myPlanInfoAdapter.a(myPlanInfoAdapter.f9942a);
                }
            });
            time = this.f9942a.getDays() - 1;
        } else if (i < 0) {
            time = -1;
        }
        bVar.i.setText(gzx.b(this.f9943b, time + 1, this.f9942a.getDays(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "checkUserInfo : userProfileMgrApi is null.");
        } else {
            userProfileMgrApi.checkUserInfo(this.f9943b, new IBaseResponseCallback() { // from class: iap
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f37410c.b(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i != 0) {
            a();
        }
    }

    private void a() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "startRunPlan : planApi is null.");
            return;
        }
        planApi.setPlanType(0);
        planApi.cancelTodayPlanRemind(this.f9942a);
        if (hcg.e().d()) {
            gzm.c(this.i);
            HashMap map = new HashMap(16);
            map.put("click", 1);
            map.put(BleConstants.SPORT_TYPE, 1);
            idy.b(AnalyticsValue.HEALTH_HOME_START_TRAIN_BTN_2010037.value(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f9943b);
        builder.b(com.huawei.health.servicesui.R.string.IDS_hwh_motiontrack_ingnore_link_attention);
        builder.c(com.huawei.ui.commonui.R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_MyPlanInfoAdapter", "ignore link and continue");
                MyPlanInfoAdapter.this.e();
            }
        });
        builder.a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Plan plan) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f9943b);
        builder.b(R.string.sug_home_finishplan);
        builder.c(R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    LogUtil.e("Suggestion_MyPlanInfoAdapter", "finishPlan planApi is null.");
                    return;
                }
                final String strAcquireId = plan.acquireId();
                planApi.setPlanType(ibl.a(strAcquireId));
                planApi.finishPlan(1, strAcquireId, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.4.2
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Suggestion_MyPlanInfoAdapter", "error Code = ", Integer.valueOf(i), ";errorInfo = ", str);
                        MyPlanInfoAdapter.this.a(i);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str) {
                        LogUtil.a("Suggestion_MyPlanInfoAdapter", "data = ", str);
                        ibf.e().e(strAcquireId);
                    }
                });
            }
        });
        builder.a(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f9943b);
        builder.a(R.string.sug_notify).a(c(i)).a(R.string.sug_coach_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.b().show();
    }

    private List<PlanWorkout> d(Plan plan, String str) {
        List<PlanWorkout> listAcquireWorkouts = plan.acquireWorkouts();
        ArrayList arrayList = new ArrayList();
        if (njy.e(listAcquireWorkouts)) {
            LogUtil.j("Suggestion_MyPlanInfoAdapter", "CollectionUtils.isEmpty(planWorkouts)");
            return arrayList;
        }
        for (PlanWorkout planWorkout : listAcquireWorkouts) {
            if (planWorkout != null && str.equals(planWorkout.popDayInfo().acquireDate())) {
                if (planWorkout.popWorkoutId() != null) {
                    arrayList.add(planWorkout);
                }
                int size = arrayList.size();
                LogUtil.d("Suggestion_MyPlanInfoAdapter", Integer.valueOf(size), "==today have workouts: ", planWorkout.popName());
            }
        }
        return arrayList;
    }

    private void a(b bVar) {
        if (!LanguageUtil.ba(this.f9943b)) {
            qqf.a(bVar.e, com.huawei.health.servicesui.R.drawable.old_plan_bg, qqf.d, 0, 0);
        } else {
            d(bVar.e);
        }
    }

    private void d(ImageView imageView) {
        qqf.e(qqz.e(this.f9943b, com.huawei.health.servicesui.R.drawable.old_plan_bg), imageView, qqf.d);
    }

    private String c(int i) {
        if (i != -404) {
            return this.f9943b.getString(R.string.sug_data_fetch_error);
        }
        return this.f9943b.getString(R.string.sug_haveno_network);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.b(this.d)) {
            return this.d.size();
        }
        if (FitnessExternalUtils.b()) {
            return this.e.size();
        }
        return this.d.size();
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MyPlanInfoAdapter> f9962a;

        e(MyPlanInfoAdapter myPlanInfoAdapter) {
            this.f9962a = new WeakReference<>(myPlanInfoAdapter);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MyPlanInfoAdapter myPlanInfoAdapter = this.f9962a.get();
            if (i != 100000 || !(obj instanceof String)) {
                LogUtil.e("Suggestion_MyPlanInfoAdapter", "onResponse error");
                if (myPlanInfoAdapter == null || myPlanInfoAdapter.f9944c == null) {
                    return;
                }
                myPlanInfoAdapter.f9944c.sendMessage(myPlanInfoAdapter.f9944c.obtainMessage(1));
                return;
            }
            OperatorStatus operatorStatus = (OperatorStatus) new Gson().fromJson(CommonUtil.ac((String) obj), OperatorStatus.class);
            if (myPlanInfoAdapter == null || myPlanInfoAdapter.f9944c == null) {
                return;
            }
            Handler handler = myPlanInfoAdapter.f9944c;
            if (operatorStatus.getTrainMonitorState() == 0) {
                LogUtil.a("Suggestion_MyPlanInfoAdapter", "device is not running");
                handler.sendMessage(handler.obtainMessage(1));
            } else {
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ArrayList<vfv> arrayList, b bVar) {
        UserInfomation userInfo;
        if (bVar == null) {
            return;
        }
        if (arrayList.size() == 0) {
            LogUtil.a("Suggestion_MyPlanInfoAdapter", "processLatestWeight has no record");
            bVar.f.setText(this.f9943b.getString(R.string.IDS_measure_weight));
            bVar.k.setVisibility(8);
            bVar.f.setVisibility(0);
            bVar.f.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
            UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
            final double weightOrDefaultValue = (userProfileMgrApi == null || (userInfo = userProfileMgrApi.getUserInfo()) == null) ? 65.0d : userInfo.getWeightOrDefaultValue();
            bVar.f.setOnClickListener(new View.OnClickListener() { // from class: ias
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37414b.b(weightOrDefaultValue, view);
                }
            });
            return;
        }
        vfv vfvVar = arrayList.get(0);
        LogUtil.a("Suggestion_MyPlanInfoAdapter", "processLatestWeight has record ", Double.valueOf(vfvVar.d()));
        bVar.f.setVisibility(8);
        if (vfvVar.d() > 0.0d) {
            bVar.k.setVisibility(8);
            bVar.m.setVisibility(0);
            bVar.m.setText(gzx.c(this.f9943b, R.string.IDS_fitness_plan_today_weight, ltc.c(vfvVar.d(), 1, 1)));
            bVar.m.setTextColor(ContextCompat.getColor(this.f9943b, R.color.white));
        }
    }

    public /* synthetic */ void b(double d, View view) {
        JumpUtil.c(this.f9943b, d, 20.0d);
    }
}
