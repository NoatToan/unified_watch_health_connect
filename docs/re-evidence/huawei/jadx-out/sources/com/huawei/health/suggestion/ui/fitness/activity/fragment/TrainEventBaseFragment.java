package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.health.suggestion.ui.fitness.module.SugChart;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.hcu;
import defpackage.hks;
import defpackage.hmc;
import defpackage.ibi;
import defpackage.ieg;
import defpackage.njy;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qqs;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class TrainEventBaseFragment extends Fragment implements Animation.AnimationListener, View.OnClickListener, SugChart.OnHelperGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f9249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseRecyclerViewAdapter<Object> f9250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9251c;
    private LinearLayout d;
    private int e;
    private Plan f;
    private Date g;
    private ImageView h;
    private ImageView i;
    private boolean j = false;
    private List<WorkoutRecord> k;
    private View l;
    private Date m;
    private String n;
    private int o;
    private List<WorkoutRecord> p;
    private ImageView q;
    private String r;
    private List<WorkoutRecord> s;
    private HealthTextView t;
    private HealthRecycleView u;
    private int v;
    private TranslateAnimation x;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.SugChart.OnHelperGestureListener
    public void scrollY(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.o = arguments.getInt("plantype");
            this.n = arguments.getString("planid");
            this.v = arguments.getInt(DBSessionCommon.COLUMN_TIME_ZONE);
            this.f = (Plan) arguments.getParcelable("joined");
        }
        View viewInflate = layoutInflater.inflate(R.layout.sug_trainevent_basefm, viewGroup, false);
        BaseActivity.cancelLayoutById(viewInflate);
        this.q = (ImageView) viewInflate.findViewById(R.id.sug_iv_ani);
        viewInflate.findViewById(R.id.sug_trainevent_time).setVisibility(0);
        BaseActivity.setViewSafeRegion(false, viewInflate.findViewById(R.id.sug_trainevent_time));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.sug_train_rcv_events);
        this.u = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        View viewFindViewById = viewInflate.findViewById(R.id.sug_loading_layout);
        this.l = viewFindViewById;
        viewFindViewById.setVisibility(8);
        e();
        this.t = (HealthTextView) viewInflate.findViewById(R.id.sug_tv_tevent_stime);
        this.h = (ImageView) viewInflate.findViewById(R.id.sug_event_last);
        this.i = (ImageView) viewInflate.findViewById(R.id.sug_event_next);
        c();
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.i.setVisibility(4);
        d();
        try {
            if (this.f != null) {
                this.m = new SimpleDateFormat("yyyy-MM-dd").parse(this.f.acquireStartDate());
                this.g = new SimpleDateFormat("yyyy-MM-dd").parse(this.f.getEndDate());
            }
            Calendar calendar = Calendar.getInstance();
            b(calendar);
            e(calendar);
        } catch (ParseException e) {
            LogUtil.e("Suggestion_TraineventBaseFm", "onCreateView", LogAnonymous.b(e));
        }
        this.u.setAdapter(this.f9250b);
        d(Calendar.getInstance());
        b();
        return viewInflate;
    }

    private void b() {
        this.u.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.TrainEventBaseFragment.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (i2 != 0) {
                    LogUtil.d("Suggestion_TraineventBaseFm", "mIsUpDownScrolling");
                    TrainEventBaseFragment.this.j = true;
                }
                if (i != 0) {
                    LogUtil.d("Suggestion_TraineventBaseFm", "mIsLeftRightScrolling");
                    TrainEventBaseFragment.this.j = false;
                }
            }
        });
    }

    private void e() {
        this.f9250b = new BaseRecyclerViewAdapter<Object>(new ArrayList(), R.layout.sug_train_event_chart2, R.layout.sug_item_rcvtrain_event) { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.TrainEventBaseFragment.2
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemViewType(int i) {
                return i > 1 ? 1 : 0;
            }

            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            public void convert(RecyclerHolder recyclerHolder, int i, Object obj) {
                ImageView imageView;
                if (recyclerHolder == null) {
                    return;
                }
                TrainEventBaseFragment.this.d = (LinearLayout) recyclerHolder.e(R.id.event_chart);
                TrainEventBaseFragment.this.f9249a = (LinearLayout) recyclerHolder.e(R.id.event_bottom);
                BaseActivity.setViewSafeRegion(false, TrainEventBaseFragment.this.f9249a, TrainEventBaseFragment.this.d);
                if (i == getItemCount() - 1 && (imageView = (ImageView) recyclerHolder.e(R.id.sug_item_rcvtrain_underline)) != null) {
                    imageView.setVisibility(4);
                }
                if (i == 0) {
                    if (njy.b(obj, hmc.class)) {
                        TrainEventBaseFragment.this.e(recyclerHolder, (List<hmc>) obj);
                    }
                } else if (i == 1) {
                    if (njy.b(obj, hmc.class)) {
                        TrainEventBaseFragment.this.a(recyclerHolder, (List<hmc>) obj);
                    }
                } else if (i >= 2) {
                    TrainEventBaseFragment.this.b(recyclerHolder, i, obj);
                }
            }
        };
    }

    private void d() {
        if (getContext() == null || !qqs.e(getContext())) {
            return;
        }
        this.i.setBackground(qqf.c(getContext().getResources().getDrawable(com.huawei.ui.commonui.R.drawable.common_ui_arrow_right), getContext().getResources().getColor(com.huawei.ui.commonui.R.color.healthTintColorPrimary)));
        this.h.setBackground(qqf.c(getContext().getResources().getDrawable(com.huawei.ui.commonui.R.drawable.common_ui_arrow_left), getContext().getResources().getColor(com.huawei.ui.commonui.R.color.healthTintColorPrimary)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(RecyclerHolder recyclerHolder, List<hmc> list) {
        if (this.j) {
            LogUtil.a("Suggestion_TraineventBaseFm", "holderItemFirstExcel mIsUpDownScrolling");
            return;
        }
        recyclerHolder.a(R.id.sug_cb_tevent_b, 8).a(R.id.sug_sc_tevent_chart2, 8);
        recyclerHolder.e(R.id.sug_cb_tevent_b_line).setVisibility(8);
        SugChart sugChart = (SugChart) recyclerHolder.e(R.id.sug_sc_tevent_chart);
        sugChart.b(1);
        sugChart.e(30);
        sugChart.d(this);
        if (this.o == 0) {
            recyclerHolder.b(R.id.sug_cb_tevent_t, getString(R.string.sug_distance).toUpperCase(Locale.ENGLISH));
            sugChart.f(b(R.color.sug_event_overcolor));
            sugChart.c(b(R.color.sug_event_dgreen), b(R.color.sug_event_green));
            sugChart.g(b(R.color.sug_event_selebg3));
        } else {
            sugChart.f(b(R.color.sug_event_overcolor_k));
            sugChart.c(b(R.color.sug_event_dorign), b(R.color.sug_event_qorign));
            sugChart.g(b(R.color.sug_event_selebg4));
        }
        sugChart.c(b(com.huawei.ui.commonui.R.color.textColorSecondary));
        sugChart.e(d(R.dimen.sug_chart_textsize));
        sugChart.a(b(com.huawei.ui.commonui.R.color.textColorTertiary));
        c(list, sugChart);
        sugChart.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecyclerHolder recyclerHolder, List<hmc> list) {
        if (this.j) {
            LogUtil.a("Suggestion_TraineventBaseFm", "holderItemMidExcel mIsUpDownScrolling");
            return;
        }
        recyclerHolder.b(R.id.sug_cb_tevent_b, getString(R.string.sug_train_event).toUpperCase(Locale.ENGLISH)).a(R.id.sug_sc_tevent_chart, 8);
        SugChart sugChart = (SugChart) recyclerHolder.e(R.id.sug_sc_tevent_chart2);
        sugChart.b(2);
        sugChart.e(30);
        sugChart.d(this);
        if (this.o == 0) {
            recyclerHolder.b(R.id.sug_cb_tevent_t, getString(R.string.sug_history_pace).toUpperCase(Locale.ENGLISH));
            sugChart.f(b(R.color.sug_event_50dorign));
            sugChart.c(b(R.color.sug_event_dgreen2), b(R.color.sug_event_green1));
            sugChart.g(b(R.color.sug_event_selebg1));
            sugChart.j(b(R.color.sug_event_selebg1));
        } else {
            recyclerHolder.b(R.id.sug_cb_tevent_t, getString(R.string.sug_coach_rate).toUpperCase(Locale.ENGLISH));
            sugChart.f(b(R.color.sug_event_overcolor_k));
            sugChart.c(b(R.color.sug_event_dorign1), b(R.color.sug_event_qorign1));
            sugChart.g(b(R.color.sug_event_selebg));
            sugChart.j(b(R.color.sug_event_selebg));
        }
        sugChart.a(d(R.dimen.sug_event_linewidth));
        sugChart.a(b(com.huawei.ui.commonui.R.color.textColorTertiary));
        sugChart.c(d(R.dimen.sug_event_line_pointradio));
        sugChart.c(b(com.huawei.ui.commonui.R.color.textColorSecondary));
        sugChart.d(b(com.huawei.ui.commonui.R.color.textColorTertiary));
        c(list, sugChart);
        sugChart.d(list);
    }

    private void c(List<hmc> list, SugChart sugChart) {
        if (LanguageUtil.ba(sugChart.getContext().getApplicationContext())) {
            Collections.reverse(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RecyclerHolder recyclerHolder, int i, Object obj) {
        e(recyclerHolder, i);
        if (obj instanceof WorkoutRecord) {
            final WorkoutRecord workoutRecord = (WorkoutRecord) obj;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            String[] strArr = {simpleDateFormat.format(Long.valueOf(workoutRecord.acquireExerciseTime())), SimpleDateFormat.getDateInstance(3).format(Long.valueOf(workoutRecord.acquireExerciseTime()))};
            b(recyclerHolder, workoutRecord, simpleDateFormat, strArr);
            recyclerHolder.b(R.id.sug_item_train_workout_date, strArr[1]).b(R.id.sug_item_train_workout_name, workoutRecord.acquireWorkoutName()).b(R.id.sug_item_train_workout_execute, strArr[0]);
            a(recyclerHolder, new Date(workoutRecord.acquireExerciseTime()));
            recyclerHolder.d(R.id.sug_trainevent_event, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.TrainEventBaseFragment.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TrainEventBaseFragment.this.o == 0 || workoutRecord.isRunWorkout()) {
                        TrainEventBaseFragment.this.a(workoutRecord);
                    } else {
                        TrainEventBaseFragment.this.d(workoutRecord);
                    }
                }
            });
        }
    }

    private void b(RecyclerHolder recyclerHolder, WorkoutRecord workoutRecord, SimpleDateFormat simpleDateFormat, String[] strArr) {
        if (this.o == 0) {
            hks.a(workoutRecord, simpleDateFormat, strArr);
            recyclerHolder.b(R.id.sug_item_train_workout_kcal, gzx.d(gzw.a(), (int) workoutRecord.acquireActualDistance(), ped.e(ped.h(workoutRecord.acquireActualDistance())))).b(R.id.sug_item_train_workout_duration, String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(workoutRecord.getDuration() / 3600), Integer.valueOf((workoutRecord.getDuration() % 3600) / 60), Integer.valueOf(workoutRecord.getDuration() % 60))).b(R.id.sug_item_train_workout_heartbeat, gzx.c(getActivity(), gzw.e(), hks.a(workoutRecord.acquireActualDistance() == 0.0f ? 0.0d : ((double) workoutRecord.getDuration()) / ped.h(workoutRecord.acquireActualDistance()))));
            return;
        }
        recyclerHolder.b(R.id.sug_item_train_workout_kcal, gzx.c(getActivity().getApplicationContext(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.i(workoutRecord.getDuration()))).b(R.id.sug_item_train_workout_duration, gzx.d(R.plurals.IDS_track_total_calorie_kcals, (int) workoutRecord.acquireActualCalorie(), ped.e(workoutRecord.acquireActualCalorie()))).b(R.id.sug_item_train_workout_heartbeat, UnitUtil.e(workoutRecord.acquireFinishRate(), 2, 0));
    }

    private void e(RecyclerHolder recyclerHolder, int i) {
        if (i == this.f9250b.getItemCount() - 1) {
            recyclerHolder.a(R.id.sug_event_bottom_, 0);
        } else {
            recyclerHolder.a(R.id.sug_event_bottom_, 8);
        }
    }

    private void a(RecyclerHolder recyclerHolder, Date date) {
        if (ieg.e(date, new Date()) == 0) {
            recyclerHolder.a(R.id.sug_item_train_workout_date, 8);
            recyclerHolder.a(R.id.sug_item_train_workout_execute, 0);
        } else {
            recyclerHolder.a(R.id.sug_item_train_workout_date, 0);
            recyclerHolder.a(R.id.sug_item_train_workout_execute, 8);
        }
    }

    private void b(Calendar calendar) {
        int i = this.v;
        if (i == 2) {
            calendar.add(6, -6);
        } else if (i == 3) {
            calendar.add(6, -30);
        }
    }

    private void c() {
        if (LanguageUtil.ba(getContext())) {
            this.h.setRotation(180.0f);
            this.i.setRotation(180.0f);
        }
    }

    private void d(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, z ? 1.0f : -1.0f, 2, 0.0f, 2, 0.0f);
        this.x = translateAnimation;
        translateAnimation.setAnimationListener(this);
        this.x.setDuration(400L);
        this.x.setInterpolator(new AccelerateDecelerateInterpolator());
        this.q.startAnimation(this.x);
    }

    public void b(boolean z) {
        this.j = false;
        if (a(z)) {
            return;
        }
        boolean zE = e(z);
        Calendar calendar = Calendar.getInstance();
        int i = this.v;
        if (i == 2) {
            calendar.add(3, this.e);
            c(z, zE, calendar);
        } else if (i == 3) {
            calendar.add(6, this.e * 31);
            c(z, zE, calendar);
        }
    }

    private boolean e(boolean z) {
        if (z) {
            this.e++;
            return false;
        }
        this.e--;
        return true;
    }

    private boolean a(boolean z) {
        if (this.v != 4) {
            return z && this.e >= 0;
        }
        return true;
    }

    private void c(boolean z, boolean z2, Calendar calendar) {
        if (ieg.e(calendar.getTime(), this.m) <= 0) {
            b(z2, calendar);
            e(calendar);
        } else {
            c(z);
        }
    }

    private void c(boolean z) {
        if (z) {
            this.e--;
        } else {
            this.e++;
        }
    }

    private void b(boolean z, Calendar calendar) {
        this.h.setVisibility(0);
        Bitmap bitmapE = gzx.e(this.u);
        if (gzx.e(this.q, bitmapE)) {
            this.q.setImageBitmap(bitmapE);
            this.q.setVisibility(0);
            d(z);
        }
        this.l.setVisibility(0);
        d(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WorkoutRecord workoutRecord) {
        Intent intent = new Intent(getActivity(), (Class<?>) FitnessResultActivity.class);
        intent.putExtra("workout_record", workoutRecord);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WorkoutRecord workoutRecord) {
        String strAcquireRunWorkoutTrajectoryId = TextUtils.isEmpty(workoutRecord.acquireTrajectoryId()) ? workoutRecord.acquireRunWorkoutTrajectoryId() : workoutRecord.acquireTrajectoryId();
        if (gzx.e(strAcquireRunWorkoutTrajectoryId)) {
            hcu.b().c(strAcquireRunWorkoutTrajectoryId);
        }
    }

    public int b(int i) {
        return getResources().getColor(i);
    }

    public float d(int i) {
        return getResources().getDimension(i);
    }

    private void a(Calendar calendar) {
        LogUtil.d("Suggestion_TraineventBaseFm", "getLocalData");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        List<WorkoutRecord> workoutRecords = courseApi != null ? courseApi.getWorkoutRecords(this.n, this.r, this.f9251c) : null;
        if (njy.b(workoutRecords)) {
            LogUtil.a("Suggestion_TraineventBaseFm", workoutRecords.toString());
            e(workoutRecords);
        } else {
            this.p = null;
            this.k = null;
            this.s = null;
            LogUtil.j("Suggestion_TraineventBaseFm", "getWorkoutRecords the data is null");
        }
        c(calendar);
    }

    private void e(List<WorkoutRecord> list) {
        if (this.o == 0) {
            ibi.b(list);
        }
        int i = this.v;
        if (i == 2) {
            this.p = list;
            LogUtil.d("Suggestion_TraineventBaseFm", "WeekRecordsData size：", Integer.valueOf(list.size()));
        } else if (i == 3) {
            this.k = list;
            LogUtil.d("Suggestion_TraineventBaseFm", "MonthRecordsData size：", Integer.valueOf(list.size()));
        } else {
            this.s = list;
            LogUtil.d("Suggestion_TraineventBaseFm", "AllRecordsData size：", Integer.valueOf(list.size()));
        }
    }

    private void c(Calendar calendar) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), getString(R.string.sug_timeformart_mmmd)));
        ArrayList arrayList3 = new ArrayList(10);
        int i = this.v;
        if (i == 2) {
            e(this.p, arrayList, arrayList2, new d(7, calendar, simpleDateFormat), arrayList3);
        } else if (i == 3) {
            e(this.k, arrayList, arrayList2, new d(31, calendar, simpleDateFormat), arrayList3);
        } else {
            Plan plan = this.f;
            if (plan != null) {
                hks.c(arrayList, arrayList2, plan);
                arrayList3.add(e(calendar, this.s, arrayList, 0));
                arrayList3.add(e(calendar, this.s, arrayList2, 1));
                hks.d(this.s, arrayList3);
            }
        }
        this.f9250b.refreshDataChange(arrayList3);
        this.l.setVisibility(8);
    }

    private void e(List<WorkoutRecord> list, List<hmc> list2, List<hmc> list3, d dVar, List<Object> list4) {
        for (int i = 0; i < dVar.f9255c; i++) {
            hmc hmcVarE = hks.e(dVar.d, dVar.e, i, this.v);
            list2.add(hmcVarE);
            Object objClone = hmcVarE.clone();
            if (objClone instanceof hmc) {
                list3.add((hmc) objClone);
            }
        }
        dVar.d.add(6, -dVar.f9255c);
        list4.add(e(dVar.d, list, list2, 0));
        list4.add(e(dVar.d, list, list3, 1));
        hks.d(list, list4);
    }

    private List e(Calendar calendar, List<WorkoutRecord> list, List<hmc> list2, int i) {
        if (list == null) {
            return list2;
        }
        if (i == 0) {
            if (this.o == 0) {
                int i2 = this.v;
                if (i2 == 2) {
                    return d(list2, list, calendar, 0);
                }
                if (i2 == 3) {
                    return d(list2, list, calendar, 0);
                }
                return d(list2, list, null, 0);
            }
            int i3 = this.v;
            if (i3 == 2) {
                return d(list2, list, calendar, 1);
            }
            if (i3 == 3) {
                return d(list2, list, calendar, 1);
            }
            return d(list2, list, null, 1);
        }
        if (this.o == 0) {
            int i4 = this.v;
            if (i4 == 2) {
                return d(list2, list, calendar, 2);
            }
            if (i4 == 3) {
                return d(list2, list, calendar, 2);
            }
            return d(list2, list, null, 2);
        }
        int i5 = this.v;
        if (i5 == 2) {
            return d(list2, list, calendar, 3);
        }
        if (i5 == 3) {
            return d(list2, list, calendar, 3);
        }
        return d(list2, list, null, 3);
    }

    private List<hmc> d(List<hmc> list, List<WorkoutRecord> list2, Calendar calendar, int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (njy.b(list2)) {
            boolean z = true;
            for (WorkoutRecord workoutRecord : list2) {
                if (workoutRecord != null) {
                    try {
                        int iA = hks.a(calendar, simpleDateFormat, workoutRecord, this.m);
                        if (workoutRecord.acquireFinishRate() < 100.0f) {
                            z = false;
                        }
                        hks.a(list, new hks.c(calendar, i, workoutRecord, iA), new DecimalFormat("##.##"), z);
                    } catch (ParseException unused) {
                        LogUtil.e("Suggestion_TraineventBaseFm", "DateFormat exception：", workoutRecord.acquireWorkoutDate());
                    }
                }
            }
        }
        return list;
    }

    protected void d(Calendar calendar) {
        e(calendar);
        java.text.DateFormat dateInstance = SimpleDateFormat.getDateInstance(3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (this.v == 4) {
            this.h.setVisibility(8);
            try {
                e(dateInstance, simpleDateFormat);
            } catch (ParseException unused) {
                LogUtil.j("Suggestion_TraineventBaseFm", "getRecordPlan parse calendar ParseException ");
            }
        } else {
            a(calendar, dateInstance, simpleDateFormat);
        }
        LogUtil.d("Suggestion_TraineventBaseFm", "acquire the date：", this.r, "--", this.f9251c);
        a(calendar);
    }

    private void a(Calendar calendar, java.text.DateFormat dateFormat, SimpleDateFormat simpleDateFormat) {
        a();
        this.f9251c = simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        String str = dateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        b(calendar);
        this.r = simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        String str2 = dateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        this.t.setText(gzx.c(BaseApplication.getContext(), R.string.sug_his_time_formart, str2, str));
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.t.setText(gzx.c(BaseApplication.getContext(), R.string.sug_his_time_formart, str, str2));
        }
    }

    private void a() {
        if (this.e < 0) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(4);
        }
    }

    private void e(Calendar calendar) {
        if (ieg.e(calendar.getTime(), this.m) >= 0) {
            this.h.setVisibility(4);
        }
    }

    private void e(java.text.DateFormat dateFormat, SimpleDateFormat simpleDateFormat) throws ParseException {
        Plan plan = this.f;
        if (plan == null || TextUtils.isEmpty(plan.acquireStartDate())) {
            return;
        }
        this.m = simpleDateFormat.parse(this.f.acquireStartDate());
        this.g = simpleDateFormat.parse(this.f.getEndDate());
        this.r = new SimpleDateFormat("yyyy-MM-dd").format(this.m);
        this.f9251c = new SimpleDateFormat("yyyy-MM-dd").format(this.g);
        this.t.setText(gzx.c(BaseApplication.getContext(), R.string.sug_his_time_formart, dateFormat.format(this.m), dateFormat.format(this.g)));
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.t.setText(gzx.c(BaseApplication.getContext(), R.string.sug_his_time_formart, dateFormat.format(this.g), dateFormat.format(this.m)));
        }
        if (this.f.getWeekCount() == 0) {
            LogUtil.e("Suggestion_TraineventBaseFm", "mJoinedPlan.getWeekCount()  planData error");
            this.f.saveWeekCount(ieg.e(this.m, this.g));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        this.q.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.q.setVisibility(4);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.d("Suggestion_TraineventBaseFm", "last and next click disable");
        if (view.getId() == R.id.sug_event_last) {
            b(false);
        } else {
            b(true);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.SugChart.OnHelperGestureListener
    public void scrollX(boolean z) {
        b(!z);
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9255c;
        private Calendar d;
        private SimpleDateFormat e;

        d(int i, Calendar calendar, SimpleDateFormat simpleDateFormat) {
            this.f9255c = i;
            this.d = calendar;
            this.e = simpleDateFormat;
        }
    }
}
