package com.huawei.health.suggestion.customizecourse.manager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.ItemEventListener;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.OnStartDragListener;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseActionViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseCourseHeadViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseMultiBottomViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseMultiViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import defpackage.gzf;
import defpackage.gzy;
import defpackage.hca;
import defpackage.hcc;
import defpackage.hdr;
import defpackage.njy;
import defpackage.qpx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CustomCourseActionAdapter extends CustomCourseCanDragAdapter implements CourseMultiViewHolder.OnMultiCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8907b;
    private int d;
    private ArrayList<hdr> e;
    private ChoreographedSingleAction f;
    private HeartRateConfigHelper g;
    private TargetConfig i;
    private final OnStartDragListener j;
    private hca k;
    private final ItemEventListener m;
    private int n;
    private gzf p;
    private hca q;
    private ChoreographedMultiActions t;
    private int o = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8908c = -1;
    private int h = -1;
    private long l = System.currentTimeMillis();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        b((CustomCourseDragViewHolder) viewHolder, i, (List<Object>) list);
    }

    public CustomCourseActionAdapter(Context context, OnStartDragListener onStartDragListener, ItemEventListener itemEventListener) {
        this.f8906a = context;
        this.j = onStartDragListener;
        this.m = itemEventListener;
    }

    public void b(HeartRateConfigHelper heartRateConfigHelper, gzf gzfVar) {
        this.g = heartRateConfigHelper;
        this.p = gzfVar;
    }

    public void d(int i) {
        this.o = i;
    }

    public void d(FitWorkout fitWorkout) {
        if (fitWorkout == null || njy.e(fitWorkout.getCourseActions())) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "setFitWorkout, fitWorkout == null or CollectionUtils.isEmpty(fitWorkout.getCourseActions())");
            return;
        }
        ArrayList<hdr> arrayList = this.e;
        if (arrayList == null) {
            this.e = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        hdr hdrVar = new hdr();
        hdrVar.a(5);
        hdrVar.c(fitWorkout.acquireName());
        hdrVar.d(fitWorkout.acquireDescription());
        this.e.add(hdrVar);
        for (ChoreographedMultiActions choreographedMultiActions : fitWorkout.getCourseActions()) {
            if (choreographedMultiActions == null || !njy.b(choreographedMultiActions.getActionList())) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "setFitWorkout, multiActions.getActionList() isEmpty");
            } else {
                d(choreographedMultiActions);
            }
        }
        notifyDataSetChanged();
    }

    private void d(ChoreographedMultiActions choreographedMultiActions) {
        if (choreographedMultiActions.getRepeatTimes() <= 1 && choreographedMultiActions.getActionList().size() == 1) {
            c(choreographedMultiActions);
        } else {
            a(choreographedMultiActions);
        }
    }

    private hdr a(ChoreographedMultiActions choreographedMultiActions, long j) {
        hdr hdrVar = new hdr();
        hdrVar.c(j);
        hdrVar.a(3);
        hdrVar.c(choreographedMultiActions.getRepeatTimes());
        return hdrVar;
    }

    private hdr a(ChoreographedSingleAction choreographedSingleAction, int i, long j) {
        hdr hdrVar = new hdr();
        hdrVar.c(j);
        hdrVar.a(i);
        if (choreographedSingleAction.getAction() != null) {
            hdrVar.a(choreographedSingleAction.getAction());
            hdrVar.c(b(choreographedSingleAction.getAction()));
            hdrVar.b(choreographedSingleAction.getAction().getId());
        }
        hdrVar.c(1);
        if (this.k == null || this.q == null) {
            g();
        }
        hdrVar.d(this.f8906a, choreographedSingleAction.getTargetConfig(), this.k);
        hdrVar.d(this.f8906a, choreographedSingleAction.getIntensityConfig(), this.k, this.q, this.d, this.p);
        return hdrVar;
    }

    private String b(AtomicAction atomicAction) {
        int iB = new gzy().b(atomicAction.getId().trim());
        if (iB != 0) {
            return BaseApplication.getContext().getResources().getString(iB);
        }
        return atomicAction.getName();
    }

    public ArrayList<hdr> c() {
        return this.e;
    }

    public void a(ChoreographedMultiActions choreographedMultiActions) {
        if (choreographedMultiActions == null || njy.e(choreographedMultiActions.getActionList())) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "addMultiActions, multiActions is null or multiActions.getActionList() is empty");
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        long j = this.l + 1;
        this.l = j;
        this.e.add(a(choreographedMultiActions, j));
        int size = choreographedMultiActions.getActionList().size();
        for (int i = 0; i < size; i++) {
            ChoreographedSingleAction choreographedSingleAction = choreographedMultiActions.getActionList().get(i);
            if (choreographedSingleAction != null) {
                if (i + 1 < size) {
                    this.e.add(a(choreographedSingleAction, 1, j));
                } else {
                    this.e.add(a(choreographedSingleAction, 2, j));
                }
            }
        }
        hdr hdrVar = new hdr();
        hdrVar.c(j);
        hdrVar.a(4);
        this.e.add(hdrVar);
    }

    public void c(ChoreographedMultiActions choreographedMultiActions) {
        if (choreographedMultiActions == null || njy.e(choreographedMultiActions.getActionList())) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "addMultiSingleActions, multiActions is null or multiActions.getActionList() is empty");
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        ChoreographedSingleAction choreographedSingleAction = choreographedMultiActions.getActionList().get(0);
        if (choreographedSingleAction != null) {
            this.e.add(a(choreographedSingleAction, 0, -1L));
        }
    }

    public void b(FitWorkout fitWorkout) {
        if (fitWorkout == null || njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "setCourseNameAndDescription, fitWorkout is null or mActions is empty");
            return;
        }
        hdr hdrVar = this.e.get(0);
        if (hdrVar.h() != 5) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "setCourseNameAndDescription, headItemConfig.getItemType() = ", Integer.valueOf(hdrVar.h()));
        } else {
            fitWorkout.saveName(hdrVar.j());
            fitWorkout.saveDescription(hdrVar.n());
        }
    }

    public List<ChoreographedMultiActions> e() {
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getCourseActions, mActions is empty");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (hdr hdrVar : this.e) {
            if (hdrVar.h() != 5) {
                if (hdrVar.h() == 0) {
                    ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
                    a(choreographedMultiActions, new ArrayList(1), hdrVar, 1);
                    arrayList.add(choreographedMultiActions);
                } else if (hdrVar.h() == 3) {
                    ChoreographedMultiActions choreographedMultiActions2 = new ChoreographedMultiActions();
                    choreographedMultiActions2.setRepeatTimes(hdrVar.i());
                    choreographedMultiActions2.setActionList(new ArrayList());
                    arrayList.add(choreographedMultiActions2);
                } else if (hdrVar.h() != 4) {
                    ChoreographedMultiActions choreographedMultiActions3 = (ChoreographedMultiActions) arrayList.get(i - 1);
                    a(choreographedMultiActions3, choreographedMultiActions3.getActionList(), hdrVar, choreographedMultiActions3.getRepeatTimes());
                } else {
                    LogUtil.a("Suggestion_CustomCourseActionAdapter", "getCourseActions, itemConfig.getItemType() = ", Integer.valueOf(hdrVar.h()));
                }
                i++;
            }
        }
        return arrayList;
    }

    public void e(int i) {
        int i2 = 0;
        this.f8907b = 0;
        this.n = 1;
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "refreshActionsTotalNum, mActions is empty.");
            return;
        }
        if (i >= this.e.size()) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "refreshActionsTotalNum, out-of-bounds array, position =", Integer.valueOf(i), ", mActions.size() = ", Integer.valueOf(this.e.size()));
            return;
        }
        long jF = this.e.get(i).f();
        long jF2 = -1;
        for (hdr hdrVar : this.e) {
            if (hdrVar != null) {
                if (hdrVar.h() == 3) {
                    if (jF == hdrVar.f()) {
                        this.n = hdrVar.i();
                    }
                    jF2 = hdrVar.f();
                    i2 = hdrVar.i();
                } else if (hdrVar.h() != 4) {
                    this.f8907b = hdrVar.f() == jF2 ? this.f8907b + i2 : this.f8907b + 1;
                }
            }
        }
    }

    private void a(ChoreographedMultiActions choreographedMultiActions, List<ChoreographedSingleAction> list, hdr hdrVar, int i) {
        ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
        choreographedSingleAction.setAction(hdrVar.b());
        choreographedSingleAction.setTargetConfig(hdrVar.g());
        choreographedSingleAction.setIntensityConfig(hdrVar.c());
        list.add(choreographedSingleAction);
        choreographedMultiActions.setActionList(list);
        choreographedMultiActions.setRepeatTimes(i);
    }

    public ChoreographedMultiActions a(int i, int i2) {
        if (njy.e(this.e) || njy.e(this.e, i)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getRepeatTimeData, mActions is empty");
            return null;
        }
        this.f8908c = i;
        this.h = i2;
        hdr hdrVar = this.e.get(i);
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getRepeatTimeData, itemConfig is null");
            return null;
        }
        ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
        this.t = choreographedMultiActions;
        choreographedMultiActions.setRepeatTimes(hdrVar.i());
        return this.t;
    }

    public ChoreographedSingleAction b(int i, int i2) {
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getEditActionData, mActions is empty");
            return null;
        }
        if (njy.e(this.e, i)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getEditActionData, position = ", Integer.valueOf(i));
            return null;
        }
        this.f8908c = i;
        this.h = i2;
        hdr hdrVar = this.e.get(i);
        if (hdrVar.b() != null) {
            ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
            this.f = choreographedSingleAction;
            choreographedSingleAction.setAction(hdrVar.b());
        }
        return this.f;
    }

    public TargetConfig e(int i, int i2) {
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getEditTargetConfig, mActions is empty");
            return null;
        }
        if (njy.e(this.e, i)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getEditTargetConfig, position = ", Integer.valueOf(i));
            return null;
        }
        this.f8908c = i;
        this.h = i2;
        hdr hdrVar = this.e.get(i);
        this.i = new TargetConfig();
        int i3 = this.h;
        if (i3 == 5 || i3 == 6) {
            this.i = hdrVar.g();
        } else {
            this.i = hdrVar.c();
        }
        return this.i;
    }

    public void i() {
        int i;
        int i2;
        if (njy.e(this.e) || (i = this.h) < 0 || (i2 = this.f8908c) < 0) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "notifyItemChanged, mActions is empty or mCurrentItemClickType mCurrentItemClickPosition = -1");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActionAdapter", "notifyItemChanged, mCurrentItemClickType = ", Integer.valueOf(i), " mCurrentItemClickPosition = ", Integer.valueOf(i2));
        hdr hdrVar = this.e.get(this.f8908c);
        int i3 = this.h;
        if (i3 == 3) {
            if (this.t == null) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "notifyItemChanged, mRepeatTimeData is null");
                return;
            } else {
                if (c(hdrVar.f(), this.t.getRepeatTimes())) {
                    a(R.string.IDS_sug_action_num_max_tip);
                    return;
                }
                hdrVar.c(this.t.getRepeatTimes());
                this.t = null;
                notifyItemChanged(this.f8908c);
                return;
            }
        }
        if (i3 == 4) {
            ChoreographedSingleAction choreographedSingleAction = this.f;
            if (choreographedSingleAction == null || choreographedSingleAction.getAction() == null) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "notifyItemChanged, mChangeActionData is null or mChangeActionData.getAction() is null");
                return;
            }
            hdrVar.a(this.f.getAction());
            hdrVar.c(b(this.f.getAction()));
            if (this.k == null || this.q == null) {
                g();
            }
            hdrVar.d(this.f8906a, this.f.getTargetConfig(), this.k);
            hdrVar.d(this.f8906a, this.f.getIntensityConfig(), this.k, this.q, this.d, this.p);
            this.f = null;
            notifyItemChanged(this.f8908c);
            return;
        }
        c(hdrVar);
    }

    private void a(int i) {
        Context context = this.f8906a;
        if (context == null) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "showToast, mContext is null");
        } else {
            qpx.e(context, context.getResources().getString(i));
        }
    }

    private boolean c(long j, int i) {
        long jF = -1;
        int i2 = 0;
        int i3 = 0;
        for (hdr hdrVar : this.e) {
            if (hdrVar != null) {
                if (hdrVar.h() == 3) {
                    jF = hdrVar.f();
                    i3 = jF == j ? i : hdrVar.i();
                } else if (hdrVar.h() != 4) {
                    i2 = hdrVar.f() == jF ? i2 + i3 : i2 + 1;
                }
            }
        }
        if (this.o <= 0) {
            return false;
        }
        LogUtil.a("Suggestion_CustomCourseActionAdapter", "isMaxActionNum, actionTotalNum = ", Integer.valueOf(i2));
        return i2 > this.o;
    }

    public hca b() {
        if (this.k == null) {
            g();
        }
        return this.k;
    }

    public hca a() {
        if (this.q == null) {
            g();
        }
        return this.q;
    }

    public int d() {
        return this.d;
    }

    private void g() {
        HeartRateConfigHelper heartRateConfigHelper = this.g;
        if (heartRateConfigHelper == null) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "initHeartRateZoneConfig, mHeartRateConfigHelper is null");
            return;
        }
        HeartZoneConf heartZoneConfC = heartRateConfigHelper.c();
        if (heartZoneConfC != null) {
            this.k = hcc.c(heartZoneConfC);
            this.q = hcc.a(heartZoneConfC);
            int classifyMethod = heartZoneConfC.getClassifyMethod();
            this.d = classifyMethod;
            LogUtil.a("Suggestion_CustomCourseActionAdapter", "initHeartRateZoneConfig, classifyMethod:", Integer.valueOf(classifyMethod), " ", heartZoneConfC.toString());
            return;
        }
        LogUtil.j("Suggestion_CustomCourseActionAdapter", "initHeartRateZoneConfig, heartZoneConf == null");
    }

    private void c(hdr hdrVar) {
        if (this.i == null) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "updateActionTargetConfig, mEditTargetConfig is null");
            return;
        }
        if (this.k == null || this.q == null) {
            g();
        }
        LogUtil.a("Suggestion_CustomCourseActionAdapter", "updateActionTargetConfig, mEditTargetConfig.getId() = ", this.i.getId(), ", mEditTargetConfig.getValueL() = ", Double.valueOf(this.i.getValueL()), ", mEditTargetConfig.getValueH() = ", Double.valueOf(this.i.getValueH()));
        int i = this.h;
        if (i == 5 || i == 6) {
            hdrVar.d(this.f8906a, this.i, this.k);
        } else if (i == 7 || i == 8) {
            hdrVar.d(this.f8906a, this.i, this.k, this.q, this.d, this.p);
        } else {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "onComItemClick, position = ", Integer.valueOf(this.f8908c), " type = ", Integer.valueOf(i));
        }
        notifyItemChanged(this.f8908c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.e) || njy.e(this.e, i)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "getItemViewType, CollectionUtils.isEmpty(mActions)");
            return 0;
        }
        return this.e.get(i).h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CustomCourseDragViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8906a);
        if (i == 3) {
            return new CourseMultiViewHolder(layoutInflaterFrom.inflate(R.layout.sug_custom_course_item_multi, viewGroup, false), this.f8906a, this.j, this.m, this);
        }
        if (i == 4) {
            return new CourseMultiBottomViewHolder(layoutInflaterFrom.inflate(R.layout.sug_custom_course_item_multi_space, viewGroup, false));
        }
        if (i == 5) {
            return new CourseCourseHeadViewHolder(layoutInflaterFrom.inflate(R.layout.sug_custom_course_item_head, viewGroup, false));
        }
        return new CourseActionViewHolder(layoutInflaterFrom.inflate(R.layout.sug_custom_course_item_action, viewGroup, false), this.f8906a, this.j, this.m);
    }

    public void b(CustomCourseDragViewHolder customCourseDragViewHolder, int i, List<Object> list) {
        super.onBindViewHolder(customCourseDragViewHolder, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(CustomCourseDragViewHolder customCourseDragViewHolder, int i) {
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "onBindViewHolder, CollectionUtils.isEmpty(mActions)");
            return;
        }
        if (i < this.e.size()) {
            hdr hdrVar = this.e.get(i);
            customCourseDragViewHolder.init(hdrVar, i);
            if (customCourseDragViewHolder instanceof CourseMultiViewHolder) {
                CourseMultiViewHolder courseMultiViewHolder = (CourseMultiViewHolder) customCourseDragViewHolder;
                ArrayList arrayList = new ArrayList();
                for (hdr hdrVar2 : this.e) {
                    if (hdrVar2 != null && hdrVar2.f() == hdrVar.f()) {
                        arrayList.add(hdrVar2);
                    }
                }
                courseMultiViewHolder.d(arrayList);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.CustomCourseCanDragAdapter
    public void itemMove(int i, int i2, CustomCourseDragViewHolder customCourseDragViewHolder) {
        if (customCourseDragViewHolder == null || njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "itemMove, dragViewHolder == null or CollectionUtils.isEmpty(mActions)");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActionAdapter", "itemMove, fromPosition=", Integer.valueOf(i), ", toPosition =", Integer.valueOf(i2));
        if (i < 1 || i >= this.e.size() || i2 < 1 || i2 >= this.e.size() || d(i, i2) || c(i, i2)) {
            return;
        }
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(this.e, i3, i4);
                i3 = i4;
            }
        } else {
            for (int i5 = i; i5 > i2; i5--) {
                Collections.swap(this.e, i5, i5 - 1);
            }
        }
        notifyItemMoved(i, i2);
    }

    private boolean c(int i, int i2) {
        int i3;
        int i4;
        hdr hdrVar = this.e.get(i);
        hdr hdrVar2 = this.e.get(i2);
        if (hdrVar.h() == 3 || hdrVar2.h() == 0 || i2 == 1 || (i3 = i2 + 1) >= this.e.size() || hdrVar.f() == hdrVar2.f()) {
            return false;
        }
        if (i <= i2 && hdrVar2.f() != this.e.get(i3).f()) {
            return false;
        }
        if (i > i2 && hdrVar2.f() != this.e.get(i2 - 1).f()) {
            return false;
        }
        long jF = hdrVar2.f();
        int i5 = 0;
        for (hdr hdrVar3 : this.e) {
            if (hdrVar3.f() == jF) {
                if (hdrVar3.h() == 3) {
                    this.f8907b += hdrVar3.i();
                }
                if (hdrVar3.h() == 1 || hdrVar3.h() == 2) {
                    i5++;
                }
                if (hdrVar3.h() == 4) {
                    break;
                }
            }
        }
        int i6 = this.f8907b - this.n;
        this.f8907b = i6;
        return i5 >= 10 || ((i4 = this.o) > 0 && i6 > i4);
    }

    private boolean d(int i, int i2) {
        int i3;
        int iH;
        if (this.e.get(i).h() != 3 || i2 == 1 || (i3 = i2 + 1) >= this.e.size() || (iH = this.e.get(i2).h()) == 0) {
            return false;
        }
        if (iH == 1 || iH == 2) {
            return true;
        }
        if (iH == 3) {
            if (i <= i2) {
                return true;
            }
            int i4 = i2 - 1;
            int iH2 = this.e.get(i4).h();
            if (i4 > 1 && iH2 != 4 && iH2 != 0) {
                return true;
            }
        }
        if (iH == 4) {
            if (i >= i2) {
                return true;
            }
            int iH3 = this.e.get(i3).h();
            if (i3 < this.e.size() && iH3 != 3 && iH3 != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.CustomCourseCanDragAdapter
    public void setDragState(CustomCourseDragViewHolder customCourseDragViewHolder, boolean z) {
        if (customCourseDragViewHolder == null) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "setDragState, viewHolder == null");
            return;
        }
        customCourseDragViewHolder.setDragState(z);
        if (z) {
            return;
        }
        if (customCourseDragViewHolder instanceof CourseActionViewHolder) {
            d((CourseActionViewHolder) customCourseDragViewHolder);
        } else {
            if (!(customCourseDragViewHolder instanceof CourseMultiViewHolder)) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "setDragState, viewHolder is error");
                return;
            }
            CourseMultiViewHolder courseMultiViewHolder = (CourseMultiViewHolder) customCourseDragViewHolder;
            courseMultiViewHolder.e(false);
            b(courseMultiViewHolder);
        }
    }

    private void d(CourseActionViewHolder courseActionViewHolder) {
        int i;
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "checkActionState, CollectionUtils.isEmpty(mActions)");
            return;
        }
        hdr hdrVarC = courseActionViewHolder.c();
        int iIndexOf = this.e.indexOf(hdrVarC);
        if (hdrVarC.h() == 0) {
            int i2 = iIndexOf - 1;
            if (i2 < 1 || (i = iIndexOf + 1) >= this.e.size()) {
                return;
            }
            hdr hdrVar = this.e.get(i2);
            hdr hdrVar2 = this.e.get(i);
            if (hdrVar == null || hdrVar2 == null) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "checkActionState, COURSE_ITEM_TYPE_ACTION lastAction is null nextAction is null");
                return;
            }
            if (hdrVar.f() != hdrVar2.f() || hdrVar.h() == 0 || hdrVar2.h() == 0) {
                return;
            }
            hdrVarC.c(hdrVar.f());
            hdrVarC.a(1);
            b(-1L);
            return;
        }
        b(courseActionViewHolder, hdrVarC, iIndexOf);
    }

    private void b(CourseActionViewHolder courseActionViewHolder, hdr hdrVar, int i) {
        long jF = hdrVar.f();
        int i2 = i + 1;
        if (i == 1 || i2 == this.e.size()) {
            d(courseActionViewHolder, hdrVar);
        } else {
            int i3 = i - 1;
            if (njy.e(this.e, i3) || njy.e(this.e, i2)) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "checkAfterDragMultiActionState outOfBounds");
                return;
            }
            hdr hdrVar2 = this.e.get(i3);
            hdr hdrVar3 = this.e.get(i2);
            if (hdrVar2 == null || hdrVar3 == null) {
                LogUtil.j("Suggestion_CustomCourseActionAdapter", "checkActionState, COURSE_ITEM_TYPE_ACTION, lastAction is null or nextAction is null");
                return;
            }
            if (hdrVar2.h() == 0 || hdrVar3.h() == 0 || hdrVar2.f() != hdrVar3.f()) {
                d(courseActionViewHolder, hdrVar);
            } else {
                if (hdrVar2.f() != hdrVar.f() || hdrVar3.f() != hdrVar.f()) {
                    hdrVar.c(hdrVar2.f() != hdrVar.f() ? hdrVar2.f() : hdrVar3.f());
                }
                hdrVar.a(1);
            }
        }
        b(jF);
    }

    private void b(long j) {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        long jF = -1;
        for (int i4 = 1; i4 < this.e.size(); i4++) {
            hdr hdrVar = this.e.get(i4);
            if (hdrVar.h() != 0) {
                if (j != -1 && hdrVar.f() == j) {
                    i++;
                    if (hdrVar.h() == 3) {
                        i3 = i4;
                    }
                    if (hdrVar.h() == 4) {
                        i2 = i4;
                    }
                }
                if (hdrVar.h() == 3) {
                    jF = hdrVar.f();
                }
                if (hdrVar.f() == jF && hdrVar.h() == 2 && this.e.get(i4 + 1).h() != 4) {
                    hdrVar.a(1);
                }
                if (hdrVar.f() == jF && hdrVar.h() == 1 && this.e.get(i4 + 1).h() == 4) {
                    hdrVar.a(2);
                }
            }
        }
        LogUtil.a("Suggestion_CustomCourseActionAdapter", "checkOriginalMultiState, oldMultiSize = ", Integer.valueOf(i));
        if (j != -1 && i <= 2) {
            this.e.remove(i2);
            this.e.remove(i3);
        }
        notifyDataSetChanged();
    }

    private void d(CourseActionViewHolder courseActionViewHolder, hdr hdrVar) {
        hdrVar.c(-1L);
        hdrVar.a(0);
        courseActionViewHolder.b();
    }

    private void b(CourseMultiViewHolder courseMultiViewHolder) {
        if (courseMultiViewHolder == null || courseMultiViewHolder.e() == null) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "openMulti, multiViewHolder is null or getActionItemConfig() is null");
            return;
        }
        if (njy.e(courseMultiViewHolder.c()) || njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "openMulti, getMultiActionList is empty or mActions is empty");
            return;
        }
        int iIndexOf = this.e.indexOf(courseMultiViewHolder.e());
        for (int i = 0; i < courseMultiViewHolder.c().size(); i++) {
            hdr hdrVar = courseMultiViewHolder.c().get(i);
            if (hdrVar.h() != 3) {
                this.e.add(iIndexOf + i + 1, hdrVar);
            }
        }
        ItemEventListener itemEventListener = this.m;
        if (itemEventListener != null) {
            itemEventListener.onComItemClick(iIndexOf, 9);
        }
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseMultiViewHolder.OnMultiCloseListener
    public void onCloseClick(CourseMultiViewHolder courseMultiViewHolder) {
        if (courseMultiViewHolder == null || courseMultiViewHolder.e() == null || njy.e(this.e)) {
            LogUtil.j("Suggestion_CustomCourseActionAdapter", "onCloseClick, multiViewHolder is null or actionItemConfig is null or mActions is null");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActionAdapter", "multi close");
        ArrayList arrayList = new ArrayList();
        hdr hdrVarE = courseMultiViewHolder.e();
        int size = this.e.size();
        Iterator<hdr> it = this.e.iterator();
        while (it.hasNext()) {
            hdr next = it.next();
            if (next.f() == hdrVarE.f() && next.h() != 3) {
                arrayList.add(next);
                it.remove();
            }
        }
        if (njy.b(courseMultiViewHolder.c())) {
            courseMultiViewHolder.c().clear();
            courseMultiViewHolder.c().addAll(arrayList);
        } else {
            courseMultiViewHolder.d(arrayList);
        }
        notifyItemRangeChanged(this.e.indexOf(hdrVarE) + 1, size);
    }
}
